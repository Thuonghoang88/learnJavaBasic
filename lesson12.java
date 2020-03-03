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
* Bài 12:
* Viết chương trình tính tổng của các chữ số của môt số nguyên n trong java. 
* Số nguyên dương n được nhập từ bàn phím. Với n = 1234, tổng các chữ số: 1 + 2 + 3 + 4 = 10
 */
public class lesson12 {
  public static void show(){
      System.out.print("Input the number ");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      System.out.println("Cach 1: ");
      totalofNumber(number);
      System.out.println("Cach 2: ");
      totalofNumber2(number);
      
  }
  // cach 1 cat tung ky tu 1 ra => roi convert sang int roi cong
  public static void totalofNumber2(int number ){
      String numberStr = String.valueOf(number);
      int size = numberStr.length();
      int total =0;
      int num;
      for(int i = 0 ; i< size -1 ; i++){
          System.out.print(numberStr.charAt(i) + " + ");
          total += Integer.parseInt(String.valueOf(numberStr.charAt(i)));
      }
      total  += Integer.parseInt(String.valueOf(numberStr.charAt(size-1)));
       System.out.print(numberStr.charAt(size-1) + " = " + total + "\n");
      
  }
  // cach 2 => suy nghi  chia cho 10
   // 123 
    public static void totalofNumber(int number){
        
        List<Integer> lst = new ArrayList<Integer>();
        while(number > 0){
            lst.add(number%10);
            number = (int)(number/10);
        }
        
        int size = lst.size();
        int total =0;
       String notify = "Total of number : ";
        for(int i = size -1; i > 0 ; i -- ){
            notify += lst.get(i) + " + ";
            total += lst.get(i);
        }
        notify += lst.get(0) + " = " + (total + lst.get(0));
        System.out.println(notify);
        
    }
}
