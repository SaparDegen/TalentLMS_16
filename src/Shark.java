public class Shark extends Animal {

    public Shark(String name, double weight) {
        super(name, weight);
    }

    public void attack() {
        System.out.println(getName() + " shark attacks its victim in the ocean");
    }

}
