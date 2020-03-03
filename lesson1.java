/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava.Array;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Đề bài: Nhập một mảng số nguyên a0, a1, a2, …, an-1. Liệt kê các phần tử xuất hiện trong mảng đúng 1 lần.
 */
public class lesson1 {
   public static void show(){
       System.out.print("Nhap phan tu cua mang ");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int[] arry = new int[number];
       System.out.print("Nhap cac phan tu cua mang");
       Map<Integer,Integer> hm = new TreeMap<Integer,Integer>();
       for(int i=0 ; i < number ; i ++){
           System.out.printf("arry[%d] = ",i);
           arry[i] = sc.nextInt();
           addElement(hm,arry[i]);
       }
       System.out.println("Cac phan tu xuat hien 1 lan: ");
       for(int i : hm.keySet()){
           if(hm.get(i) == 1){
               System.out.println(i + " xuat hien : " + hm.get(i) );
           }
       }
       System.out.println("Cac phan tu xuat hien 2 lan: ");
       for(int i : hm.keySet()){
           if(hm.get(i) == 2){
               System.out.println(i + " xuat hien : " + hm.get(i) );
           }
       }
       System.out.println("So lan xuat hien cua cac phan tu: ");
       for(int i : hm.keySet()){
            System.out.printf("%d xuat hien : %d \n",i, hm.get(i));
       }
       System.out.println("Sap xep theo thu tu tang dan ");
       sortArrayASC(arry);
       for(int i=0; i< arry.length ; i ++){
           if(i!=0){
               System.out.print(",");
           }
           System.out.print(arry[i]);
       }
       
       System.out.println("\nSap xep theo thu tu giam dan ");
       sortArrayDESC(arry);
       for(int i=0; i< arry.length ; i ++){
           if(i!=0){
               System.out.print(",");
           }
           System.out.print(arry[i]);
       }
       System.out.println("Chen gia tri vao mang:");
       System.out.print("Nhap gia tri Can Chen : ");
       int num = sc.nextInt();
       sortArrayASC(arry);
       System.out.print("\nMang truoc khi chen");
       for(int i=0; i< arry.length ; i ++){
           if(i!=0){
               System.out.print(",");
           }
           System.out.print(arry[i]);
       }
       
       int[] newarray =  insertelement(arry,num);
       System.out.print("\nMang sau khi chen");
        for(int i=0; i< newarray.length ; i ++){
           if(i!=0){
               System.out.print(",");
           }
           System.out.print(newarray[i]);
       }
      System.out.print("\nNoi 2 Mang");
      System.out.print("\nNhap mang thu 1");
      int anum = sc.nextInt();
      int[] a = new int[anum];
      for(int i=0 ; i< anum; i++){
          System.out.printf("arry[%d] = ",i);
           a[i] = sc.nextInt();
           
      }
      System.out.print("\nNhap mang thu 2");
      int bnum = sc.nextInt();
      int[] b = new int[bnum];
      for(int i=0 ; i< bnum; i++){
          System.out.printf("arry[%d] = ",i);
           b[i] = sc.nextInt();
           
      }
      System.out.print("\nMang 1");
        for(int i=0; i< a.length ; i ++){
           if(i!=0){
               System.out.print(",");
           }
           System.out.print(a[i]);
       }
      System.out.print("\nMang 2");
        for(int i=0; i< b.length ; i ++){
           if(i!=0){
               System.out.print(",");
           }
           System.out.print(b[i]);
       }
      System.out.print("\nNoi 2 Mang ");
      int[] c = mergeArray(a,b);
       for(int i=0; i< c.length ; i ++){
           if(i!=0){
               System.out.print(",");
           }
           System.out.print(c[i]);
       }
   } 
  
   /* chen phan tu K vao mang arry 
    * sao cho mang van duy tri duoc su tang dan
   */
   public static int [] insertelement(int[]arry,int k){
       int size = arry.length  ;
       int newsize = arry.length +1;
       int[] newArray = new int[newsize];
       boolean isInsert = false;
       int j = size -1;
       for(int i = newsize -1  ; i>=0; i--){
          if(j >= 0){
           if(!isInsert){
                if(arry[j] > k){
                    newArray[i] =  arry[j];
                }else {
                    newArray[i] = k;
                    i --;
                    newArray[i] = arry[j] ;
                    isInsert = true;
                }
               
           }else{
                   newArray[i] = arry[j] ;
            }
            j--;
          }
        }
       if(!isInsert){
           newArray[0] =  k ;
       }
       return newArray;
   }
    public static void addElement(Map<Integer,Integer> map, int number){
       int count= 1;
       if(map.containsKey(number)){
           count = map.get(number) + 1;
           map.put(number,count);
       }else{
           map.put(number, 1);
       }
   }
   public static void sortArrayASC(int[] lst){
       int temp =0;
       
       for(int i =0; i< lst.length -1; i++){
           for(int j= i+1; j< lst.length ; j++){
               if(lst[i]>lst[j]){
                   temp = lst[i];
                   lst[i] = lst[j];
                   lst[j] = temp;
               }
           }
       }
    }
   public static void sortArrayDESC(int[] lst){
       int temp =0;
       for(int i =0; i< lst.length -1; i++){
           for(int j= i+1; j< lst.length ; j++){
               if(lst[i]<lst[j]){
                   temp = lst[i];
                   lst[i] = lst[j];
                   lst[j] = temp;
               }
           }
       }
    }
   public static int[] mergeArray(int[] a, int[]b){
       int aIndex = a.length -1;
       int bIndex = b.length -1;
       int cIndex = aIndex + bIndex +1;
       int[] c = new int[cIndex+1];
       sortArrayASC(a);
       sortArrayASC(b);
       for(int i = cIndex; i > -1 ; i --){
           if(aIndex >-1 && bIndex > -1){
               if(a[aIndex] > b[bIndex]){
                   c[i] = a[aIndex];
                   aIndex --;
               }else {
                   c[i] = b[bIndex];
                   bIndex --;
               }
           }else if(aIndex == -1){
               c[i] = b[bIndex];
               bIndex --;
           }else if(bIndex == -1){
               c[i] = a[aIndex];
               aIndex -- ;
           }
       }
       return c;
   }
}
