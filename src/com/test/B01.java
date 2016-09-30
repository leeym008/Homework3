package com.test;

import java.util.*;
public class B01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int max_num, min_num;
		
		int [] num = new int[3];
		
		for (int i=0; i<3; i++){
		System.out.printf("%d번째 숫자를 입력하세요 : ",i+1);
		num[i]=s.nextInt();
		}
		
		max_num=num[0];
		min_num=num[0];
		
		for (int i=0; i<3; i++){
			if (max_num > num[i])
				min_num=num[i];
			if (min_num < num[i])
				max_num=num[i];
		}
		System.out.printf("최댓값 : %d 최솟값 : %d",max_num,min_num);
	}
}
