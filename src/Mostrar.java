/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 *
 * @author xltiagoxl
 */
public class Mostrar extends JFrame{
	AgregarAbejas bee=new AgregarAbejas();
    double radio=0.0001;
    
    public Mostrar() {
    	
    	super("Dibujar");
			
		
    	setSize(500,500);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
  
    
    public void paint(Graphics g) {
   
    	super.paint(g);
    	Graphics2D circulo=(Graphics2D)g;
    	circulo.setStroke(new BasicStroke(10.f));
    	circulo.setPaint(Color.BLUE);
    	for(int i=0;i<bee.Ejex.size();i++) {
    		circulo.fillOval(bee.Ejex.get(i),bee.Ejey.get(i), 10, 10);
    	}
    	
    }
    }

    
   
    
    
 



