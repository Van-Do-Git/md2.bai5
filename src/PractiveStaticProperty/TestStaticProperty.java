package PractiveStaticProperty;

public class TestStaticProperty {



    public static void main(String[] args) {

        PracticeStaticProperty car1 = new PracticeStaticProperty("Mazda 3", "Skyactiv 3");

        System.out.println(car1.numberOfCars);
        System.out.println(PracticeStaticProperty.numberOfCars);

        PracticeStaticProperty car2 = new PracticeStaticProperty("Mazda 6", "Skyactiv 6");

        System.out.println(car2.numberOfCars);
        System.out.println(PracticeStaticProperty.numberOfCars);

    }

}
