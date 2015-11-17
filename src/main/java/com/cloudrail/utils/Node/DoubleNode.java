package main.java.com.cloudrail.utils.Node;

/**
 * Created by kidio on 17/11/15.
 */
public class DoubleNode extends PrimaryNode{
    double value ;

    public DoubleNode(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {

        this.value = value;
    }
}
