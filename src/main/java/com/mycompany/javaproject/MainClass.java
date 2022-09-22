/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;

/**
 *
 * @author KIM ANH
 */
public class MainClass {
    //Tim Max by DangCongTung
     public int timMax(int a , int b , int c){ 
        int max = a;
        if(a < b) max = b;
        else if( a < c) max = c;
        return max;
    }
    //TimMin by NguyenVanAnh
    public int timMin(int a , int b , int c){ 
        int min = a;
        if(a > b) min = b;
        else if( a > c) min = c;
        return min;
    }
    public static void main(String[] args) {
        MainClass a = new MainClass();
        //Chạy code trong này
        System.out.println("Min là : "+ a.timMin(10, 22, 9));
        System.out.println("Max là : "+ a.timMax(101, 222, 19));
    }
   //PhepTru by TranTungHuyQuan
    public static void main(String[] args) {
     int num1 = 10, num2 = 7, hieu;
      hieu = num1 - num2;
 
      System.out.println("Hieu hai so la: "+hieu);
   
    }
    //PhepCong by PhamVietLam
     public static void main(String[] args) {
       int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        num1 = sc.nextInt();
 
        System.out.println("Nhập vào số thứ hai: ");
        num2 = sc.nextInt();
 
        sc.close();
        sum = num1 + num2;
        System.out.println("Tổng của hai số vừa nhập là: "+sum);
        // TODO code application logic here
    }

    
}
