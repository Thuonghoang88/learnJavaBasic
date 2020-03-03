/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
 * Viết chương trình tìm ước số chung lớn nhất (USCLN)
 * và bội số chung nhỏ nhất (BSCNN) 
 * của hai số nguyên dương a và b nhập từ bàn phím.
 */
public class lesson7 {
    public static void show(){
        System.out.print("Please input the number 1 ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         System.out.print("\nPlease input the number 2 ");
        int b = sc.nextInt();
        System.out.println("uoc so chung lon nhat cua " + a + " va " + b + " la: " + USCLN(a,b));
        System.out.println("boi so chung nho nhat cua " + a + " va " + b + " la: " + BSCNN(a,b));
    }
    // USCLN
    public static int USCLN(int a, int b){
        if(a > b){
            if(b==0) return a;
            return USCLN(b,a%b);
        }else {
            if (b==0) return a;
            return USCLN(a,b%a);
        }
    }
    // BSCNN
    public static int BSCNN(int a, int b){
        return a*b/(USCLN(a,b));
    }
}
