package com.datatypes;

public class TypeCasting {
	public static void main(String[] args) {

		int num = 500;

		long num1 = num; // implicit 6

		System.out.println("num: "+num);
        System.out.println("num1: "+num1);
        
        long num2 = 355;
		int num3 = (int) num2;//explicit
        System.out.println("num2: "+num2);
        System.out.println("num3: "+num3);
        
        //java 10 onwards
        var var1= "keerthi";
        var var2=78;
        System.out.println(var1+" "+var2);
}
}
