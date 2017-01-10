package com.tuinsomniacorp.eulerproject;

public class MultipleOf3Or5 {

	public static long findSumOf(int limit){
		long sum = 0;
		for (int i = 3; i < limit;i += 3){
			sum += i;
		}
		for (int i = 5; i < limit; i += 5){
			if(i%3!=0){
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(" " + findSumOf(1000));
	}

}
