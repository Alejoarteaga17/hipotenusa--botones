package MuchasCosas;

public class Lasagna {
    public int expectedMinutesInOven(int i) {
        return i;
    }

    public int remainingMinutesInOven(int howManyItsBeenInside) {
        return expectedMinutesInOven(40) - howManyItsBeenInside;
    }

    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    public int totalTimeInMinutes(int enHorno) {
        return preparationTimeInMinutes(4) + enHorno;

    }
}
