package assignment_project;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FunctionController implements FunctionUtility{
    ArrayList<BaseEntity> dataList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    BaseEntity post = new BaseEntity();

    //1. chuc nang them
    @Override
    public void addPost() {
        System.out.println("please! Enter your staff infomation");
        System.out.println("------------------------------------");
        int choice =0;
        do {
            BaseEntity dataCollect = new BaseEntity();

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
            System.out.println("Your staff infomation with id:" + dataList.get(i).getId());
            System.out.println("------------------------------------");
            System.out.println("Title:" + dataList.get(i).getTitle());
            System.out.println("Descript:" + dataList.get(i).getDescript());
            System.out.println("Avatar:" + dataList.get(i).getAvatar());
            System.out.println("Content:" + dataList.get(i).getContent());
            System.out.println("Day Post:" + dataList.get(i).getDayPost());
            System.out.println("------------------------------------");
        }
    }
    //3. chuc nang search
    @Override
    public void searchPost() {
        BaseEntity post = new BaseEntity();
        int choice =0;
        do {
            System.out.println("please, choice one search option");
            System.out.println("------------------------------------");
            System.out.println("[1]. Search by id");
            System.out.println("[2]. Search by title");
            System.out.println("[3]. Search by Author");
            System.out.println("[4]. Exit");
            System.out.println("------------------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    //1. tim theo ID
                    System.out.println("Please, enter id: ");
                    System.out.println("------------------------------------");
                    long searchId = scanner.nextLong();
                    for (int i = 0; i < dataList.size(); i++) {
                        post = dataList.get(i);
                        if (post.getId()==searchId) {
                            System.out.println("Post id:" + post.getId());
                            System.out.println("Post title:" + post.getTitle());
                            System.out.println("Post descript:" + post.getDescript());
                            System.out.println("Post avatar:" + post.getAvatar());
                            System.out.println("Post content:" + post.getContent());
                            System.out.println("Post author:" + post.getAuthor());
                            System.out.println("Post day post:" + post.getDayPost());
                            System.out.println("------------------------------------");
                        } else {
                            System.out.println("isvalid id");
                            System.out.println("------------------------------------");
                        }
                    }
                    break;
                case 2:
                    //2. tim theo Title
                    String searchTitle;
                    System.out.println("Please, enter Title: ");
                    System.out.println("------------------------------------");
                    searchTitle = scanner.nextLine();
                    for (int i = 0; i < dataList.size(); i++) {
                        post = dataList.get(i);
                        if (Objects.equals(post.getTitle(), searchTitle)) {
                            System.out.println("Post id:" + post.getId());
                            System.out.println("Post title:" + post.getTitle());
                            System.out.println("Post descript:" + post.getDescript());
                            System.out.println("Post avatar:" + post.getAvatar());
                            System.out.println("Post content:" + post.getContent());
                            System.out.println("Post author:" + post.getAuthor());
                            System.out.println("Post day post:" + post.getDayPost());
                        } else {
                            System.out.println("isvalid Title");
                        }
                    }
                    break;
                case 3:
                    //3. tim theo Author
                    String searchAuthor;
                    System.out.println("Please, enter Author: ");
                    System.out.println("------------------------------------");
                    searchAuthor = scanner.nextLine();
                    for (int i = 0; i < dataList.size(); i++) {
                        if (Objects.equals(post.getAuthor(), searchAuthor)) {
                            System.out.println("Post id:" + post.getId());
                            System.out.println("Post title:" + post.getTitle());
                            System.out.println("Post descript:" + post.getDescript());
                            System.out.println("Post avatar:" + post.getAvatar());
                            System.out.println("Post content:" + post.getContent());
                            System.out.println("Post author:" + post.getAuthor());
                            System.out.println("Post day post:" + post.getDayPost());
                        } else {
                            System.out.println("isvalid Author");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("please choice from 1 to 4");
                    break;
            }
        } while (choice!=4);
        //4. tim theo chu cai

    }

    //4. chuc nang xoa
    @Override
    public void deletePost() {
        System.out.println("Please, enter id delete:");
        System.out.println("------------------------------------");
        long searchId = scanner.nextLong();
        for (int i = 0; i < dataList.size(); i++) {
            post = dataList.get(i);
            if (post.getId()==searchId) {
                dataList.remove(dataList.get(i));
                System.out.println("Remove done");
            } else {
                System.out.println("isvalid id");
            }
        }

    }

    //5. chuc nang in
    public void showInfomation(){
        System.out.println("Post id:" + post.getId());
        System.out.println("Post title:" + post.getTitle());
        System.out.println("Post descript:" + post.getDescript());
        System.out.println("Post avatar:" + post.getAvatar());
        System.out.println("Post content:" + post.getContent());
        System.out.println("Post author:" + post.getAuthor());
        System.out.println("Post day post:" + post.getDayPost());
    }
}
