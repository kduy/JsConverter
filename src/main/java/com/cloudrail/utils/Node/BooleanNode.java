package main.java.com.cloudrail.utils.Node;

/**
 * Created by kidio on 17/11/15.
 */
public class BooleanNode extends PrimaryNode{
    boolean value ;

    public BooleanNode(boolean value){
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {

        this.value = value;
    }
}
