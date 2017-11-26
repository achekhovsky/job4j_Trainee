package ru.job4j.professions;

import java.util.Arrays;

/**
 * This class for profession engineer.
 * @author achekhovsky
 * @version 1.0
 */
public class Engineer extends Profession {
    private int rank;
    private Project[] developments;

    /**
     * Construct a new Engineer object with default values.
     */
    public Engineer() {
        super();
        developments = new Project[1];
        this.rank = 0;
    }
    /**
     * Construct a new Engineer object with the specified values.
     * @param name - the name
     * @param surname - the surname
     * @param age - the age
     */
    public Engineer(String name, String surname, int age, int rank) {
        this.setName(name);
        this.setSurname(surname);
        developments = new Project[1];
        this.setAge(age);
        this.rank = rank;
    }

    /**
     * Getter for the rank.
     * @return rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * Setter for the rank.
     * @param rank - new value for the rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * To develop a new project
     * @param prj - new project
     */
    public void design(Project prj) {
        int ln = developments.length;
        if (developments[ln - 1] != null) {
            developments = Arrays.copyOf(developments, ln * 2);
        }
        for (int i = 0; i < developments.length; i++) {
            if (developments[i] == null) {
                developments[i] = prj;
                break;
            }
        }
    }

    /**
     * Getter for the projects
     * @param index - indexof the project
     * @return project
     */
    public Project getProject(int index) {
        try {
            return developments[index];
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Inner class Project
     */
    private class Project {
        String projectName;
        /**
         * Construct a new Project object with default values.
         */
        Project() {
            projectName = "";
        }

        /**
         * Getter fot the prijectName
         * @return projectName
         */
        public String getProjectName() {
            return projectName;
        }

        /**
         * Setter for the projectName
         * @param projectName - new value for the projectName
         */
        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }
    }
}
