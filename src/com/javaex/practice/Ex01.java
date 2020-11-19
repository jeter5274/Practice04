package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		//for(int i=0; i<=intArray.length;i++) { //intArray.length는 5이며, 배열의 index는 0~4이기 떄문에 index 5가 존재하지 않아 오류가 난다.
		for(int i=0; i<intArray.length;i++) {
			result = result + intArray[i];
		}
		
		System.out.println(result);
	}

}

/* 출력결과 예상
 for i=0 -> result = 0 + 3
 for i=1 -> result = 3 + 7
 for i=2 -> result = 10 + 12
 for i=3 -> result = 22 + 0
 for i=4 -> result = 22 + 0
 으로
 
 <출력>
 22
 
*/