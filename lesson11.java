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
* Viết chương trình phân tích số nguyên n thành các thừa số nguyên tố trong java. Ví dụ: 100 = 2x2x5x5.
 */
public class lesson11 {
    public static void showArray(){
        System.out.print("Input the number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> lst = thuaSonguyento(number);
        int size = lst.size();
         System.out.print(number + " = ");
        for(int i=0; i< size -1; i++){
            System.out.print(lst.get(i) + "x");
        }
        System.out.println( lst.get(size-1) +"\n" );
    }
    
    public static List<Integer> thuaSonguyento(int n){
        List<Integer> lst = new ArrayList<Integer>();
        int i = 2;
        while(n>1){
            if(n % i == 0){
                lst.add(i);
                n = (int) n/i;
            }else{
                i++;
            }
        }
     return lst;   
    }
}
