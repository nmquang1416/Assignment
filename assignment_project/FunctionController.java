package assignment_project;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionController implements FunctionUtility{
    ArrayList<BaseEntity> dataList = new ArrayList<>();
    BaseEntity dataCollect = new BaseEntity();
    Scanner scanner = new Scanner(System.in);

    //1. chuc nang them
    @Override
    public void addPost() {
        System.out.println("please! Enter your staff infomation");
        System.out.println("------------------------------------");
        int choice =0;
        do {
            System.out.println("Input id:");
            dataCollect.setId(scanner.nextLong());
            scanner.nextLine();

            System.out.println("Input title:");
            dataCollect.setTitle(scanner.nextLine());

            System.out.println("Input descript:");
            dataCollect.setDescript(scanner.nextLine());

            System.out.println("Input avatar: ");
            dataCollect.setAvatar(scanner.nextLine());

            System.out.println("Input content: ");
            dataCollect.setContent(scanner.nextLine());

            System.out.println("Input Author:");
            dataCollect.setAuthor(scanner.nextLine());

            System.out.println("Input Day Post:");
            dataCollect.setDayPost(scanner.nextLine());

            dataList.add(dataCollect);
            System.out.println("Do you want continues import data?");
            System.out.println("[1]. Yes");
            System.out.println("[2]. No");
            choice = scanner.nextInt();

        } while (choice == 1);
    }
    //2. chuc nang hien thi
    @Override
    public void showPost() {
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println("Your staff infomation with id:" );
            System.out.println("------------------------------------");

        }
    }
    //3. chuc nang search
    @Override
    public void searchPost() {

    }
    //4. chuc nang xoa
    @Override
    public void deletePost() {

    }
}
