package homeWork;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 5), new Cat("Murzik", 10), new Cat("Tom", 15)};
        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " is full: " + cat.isFull());
        }
    }
}
