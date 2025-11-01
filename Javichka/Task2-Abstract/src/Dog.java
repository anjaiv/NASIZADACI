public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void sound(){
        System.out.println("BARK!");
    }

    public void fetch(){
        System.out.println("Fetching the ball...");
    }
}
