/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodatos;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author xltiagoxl
 */
public class Mostrar {

    JFrame mapa = new JFrame();

    public Mostrar() throws IOException {
        mapa = new JFrame("Mantrix");
        mapa.setBounds(0, 0, 1000, 1000);
        mapa.setBackground(Color.yellow);
        mapa.setLayout(null);
        mapa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mapa.setVisible(true);

        QuadTree q1 = new QuadTree(1, new Boundry(0, 0, 1000, 1000));
        String cadena;
        FileReader f = new FileReader("Prueba.txt");
        BufferedReader b = new BufferedReader(f);

        while ((cadena = b.readLine()) != null) {
            String[] papu = cadena.split(",");
            int x = Integer.parseInt(papu[0]);
            int y = Integer.parseInt(papu[1]);

            q1.insert(x, y, 1);
            
        }
        b.close();
        QuadTree.dfs(q1);
    }

}


