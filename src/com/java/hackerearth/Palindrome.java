/*
 * You have been given a String S. 
 * You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).
 * Input Format:
 * The first and only line of input contains the String S. The String shall consist of lower-case English alphabets only.
 * Output Format:
 * Print the required answer on a single line.
 * Constraints:
 * 1 ≤ |S| ≤ 100
 * 
 * Note: String S consists of lower-case English Alphabets only.
 * Sample Input: Level
 * Sample Output: YES
 */

package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder input = new StringBuilder(br.readLine());
			String output = "NO";
			if (input.toString().equalsIgnoreCase(input.reverse().toString())) {
				output = "YES";
			}
			System.out.println(output);
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}