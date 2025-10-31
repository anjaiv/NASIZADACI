import java.util.Random;

public class CountPasses {
    public static void main(String[] args) {
        Random rnd = new Random();
        int passCount = 0;

        for (int i = 1; i <= 5; i++) {
            int score = rnd.nextInt(101);
            System.out.println("Student " + i + " score: " + score);
            if (score >= 60) {
                passCount++;
            }
        }

        System.out.println("Total passed: " + passCount);
    }
}


