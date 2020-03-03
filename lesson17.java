/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
 * Để kiểm tra chuỗi s1 chứa chuỗi s2 hay không, bạn có thể sử dụng phương thức contains() trong java.
 */
public class lesson17 {
    public static void print(){
        System.out.println("input first string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("input second string: ");
        String str2 = sc.nextLine();
        if(isContain(str1,str2)){
            System.out.print(str1 + " contain " + str2 );
        }else {
            System.out.print(str1 + " not contain  " + str2 );
        }
        
    }
    public static boolean isContain(String str1,String str2){
        if(str1.contains(str2)){
            return true;
        }
        return false;
    }
}
