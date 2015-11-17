package main.java.com.cloudrail.utils.Visitor;

import main.java.com.cloudrail.utils.Node.JsonArrayNode;
import main.java.com.cloudrail.utils.Node.JsonObjectNode;
import main.java.com.cloudrail.utils.Node.PrimaryNode;

/**
 * Created by kidio on 17/11/15.
 */
public interface
Visitor {
    public String visit(JsonArrayNode jsonArrayNode, int tagLevel);
    public String visit (JsonObjectNode jsonObjectNode, int tagLevel);
    public String visit (PrimaryNode primaryNode, int tagLevel);
}
