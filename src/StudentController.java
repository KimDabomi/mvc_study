public class StudentController {
    // Model Object
    private Student model;
    // View Object
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Control model object
    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentRollNum(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentName() {
        return model.getName();
    }

    public String getStudentRollNum() {
        return model.getRollNo();
    }

    // Control view object
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
