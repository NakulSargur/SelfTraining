/*
 * Akash and Vishal are quite fond of traveling. They mostly travel by railways. 
 * They were traveling in a train one day and they got interested in the seating arrangement of their compartment. 
 * The compartment looked something like 
 * 
 * So they got interested to know the seat number facing them and the seat type facing them. The seats are denoted as follows : 
 * Window Seat : WS
 * Middle Seat : MS
 * Aisle Seat : AS
 * You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.
 * INPUT: First line of input will consist of a single integer T denoting number of test-cases. Each test-case consists of a single integer N denoting the seat-number.
 * OUTPUT: For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line
 * 
 * CONSTRAINTS
 * 1<=T<=105
 * 1<=N<=108
 */
package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeatingArrangement
{
	static final int totalSeatsInRow = 6;
	
	static final SeatingArrangement seatingArrangement = new SeatingArrangement();
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int noOfTestCases = Integer.valueOf(br.readLine());
			for (int i = 0; i < noOfTestCases; i++)
			{
				int inputSeatNumber = Integer.valueOf(br.readLine());
				seatingArrangement.printOutput(inputSeatNumber);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void printOutput(int inputSeatNumber) {
		String[] seatDirection = getLeftOrRight(inputSeatNumber % (totalSeatsInRow * 2));
		String seatType = getSeatType(inputSeatNumber % (totalSeatsInRow));
		int outputSeatNumber = 0;
		if (seatType.equals("WS")) {
			outputSeatNumber = seatDirection[0].equals("Left") ? (seatDirection[1].equals("FF") ? (inputSeatNumber + 11) : inputSeatNumber - 11)
					: (seatDirection[1].equals("FF") ? (inputSeatNumber + 1) : (inputSeatNumber - 1));
		}
		else if (seatType.equals("MS")) {
			outputSeatNumber = seatDirection[0].equals("Left") ? (seatDirection[1].equals("FF") ? (inputSeatNumber + 9) : inputSeatNumber - 9)
					: (seatDirection[1].equals("FF") ? (inputSeatNumber + 3) : inputSeatNumber - 3);
		}
		else if (seatType.equals("AS")) {
			outputSeatNumber = seatDirection[0].equals("Left") ? (seatDirection[1].equals("FF") ? (inputSeatNumber + 7) : inputSeatNumber - 7)
					: (seatDirection[1].equals("FF") ? (inputSeatNumber + 5) : inputSeatNumber - 5);
		}
		System.out.println(outputSeatNumber + " " + seatType);
	}

	private String[] getLeftOrRight(int modOf12) {
		String[] retVal = new String[2];
		if (modOf12 == 1 || modOf12 == 2 || modOf12 == 3) {
			retVal[0] = "Left";
			retVal[1] = "FF";
		} else if (modOf12 == 0 || modOf12 == 11 || modOf12 == 10) {
			retVal[0] = "Left";
			retVal[1] = "BF";
		} else if (modOf12 == 7 || modOf12 == 8 || modOf12 == 9) {
			retVal[0] = "Right";
			retVal[1] = "BF";
		} else if (modOf12 == 4 || modOf12 == 5 || modOf12 == 6) {
			retVal[0] = "Right";
			retVal[1] = "FF";
		}
		return retVal;
	}

	private String getSeatType(int modOf6) {
		if (modOf6 == 0 || modOf6 == 1) {
			return "WS";
		} else if (modOf6 == 2 || modOf6 == 5) {
			return "MS";
		} else if (modOf6 == 3 || modOf6 == 4) {
			return "AS";
		} else {
			return "Invalid seat number";
		}
	}
}