package com.datatypes;

import java.util.Arrays;

public class NonPrimitive {

		public static void main(String[] args) {
			// string
			String name = "Anu";
			System.out.println("My name: "+name);
			//array
			int[] arr= {2,3,4,5,6};
			System.out.println("Your marks: "+Arrays.toString(arr));
			for(int i=0;i<5;i++) {
				System.out.println(arr[i]);
			}
		}

	}

