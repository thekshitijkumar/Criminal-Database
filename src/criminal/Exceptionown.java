/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminal;

import javax.swing.JOptionPane;

/**
 *
 * @author Himanshu
 */
public class Exceptionown extends Exception{

    public Exceptionown(String s) {
        super(s);
        JOptionPane.showMessageDialog(null, s);
        
    }
    
    
}
