/*
 * You have been given a String S consisting of upper-case and lower-case English alphabets.
 * You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.
 * Input Format:
 * The first and only line of input contains the String S
 * Output Format:
 * Print the resultant String on a single line.
 * Constraints: 1 ≤ |S| ≤ 100 where |S| denotes the length of string 
 * Sample Input: abcdE
 * Sample Output: ABCDe 
 */

package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleString {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			StringBuilder output = new StringBuilder();
			for (int i = 0; i < input.length(); i++) {
				char convertedChar;
				if (Character.isUpperCase(input.charAt(i))) {
					convertedChar = Character.toLowerCase(input.charAt(i));
				} else {
					convertedChar = Character.toUpperCase(input.charAt(i));
				}
				output.append(convertedChar);
			}
			System.out.print(output.toString());
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}
