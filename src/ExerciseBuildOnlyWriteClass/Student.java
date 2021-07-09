package ExerciseBuildOnlyWriteClass;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "Join";
        classes = "C02";
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
