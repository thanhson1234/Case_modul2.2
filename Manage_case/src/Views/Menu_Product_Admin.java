package Views;

import Controller.Maneger_SignUp;
import Controller.Maneger_admin;
import Model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Product_Admin {
    Maneger_admin maneger_admin = new Maneger_admin();
    Maneger_SignUp maneger_signUp = new Maneger_SignUp();
    Scanner sc = new Scanner(System.in);

    public void Menu_Admin() {
        while (true) {


            System.out.println("=============Menu==========");
            System.out.println("1.  Hiển thị sản phẩm");
            System.out.println("2.  Thêm sản phâm");
            System.out.println("3.  Sửa sản phẩm");
            System.out.println("4.  Xóa sản phẩm");
            System.out.println("5.  tìm kiếm sản phẩm");
            System.out.println("6.  hiển thị danh sách Người dùng");
            System.out.println("7.  Tìm kiếm theo ký tự");
            System.out.println("8.  Xóa Account người dùng");
            System.out.println("9.  Trở về màn hình đăng nhập");
            System.out.println("10. Thoát khỏi trương trình");
            int choice = 0;

            while (choice < 1 || choice > 10) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice < 1 || choice > 10) {
                        System.out.println("mời nhập lại");
                    }
                } catch (Exception e) {
                    System.out.println("sai định dạng mời nhập lại");

                }
            }
            switch (choice) {
                case 1:
                    maneger_admin.show();
                    break;
                case 2:
                    maneger_admin.add();
                    break;
                case 3:
                    maneger_admin.fix();
                    break;
                case 4:
                    maneger_admin.delete();
                    break;
                case 5:
                    maneger_admin.search();
                    break;
                case 6:
                    maneger_signUp.showNV();
                    break;
                case 7:
                    maneger_admin.search_char();
                    break;
                case 8:
                    maneger_signUp.DeleteNV();
                    break;
                case 9:
                    Menu_Account.menu_account.manu();
                    break;
                case 10:
                    return;
            }
        }
    }
}



