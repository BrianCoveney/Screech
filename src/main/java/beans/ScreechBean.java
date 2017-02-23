package main.java.beans;

/**
 * Created by brian on 23/02/17.
 */
public class ScreechBean {

    // encapsulate properties / attributes of the class
    private int skidLength = 0;
    private int skidMarks = 0;


    // As we are not defining any parameterised constructors, java supplies a default no arg constructor


    // accessor method - allow the client to retrieve the state of the object
    public int getSkidLength() { return skidLength; }

    // mutator method - allow the client change the state of the object
    public void setSkidLength(int skidLength) {
        this.skidLength = skidLength;
    }

    public void setSkidMarks(int skidMarks) {
        this.skidMarks = skidMarks;
    }

    public int getSkidMarks() {
        return skidMarks;
    }

    public boolean isNotZero() {
        if(skidLength > 0) {
            return true;
        }
        return false;
    }

}
