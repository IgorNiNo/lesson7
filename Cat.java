package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    private static int satietyCatsCount;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if( appetite <= plate.getFood() ) {
            plate.decreaseFood(appetite);
            System.out.println(name + " поел " + appetite + " единицы");
            satiety = true;
            satietyCatsCount++;
        } else {
            System.out.println(name + " не поел. Мало еды в тарелке");
        }
    }

    public void info() {
        System.out.println("Кот " + name + " с аппетитом " + appetite + " единиц");
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatietyCatsCount() {
        return satietyCatsCount;
    }
}
