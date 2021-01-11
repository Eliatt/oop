package entities;

import school.Profession;

public class Teacher extends Person {

    private Profession profession;

    public Teacher(String name, int age, Profession profession) {
        super(name, age);
        this.profession = profession;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                "profession=" + profession +
                "\n"+'}';
    }
}
