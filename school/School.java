package school;

import java.util.Arrays;

public class School {
    ClassRoom[]classRooms;

    public School() {
        this.classRooms = new ClassRoom[5];
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    @Override
    public String toString() {
        return "School{" +
                "classRooms=" + Arrays.toString(classRooms) +
                '}';
    }
    public int schoolAvg(){

        return 1;
    }
    public int schoolAvgType(Profession profession){
        return 1;
    }
}
