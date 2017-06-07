/*
 * Dhananjay has recently learned about ASCII values.He is very fond of experimenting. 
 * With his knowledge of ASCII values and character he has developed a special word and named it Dhananjay's Magical word.
 * A word which consist of alphabets whose ASCII values is a prime number is an Dhananjay's Magical word. 
 * An alphabet is Dhananjay's Magical alphabet if its ASCII value is prime.
 * Dhananjay's nature is to boast about the things he know or have learnt about. 
 * So just to defame his friends he gives few string to his friends and ask them to convert it to Dhananjay's Magical word. 
 * None of his friends would like to get insulted. Help them to convert the given strings to Dhananjay's Magical Word.
 * 
 * Rules for converting:
 * 1.Each character should be replaced by the nearest Dhananjay's Magical alphabet.
 * 2.If the character is equidistant with 2 Magical alphabets. The one with lower ASCII value will be considered as its replacement.
 * Input format:
 * First line of input contains an integer T number of test cases. Each test case contains an integer N (denoting the length of the string) and a string S.
 * Output Format:
 * For each test case, print Dhananjay's Magical Word in a new line.
 * Constraints:
 * 1 <= T <= 100
 * 1 <= |S| <= 500
 * 
 * Sample Input: 1
				 6
				 AFREEN
 * Sample Output: CGSCCO 
 */

package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CopyOfMagicalWord {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int noOfTestCases = Integer.parseInt(br.readLine());
			for (int i = 0; i < noOfTestCases; i++) {
				StringBuilder outputValue = new StringBuilder();
				int strLength = Integer.parseInt(br.readLine());
				String strValue = br.readLine();
				for (int j = 0; j < strLength; j++) {
					outputValue.append(getMagicalCharecter((int) strValue.charAt(j)));
				}
				System.out.println(outputValue.toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static char getMagicalCharecter(int inputNumber) {
		boolean basicPrimeCheck = isValidPrimeNumber(inputNumber);
		int moveIndex = 1;
		char magicalChar = (char) inputNumber;
		while (!basicPrimeCheck) {
			boolean fwprimeCheck = isValidPrimeNumber(inputNumber + moveIndex);
			boolean rwprimecheck = isValidPrimeNumber(inputNumber - moveIndex);
			if ((fwprimeCheck && rwprimecheck) || (!fwprimeCheck && rwprimecheck)) {
				magicalChar = (char) (inputNumber - moveIndex);
				basicPrimeCheck = true;
			} else if (fwprimeCheck && !rwprimecheck) {
				magicalChar = (char) (inputNumber + moveIndex);
				basicPrimeCheck = true;
			}
			moveIndex++;
		}
		return magicalChar;
	}

	private static boolean isValidPrimeNumber(int number) {
		if ((number >= 65 && number <= 90) || (number >= 97 && number <= 122)) {
			int modulus = number / 2;
			for (int i = 2; i <= modulus; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}