class Student {
    public String name;
    public static String studentClass;
}



public class Static {
    public static void main(String[] args) {
        Student.studentClass = "Web Development Java";

        System.out.println(Student.studentClass);

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Firli";

        student2.name = "Ismail";

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}
