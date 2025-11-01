import java.util.Scanner;

public class NameAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Внеси го твоето име: ");
        String name = sc.nextLine();

        int length = name.length();
        char middle = name.charAt(length / 2);

        System.out.println("Должина на името: " + length);
        System.out.println("Средна буква: " + middle);
        System.out.println("Agent " + name + ", the middle character of your name is " + middle + ".");
        sc.close();
    }
}
