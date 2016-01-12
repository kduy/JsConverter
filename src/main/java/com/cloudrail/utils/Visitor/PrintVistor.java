package main.java.com.cloudrail.utils.Visitor;

import main.java.JsonConverter;
import main.java.com.cloudrail.utils.Node.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * Created by kidio on 17/11/15.
 */
public class PrintVistor implements Visitor {
    @Override
    public String visit(JsonArrayNode jsonArrayNode, int tagLevel, String parent) {
        String tags = repeat("\t",tagLevel);
        JSONArray jsonArray = jsonArrayNode.getJsonArray();

        StringBuilder builder = new StringBuilder("");
        builder.append(tags+"{\n");
        builder.append(tags+"\t\"type\": \"Array\",\n");

        builder.append(tags+"\t\"tags\": [\n");
        builder.append(tags+"\t\t\""+reformat(parent)+"\", \"List\"\n");
        builder.append(tags+"\t],\n");

        builder.append(tags+"\t\"items\":");
        for (Object element : jsonArray) {

            if (!(element instanceof  JSONArray || element instanceof JSONObject) )
                builder.append(travel(element,tagLevel+1,parent));
            else
                builder.append(travel(element,tagLevel+1,""));
            builder.append("\n");
            break;
        }
        //builder.deleteCharAt(builder.length()-2);
        //builder.append(tags+"\t]\n");
        builder.append(tags+"}");

        return  builder.toString();



        /*
        StringBuilder builder = new StringBuilder("");
        builder.append(tags+"{\n");
        builder.append(tags+"\t\"type\": \""+type+"\",\n");
        builder.append(tags+"\t\"tags\": [\n");
        builder.append(tags+"\t\t\""+reformat(parent)+"\"\n");
        builder.append(tags+"\t]\n");
        builder.append(tags+"}");
        */
    }

    @Override
    public String visit(JsonObjectNode jsonObjectNode, int tagLevel, String parent) {
        String tags = repeat("\t",tagLevel);
        JSONObject jsonObject = jsonObjectNode.getJsonObject();
        StringBuilder builder = new StringBuilder("");

        Iterator<Entry<String, Object>> iterator = jsonObject.entrySet().iterator();
        builder.append(tags+"{\n");

        // type
        builder.append(tags+"\t\"type\": \"Object\",\n");

        // required
        builder.append(tags+"\t\"required\":[ \n");

        Boolean haveRequiredFields = true;
        try {
            haveRequiredFields = readPropertyFile(JsonConverter.PropFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (haveRequiredFields){
            while (iterator.hasNext()){
                builder.append(tags+"\t\t\""+iterator.next().getKey()+"\",\n");
            }
        }
        builder.deleteCharAt(builder.length()-2);
        builder.append(tags+"\t],\n");

        // properties
        builder.append(tags+"\t\"properties\":{\n");



        iterator = jsonObject.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Object> temp = iterator.next();
            builder.append(tags+"\t\t\""+temp.getKey()+"\":");
            builder.append(travel(temp.getValue(),tagLevel+2,temp.getKey() )+",");
            builder.append("\n");
        }
        /*Iterator<Object> iterator2 = jsonObject.keySet().iterator();
        while (iterator2.hasNext()) {
            Object temp = iterator2.next();
            builder.append(tags+"\t\t\""+temp+"\":");
            builder.append(travel(jsonObject.get(temp),tagLevel+2)+",");
            builder.append("\n");

            //System.out.println(jsonObject.get(temp).getClass());
        }*/


        builder.deleteCharAt(builder.length()-2);
        builder.append(tags+"\t}\n");

        builder.append(tags+"}");

        return  builder.toString();

    }

    private Boolean readPropertyFile(String fileName) throws IOException {
        Properties prop = new Properties();
        InputStream inputStream = new FileInputStream(fileName);
        if(inputStream != null ){
            prop.load(inputStream);
        } else {
            throw new FileNotFoundException(fileName + " not found");
        }
        return Boolean.parseBoolean(prop.getProperty("required"));
    }

    private String travel(Object temp, int tagLevel, String parent) {
        if (temp instanceof JSONArray){
            return (new JsonArrayNode((JSONArray) temp)).accept(this, tagLevel, parent);
        }else if (temp instanceof JSONObject){
            return (new JsonObjectNode((JSONObject)temp)).accept(this,tagLevel, parent);
        }else {
            //return (new PrimaryNode(temp.toString())).accept(this,tagLevel);
            if (temp instanceof  java.lang.Long){
                return (new LongNode(((Long) temp).intValue())).accept(this,tagLevel, parent);
            } else if (temp instanceof  java.lang.Double){
                return (new DoubleNode(((Double) temp).doubleValue())).accept(this,tagLevel,parent);
            } else if (temp instanceof  java.lang.Boolean){
                return (new BooleanNode(((Boolean) temp).booleanValue())).accept(this,tagLevel,parent);
            } else {
                return (new StringNode(temp.toString())).accept(this,tagLevel,parent);
            }
        }
    }

    @Override
    public String visit(PrimaryNode primaryNode, int tagLevel, String parent) {
        String tags = repeat("\t",tagLevel);
        String value="";
        String type ="String";

        if (primaryNode instanceof LongNode){
            value = ""+((LongNode) primaryNode).getValue();
            type = "Integer";
        }else if (primaryNode instanceof DoubleNode){
            value = ""+((DoubleNode) primaryNode).getValue();
            type = "Number";
        }else if (primaryNode instanceof BooleanNode){
            value = ""+((BooleanNode) primaryNode).getValue();
            type = "Boolean";
        }else {
            value = ((StringNode)primaryNode).getValue();
            type="String";
        }

        StringBuilder builder = new StringBuilder("");
        builder.append(tags+"{\n");
        builder.append(tags+"\t\"type\": \""+type+"\",\n");
        builder.append(tags+"\t\"tags\": [\n");
        builder.append(tags+"\t\t\""+reformat(parent)+"\"\n");
        builder.append(tags+"\t]\n");
        builder.append(tags+"}");

        return  builder.toString();
    }

    private String reformat(String parent) {
        String result = "" ;
        for (String s : parent.split("[_||-]")){
            result+= s.isEmpty() ? "" : (String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1));
        }
        return result;
    }

    private static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}
