package assignment_project;

public class MainThread {
    public static void main(String[] args) {
        FunctionController functionController = new FunctionController();
        functionController.addPost();

        functionController.showPost();
    }
}
