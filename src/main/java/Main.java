import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rafflebager rafflebager = new Rafflebager();
        Scanner sc = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("""
                    \nVelkommen til Raflebageret 
                    1. Kast terninger
                    2. Se liste af kastede terninger 
                    3. Afslut Programmet
                    """);

            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    rafflebager.throwDice();
                    break;
                case 2:
                    rafflebager.se();
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Du intastede " + userChoice + " Dette er ikke en mulighed Prøv igen");
            }
        } while (userChoice != 3);
    }
}
