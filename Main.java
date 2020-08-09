package lesson7;

import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {

        String[] nameOfCat = new String[] {"Барсик", "Мурзик", "Васька", "Пушок", "Леопольд", "Том"};
        int numberCats;
        int catName;
        int appetit;
        int addFood;
        int satietyCats = 0;

        Plate plate = new Plate(100);

        numberCats = random.nextInt(10);

        System.out.println("Всего будет создано " + numberCats + " котов");
        plate.info();
        System.out.println();
        for (int i = 0; i < numberCats; i++) {
            catName = random.nextInt(nameOfCat.length);
            appetit = random.nextInt(20) + 10;
            Cat cat = new Cat(nameOfCat[catName], appetit);
            cat.info();
            while ( !cat.isSatiety() ) {
                cat.eat(plate);
                if( !cat.isSatiety() ) {
                    addFood = random.nextInt(10) + 10;
                    System.out.println("Добавим в тарелку " + addFood + " единицы еды");
                    plate.setFood(addFood);
                }
            }
            satietyCats = cat.getSatietyCatsCount();
        }
        System.out.println();
        System.out.println("Всего было накормлено " + satietyCats + " котов");
        plate.info();

    }
}
