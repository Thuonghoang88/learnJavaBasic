/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.HashMap;
import java.util.Scanner;

/**
* Bài 03:
* Hãy viết chương trình để tạo ra một map chứa (i, i*i), 
* trong đó i là số nguyên từ 1 đến n (bao gồm cả 1 và n), 
* n được nhập từ bàn phím. Sau đó in map này ra màn hình. 
* Ví dụ: Giả sử số n là 8 thì đầu ra sẽ là: {1: 1, 2: 4, 3: 9, 4: 16, 5: 25, 6: 36, 7: 49, 8: 64}.
 */
public class lesson3 {
   public static void showMap(){
       System.out.print("Please input the number: ");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
      
       HashMap<Integer, Integer> lshm = mapNumber(number);
       
       System.out.print(lshm);
   }
   public static HashMap<Integer, Integer> mapNumber(int n){
       HashMap<Integer,Integer> hm = new HashMap();
       for(int i=1; i<= n; i++ ){
          
           hm.put(i, i*i);
       }
       return hm;
   }
}
