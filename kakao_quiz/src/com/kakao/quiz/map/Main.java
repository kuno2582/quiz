package com.kakao.quiz.map;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {5,6,7,8,9};

		ArrayList<String> binaryArr1 = new ArrayList<String>();
		ArrayList<String> binaryArr2 = new ArrayList<String>();
		
		for(int i : arr1){
			binaryArr1.add(Integer.toBinaryString(i));
		}
		for(int j : arr2){
			binaryArr2.add(Integer.toBinaryString(j));
		}
		
		System.out.println(binaryArr1);
		System.out.println(binaryArr2);
	}
	
	public static String[] secretMap(String[] a, String[] b){
		
		String[] rMap = {};
		
		for(int i=0; i<a.length; i++){
			int x = Integer.parseInt(a[i]);
			int y = Integer.parseInt(b[i]);
			String sumStr = String.valueOf(x+y);
			
			rMap[i] = sumStr;
		}
		
		return rMap;
	}

}
