import java.util.Random;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int treasureX = rnd.nextInt(10) + 1;
        int treasureY = rnd.nextInt(10) + 1;
        boolean found = false;

        System.out.println("=== Treasure Hunt ===");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Обид " + i + " - внеси X (1–10): ");
            int x = sc.nextInt();
            System.out.print("Внеси Y (1–10): ");
            int y = sc.nextInt();

            if (x == treasureX && y == treasureY) {
                System.out.println("🎉 Го најде богатството!");
                found = true;
                break;
            } else {
                System.out.println("Промаши! Обиди се повторно.");
            }
        }

        if (!found)
            System.out.println("Играта заврши. Богатството беше на [" + treasureX + ", " + treasureY + "].");

        sc.close();
    }
}
