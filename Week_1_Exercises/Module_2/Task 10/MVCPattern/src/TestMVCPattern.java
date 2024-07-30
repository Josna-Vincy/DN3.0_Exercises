public class TestMVCPattern {
    public static void main(String[] args) {
        Student student = new Student("1", "Josna Vincy", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
        controller.setStudentName("Josna Vincy S");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
