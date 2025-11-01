import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String dogName;
        String wolfName;
        String birdName;
        System.out.println("Dog name: ");
        dogName = scanner.nextLine();
        System.out.println("Wolf name: ");
        wolfName = scanner.nextLine();
        System.out.println("Bird name: ");
        birdName = scanner.nextLine();
        Animal[] zoo={new Dog(dogName),new Wolf(wolfName),new Bird(birdName)};
        for (int i=0; i<zoo.length;i++){
            zoo[i].sound();
            if(zoo[i] instanceof Dog d){
                d.fetch();
            }
            else if(zoo[i] instanceof Wolf w){
                w.eat();
            }
            else if(zoo[i] instanceof Bird b){
                b.fly();
            }
        }

    }
}
