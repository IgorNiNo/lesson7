package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if(food >= amount) {
            food -= amount;
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food += food;
        System.out.println("В тарелке стало " + this.food + " единиц еды");
    }

    public void info() {
        System.out.println("В тарелке " + food + " единиц еды");
    }

}
