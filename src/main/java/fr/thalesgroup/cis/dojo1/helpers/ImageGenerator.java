/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.thalesgroup.cis.dojo1.helpers;

import java.awt.Color;

/**
 *
 * @author vincent
 */
public class ImageGenerator {
    
    Color[][] generateWhiteImage() {
        Color w = Color.white;
        Color[][] pixels = new Color[12][12];
        
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                pixels[i][j]=w;
            }
        }
        
        return pixels;
    }
    
}
