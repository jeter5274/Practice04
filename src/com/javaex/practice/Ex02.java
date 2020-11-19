package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] dbArray = new double[3];
		
		dbArray[0] = 6.7;
		dbArray[1] = 3.3;
		dbArray[2] = 1.2;
		
		/*
		//선언 및 생성과 동시에 초기화
		double[] dbArray = new double[] {6.7, 3.3, 1.2} ; 
		*/
		
		/*
		//선언 및 생성과 동시에 초기화 축약
		double[] dbArray = {6.7, 3.3, 1.2} ; 
		*/
		
		for(int i=0; i<dbArray.length; i++) {
			System.out.println(dbArray[i]);
		}
	}

}
