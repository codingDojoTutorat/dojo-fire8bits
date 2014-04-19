/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.thalesgroup.cis.dojo1.helpers;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author vincent
 */
public class ImageGeneratorTest {
    
    public ImageGeneratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    @Test
    public void generateWhiteImageTest() throws IOException{
        //GIVEN
        ImageGenerator generator = new ImageGenerator();
        Color[][] reference = ImgUtils.fromImage(new File("src/test/resources/0.png"));
        
        //WHEN
        Color[][] whiteImage = generator.generateWhiteImage();
        
        //THEN
        Assert.assertArrayEquals(reference, whiteImage);
    }
    
    
}