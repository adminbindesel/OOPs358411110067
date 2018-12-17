package lab4;

import java.util.Scanner;

public class Ouiz_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter integer 1: ");
        x = sc.nextInt();
        System.out.println("Enter integer 1: ");
        y = sc.nextInt();
        //call methods
        System.out.println("ผลการบวก = "+sumt(x,y));
        System.out.println("ผลการลบ = "+subt(x,y));
        System.out.println("ผลการคูณ = "+mult(x,y));
        System.out.println("ผลการหาร = "+divt(x,y));

    }//main
    private static  int divt (int x, int y){
        return x / y;
    }   private static  int mult (int x, int y){
        return x * y;
    }   private static  int subt (int x, int y){
        return x - y;
    }   private static  int sumt (int x, int y){
        return x + y;
    }
}//class

