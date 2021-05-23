package _00_IntroToStacks;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
    	Scanner in = new Scanner(System.in);
        //    Don't forget to import the Stack class
    	Stack<Double> stk = new Stack<Double>();

        // 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
    	for(int i=0;i<100;i++) {
    		double rnd = new Random().nextDouble() * 100;
    		stk.push(rnd);
    	}
        // 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
    	System.out.println("Enter in two numbers between 0 and 100, inclusive");
    	double in1 = in.nextDouble();
    	double in2 = in.nextDouble();
    	
        // 4. Pop all the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, print it to the screen.
    	while(!stk.isEmpty()) {
    		double popped = stk.pop();
    		if(popped>in1 && popped<in2 || popped>in2 && popped<in1) {
    			System.out.println(popped);
    		}
    	}

        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Popping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
