package creator;

public class Bike {

    private Wheel frontWheel, backWheel;
    private Frame frame;

    /* Finish the Bike class. You should be able to create a Bike
    object with two Wheel objects and a Frame object*/

    public Bike(Frame frame, Wheel frontWheel, Wheel backWheel){
        this.frame = frame;
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
    }

    public String toString() {
        return "Bike: " + frontWheel.toString() + ", "
                + backWheel.toString() + ", " +
                frame.toString();
    }
}
