/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.builder;

import javax.swing.JOptionPane;

/**
 * HouseBuilder.java - description
 *
 * @author Alex Bahsler
 * @since Oct. 22, 2019, 11:14:11 a.m.
 */
public class HouseBuilder {

    static final String TITLE = "House Builder";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
        program();
        end();
    }

    private static void start() {
        JOptionPane.showMessageDialog(null,
                "Welcome to " + TITLE,
                TITLE,
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void end() {
        JOptionPane.showMessageDialog(null,
                "Thanks for using " + TITLE,
                TITLE,
                JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }

    private static void program() {
        do {
            houseBuild();
        } while (playAgain() == true);
    }

    private static boolean playAgain() {
        int response = JOptionPane.showConfirmDialog(
                null,
                "do you want to play again?",
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
     * Determines if odd or even
     *
     * @param number number to check
     * @return true if even, false if odd
     */
    private static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * asks user for number in input dialog
     *
     * @param text text to show in dialog
     * @return a valid integer
     */
    private static int inputInteger(String text) {
        String userInput = JOptionPane.showInputDialog(null,
                text, TITLE, JOptionPane.QUESTION_MESSAGE);

        while (userInput == null || userInput.equals("")) {
            userInput = JOptionPane.showInputDialog(null,
                    "Error try again!\n\n" + text, TITLE, JOptionPane.QUESTION_MESSAGE);
        }
        //now turn into number
        int number = Integer.parseInt(userInput);
        return number;
    }
    //just for this problem
    static final String SPACE = " ";
    static final String LEFT_ROOF = "/";
    static final String RIGHT_ROOF = "\\";
    static final String TOP = "_";
    static final String WALL = "|";
    static final String STONE = "*";

    /**
     * Asks user for size and draws a house
     */
    private static void houseBuild() {
        int size = inputInteger("Enter the size of the house");
        if (isEven(size) == true && size >= 4) {
            roof(size);
            base(size);
            walk(size);

        } else {
            JOptionPane.showMessageDialog(null,
                    "you cannot create a house of this size " + size,
                    TITLE,
                    JOptionPane.WARNING_MESSAGE);
        }

    }

    private static void walk(int size) {
        //add spaces up to steps
        for (int i = 0; i < (size/2)-1; i++){
            System.out.print(SPACE);
        }
        //draw steps
        System.out.println(STONE +STONE);
        //add spaces before sidewalk
        for (int i = 0; i < (size/2)-1; i++) {
            System.out.print(SPACE);
        }
        //draw sidewalk
        for (int i = 0; i < size; i++) {
            System.out.print(STONE);
        }
        System.out.println("");
    }

    private static void base(int size) {
        //draw ceiling
        System.out.print(LEFT_ROOF);
        for (int i = 0; i < (size-2)-1; i++) {
            System.out.print(TOP);
        }
        System.out.println(RIGHT_ROOF);
        //draw walls
        for (int i = 0; i < (size/2)-1; i++) {
            System.out.print(WALL);
            for (int j = 0; j < (size-2); j++) {
                System.out.print(SPACE);
            }
            System.out.println(WALL);
        }
        //draw floor
        System.out.print(WALL);
        for (int i = 0; i < (size-2); i++) {
            System.out.print(TOP);
        }
        System.out.println(WALL);
    }

    private static void roof(int size) {
        //loop through all roof rows
        for (int i = 0; i < (size/2)-1; i++) {
            //draw a row of a roof
            //draw all the leading spaces
            for (int j = (size/2)-1; j > i; j--) {
                System.out.print(SPACE);
            }
            //draw the left roof
            System.out.print(LEFT_ROOF);
            //now any middle spaces
            for (int j = 0; j < i*2; j++) {
                System.out.print(SPACE);
            }
            //now the right roof
            System.out.println(RIGHT_ROOF);
        }
    }
}
