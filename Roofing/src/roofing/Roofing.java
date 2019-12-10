/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roofing;

import javax.swing.JOptionPane;

/**
 * Roofing.java - description
 *
 * @author Alex Bahsler
 * @since Dec. 3, 2019, 11:57:49 a.m.
 */
public class Roofing {

    static final String TITLE = "the Roofing Program";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
        program();
        end();
    }

    /**
     * Starts the app
     */
    private static void start() {
        JOptionPane.showMessageDialog(null,
                "Welcome to " + TITLE,
                TITLE,
                JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Ends the app
     */
    private static void end() {
        JOptionPane.showMessageDialog(null,
                "Thanks for using " + TITLE,
                TITLE,
                JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }

    /**
     * runs the application over and over until the user ends the application
     */
    private static void program() {
        do {
            selectConversion();
        } while (playAgain() == true);
    }

    /**
     * ask the user if they want to play again, in a dialog box
     *
     * @return true (means yes, play again), false (no)
     */
    private static boolean playAgain() {
        int response = JOptionPane.showConfirmDialog(
                null,
                "Make another conversion?",
                TITLE,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_NO_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * asks the user to enter a valid integer in an input dialog
     *
     * @param text text to display in dialog
     * @return a valid integer
     */
    private static int inputInteger(String text) {
        String userInput = JOptionPane.showInputDialog(null,
                text, TITLE, JOptionPane.QUESTION_MESSAGE);

        while (userInput == null || userInput.equals("")) {
            userInput = JOptionPane.showInputDialog(null,
                    "Error try again!\n\n" + text, TITLE,
                    JOptionPane.QUESTION_MESSAGE);
        }
        //now turn into number
        int number = Integer.parseInt(userInput);
        return number;
    }

    //variable/methods for this program below...................................
    /**
     * gives specific variables to the conversion methods
     */
    private static void selectConversion() {
        int selection = inputInteger("What would you like to to:\n\n"
                + "1. See sales for Winnipeg\n"
                + "2. Enter the sales for Winnipeg\n"
                + "3. See the sales for Calgary\n"
                + "4. Enter the sales for Calgary\n"
                + "5. See the total sales for the company\n"
                + "6. Quit the program\n\n");
        /**
         * View sales for Winnipeg
         */
        if (selection == 1) {

        }
        /**
         * Enter The sales for Winnipeg
         */
        if (selection == 2) {
            winnipegSales();
        }
        /**
         * View sales in Calgary
         */
        if (selection == 3) {

        }
        /**
         * Enter sales for Calgary
         */
        if (selection == 4) {
            calgarySales();
        }
        /**
         * View total sales
         */
        if (selection == 5) {

        }
        /**
         * End
         */
        if (selection == 6) {
            end();
        }
    }

    private static void winnipegSales(String userInput) {
        int size = 1;
        for (int i = 0; i < 25; i++) {

            userInput = JOptionPane.showInputDialog(null,
                    "Enter sales for size " + size++ + ":",
                    TITLE,
                    JOptionPane.QUESTION_MESSAGE);
            
            double convert = Double.parseDouble(userInput);
        }
        
    }

    
    private static void calgarySales() {
        String userInput = JOptionPane.showInputDialog(null,
                "Enter sales for Calgary",
                TITLE,
                JOptionPane.QUESTION_MESSAGE);
    }

}
