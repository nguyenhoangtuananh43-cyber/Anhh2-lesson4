public class Student {
    public static void main(String[] args) {
        StaticMethod.change();

        StaticMethod s1 = new StaticMethod(111, "Duy");
        StaticMethod s2 = new StaticMethod(222, "Huy");
        StaticMethod s3 = new StaticMethod(333, "Tuấn Anh");

        s1.display();
        s2.display();
        s3.display();
    }
}
