/*
 * You are given an integer N. You need to print the series of all prime numbers till N.
 * Input Format:
 * The first and only line of the input contains a single integer N denoting the number till where you 
 * need to find the series of prime number.
 * Output Format:
 * Print the desired output in single line separated by spaces.
 * Constraints: 1<=N<=1000
 * 
 * Sample Input: 9
 * Sample Output: 2 3 5 7
 */
package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int inputNumber = Integer.parseInt(br.readLine());
			for (int i = 2; i < inputNumber; i++) {
				if (isPrimeNumber(i)) {
					System.out.print(i + " ");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static boolean isPrimeNumber(int number) {
		int modulus = number / 2;
		for (int i = 2; i <= modulus; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}