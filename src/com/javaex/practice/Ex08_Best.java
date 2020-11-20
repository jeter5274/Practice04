package com.javaex.practice;

//import java.util.Scanner;

public class Ex08_Best {

	public static void main(String[] args) {

		int lottoNums[] = new int[6];
		//Scanner sc = new Scanner(System.in); //테스트를 위한 입력
		
		for (int i = 0; i < lottoNums.length; i++) {
			
			//System.out.print("숫자" +(i+1)+ "입력 : "); //테스트를 위한 입력하라는 출력
			//lottoNums[i] = sc.nextInt(); //입력받음
			lottoNums[i] = (int)(Math.random()*45)+1;
			
			//중복 체크
			for (int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					i--;
					//System.out.println("앞의 값과 중복입니다. 다시입력하세요"); //중복안내
				}
			}
		}
		
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i] + "\t");
			
		}
		
		System.out.println("");
	
		//sc.close();
	}

}
