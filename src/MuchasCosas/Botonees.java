package MuchasCosas;

import javax.swing.*;
import java.awt.event.*;
public class Botonees extends JFrame implements ActionListener {
    private JButton boton1, boton2, boton3;
    private JLabel label1;

    public Botonees(){
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);

        label1 = new JLabel("En espera...");
        label1.setBounds(10,10,300,30);
        add(label1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== boton1){
            label1.setText("Haz presionado el botón 1");
        } if (e.getSource()==boton2){
            label1.setText("Haz presionado el botón 2");
        }if(e.getSource()== boton3){
            label1.setText("Haz presionado el botpon 3");
        }

    }
}
