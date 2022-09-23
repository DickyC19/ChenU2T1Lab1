public class Student {
    private String name;
    private int age;
    private double average;

    public Student(String studentName, int studentAge, double studentAverage) {
        studentName = name;
        studentAge = age;
        studentAverage = average;
    }

    public void introduce() {
        if (average > 80) {
            System.out.println("Hello my name is " + name + " and I have a high average");
        } else {
            System.out.println("Hello my name is " + name + " and I have a low average");
        }
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average: " + average);
    }

}
