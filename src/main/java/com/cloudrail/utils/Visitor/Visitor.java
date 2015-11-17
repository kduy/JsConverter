package main.java.com.cloudrail.utils.Visitor;

import main.java.com.cloudrail.utils.Node.JsonArrayNode;
import main.java.com.cloudrail.utils.Node.JsonObjectNode;
import main.java.com.cloudrail.utils.Node.PrimaryNode;

/**
 * Created by kidio on 17/11/15.
 */
public interface Visitor {
    public void visit(JsonArrayNode jsonArrayNode);
    public void visit (JsonObjectNode jsonObjectNode);
    public void visit (PrimaryNode primaryNode);
}
