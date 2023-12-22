package ru.mirea.lab4_1.task7;

public class Main {
    public static void main(String[] args) {
        Student[] learners = new Student[4];
        learners[0] = new SchoolStudent("Joe", 15);
        learners[1] = new CollegeStudent("Doe", 20);
        learners[2] = new SchoolStudent("John", 13);
        learners[3] = new CollegeStudent("Dough", 22);

        System.out.println("School students:");
        for (Student learner : learners) {
            if (learner instanceof SchoolStudent) {
                learner.study();
            }
        }

        System.out.println("\nCollege students:");
        for (Student learner : learners) {
            if (learner instanceof CollegeStudent) {
                learner.study();
            }
        }
    }
}
