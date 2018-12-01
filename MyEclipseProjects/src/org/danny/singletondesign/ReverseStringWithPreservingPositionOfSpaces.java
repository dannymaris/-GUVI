package org.danny.singletondesign;

public class ReverseStringWithPreservingPositionOfSpaces {
	 public static void main(String args[]) {
		 
		 /*Approach2 print statement*/
		 reverseString("India Is my country"); 
	 
		 /* You can reverse the contents of a given String using leaving the 
		 spaces using the reverse() method of the StringBuffer class */
		 
	      String str = "hi welcome to Tutorialspoint";
	      String strArray[] = str.split(" ");
	      StringBuffer sb= new StringBuffer(str);
	      sb.reverse();
	      for(int i=0 ; i<str.length(); i++){
	      if(str.charAt(i)== ' '){
	         sb.insert(i, " ");
	      }
	   }
	   sb.append("");
	   System.out.println(sb);
	 }

           /*Approach2*/
	   
	   static void reverseString(String input) {  
		   
	        char[] inputArray = input.toCharArray();  
	        char[] result = new char[inputArray.length];  
	   
	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] == ' ') {  
	                result[i] = ' ';  
	            }  
	        }  
	   
	        int j = result.length - 1;  
	   
	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] != ' ') {  
	                if (result[j] == ' ') {  
	                    j--;  
	                }  
	                result[j] = inputArray[i];  
	                j--;  
	            }  
	        }  
	        System.out.println(input + " --> " + String.valueOf(result));  
	    }  
	   
	   
	         
	    }  
