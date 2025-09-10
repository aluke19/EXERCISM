package EXERCISM;

public class CarsAssemble {
    public static productionRatePerHour (int speed) {

        int base = speed * 221;

        if (speed >= 0 && speed <= 4)
        return base;

        if (speed >= 5 && speed <= 8)
        return base * 0.9;

        if (speed == 9)
        return base * 0.8;

        if (speed == 10)
        return base * 0.77;

        else 
        return 0;
    }

    public static workingItemsPerMinute (int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
