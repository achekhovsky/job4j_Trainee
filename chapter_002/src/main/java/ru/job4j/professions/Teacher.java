package ru.job4j.professions;

import java.util.Arrays;

/**
 * This class for profession teacher.
 * @author achekhovsky
 * @version 1.0
 */
public class Teacher extends Profession {
    private Profession[] students;

    /**
     * Construct a new Teacher object with default values.
     */
    public Teacher() {
        super();
        students = new Profession[1];
    }
    /**
     * Construct a new Teacher object with the specified values.
     * @param name - the name
     * @param surname - the surname
     * @param age - the age
     */
    public Teacher(String name, String surname, int age) {
        this.setName(name);
        this.setSurname(surname);
        students = new Profession[1];
        this.setAge(age);
    }

    /**
     * This method adds the student to the list of teacher
     * @param student
     */
    public void takeStudent(Profession student) {
        int ln = students.length;
        if (students[ln - 1] != null) {
            students = Arrays.copyOf(students, ln * 2);
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    /**
     * This method displays a list of students which the teacher teaches.
     * @return a list of patients
     */
    public String teach() {
        StringBuffer result = new StringBuffer("Доктор " + this.getName() + " лечит:" + System.lineSeparator());
        for (Profession student : students) {
            result.append(student.getName() + System.lineSeparator());
        }
        return result.toString();
    }

}
