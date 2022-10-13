package Controller;

import java.util.Scanner;

public class Maneger_forget_password {
    Maneger_SignUp maneger_signUp;
    Scanner sc = new Scanner(System.in);

    public void forget() {
        maneger_signUp = new Maneger_SignUp();
        System.out.println("mời bạn nhập số điện thoại");
        String nunBer = sc.nextLine();
        int choice = 0;
        for (int i = 0; i < maneger_signUp.accounts.size(); i++) {
            if (maneger_signUp.accounts.get(i).getNumber().equals(nunBer)) {
                System.out.println("Mật khẩu của bạn là :"+maneger_signUp.accounts.get(i).getPassWord());
                ++choice;

            }
        }
        if (choice == 0) {
            System.out.println("không có trong danh sách");
        }

    }

}
