
package introradio;
import javax.swing.JOptionPane;

/**
 * 
 * 
 * @author alex
 */
public class IntroRadio {
    
    // Constants
    final double NUM_1 = 1.8;
    final double NUM_2 = 32;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, 
                "Welcome to the C-RAP number 2 radio station \n\n"
                        + "You are an intern at radio station, C-RAP, The \n"
                        + "disk jockeys announce the current temperature \n"
                        + "in both Fahrenheit and Celsius every half-hour.\n"
                        + "They would like an easy way to display both the \n"
                        + "Fahrenheit and Celsius temperatures quickly and \n"
                        + "at the same time. The local airport phones in \n"
                        + "the temperature (but only in Celsius). They \n"
                        + "have requested that you develop an application \n"
                        + "that will display both temperatures after the\n"
                        + "Celsius temperature is inputted. Note: Use \n"
                        + "this conversion formula FF = (CC ∗ 1.8) + 32");
        
        
        String input = JOptionPane.showInputDialog(
                "Enter temperature in Celecius");
        
        double  celsius = Double.parseDouble(input);
        
        double fahrenheit = (celsius * 1.8) + 32;
        
        JOptionPane.showMessageDialog(null, "Your temperature in Fahrenheit is "
        + fahrenheit);
        
        JOptionPane.showMessageDialog(null, "Thank you!");   
    }    
}
