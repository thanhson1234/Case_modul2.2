package Views;

import Controller.Maneger_User;

import java.util.Scanner;

public class Menu_product_User {
    //    Menu_Account menu_account = new Menu_Account();
    Scanner sc = new Scanner(System.in);
    Maneger_User maneger_user = new Maneger_User();

    public void Menu_User() {
        int choice = 0;
        while (true) {

        System.out.println("=============Menu==========");
        System.out.println("1.Hiển thị sản phẩm");
        System.out.println("2.Thêm vào giỏ hàng");
        System.out.println("3.Hiển thị giỏ hàng");
        System.out.println("4.Xóa sản phẩm trong giỏ hàng");
        System.out.println("5.Tính tổng tiền giỏ hàng");
        System.out.println("6. Trở về màn hình chính");

            choice = Integer.parseInt(sc.nextLine());
            while (choice < 1 || choice > 7) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice < 1 || choice > 7) {
                        System.out.println("mời nhập lại từ 1 đến 6");
                    }
                } catch (Exception e) {
                    System.out.println("sai định dạng mời nhập lại");
                }
            }

            switch (choice) {
                case 1:
                    maneger_user.ShowSp();
                    break;
                case 2:
                    maneger_user.addcart();
                    break;
                case 3:
                    maneger_user.showcart();
                    break;
                case 4:
                    maneger_user.DeleteSp();
                    break;
                case 5:
                    //maneger_user.totalMoney();
                    maneger_user.payment();
                    break;
                case 6:
                    Menu_Account.menu_account.manu();
                    return;
            }
        }
    }
}
