import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("dz-7");

        System.out.println(SolarSystem.values().length);
        System.out.println(SolarSystem.Mars.ordinal());
        System.out.println(SolarSystem.Venus.getOrderFromSun());

        System.out.println(SolarSystem.Venus.getDistanceToTheSun());
        System.out.println(SolarSystem.Pluto.getDistanceToTheSun());
    }
}
