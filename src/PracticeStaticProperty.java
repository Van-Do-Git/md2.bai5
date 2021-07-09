public class PracticeStaticProperty {
    private String name;
    private String engine;
    public static int numberOfCars;

    public PracticeStaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
