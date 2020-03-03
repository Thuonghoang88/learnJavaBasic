/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
 * Viết chương trình liệt kê n số nguyên tố đầu tiên trong java. Số nguyên dương n được nhập từ bàn phím.
 * 
 */
public class lesson9 {
    public static void showPrimeNNumber(){
        System.out.print("Input the number of Prime : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;
        int i =0;
        System.out.print("List of Prime: ");
        while (count <= number){
            if(isPrimeNumber(i) && count < number) {
                System.out.print(i + ",");
                count ++;
            }
            else if(isPrimeNumber(i) && count == number) {
                System.out.print(i );
                count ++;
            }
            i ++;
            
        }
        
    }
    public static boolean isPrimeNumber(int number ){
        if(number < 0 ){
            return false;
        }else{
            int square =(int) Math.sqrt(number);
            for(int i =2 ; i<= square ; i ++){
                if(number % i == 0) return false ;
            }
        }
        return true;
    } 
}
