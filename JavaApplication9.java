/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        Scanner ss=new Scanner(System.in);
        s=ss.nextLine();
        String ans=new StringBuilder(s).reverse().toString();
    }
}
