package assignment_project;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        FunctionController functionController = new FunctionController();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Choice one option");
            System.out.println("------------------------------------");
            System.out.println("[1]. Add Post");
            System.out.println("[2]. Show Post");
            System.out.println("[3]. Search Post");
            System.out.println("[4]. Delete Post");
            System.out.println("[5]. Exit");
            System.out.println("------------------------------------");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    functionController.addPost();
                    break;
                case 2:
                    functionController.showPost();
                    break;
                case 3:
                    functionController.searchPost();
                    break;
                case 4:
                    functionController.deletePost();
                    break;
                case 5:
                    System.out.println("goodbye!");
                    System.out.println("------------------------------------");
                    break;
                default:
                    System.out.println("isvalid option");
                    break;
            }
        } while (choice!=5);

    }
}
