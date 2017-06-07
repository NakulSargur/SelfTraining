/*
 * You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.
 * Input Format: The first and only line of input contains 3 space separated integers l, r and k.
 * Output Format: Print the required answer on a single line.
 * Constraints:
 * 1 ≤ l ≤ r ≤ 1000 
 * 1 ≤ k ≤ 1000
 * 
 * Sample Input: 1 10 1
 * Sample Output: 10
 */

package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDivisors
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] inputValues = br.readLine().split(" ");
			int l = Integer.valueOf(inputValues[0]);
			int r = Integer.valueOf(inputValues[1]);
			int k = Integer.valueOf(inputValues[2]);
			int outputCount = 0;
			for (int i = l; i <= r; i++) {
				if (i % k == 0) {
					outputCount++;
				}
			}
			System.out.println(outputCount);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
