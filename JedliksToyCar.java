package EXERCISM;

public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryPercentage = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay (){
        return ("Driven"+ distanceDriven + " meters");
    }
}
