package com.swetha.javatrials;

public class ReverseAString {
		
		public static void main(String[] args) {
			
			String input = "Reverse a String";
			
			byte[] StringArray = input.getBytes();
			byte[] resultSet = new byte[StringArray.length];
			
			for(int i=0;i<StringArray.length;i++) {
				resultSet[i] = StringArray[StringArray.length-i-1];
				System.out.println(new String(resultSet));
				
				
				
			}

		}
}
