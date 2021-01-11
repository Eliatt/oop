package entities;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
            // Check age val
        if (age>0&&age<120){
        this.age = age;
        }else{
            this.age=10;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>0&&age<120){
            this.age = age;
        }else{
            this.age=10;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
