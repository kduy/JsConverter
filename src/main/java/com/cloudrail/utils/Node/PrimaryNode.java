package main.java.com.cloudrail.utils.Node;

import main.java.com.cloudrail.utils.Visitor.Visitor;

/**
 * Created by kidio on 17/11/15.
 */
public abstract class PrimaryNode implements  Visitable{


    @Override
    public String accept(Visitor visitor, int tagLevel, String parent) {
        return visitor.visit(this,tagLevel, parent);
    }
}
