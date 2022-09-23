import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Rafflebager {
    ArrayList<Integer> terninger;
    Random random;
    Scanner scanner;
    int antalTeringer;

    public Rafflebager() {
        terninger = new ArrayList<Integer>();
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public Rafflebager(int antalTeringer) {
        this.antalTeringer = antalTeringer;
    }

    public void throwDice() {
        System.out.println("\nHvor mange terninger ønsker du at kaste");
        antalTeringer = scanner.nextInt();

        for (int i = 0; i != antalTeringer; i++) {
            int randomNumber = random.nextInt(6) + 1;
            System.out.println(randomNumber);
            terninger.add(randomNumber);
        }
    }

    public void se() {
        System.out.println("Liste af terningsslag");
        System.out.println(terninger);
    }
}
