/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.function;

/**
 *
 * @author HOANGANH
 */
import java.util.Scanner;
public class Arrangement {
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
        int [] a=new int[5];
        int i,j,tempt;           
        System.out.println("Nhap vao cac phan tu cua mang: ");
        for(i=0;i<5;i++){
            System.out.println("a"+"["+i+"]"+"=" );
            a[i]=input.nextInt();
        }
        System.out.println("Sap xep theo thu tu tang dan: ");
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j]){
                    tempt=a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
            System.out.println("a"+"["+i+"]"+"=");
            System.out.println(a[i]);
        }
    
}
}