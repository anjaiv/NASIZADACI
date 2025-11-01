public class Radio extends Gadget{
    private int numChannels;

    public Radio(String brand, String model, int numChannels) {
        super(brand, model);
        this.numChannels = numChannels;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Number of channels: " + this.numChannels);
    }
    public void playRadio(){
        System.out.println("Playing Radio...");
    }
}
