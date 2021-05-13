package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int id;
        int salary;
        int numberOfTeachers;
        Teacher teacher;
        List<Teacher> teacherList = new ArrayList<>();

        System.out.print("Ingrese el número de profesores que desea registrar: ");
        numberOfTeachers= scanner.nextInt();

        for(int i = 0; i < numberOfTeachers; i++){

            System.out.print("Nombre: ");
            name = scanner.next();

            System.out.print("Id: ");
            id = scanner.nextInt();

            System.out.print("Salario: ");
            salary = scanner.nextInt();

            teacher = new Teacher(id, name, salary);
            teacherList.add(teacher);

        }

        System.out.println(teacherList.toString());

        String studentName;
        int studentId;
        int grade;
        int numberOfStudents;
        Student student;
        List<Student> studentList = new ArrayList<>();

        System.out.print("Ingrese el número de estudiantes que desea registrar: ");
        numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++ ) {

            System.out.print("Nombre: ");
            studentName = scanner.next();

            System.out.print("Id: ");
            studentId = scanner.nextInt();

            System.out.print("Grado: ");
            grade = scanner.nextInt();

            student = new Student(studentId, studentName, grade);
            studentList.add(student);

        }

        System.out.println(studentList.toString());

        School ghs = new School(teacherList, studentList);

        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).payFees(5000);
        }

        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
        /*
        studentList.get(0).payFees(5000);
        studentList.get(1).payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

         */
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println("------Making GHS PAY SALARY-------");
            teacherList.get(i).receiveSalary(teacherList.get(i).getSalary());
            System.out.println("GHS has spent for salary to " + teacherList.get(i).getName()
                    + " and now has " + ghs.getTotalMoneyEarned());
        }

        /*
        System.out.println("------Making GHS PAY SALARY-------");
        teacherList.get(0).receiveSalary(teacherList.get(0).getSalary());
        System.out.println("GHS has spent for salary to " + teacherList.get(0).getName()
                + " and now has " + ghs.getTotalMoneyEarned());

        teacherList.get(1).receiveSalary(teacherList.get(1).getSalary());
        System.out.println("GHS has spent for salary to " + teacherList.get(1).getName()
                + " and now has " + ghs.getTotalMoneyEarned());

         */

        /*
        Teacher lizzy = new Teacher(1,"Lizzy", 500);
        Teacher melissa = new Teacher(2,"Melissa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshit",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);

        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making GHS PAY SALARY-------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        + " and now has " + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                + " and now has " + ghs.getTotalMoneyEarned());

        System.out.println(rakshith);

        melissa.receiveSalary(melissa.getSalary());

        System.out.println(melissa);

         */
    }
}
