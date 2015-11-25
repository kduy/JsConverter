package main.java.com.cloudrail.utils.Node;

import main.java.com.cloudrail.utils.Visitor.Visitor;
import org.json.simple.JSONObject;

/**
 * Created by kidio on 17/11/15.
 */
public class JsonObjectNode implements Visitable  {

    private JSONObject jsonObject;

    public  JsonObjectNode (JSONObject jsonObject){
        this.jsonObject = jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {

        return jsonObject;
    }

    @Override
    public String accept(Visitor visitor, int tagLevel, String parent) {
        return visitor.visit(this, tagLevel, parent);
    }
}
