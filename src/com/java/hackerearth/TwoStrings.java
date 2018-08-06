/*
 * Given two strings of equal length, you have to tell whether they both strings are identical.
 * Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.
 * 
 * Input: First line, contains an intger 'T' denoting no. of test cases.
 * Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
 * 
 * Output: For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.
 * 
 * Constraints:	1<= T <=100
				1<= |S1| = |S2| <= 10^5
				String is made up of lower case letters only.
 * Note : Use Hashing Concept Only . Try to do it in O(string length) .
 */

package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoStrings {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.valueOf(br.readLine()).intValue();
		while (tests-- > 0) {
			String[] strArray = br.readLine().split(" ");
			boolean isNo = false;
			String str2 = strArray[1];
			for (char c : strArray[0].toCharArray()) {
				if (!str2.contains(String.valueOf(c))) {
					System.out.println("NO");
					isNo = true;
					break;
				} else {
					str2 = str2.replaceFirst(String.valueOf(c), "");
				}
			}
			if (!isNo)
				System.out.println("YES");
		}
	}
}
