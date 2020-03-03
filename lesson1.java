/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * Viết chương trình tìm tất cả các số chia hết cho 7 
 * nhưng không phải bội số của 5, nằm trong đoạn 10 và 200
 * (tính cả 10 và 200). 
 * Các số thu được sẽ được in thành chuỗi trên một dòng, 
 * cách nhau bằng dấu phẩy.
 */
public class lesson1 {
   public static List listNumber(){
       List<Integer> lst = new ArrayList<Integer>();
       for(int i =10; i<=200 ; i++) {
           if((i %7 == 0)&& (i % 5 !=0)){
               lst.add(i);
           }
       }
       return lst;
   }
   public static void showListNumber(List<Integer> lst){
       if(lst!=null && !lst.isEmpty()){
           int size = lst.size();
           for(int i=0 ; i< size -1 ; i++){
               System.out.print(lst.get(i) +", ");
               
           }
           System.out.print(lst.get(size-1));
       }
   }
}
