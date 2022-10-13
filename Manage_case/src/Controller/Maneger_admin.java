package Controller;

import IO.Read_write;
import Model.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maneger_admin {

    File file = new File("C:\\Users\\Admin\\Desktop\\Case stady\\Manage_case\\src\\File_Text\\NameSanPham.txt");

    Scanner sc = new Scanner(System.in);
    Read_write<Product> read_write = new Read_write<>();

    ArrayList<Product> menu_product_admins = read_write.read(file);

    public Product information() {
        int id = 0;
        while (true) {
            System.out.println("Nhập id");
            try {
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("sai định dạng vui lòng nhập lại");
            }
        }
        System.out.println("nhập tên sản phẩm");
        String name = sc.nextLine();

        System.out.println("nhập giá sản phẩm");
        Double price = Double.valueOf(sc.nextLine());

        System.out.println("nhập mô tả");
        String describe = sc.nextLine();

        System.out.println("số lượng");
        int amount = 0;
        while (true) {
            try {
                amount = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("sai định dạng mời nhập lại");
            }
        }
        Object spM = new Product(id, name, price, describe, amount);
        read_write.write(file, menu_product_admins);
        return (Product) spM;
    }

    public void show() {
        for (int i = 0; i < menu_product_admins.size(); i++) {
            System.out.println(menu_product_admins.get(i).toString());
        }
    }

    public void add() {
        menu_product_admins.add(information());
        read_write.write(file, menu_product_admins);
        show();
    }

    public void fix() {
        System.out.println("nhập tên muốn sửa");
        String fixx = sc.nextLine();
        for (int i = 0; i < menu_product_admins.size(); i++) {
            if (menu_product_admins.get(i).getName().equals(fixx)) {
                menu_product_admins.set(i, information());
            }
        }
    }

    public void delete() {
        System.out.println(" nhập id muốn xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < menu_product_admins.size(); i++) {
            if (menu_product_admins.get(i).getId() == id) {
                System.out.println("bạn bấm 'Y' để xóa sản phẩm");
                String y = sc.nextLine();
                if (y.equals("y"))
                    menu_product_admins.remove(menu_product_admins.get(i));
            }
        }
    }

    public void search() {
        System.out.println("nhập tên muốn tìm");
        String name = sc.nextLine();
        for (int i = 0; i < menu_product_admins.size(); i++) {
            if (menu_product_admins.get(i).getName().equals(name)) {
                System.out.println(menu_product_admins.get(i));
            }
        }
    }
    public void search_char(){
        System.out.println("nhập chữ cái muốn tìm kiếm");
        String c= sc.nextLine();
        for (int i = 0; i < menu_product_admins.size(); i++) {
            if (menu_product_admins.get(i).getName().charAt(0) == c.charAt(0)) {
                System.out.println(menu_product_admins.get(i).toString());
            }
        }
    }
}
