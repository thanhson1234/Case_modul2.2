package Controller;

import IO.Read_write;
import Model.Account;
import Views.Menu_Account;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maneger_SignUp {
    Scanner sc = new Scanner(System.in);
    File file = new File("C:\\Users\\Admin\\Desktop\\Case stady\\Manage_case\\src\\File_Text\\account.txt");
    Read_write read_write = new Read_write();
    ArrayList<Account> accounts = read_write.read(file);
    String regex = "^[A-Za-z0-9]{5,}@thanhson.com$";
    Pattern pattern = Pattern.compile(regex);

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void SignUp() {
        accounts = read_write.read(file);
        String name = "";
        boolean check = true;
        while (true) {
            System.out.println("nhập User Name chữ đầu tiên viết hoa, tối tiểu 6 ký tự và kết thúc bằng @thanhson.com");
            while (check) {
                name = sc.nextLine();
                if (checkUserName(name)) {
                    check = false;
                } else {
                    System.out.println("Trùng User2 name mời nhập lại");
                }
            }
            Matcher matcher = pattern.matcher(name);                    // nhập đúng kí tự
            if (matcher.matches()) {
                System.out.println("Hợp lệ");
                break;
            } else {
                System.out.println("Không hợp lệ");
                check = true;
            }
        }
        System.out.println("nhập Password");
        String pass = sc.nextLine();


        System.out.println("nhập full name");
        String fullname = sc.nextLine();

        int age = 0;
        while (true) {
            System.out.println("nhập tuổi");
            try {
                age = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("sai định dạng mời nhập lại");
            }
        }
        System.out.println("nhập địa chỉ");
        String adrees = sc.nextLine();

        System.out.println("nhập giới tính");
        String gender = sc.nextLine();

        System.out.println("nhập số điện thoại");
        String number = sc.nextLine();

        accounts.add(new Account(name, pass, fullname, age, number, gender, adrees));
        read_write.write(file, accounts);
        Menu_Account.menu_account.manu();
    }


    public boolean checkUserName(String UserName) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUseName().equals(UserName)) {
                return false;
            }
        }
        return true;
    }

    public void showNV() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).toString());
        }
    }
public void DeleteNV(){
    System.out.println("nhập tên muốn xóa ");
    String name = sc.nextLine();
    for (int i = 0; i < accounts.size(); i++) {
        if (accounts.get(i).getUseName().equals(name)){
            System.out.println("bấm 'y' để xóa");
            String y = sc.nextLine();
            if (y.equals("y")){
            accounts.remove(i);

            }
        }
    }
    System.out.println("xóa thành công");
}
}
