package main.java.com.cloudrail.utils.Visitor;

import main.java.com.cloudrail.utils.Node.JsonArrayNode;
import main.java.com.cloudrail.utils.Node.JsonObjectNode;
import main.java.com.cloudrail.utils.Node.PrimaryNode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by kidio on 17/11/15.
 */
public class PrintVistor implements Visitor {
    @Override
    public void visit(JsonArrayNode jsonArrayNode) {
        System.out.println("this is pritnvisitor for arraynode");
        JSONArray jsonArray = jsonArrayNode.getJsonArray();
        for (Object element : jsonArray) {
            if (element instanceof JSONArray){
                (new JsonArrayNode((JSONArray) element)).accept(this);
            }else if (element instanceof  JSONObject){
                (new JsonObjectNode((JSONObject)element)).accept(this);
            }else {
                (new PrimaryNode(element.toString())).accept(this);
            }
        }
    }

    @Override
    public void visit(JsonObjectNode jsonObjectNode) {
        JSONObject jsonObject = jsonObjectNode.getJsonObject();
        Iterator<Map.Entry<String, Object>> iterator = jsonObject.entrySet().iterator();
        while (iterator.hasNext()) {
            Object temp = iterator.next().getValue();
            if (temp instanceof JSONArray){
                (new JsonArrayNode((JSONArray) temp)).accept(this);
            }else if (temp instanceof  JSONObject){
                (new JsonObjectNode((JSONObject)temp)).accept(this);
            }else {
                (new PrimaryNode(temp.toString())).accept(this);
            }
        }


    }

    @Override
    public void visit(PrimaryNode primaryNode) {
        System.out.println(primaryNode.getValue());
    }
}
