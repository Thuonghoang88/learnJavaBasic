/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Duyệt các số từ 100000 đến 999999, 
 * rồi phân tách số hiện tại thành các chữ số đơn lẻ để kiểm tra tính thuận nghịch.
 * 123321 true
 * 123451 = false
 */
public class lesson13 {
    public static void showThuanNghich(){
        System.out.println("Input the number");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int count = 0;
        System.out.println("Danh sach so thuan nghic theo cach 1");
        for(int i = 1; i <= number ; i ++){
            if(isThuanNghich(i) ){
                if (count !=0 ){
                    System.out.print(",");
                }
                System.out.print(i);
                if(count ==9){
                    System.out.print("\n");
                    count =0;
                }else{
                    count ++;
                }
            }
        }
        count = 0;
        System.out.println("\nDanh sach so thuan nghic theo cach 2");
        for(int i = 1; i <= number ; i ++){
            if(isThuanNghich2(i)){
                if (count !=0 ){
                    System.out.print(",");
                }
                System.out.print(i);
                if(count ==9){
                    System.out.print("\n");
                    count = 0;
                }else{  
                    count ++;
                }
            }
        }
    }
    public static boolean isThuanNghich2(int n){
        String numStr = String.valueOf(n);
        int size = numStr.length();
        if(size %2 != 0){
            return false;
        }else {
            for(int i=0 ; i<= size/2 ; i ++){
                if(numStr.charAt(i)!= numStr.charAt(size- i - 1)){
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean isThuanNghich(int n){
        List<Integer> lst = new ArrayList<Integer>();
        while(n>0){
           lst.add(n%10);
           n= (int) n/10;
        }
        int size = lst.size();
        if(size%2 !=0){
            return false;
        }else{
           for(int i =0; i < size/2;i++){
               if(lst.get(i) != lst.get(size -i -1)){
                   return false;
               }
           } 
           return true;
        }
    }
}
