package com.testing;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter Element");
		for (int i = 0; i < args.length; i++) {
			String s=sc.nextLine();
			arr[i]=s;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
