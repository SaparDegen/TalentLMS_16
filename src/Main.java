public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Shark("Great white", 2270),
                new Shark("Blue", 200),
                new Shark("Tiger", 635),
                new Shark("Mako", 800),
                new Turtle("Olive Ridley", 45),
                new Turtle("Hawksbill", 90),
                new Turtle("Flatbacks", 90),
                new Turtle("Green", 140),
                new Eagle("See", 6.7),
                new Eagle("Philippine", 6.3),
                new Eagle("Harpy", 6),
                new Eagle("White-Tailed", 4.8)
        };

        Shark[] sharks = new Shark[4];
        Turtle[] turtles = new Turtle[4];
        Eagle[] eagles = new Eagle[4];

        int i = 0, j = 0, k = 0;
        for (Animal a: animals) {
            if (a.getClass().getSimpleName().equals("Shark")) {
                a.attack();
                sharks[i] = (Shark) a;
                i++;
            } else if (a instanceof Turtle) {
                Turtle b = (Turtle) a;
                b.swim();
                turtles[j] = (Turtle) a;
                j++;
            } else if (a instanceof Eagle) {
                Eagle b = (Eagle) a;
                b.fly();
                eagles[k] = (Eagle) a;
                k++;
            }
        }
    }
}