package Controller;

import IO.Read_write;
import Model.Account;
import Views.Menu_Product_Admin;
import Views.Menu_product_User;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maneger_SignIn {
    Scanner sc = new Scanner(System.in);
    File file = new File("C:\\Users\\Admin\\Desktop\\Case stady\\Manage_case\\src\\File_Text\\account.txt");
    Read_write read_write = new Read_write();
    Menu_Product_Admin menu_product_admin = new Menu_Product_Admin();

    Menu_product_User menu_product_user = new Menu_product_User();

    Maneger_SignUp signUp ;

    public void singIn() {
        signUp = new Maneger_SignUp();
        boolean check = true;
        while (check) {
            System.out.println("Nhập username");
            String nhap = sc.nextLine();
            System.out.println("Nhập password");
            String pass = sc.nextLine();
            if (nhap.equals("Admin") && pass.equals("123456")) {
                menu_product_admin.Menu_Admin();            // menu admin
                return;
            }else {
                for (int i = 0; i < signUp.getAccounts().size(); i++) {
                    if (signUp.getAccounts().get(i).getUseName().equals(nhap) && signUp.getAccounts().get(i).getPassWord().equals(pass)) {
                        System.out.println("chúc mừng bạn đã đăng nhập thành công");
                        signUp.getAccounts().get(i);
                        menu_product_user.Menu_User();
                        check = false;
                    }
                }
            }
            if (check){
                System.out.println("sai mật khẩu mời nhập lại");
            }

        }
    }
}
