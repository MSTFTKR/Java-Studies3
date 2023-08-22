/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafateker.ex;

import javax.swing.*;

/**
 *
 * @author musta
 */
public class window { 
    private  JFrame frame;

    public window() {
        frame = new JFrame();
        
        JButton button = new JButton("Tıkla");
        
        button.setBounds(130,100,200,40);
        
        frame.add(button);
        
        frame.setSize(400,500);
        
        frame.setLayout(null);
        
        frame.setVisible(true);
    }
    
    
    
}
