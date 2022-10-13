package Controller;

import Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Maneger_User {
    ArrayList<Product> exceptions = new ArrayList<>();
    Maneger_admin maneger_admin = new Maneger_admin();
    Scanner sc = new Scanner(System.in);

    public void ShowSp() {
        for (int i = 0; i < maneger_admin.menu_product_admins.size(); i++) {
            System.out.println(maneger_admin.menu_product_admins.get(i).toString());
        }
    }

    public void addcart() {

        System.out.println("nhập id thêm vào giỏ hàng");
        int id = 0;
        while (true) {
            try {
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("sai định dạng mời nhập lại");
            }
        }
        for (int i = 0; i < maneger_admin.menu_product_admins.size(); i++) {
            if (id == maneger_admin.menu_product_admins.get(i).getId()) {
                exceptions.add(maneger_admin.menu_product_admins.get(i));
            }
        }
    }

    public void showcart() {
        for (int i = 0; i < exceptions.size(); i++) {
            System.out.println(exceptions.get(i));
        }
    }

    public void DeleteSp() {
        System.out.println("nhập id muốn xóa");
        int id = 0;
        try {
            id = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("sai định dạng mời nhập lại");
        }
        for (int i = 0; i < exceptions.size(); i++) {
            if (id == exceptions.get(i).getId()) {
                System.out.println("bạn bấm 'Y' để xóa sản phẩm");
                String y = sc.nextLine();
                if (y.equals("Y"))
                    exceptions.remove(i);
            } else {
                System.out.println("không xóa");
            }
        }
    }

    public double totalMoney() {
        double total = 0.0;
        for (int i = 0; i < exceptions.size(); i++) {
            total += exceptions.get(i).getPrice();
        }
        System.out.println(total);
        return total;
    }

    public void payment() {
        System.out.println("Bạn có muốn thanh toán cho đơn hàng?");
        showcart();
        System.out.println("nhấp y để mua hàng");
        String y = sc.nextLine();
        if (y.equals("y")) {
            System.out.println("Bạn đã thanh toán " + totalMoney() + " cho đơn hàng!");
            exceptions = new ArrayList<>();
        }
    }
}

