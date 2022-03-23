
import java.util.Scanner;

class Main {

    static double calculateAge (long seconds, String planet){
        double earthAge = (double) seconds/31557600;

        switch (planet){
            case "Ziemia": return earthAge;
            case "Merkury": return earthAge / 0.2408467;
            case "Wenus": return earthAge / 0.61519726;
            case "Mars": return earthAge / 1.8808158;
            case "Jowisz": return earthAge / 11.862615;
            case "Saturn": return earthAge / 29.447498;
            case "Uran": return earthAge / 84.016846;
            case "Neptun": return earthAge / 164.79132;
        }

        return earthAge;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long secs = 0;
        String planet = "";

        secs = sc.nextLong();
        planet = sc.next();

        System.out.printf("%.2f", calculateAge(secs,planet));

    }
}
