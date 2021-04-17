/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author S542406
 */
public class Question2 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Exam-2 Question-2 : Sai Manideep Allu");
       int[][] a1 =  new int[3][3]; 
       int[][] a2 =  new int[3][3];
        System.out.print("Enter list1: ");
        for(int i=0; i<a1[0].length; i++)
        {
           for(int j=0; j<a1[0].length; j++)
           {
               a1[i][j] = sc.nextInt();
           }
       }
        System.out.println();
        System.out.print("Enter list2: ");
        for(int i=0; i<a2[0].length; i++)
        {
           for(int j=0; j<a2[0].length; j++)
           {
               a2[i][j] = sc.nextInt();
           }
       }
       if (equals(a1, a2)) 
       {
           System.out.println("The two arrays are strictly identical");
       } 
       else 
       {
           System.out.println("The two arrays are not strictly identical");
       }
   }
   public static boolean equals(int[][] m1,int[][] m2) 
   {
       if (m1 == null) 
       {
           return (m2 == null);
       }
       if (m2 == null) 
       {
           return false;
       }
       if (m1.length != m2.length) 
       {
           return false;
       }
       for (int i = 0; i < m1.length; i++) 
       {
           if (!Arrays.equals(m1[i], m2[i])) 
           {
               return false;
           }
       }
       return true;
    }
}
