/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
* Bài 05:
* Viết chương trình chuyển đổi 
* một số tự nhiên ở hệ số 10 thành một số ở hệ cơ số B 
* (1 <= B <= 32) bất kỳ. 
* Giả sử hệ cơ số cần chuyển là 2 <= B <= 16. 
* Số đại điện cho hệ cơ số B > 10 là A = 10, B = 11, C = 12, D = 13, E = 14, F = 15.
 */
public class lesson5 {
    public static void showNumber(){
        System.out.print("Nhap so nguyen duong n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("so " + n + " trong he co so 2 = " + convertNumber(n,2) + "\n");
        System.out.print("so " + n + " trong he co so 16 = " + convertNumber(n,16));
    }
    public static String convertNumber(int n, int b){
        // truong hop khong phai he so ( tu 1 den 16 )
        if(n <0 || b < 2 || b >16){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n ;
        while(remainder >0 ){
            if(b>10){
                m = remainder %b;
                if(m >= 10){
                    sb.append((char)(55 + m));
                }else{
                    sb.append(m);
                }
                        
            }else{
                sb.append(remainder %b);
            }
            remainder = (int) remainder/ b;
        }
         return sb.reverse().toString();
    }
 
}
