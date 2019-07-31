package classobject;

public class School {

    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 22);
        Student student2 = new Student("Jan Kowalski", 22);
        System.out.println("Lista studentów: ");
        String student1String = student1.toString();
        String student2String = student2.toString();
        System.out.println(student1String);
        System.out.println(student2String);
    }
}
