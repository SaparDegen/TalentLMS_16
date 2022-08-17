public class Turtle extends Animal {

    public Turtle(String name, double weight) {
        super(name, weight);
    }

    public void swim() {
        System.out.println(getName() + " turtle can swim in the deep ocean");
    }

}
