package com.techai.javaproject.OneDArrays;

public class CountPalindromeNumbers {

	public static boolean countPalindromeNum(int num) {
		int originalNum=num;
		int revNum=0;
		
		while(num!=0) {
			int last = num % 10;
			revNum = revNum * 10 + last;
			num = num/10;
		}
		if(originalNum==revNum) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int [] arr = {11,22,33,12,13,14,15};
		//int num=3223;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(countPalindromeNum(arr[i])) {
				count++;
			}
		}
		System.out.println("Count of Palindrome Numbers in the Array is:"+count);
	}

}
