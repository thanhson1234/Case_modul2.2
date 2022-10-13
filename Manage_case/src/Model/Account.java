package Model;

import java.io.Serializable;

public class Account implements Serializable {
    private String useName;
    private String passWord;

    private String number;
    private int age;
    private String fullname;
    private String address;
    private boolean gender;


    @Override
    public String toString() {
        return "Account{" +
                "useName='" + useName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", number='" + number + '\'' +
                ", age=" + age +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Account(String name, String pass, String fullname, int age, String numBer, String adrees, String number) {
        this.useName = name;
        this.passWord = pass;
        this.fullname= fullname;
        this.age = age;
        this.number = numBer;
        this.address = adrees;
    }

    public Account() {

    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }



    public String getFullName() {
        return number;
    }

    public void setFullName(String fullName) {
        this.number = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
