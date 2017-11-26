package ru.job4j.professions;

import java.util.Arrays;

/**
 * This class for profession doctor.
 * @author achekhovsky
 * @version 1.0
 */
public class Doctor extends Profession {
    private String specialization;
    private Profession[] patients;

    /**
     * Construct a new Doctor object with default values.
     */
    public Doctor() {
        super();
        specialization = "";
        patients = new Profession[1];
    }
    /**
     * Construct a new Doctor object with the specified values.
     * @param name - the name
     * @param surname - the surname
     * @param spec - the specialization
     * @param age - the age
     */
    public Doctor(String name, String surname, String spec, int age) {
        this.setName(name);
        this.setSurname(surname);
        specialization = spec;
        patients = new Profession[1];
        this.setAge(age);
    }

    /**
     * This method adds the patient to the list of doctor
     * @param patient
     */
    public void takePatient(Profession patient) {
        int ln = patients.length;
        if (patients[ln - 1] != null) {
            patients = Arrays.copyOf(patients, ln * 2);
        }
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = patient;
                break;
            }
        }
    }

    /**
     * this method displays a list of patients which the doctor heal.
     * @return a list of patients
     */
    public String heal() {
        StringBuffer result = new StringBuffer("Доктор " + this.getName() + " лечит:" + System.lineSeparator());
        for (Profession patient : patients) {
            result.append(patient.getName() + System.lineSeparator());
        }
        return result.toString();
    }
}
