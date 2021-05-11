package school.management.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and students
 * using an ArrayList.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in the school.
     * @param students list of the students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }


}
