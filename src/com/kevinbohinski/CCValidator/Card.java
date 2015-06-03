/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-4-27
 *  
 * CCValidator
 * Card.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 * 
 * Please use Apache ANT to compile, run, or jar this project.
 */

/* Setting Package */
package com.kevinbohinski.CCValidator;

/* Setting Imports */

public class Card {

	/* Setting Vars */
	private Long cnum;

	/**
	 * Constructor: Generates a new Card object based on input.
	 * 
	 * @param cnum
	 *            : The number of the card.
	 */
	public Card(Long cnum) {
		this.cnum = cnum;
	}

	/**
	 * @return the cnum
	 */
	public Long getCnum() {
		return cnum;
	}

	/**
	 * @param cnum the cnum to set
	 */
	public void setCnum(Long cnum) {
		this.cnum = cnum;
	}

	/**
	 * validate Validates a card using the Luhn-10 algorithm.
	 * 
	 * @return : boolean of the card's validity.
	 */
	public boolean validate() {
		String ccstring = Long.toString(cnum);
		char[] ccchar = ccstring.toCharArray();
		if (ccchar.length <= 19) {
			int sum = 0;
			for (int i = 0; i < ccchar.length; i++) {
				if (i % 2 == 0) {
					int val = Integer.parseInt(String.valueOf(ccchar[i]));
					val = val * 2;
					if (val > 9) {
						sum += (1 + (val % 10));
					} else {
						sum += val;
					}
				} else {
					sum += Integer.parseInt(String.valueOf(ccchar[i]));
				}
			}
			if (sum % 10 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

} /* Card.java */
