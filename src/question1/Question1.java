/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S542406
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Exam-2 Question-1 : Sai Manideep Allu");
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for(int i=0;i<10;i++)
        {
        list1.add(sc.nextInt());
        }
        removeDuplicate(list1); 
    }
    
    public static void removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (Integer i : list) 
        {
            if (!list2.contains(i)) 
            {
                list2.add(i);
            }
        }
        System.out.print("The distinct integers are ");
        for(Integer i : list2)
        {
        System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
