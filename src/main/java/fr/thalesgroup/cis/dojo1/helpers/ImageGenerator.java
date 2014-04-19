/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.thalesgroup.cis.dojo1.helpers;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.Color;

/**
 *
 * @author vincent
 */
public class ImageGenerator {
    public static final int SIZE = 12;
    public static final float RGB_MAX = 255;
    
    Color[][] generateWhiteImage() {
        Color w = Color.white;
        Color[][] pixels = new Color[SIZE][SIZE];
        
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                pixels[i][j]=w;
            }
        }
        
        return pixels;
    }
    
    Color[][] generateGreyGradientImage() {
        Color gradient = Color.black;
        Color[][] pixels = new Color[SIZE][SIZE];
        float gap = ((float)1/12);
        
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                pixels[i][j]=gradient;
            }
            int grey=(int)(RGB_MAX*(i+1)*gap);
            System.out.println("grey: "+grey);
            gradient=new Color(grey,grey,grey);
        }
        
        return pixels;
    }
    
}
