package main.java.com.cloudrail.utils.Node;

/**
 * Created by kidio on 17/11/15.
 */
public class StringNode extends PrimaryNode {
    String value ;

    public StringNode (String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }
}
