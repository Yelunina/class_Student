//#1 Создать класс Student со следующими полями
// (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
// Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
// который возвращает строку с данными студента.
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Jon";
        student1.lastName = "Smith";
        student1.group = 31;

        Student student2 = new Student();
        student2.firstName = "Bill";
        student2.lastName = "Jonson";
        student2.group = 31;


    }

    public static String  studentToString(Student student){
        System.out.println(student.firstName+student.lastName+student.group);
        return student.firstName;
    }
}