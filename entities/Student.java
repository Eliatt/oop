package entities;

import school.Grade;
import school.Profession;

import java.util.Arrays;

public class Student extends Person {

    private Grade[]grades;

    public Student(String name, int age) {
        super(name, age);
        this.grades=new Grade[Profession.values().length];

    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student\n{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                "grades=" + Arrays.toString(grades) +
                +'}';
    }
}
