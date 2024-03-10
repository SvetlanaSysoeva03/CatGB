package homeWork;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
    public String getName(){
        return name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
