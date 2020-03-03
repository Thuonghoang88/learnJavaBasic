/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
 *
 * Bài tập Python: Viết chương trình liệt kê các số Fibonacci nhỏ hơn n 
 * là số nguyên tố trong Java. N là số nguyên dương được nhập từ bàn phím.
 */
public class lesson14 {
    public static void show(){
        System.out.print("Input the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fb =0;
        
        for(int i= 0; i<= number; i++){
            fb  = fibonacci(i);
            if((fb < number) && isPrime(fb)){
                if( i>0 ){
                    System.out.print(",");
                }
                System.out.print(fb);
            }
        }
    }
 public static boolean isPrime(int number){
     if(number <0 ){
         return false;
     }
     else if(number <2 ){
         return false;
     }
     int square = (int) Math.sqrt(number);
     for(int i=2; i <= square; i++){
         if(number % i == 0){
             return false;
         }
     }
     return true;
 }   
 public static int fibonacci(int number){
    if(number == 0 || number == 1){
        return number;
    } else{
        return fibonacci(number -1 ) + fibonacci(number-2);
    }
     
 }   
}   
