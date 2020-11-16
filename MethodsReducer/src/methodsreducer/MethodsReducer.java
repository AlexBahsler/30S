
package methodsreducer;

import javax.swing.JOptionPane;

/**
 * MethodsReducer.java -
 *
 * @author alex
 * @since Nov. 10, 2020
 */
public class MethodsReducer {

    final static String TITLE = "Fraction Reducer";
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int test;
        
        do{
        // dialoge 1
        output("Welcome to Fraction Reducer", JOptionPane.DEFAULT_OPTION);
        
        // dialogue 2
        String  input = JOptionPane.showInputDialog(null,"Enter the fraction:",
                TITLE, JOptionPane.DEFAULT_OPTION);
        
        int numerator = getNumerator(input);
        int denominator = getDenominator(input);
        
        // dialogue 3
        output("The numerator is: " + numerator
                + "\nThe denominator is: " + denominator
                + "\nThe reduced fraction is: " + reduce(numerator, denominator),
                JOptionPane.DEFAULT_OPTION);
        
        //dialogue 4
        test = JOptionPane.showConfirmDialog(null, "Do you want to play again?", 
                TITLE, JOptionPane.YES_NO_OPTION);
        
        } while(test == 0);
        
        
        
        if(test == 1){
            System.out.println("WE be done");
        }
        
    }
    
    /**
     * 
     * @param numerator
     * @param denominator
     * @return 
     */
    private static String reduce(int numerator, int denominator){
        
        while(numerator % 2 == 0 && denominator % 2 == 0 ){
            //test data numerator = 4
            numerator /= 2;
            denominator /= 2;        
        }
        
        while(numerator % 3 == 0 && denominator % 3 == 0){
            
            numerator /= 3;
            numerator = numerator / 3;
            
        }
        
       return numerator + "/" + denominator; 
    }

    /**
     * 
     * @param string 
     */
    private static int getNumerator(String string) {
        
        String[] array = string.split("/");
        
        // single index from split String array
        String numerator = array[0];
        
        return Integer.parseInt(numerator);
        
    }
    
    /**
     * 
     * @param string 
     */
    private static int getDenominator(String string) {
        
        String[] array = string.split("/");
        
        // single index from split String array
        String denominator = array[1];
        
        return Integer.parseInt(denominator);
    }
    
    /**
     * 
     */
    private static void output(String message, int messageType) {
       JOptionPane.showMessageDialog(null, message, TITLE, messageType);           
    }
    
    
}
