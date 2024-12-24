package com.techai.javaprograms.Basics;

public class ConvertLowerCaseToUpperCase {

	public static  int convertToUpperCase(char ch) {
		//Implicit TypeCasting char to int - Widening(Conversion from lower data type to higher datatype.)
		int var = ch;
		var = var-32;
		return var;
	}
	public static void main(String[] args) {
		char ch = 'a';
		int res = convertToUpperCase(ch); 
		//Narrowing - converting higher datatype to lower DT.
		//res having ASCII value of 'A' i.e - 65
		//By using Type cast operator -(datatype)value;- converted to char -'A'.
		System.out.print("Character -"+ch+" Converted to UpperCase -" +"  "+(char)res);

	}

}
