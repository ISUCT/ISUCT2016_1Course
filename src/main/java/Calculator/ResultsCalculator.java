package Calculator;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by stud_6 on 19.12.16.
 */
public class ResultsCalculator {

    JFrame frame;
    JLabel label;
    JTextField tf1, tf2, tf3, tf4;

    public static void main(String [] strings){

        //запуск калькулятора

        ResultsCalculator gui = new ResultsCalculator();
        gui.go();
    }

    //метод, сам фронт

    public void go(){
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton arrayButton = new JButton("Посчитать по значениям массива");
        arrayButton.addActionListener(new ArrayListener());

        JButton nkxButton = new JButton("Посчитать по значениям nkx");
        nkxButton.addActionListener(new NkxListener());

        label = new JLabel(" Значения:");

        frame.getContentPane().add(BorderLayout.NORTH, arrayButton);
        frame.getContentPane().add(BorderLayout.CENTER,  label);
        frame.getContentPane().add(BorderLayout.SOUTH, nkxButton);

        frame.setSize(950,100);
        frame.setVisible(true);

        tf1 = new JTextField();
        tf2 = new JTextField();

    }

    //чё вводим

    public ArrayList<Double> temp(){
        Double []tmp ={};
        ArrayList<Double> xValRes =  new ArrayList<Double>(Arrays.<Double>asList(tmp));
        return(xValRes);
    }



    class ArrayListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {

            ArrayList<Double> xValRes = new Calculator().equ1(temp());
            label.setText(" Значения: " + xValRes);
        }
    }

    class NkxListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            ArrayList<Double> xValRes = new Calculator().equ1(1.25, 3.25, 0.4);
            label.setText(" Значения: " + xValRes);
        }
    }
}
