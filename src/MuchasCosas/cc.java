package MuchasCosas;

public class cc {
    public static void main(String[]args){
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven(40));
        System.out.println(lasagna.remainingMinutesInOven(20));
        System.out.println(lasagna.preparationTimeInMinutes(4));
        System.out.println(lasagna.totalTimeInMinutes(35));
    }
}
