/*
 * Given two strings, a and b , that may or may not be of the same length, 
 * determine the minimum number of character deletions required to make a and b anagrams. 
 * Any characters can be deleted from either of the strings.
 * Constraints:
 * string lengths<=10000
 * Note: Anagram of a word is formed by rearranging the letters of the word.
 * 
 * Sample Input: 
 * 1 cde abc
 * Sample Output: 4
 */

package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Anagrams {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.valueOf(br.readLine());
		while (tests-- > 0) {
			String s1 = br.readLine();
			String s2 = br.readLine();
			for (char c : s1.toCharArray()) {
				if (s2.contains(String.valueOf(c))) {
					s1 = s1.replaceFirst(String.valueOf(c), "");
					s2 = s2.replaceFirst(String.valueOf(c), "");
				}
			}
			System.out.println(s1.length() + s2.length());
		}
		br.close();
	}

}
