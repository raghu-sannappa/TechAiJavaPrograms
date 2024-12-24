package com.techai.javaproject.OneDArrays;

import java.util.Arrays;

public class PrintNonRepeatedElements {

	public static void printUniqueElements(int [] arr,boolean [] visited) {
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==false) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
					}
				}
				if(count==1) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,4,10,11,12,3,5,66,33,33};
		boolean [] visited = new boolean[arr.length];
		printUniqueElements(arr,visited);

	}

}
