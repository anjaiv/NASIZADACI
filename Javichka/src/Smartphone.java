public class Smartphone extends Gadget{
    private double battery;

    public Smartphone(String brand, String model, double battery) {
        super(brand, model);
        this.battery = battery;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Battery: " + this.battery);
    }
    public void app(){
        System.out.println("Opening a mobile app...");
    }
}
