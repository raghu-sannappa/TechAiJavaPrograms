package com.techai.javaproject.OneDArrays;

public class PrintFirstAndLastElement {

	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 } ;
		
		for (int i = 0, j= a.length-1 ; i <= j ; i++, j-- )
		{
			if( i < j )
			{
				System.out.print( a[i] + " ");
				System.out.print( a[j] + " ");
			}
			else
			{
				System.out.print( a[ i ]+ " ");
			}
			
		}
	}

}
