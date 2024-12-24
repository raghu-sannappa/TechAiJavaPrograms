package com.techai.javaproject.OneDArrays;

import java.util.HashMap;
public class FrequencyOfNumberArray {

	public static void printCountOfEachElements(int [] arr,boolean [] visited) {
		
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==false) {
				int count=1; // // Reset count for each new element
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {  //// If a duplicate is found
					count++;
					visited[j]=true;  // Mark duplicate as visited
				}
			}
			System.out.println(arr[i]+"-"+count);
		}
		}
		
	}
	
	
	public static void usinghashMapMethod(int [] arr) {
		
		HashMap<Integer,Integer>fc = new HashMap<>();
		for(int num:arr) {
			if(fc.containsKey(num)) {
				fc.put(num, fc.get(num)+1);
			}else {
				fc.put(num, 1);
			}
		}
		System.out.println(fc);
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,2,3,4,5,6,7,5,6};
		boolean [] visited = new boolean[arr.length];
		
		printCountOfEachElements(arr,visited);
		System.out.println("========================");
		usinghashMapMethod(arr);

	}

}
