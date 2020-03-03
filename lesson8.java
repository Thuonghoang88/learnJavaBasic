/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
 * Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n. Số nguyên dương n được nhập từ bàn phím.
 */
public class lesson8 {
    public static void showPrimeNumber(){
        System.out.print("Input the number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("List Number is Prime :");
        for(int i = 0 ; i<= number ; i ++ ){
            if(isPrimeNumber(i) && i < number){
                System.out.print(i + ", ");
            } 
            else if(isPrimeNumber(i)){
                System.out.print(i);
            }
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
