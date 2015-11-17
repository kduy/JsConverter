package main.java.com.cloudrail.utils.Node;

/**
 * Created by kidio on 17/11/15.
 */
public class LongNode extends  PrimaryNode{
    long value ;

    public LongNode(long value){
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {

        this.value = value;
    }
}
