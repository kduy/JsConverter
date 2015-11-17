package main.java.com.cloudrail.utils.Node;

import main.java.com.cloudrail.utils.Visitor.Visitor;

/**
 * Created by kidio on 17/11/15.
 */
public class PrimaryNode implements  Visitable{
    String value ;

    public PrimaryNode (String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
