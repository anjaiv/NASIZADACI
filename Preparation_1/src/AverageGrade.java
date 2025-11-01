import java.util.Scanner;

public class AverageGrade {
    public static void average(double grade1, double grade2, double grade3) {
        double result=(grade1+grade2+grade3)/3;
        System.out.println("Average is: "+result);
        if (result>85){
            System.out.println("Excellent grade!");
        }
        else if(result>=70 && result<85){
            System.out.println("Great grade!");
        }
        else if(result>50 && result<70){
            System.out.println("You could do better!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade1,grade2,grade3;
        grade1 = scanner.nextDouble();
        grade2 = scanner.nextDouble();
        grade3 = scanner.nextDouble();
        average(grade1,grade2,grade3);


    }
}