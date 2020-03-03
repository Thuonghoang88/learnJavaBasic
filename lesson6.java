/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
* Bài 06:
* Dãy số Fibonacci được định nghĩa như sau: F0 = 0, F1 = 1, F2 = 1, Fn = F(n-1) + F(n-2) với n >= 2. 
* Ví dụ: 0, 1, 1, 2, 3, 5, 8, ... Hãy viết chương trình tìm n số Fibonacci đầu tiên.
 */
public class lesson6 {
    public static void showArrayFibonacci(){
        System.out.print("Please input number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       for(int i = 0;i < number  ; i++) {
         
           System.out.print(fibonacci2(i) + ", ");
       }
       System.out.print(fibonacci2(number));
       
    }
    // su dung de quy
    public static int fibonacci( int n){
        if(n ==0 || n == 1){
            return n ;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    // ko su dung de quy
    public static int fibonacci2(int n){
        int f1 =0;
        int f2 =0;
        int fn = 1;
        if(n<=0|| n==1){
           return n;
        }else{
            for (int i =2 ; i <=n ; i++ ){
                f1 = f2;
                f2 = fn;
                fn = f1 + f2;
                
              
            }
        }
        return fn;
    }
}
