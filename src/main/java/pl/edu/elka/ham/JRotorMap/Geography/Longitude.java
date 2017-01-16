package pl.edu.elka.ham.JRotorMap.Geography;

/**
 * Created by erxyi on 09.01.17.
 */
public class Longitude extends Coordinate {
    public enum LongitudeDirections {East, West }

    private LongitudeDirections direction;

    public Longitude() {
        super();
        direction = LongitudeDirections.East;
    }

    public Longitude(double ddd, LongitudeDirections ld) {
        super(ddd);
        direction = ld;
    }

    public Longitude(int degrees, double mm, LongitudeDirections ld) {
        super(degrees, mm);
        direction = ld;
    }

    public LongitudeDirections getDirection() {
        return direction;
    }

    public String toString() {
        String d;
        if (direction == LongitudeDirections.East)
            d = "E";
        else
            d = "W";

        return Double.toString(super.getDDD()) + " " + d;
    }

    public double getSignDDD()
    {
        double d = super.getDDD();

        if(direction == LongitudeDirections.West)
            d *= -1.0;

        return d;
    }
}