/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlesun.package2;

/**
 *
 * @author chris
 */
public class Sun {

    private static Sun sun;

    private Sun() {

    }

    public static Sun getUniqueSun() {

        if (sun == null) {
            System.out.println("sun is null so sun is created");
            sun = new Sun();

        }else{
        
            System.out.println("sun is not null so object sun is returned");
        }
        return sun;

    }
}
