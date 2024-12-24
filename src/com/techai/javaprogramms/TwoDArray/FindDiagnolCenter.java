package com.techai.javaprogramms.TwoDArray;

public class FindDiagnolCenter {

	public static void findCenterElement(int [][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				//&& operator
				if(i==arr.length/2 && j==arr[i].length/2) {
					
					System.out.print(arr[i][j]+" ");
					
				}else {
					
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [][] arr = {{10,20,30},{40,50,60},{70,80,90}};
		findCenterElement(arr);
	}

}
