package com.java.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrainSeatingArrangement {

	private static final int	MAX_NUM_OF_SEATS_IN_ROW	= 6;
	
	private static final int	MAX_NUM_OF_SEATS_IN_CUBICLE	= MAX_NUM_OF_SEATS_IN_ROW * 2;

	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			int noOfTestCases = Integer.parseInt(in.readLine());
			for (int i = 0; i < noOfTestCases; i++) {
				int inputSeatNum = Integer.valueOf(in.readLine());
				System.out.print(getOppositeSeatNum(inputSeatNum) + " " + getSeatType(inputSeatNum, i));
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	private static int getOppositeSeatNum(int inputSeatNum) {
		int inputModMaxSeats = inputSeatNum % MAX_NUM_OF_SEATS_IN_CUBICLE;
		int inputDivMaxSeats = inputSeatNum / MAX_NUM_OF_SEATS_IN_CUBICLE;
		int oppositeSeatNum = (inputModMaxSeats == 0) ? (MAX_NUM_OF_SEATS_IN_CUBICLE * (inputDivMaxSeats - 1)) : (MAX_NUM_OF_SEATS_IN_CUBICLE * (inputDivMaxSeats));
		oppositeSeatNum += (oppositeSeatNum + MAX_NUM_OF_SEATS_IN_CUBICLE) - inputSeatNum + 1;
		return oppositeSeatNum;
	}

	private static String getSeatType(int seatNum, int i) {
		int modOfMaxSeatNum = seatNum % MAX_NUM_OF_SEATS_IN_ROW;
		if ((modOfMaxSeatNum == 0) || (modOfMaxSeatNum == 1))
			return "WS";
		else if ((modOfMaxSeatNum == 2) || (modOfMaxSeatNum == 5))
			return "MS";
		else
			return "AS";
	}
}