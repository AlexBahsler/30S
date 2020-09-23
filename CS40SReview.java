
package cs40s.review;

import javax.swing.JOptionPane;

/**
 *CS40SReview.java - description

 * @author Alex Bahsler
 * @since Sep. 15, 2020 
 */
public class CS40SReview {

    /**
     * @param args the command line arguments
     */
    int burgers;
    int fries;
    int sodas;
    double cash;
    double subTotal;
    double total;
    double change == cash - total;
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, 
            "The tremendously popular fast food restaurant\n" +
            "“Larry’s Burgers” charges $11. 4444 for burgers,\n" +
            "$00. 8888 for fries, and $00. 9999 for sodas. You\n" +
            "have been commissioned to write a cash\n" +
            "program which allows an employee to enter an\n" +
            "order (the number of burgers, fries, and sodas),\n" +
            "the amount of cash the customer tendered, and\n" +
            "then display a total, the tax (at 13%), and the\n" +
            "final cost, and the change");
        
        JOptionPane.showInputDialog(null,
            "Enter the number of hamburgers ordered");
        
        
        JOptionPane.showInputDialog(null,
            "Enter the number of fries ordered:");
        
        
        JOptionPane.showInputDialog(null,
            "Enter the number of sodas ordered:");
        
        
        JOptionPane.showInputDialog(null,
            "Enter the cash tendered:");
        
        
        JOptionPane.showMessageDialog(null,
              "Your order is:"
            + "\nHamburgers:" + burgers
            + "\nFries:" + fries
            + "\nSodas:" + sodas
            + "\nCash tendered:" + cash
            + "\nSub-total:" + subTotal
            + "\nTotal:" + total
            + "\nChange:" + change);
        
        
        
        
    }
}
