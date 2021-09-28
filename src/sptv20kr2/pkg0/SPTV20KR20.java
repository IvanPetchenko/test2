/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20kr2.pkg0;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20KR20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите трехзначное число");
        int userNum = scanner.nextInt();
        
        int x1 = ((int)userNum/100);
        
        int x2 = ((int)userNum/10%10);
        
        int x3 = (int)userNum- ((int)userNum/10)*10;
        
        System.out.printf(String.join("%n",
                "сотни - %1$-5d\n",
                "десятки - %2$-5d\n",
                "еденици - %3$-5d\n"),x1,x2,x3);
        System.out.println("");
    }
    
}
