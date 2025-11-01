public class Gadget {
    private String brand;
    private String model;

    public Gadget(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void display(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }
}
