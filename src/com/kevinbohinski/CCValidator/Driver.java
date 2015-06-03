/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-4-27
 *  
 * CCValidator
 * Driver.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 * 
 * Please use Apache ANT to compile, run, or jar this project.
 */

/* Setting Package */
package com.kevinbohinski.CCValidator;

/* Setting Imports */
import java.util.Scanner;

public class Driver {

	/* Note: Test valid card 4563960122001999 */

	/**
	 * main method, executes the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("--------------------------");
		System.out.println("     CCValidator");
		System.out.println("     Kevin Bohinski");
		System.out.println("--------------------------");
		System.out
				.println("Note: Please use Apache ANT to compile, run, or jar this project.");
		System.out
				.println("Note: To see some examples for cards check out \"input.txt\".");

		Scanner in = new Scanner(System.in);

		System.out.println("\nEnter a number to validate.");
		Long cnum = in.nextLong();
		Card tmp = new Card(cnum);
		boolean validity = tmp.validate();
		if (validity) {
			System.out.println("Card is valid.");
		} else {
			System.out.println("Card is NOT valid.");
		}

		in.close();

	} /* main() */

} /* Driver.java */