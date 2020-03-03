/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
* Bài 04:
* Viết chương trình giải phương trình bậc 2: ax2 + bx + c = 0.
 */
public class lesson4 {
    public static void showQuadraticEquation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please in put a.X^2: ");
        float a = sc.nextFloat();
        System.out.print("Please in put b.X: ");
        float b = sc.nextFloat();
        System.out.print("Please input c :");
        float c = sc.nextFloat();
        System.out.println("a.X^2 + b.X + c =0 :" + a + ". X^2 + " + b + ".X + " + c);
        quadraticEquation(a,b,c);
        giaiPTBac2(a,b,c);
    }
    public static void quadraticEquation(float a, float b, float c){
        float delta = b * b - 4 * a * c;
        if(delta <0 ){
            System.out.print("can not find x");
        }else{
            float x1 =(float) (-b + Math.sqrt(delta))/(2*a);
            float x2 =(float) (-b - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = "+ x1 +", X2 = " + x2);
        }
    }
    public static void giaiPTBac2(float a, float b, float c){
        if(a == 0){
            if(b==0){
                System.out.println("Phuong Trinh Vo Nghiem ");
            }else {
                System.out.print(" phuong trinh co mot nghiem: x = " + (-c/b));
            }
            return;
        }
        float delta = b * b - 4 * a *c;
        float x1; float x2;
        if(delta >0 ){
            x1 = (float) (-b + Math.sqrt(delta))/(2 * a);
            x2 = (float) (-b - Math.sqrt(delta))/(2 * a);
            System.out.println("Phuong Trinh co hai nghiem x1 = " + x1 + ", x2 = " + x2);
        }else if(delta ==0){
            x1 =(float) -b/(2*a);
            System.out.println("Phuowng trinh co nghiem kep X1, X2 = " + x1);
        }else {
            System.out.println("Phuong Trinh khong co nghiem ");
        }
    }
}
