package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("ชื่ออะไรหรอ? : ");
        name = sc.nextLine();

        String age;
        System.out.print("อายุเท่าไร: ");
        age = sc.nextLine();

        String sex;
        System.out.println("เพศอะไร: ");
        sex = sc.nextLine();

        String phonenumber;
        System.out.print("เบอร์โทรศัพท์หมายเลข: ");
        phonenumber = sc.nextLine();

        String adrass;
        System.out.print("ที่อยู่ปัจจุบัน: ");
        adrass = sc.nextLine();

        System.out.println("ชื่อของคุณ," + name);
        System.out.println("อายุ" + age + "ปี");
        System.out.println("เพศ" + sex);
        System.out.println("เบอร์โทรศัพท์ของคุณหมายเลข" + phonenumber);
        System.out.println("ที่อยู่ปัจจุบันของคุณ" + adrass);


    }//main

}//class








