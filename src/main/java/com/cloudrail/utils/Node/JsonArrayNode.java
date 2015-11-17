package main.java.com.cloudrail.utils.Node;

/**
 * Created by kidio on 17/11/15.
 */
import main.java.com.cloudrail.utils.Visitor.Visitor;
import org.json.simple.JSONArray;

public class JsonArrayNode  implements Visitable  {
    private JSONArray jsonArray;

    public JsonArrayNode (JSONArray jsonArray){
        this.jsonArray = jsonArray;
    }

    public void setJsonArray(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public JSONArray getJsonArray() {

        return jsonArray;
    }

    @Override
    public String accept(Visitor visitor, int tagLevel ) {
        return visitor.visit(this,tagLevel);
    }
}
