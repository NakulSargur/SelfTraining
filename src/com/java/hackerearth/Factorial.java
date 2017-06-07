/*
 * You have been given a positive integer N.
 * You need to find and print the Factorial of this number. The Factorial of a positive integer N refers to the product of all number in the range from 1 to N.
 * You can read more about the factorial of a number here.
 * Input Format:
 * The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.
 * Output Format: 
 * Output a single line denoting the factorial of the number N
 * Constraints: 
 * 1 ≤ N ≤ 10
 */

package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int inputNumber = Integer.parseInt(br.readLine());
			int outputNumber = inputNumber;
			while (inputNumber > 1) {
				outputNumber = outputNumber * (--inputNumber);
			}
			System.out.println(outputNumber);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
