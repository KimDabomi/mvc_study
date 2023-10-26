import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();;
        controller.setStudentRollNum("4567");
        controller.updateView();;
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Kim");
        student.setRollNo("1234");
        return student;
    }
}