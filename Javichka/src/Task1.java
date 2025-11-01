import java.util.Scanner;


public class Task1 {
    public static void main(String[] args){

        Scanner scanner=new Scanner (System.in);
        String phoneBrand;
        String phoneModel;
        double phoneBattery;
        String radioBrand;
        String radioModel;
        int numChannels;
        System.out.println("Enter phone brand: ");
        phoneBrand=scanner.nextLine();
        System.out.println("Enter phone model: ");
        phoneModel=scanner.nextLine();
        System.out.println("Enter phone battery: ");
        phoneBattery=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter radio brand: ");
        radioBrand=scanner.nextLine();
        System.out.println("Enter radio model: ");
        radioModel=scanner.nextLine();
        System.out.println("Enter number of channels: ");
        numChannels=scanner.nextInt();
        scanner.nextLine();
        Gadget[] gadgets={new Smartphone(phoneBrand,phoneModel,phoneBattery), new Radio(radioBrand,radioModel,numChannels)};
        for (int i=0;i<gadgets.length;i++){
            gadgets[i].display();
            if (gadgets[i] instanceof Smartphone s){
                s.app();
            }
            else if(gadgets[i] instanceof Radio r){
                r.playRadio();

            }
        }

    }



}