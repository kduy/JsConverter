package main.java.com.cloudrail.utils.Visitor;

import main.java.com.cloudrail.utils.Node.JsonArrayNode;
import main.java.com.cloudrail.utils.Node.JsonObjectNode;
import main.java.com.cloudrail.utils.Node.PrimaryNode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Created by kidio on 17/11/15.
 */
public class PrintVistor implements Visitor {
    @Override
    public String visit(JsonArrayNode jsonArrayNode) {
        JSONArray jsonArray = jsonArrayNode.getJsonArray();
        StringBuilder builder = new StringBuilder("");

        builder.append("{\n");
        builder.append("\t\"type\": \"Array\"\n");
        builder.append("\t\"item\": [\n");
        for (Object element : jsonArray) {
            builder.append("\t\t");
            builder.append(travel(element));
            builder.append(",");
            builder.append("\n");
        }
        builder.append("\t]\n");
        builder.append("}\n");
        return  builder.toString();
    }

    @Override
    public String visit(JsonObjectNode jsonObjectNode) {
        JSONObject jsonObject = jsonObjectNode.getJsonObject();
        StringBuilder builder = new StringBuilder("");

        Iterator<Entry<String, Object>> iterator = jsonObject.entrySet().iterator();
        builder.append("{\n");
        // type
        builder.append("\t\"type\": \"Object\"\n");
        // required
        builder.append("\t\"required\": [\n");
        while (iterator.hasNext()){
            builder.append("\t\t"+iterator.next().getKey()+",\n");
        }
        builder.append("\t]\n");

        // properties
        builder.append("\t\"properties\":{\n");
        iterator = jsonObject.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Object> temp = iterator.next();
            builder.append("\t\t"+temp.getKey()+":");
            builder.append(""+ travel(temp.getValue()));
            builder.append("\n");
        }
        builder.append("\t}\n");

        builder.append("}\n");


        return  builder.toString();

    }

    private String travel(Object temp) {
        if (temp instanceof JSONArray){
            return (new JsonArrayNode((JSONArray) temp)).accept(this);
        }else if (temp instanceof JSONObject){
            return (new JsonObjectNode((JSONObject)temp)).accept(this);
        }else {
            return (new PrimaryNode(temp.toString())).accept(this);
        }
    }

    @Override
    public String visit(PrimaryNode primaryNode) {
        String value = primaryNode.getValue();

        StringBuilder builder = new StringBuilder("");
        builder.append("{\n");
        builder.append("\t\"type\": \"String\"\n");
        builder.append("\t\"tags\": [\n");
        builder.append("\t\t"+value+"\n");
        builder.append("\t]\n");
        builder.append("}\n");
        return  builder.toString();
    }
}
