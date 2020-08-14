package com.sriman;

public class TestQuestion2 {
	
	public static boolean palindromeDescendant(int num) {
		boolean isSym=false;
		while(num>9) {
			if(isSymmetriccal(num)) {
				isSym=true;
				break;
			}
			num=getSumOfDigits(num);
			
		}
		return isSym;
		
	}
	
	private static int getSumOfDigits(int n) {
		String istring=Integer.toString(n);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<istring.length()-1;i+=2) {
			int i1=Integer.parseInt(Character.toString(istring.charAt(i)));
			int i2=Integer.parseInt(Character.toString(istring.charAt(i+1)));
			int num=i1+i2;
			sb.append(Integer.toString(num));
			
		}
		return Integer.parseInt(sb.toString());
	}

	public static boolean isSymmetriccal(int num) {
		int reversenum=0,n=num;
		if(n<0)
			n=n* -1;
		while(n!=0) {
			
			reversenum=reversenum*10;
			reversenum=reversenum + n%10;
			n=n/10;
		}
		return (reversenum==num);
	}

	public static void main(String[] args) {
		int n=130011;
		System.out.println("It is palindrom-:"+ palindromeDescendant(n));
		
	}

}
