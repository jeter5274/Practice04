package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		//중복테스트
		//int[] lottoNums = new int[] {1,1,1,1,1,1}; 
		
		int[] lottoNums = new int[6]; 
		
		boolean chkDup = true;
		
		
		for(int i=0; i<lottoNums.length; i++) {
			
			lottoNums[i] = (int)(Math.random()*45+1);
			
		}
		
		//중복체크
		while(true) {
			
			for(int i=0; i<lottoNums.length; i++) {
				
				for(int j=0; j<lottoNums.length; j++) {
					if(i == j) {
						continue;			
					}else if(lottoNums[i] == lottoNums[j]) {
						chkDup = true;
						lottoNums[i] = (int)(Math.random()*45+1);
						break;
					}else {
						chkDup = false;
					}
				}	
					
				if(chkDup == true) {
					break;
				}
			}
			if(chkDup == false) {
				break;
			}
		}
		//중복체크 끝
		
		for(int i=0; i<lottoNums.length; i++) {
			
			System.out.print(lottoNums[i]+ "\t");
			
		}
		
		System.out.println("");
	}

}
