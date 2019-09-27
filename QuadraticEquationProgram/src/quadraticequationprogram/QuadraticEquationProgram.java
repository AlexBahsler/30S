package quadraticequationprogram;

import javax.swing.JOptionPane;

/**
 * QuadraticEquationProgram.java - description
 *
 * @author Alex Bahsler
 * @since Sep. 25, 2019, 11:42:09 a.m.
 */
public class QuadraticEquationProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String aInput = JOptionPane.showInputDialog(null,
                "Enter value for A");
        String bInput = JOptionPane.showInputDialog(null,
                "Enter value for B");
        String cInput = JOptionPane.showInputDialog(null,
                "Enter value for C");

        double a = Double.parseDouble(aInput);
        double b = Double.parseDouble(bInput);
        double c = Double.parseDouble(cInput);

        double positive = -b + Math.sqrt((b * b) -4*a*c)/2*a;
//        double negative = -b + Math.((b * b) -4*a*c)/2*a;
        System.out.println(positive);        
        JOptionPane.showMessageDialog(null,
                "For the values:"
                + "\nA = " + a
                + "\nB = " + b
                + "\nC = " + c
                + "\nThe positive root is: " + positive
                + "\nThe negative root is: " );

    }

}
