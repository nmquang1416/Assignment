package assignment_project.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //tao ra mot array list Student dung de chua danh sach sinh vien
        ArrayList<Student> danhSachSinhVien = new ArrayList<Student>();
        //Tao ra doi tuong cu the cua lop Student.
        Student st1 = new Student(7, "Hung", "Dao");
        //dua doi tuong vao danh sach
        danhSachSinhVien.add(st1);
        Student st2 = new Student(8, "Quang", "Minh");
        danhSachSinhVien.add(st2);
        Student st3 = new Student(9, "Hoang", "Dao");
        danhSachSinhVien.add(st3);
        Student st4 = new Student(10, "Huyen", "Minh");
        danhSachSinhVien.add(st4);
        Student st5 = new Student(11, "Hao", "Dao");
        danhSachSinhVien.add(st5);

        //Tao bien de luu index cua phan tu tim duoc

        int searchIndex = 0;
        //Tao bien luu tu khoa tim kiem

        System.out.println("nhap thong search id: ");
        int searchKey = scanner.nextInt();

//        long searchKey = 10;// tim sinh vien co id = 15

        //foreach, duyet qua cac phan tu cua list
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            //lay ra phan tu tai index thu i.
            Student student = danhSachSinhVien.get(i);
            //so sanh neu trung voi tu khoa
            if (student.getId() == searchKey) {
                //luu lai index cua phan tu
                danhSachSinhVien.remove(danhSachSinhVien.get(i));
                System.out.println("done");
//                searchIndex = i;
//                System.out.println(student.getId());
//                System.out.println(student.getLastName());
//                System.out.println(student.getFirstName());
            }
            //gan gia tri ra bien name va in ra
//            System.out.printf("Student" + student.getId(), student.getLastName(),student.getFirstName());
        }
        System.out.println(danhSachSinhVien);
    }
}
