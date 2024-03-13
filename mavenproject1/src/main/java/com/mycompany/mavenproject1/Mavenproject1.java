/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Tang Chun Xuan
 */
public class Mavenproject1 extends JFrame{    

    JFrame maven=new JFrame();
    JMenuBar mb = new JMenuBar();
    
    JMenu help=new JMenu("Menu");
    JMenu submenu=new JMenu("sub menu");
    
   JCheckBox bold=new JCheckBox("Bold");
   JCheckBox Italic=new JCheckBox("Italic");
   JComboBox jcboColor = new JComboBox(new Object[]{"Canada","China","Denmark","Malaysia"});
   JList list=new JList(new Object[]{"Canada","China","Denmark","Malaysia"});
   JLabel l1=new JLabel("Canada");
   JLabel l2=new JLabel("China");
   JLabel l3=new JLabel("Denmark");
   JLabel l4=new JLabel("Malaysia");
   
   JPanel p1=new JPanel();
   JPanel p2=new JPanel();
   JPanel p3=new JPanel();
    
    public Mavenproject1(){
       setJMenuBar(mb);
       mb.add(help);
        help.add(new JMenuItem("Item1"));
        help.add(new JMenuItem("Item2"));
        help.addSeparator();
        help.add(new JMenuItem("Item3"));
        help.add((submenu));
        submenu.add(new JMenuItem("Item4"));
        submenu.add(new JMenuItem("Item5"));
        jcboColor.setSize(jcboColor.getPreferredSize().width,jcboColor.getPreferredSize().height);
        p1.add(jcboColor,BorderLayout.NORTH);
        p2.setLayout(new GridLayout(2,1));
        p2.add(bold);
        p2.add(Italic);
        p3.add(list);
        
        add(p1,BorderLayout.NORTH);
        add(p2);
        add(p3,BorderLayout.SOUTH);
        setTitle("GUI COMPONENTS II DEMO");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }    
        
    public static void main(String[] args) {
        new Mavenproject1();
        

    }
}
