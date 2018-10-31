/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumbers;

import java.util.Scanner;



/**
 *
 * @author aemal4075
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        int [ ] randomNum = new int [10];
        int minimum;
        int maximum;
        int num;
        
        for(int i = 0; i < randomNum.length; i = i + 1)
        {
            randomNum[i] = (int)(Math.random()*100);
            System.out.println(randomNum[i]);
        }
        
        minimum = randomNum [0];
        maximum = randomNum [0];
        for (int i = 0; i < randomNum.length; i = i + 1)
            
        
        {
            if (randomNum [i] < minimum)
            {
              minimum = randomNum[i];
                 System.out.println(randomNum[i] + " Is the minimum value.");
              
            }
            
            if (randomNum [i] > maximum)
            {
                maximum = randomNum [i];
                    System.out.println(randomNum[i] + " Is the maximum value.");
            }
        }
    }
    
}
