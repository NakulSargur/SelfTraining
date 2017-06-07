/*
 * You have been given an array A of size N consisting of positive integers. 
 * You need to find and print the product of all the number in this array Modulo (10^9 + 7)
 * Input Format: The first line contains a single integer N denoting the size of the array. 
 * The next line contains N space separated integers denoting the elements of the array
 * Output Format: Print a single integer denoting the product of all the elements of the array Modulo (10^9 + 7)
 * Constraints: 1 ≤ N ≤ 103
 * 1 ≤ A[i] ≤ 103 
 * 
 * Sample Input:
 * 5
 * 1 2 3 4 5
 * Sample Output:
 * 120
 */

package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindProduct {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			br.readLine();
			String[] values = br.readLine().split(" ");
			long product = 1;
			for (String value : values) {
				product = (long) ((product * Integer.parseInt(value)) % (Math.pow(10, 9) + 7));
			}
			System.out.println(product);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
