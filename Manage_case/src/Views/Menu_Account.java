package Views;

import Controller.Maneger_SignIn;
import Controller.Maneger_SignUp;
import Controller.Maneger_forget_password;

import java.util.Scanner;

public class Menu_Account {
    Scanner sc = new Scanner(System.in);
    Maneger_SignUp signUp = new Maneger_SignUp();
    Maneger_SignIn maneger_signIn = new Maneger_SignIn();
    public static Menu_Account menu_account;

    Maneger_forget_password password = new Maneger_forget_password();

    public void manu() {
        int choice = 0;

        while (true) {
            System.out.println("======= Welcome to ThanhSơn Company International =========");
            System.out.println("=                                                         =");
            System.out.println("=                    1.Đăng nhập                          =");
            System.out.println("=                                                         =");
            System.out.println("=                    2. Đăng ký                           =");
            System.out.println("=                                                         =");
            System.out.println("=                    3. Quên mật khẩu                     =");
            System.out.println("=                                                         =");
            System.out.println("=                    4. Thoát                             =");
            System.out.println("=                                                         =");
            System.out.println("===========================================================");
            while (choice < 1 || choice > 4) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice < 1 || choice > 4) {
                        System.out.println("mời nhập lại");
                    }
                } catch (Exception e) {
                    System.out.println("sai định dạnh mời nhập lại");
                }
            }
            switch (choice) {
                case 1:
                    maneger_signIn.singIn();
                    break;
                case 2:
                    signUp.SignUp();
                    break;
                case 3:
                    password.forget();
                    break;
                case 4:
                    return;
            }
            choice = 0;
        }
    }
}
