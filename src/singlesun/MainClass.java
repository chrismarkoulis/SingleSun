/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlesun;

import singlesun.package2.Sun;

/**
 *
 * @author chris
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calling sun for the 1st time");
        Sun s = Sun.getUniqueSun();         //design pattern singleton
        System.out.println("Calling sun for the 2nd time");

        Sun s3 = Sun.getUniqueSun();
        System.out.println("is s == s3_?");
        System.out.println(s == s3);


    }
    
}
