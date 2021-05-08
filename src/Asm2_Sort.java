import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private int ID;
    private String name;
    private double CGPA;

    public Student(int ID, String name, double CGPA) {
        this.ID = ID;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class CheckOrder implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getCGPA() == student2.getCGPA()) {
            if (student1.getName().compareTo(student2.getName()) == 0) {
                return student2.getID() - student1.getID();
            }
            else {
                return student1.getName().compareTo(student2.getName());
            }
        }
        else {
            return (int)(student2.getCGPA()*1000 - student1.getCGPA()*1000);
        }
    }
}
public class Asm2_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudent = sc.nextInt();

        Student[] student = new Student[numberOfStudent];
        CheckOrder check = new CheckOrder();

        for (int i = 0; i < numberOfStudent; i++) {
            student[i] = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
        }

        Arrays.sort(student, check);
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName());
        }


    }
}
