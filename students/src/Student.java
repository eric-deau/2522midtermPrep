public class Student {
    static int numStudents = 0;

    public Student() {
        numStudents++;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s3.numStudents);
    }
}
