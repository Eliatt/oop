import entities.Student;
import entities.Teacher;
import school.ClassRoom;
import school.Grade;
import school.Profession;
import school.School;

public class Main {
    public static void main(String[] args) {
        ClassRoom class1=new ClassRoom("ClassMath",new Teacher("avi",40,Profession.MATH));
        ClassRoom class2=new ClassRoom("ClassChemistry",new Teacher("may",40,Profession.CHEMISTRY));
        ClassRoom class3=new ClassRoom("ClassGeography",new Teacher("roni",50,Profession.GEOGRAPHY));
        ClassRoom class4=new ClassRoom("ClassLiterature",new Teacher("limor",29,Profession.LITERATURE));
        ClassRoom class5=new ClassRoom("ClassPhysics",new Teacher("david",39,Profession.PHYSICK));
        //ClassRoom class6=new ClassRoom("ClassSport",new Teacher("avi",40,Profession.SPORTS));
        ClassRoom[] allClasses={class1,class2,class3,class4,class5};



        School school=new School();
        school.setClassRooms(allClasses);
        for(ClassRoom classRoom: school.getClassRooms()) {
            for (int i = 0; i < classRoom.getStudents().length; i++) {
                classRoom.getStudents()[i] = new Student("Student" +  i, 34);
            }
        }



        for (int i=0;i<school.getClassRooms().length;i++){
            initStudents(school.getClassRooms()[i].getStudents());
        }
        System.out.println(schoolAvg(school));
        System.out.println(school.getClassRooms()[2]);
        System.out.println(schoolAvg(school,Profession.MATH));
    }
    public static void  initStudent(Student student) {
        student.getGrades()[0] = new Grade(Profession.MATH, (int) (Math.random() * 60) + 40);
        student.getGrades()[1] = new Grade(Profession.CHEMISTRY, (int) (Math.random() * 60) + 40);
        student.getGrades()[2] = new Grade(Profession.GEOGRAPHY, (int) (Math.random() * 60) + 40);
        student.getGrades()[3] = new Grade(Profession.LITERATURE, (int) (Math.random() * 60) + 40);
        student.getGrades()[4] = new Grade(Profession.PHYSICK, (int) (Math.random() * 60) + 40);
        student.getGrades()[5] = new Grade(Profession.SPORTS, (int) (Math.random() * 60) + 40);

    }
    public static void  initStudents(Student[] students) {
        for (Student student : students) {
            initStudent(student);
        }

    }
    public static int ranAge(){
        return (int)(Math.random()*120);
    }

    public static int schoolAvg(School school) {
        int count=0;
        int sum=0;
        for (ClassRoom classRoom : school.getClassRooms()){
            for (Student student:classRoom.getStudents()){
                for (Grade grade:student.getGrades()){
                count++;
                    sum+=grade.getScore();
                }

            }
        }
        int avg=sum/count;
        return avg;

    }
    protected static int classAvg(ClassRoom classRoom){
        int count=0;
        int sum=0;
        for (Student student:classRoom.getStudents()){
            for (Grade grade:student.getGrades()){
                count++;
                sum+=grade.getScore();
            }

        }
        int avg=sum/count;
        return avg;
    }

    public static int schoolAvg(School school,Profession profession) {
        int count=0;
        int sum=0;
        for (ClassRoom classRoom : school.getClassRooms()){
            for (Student student:classRoom.getStudents()){
                for (Grade grade:student.getGrades()){
                    if(grade.getProfession()==profession){
                    count++;
                    sum+=grade.getScore();

                    }
                }

            }
        }
        int avg=sum/count;
        return avg;

    }
}
