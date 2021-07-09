package PracticeStaticMethod;

public class TestStaticMethod {
    public static void main(String args[]) {
        PracticeStaticMethod.change(); //calling change method

        //creating objects
        PracticeStaticMethod s1 = new PracticeStaticMethod(111, "Hoang");
        PracticeStaticMethod s2 = new PracticeStaticMethod(222, "Khanh");
        PracticeStaticMethod s3 = new PracticeStaticMethod(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
