package com.tka;

public class Online_shopping_application {
	//product ID
	void perchase(int a) {
	System.out.println("productId is-->"+(a));
}
//product ID and Quantity
void perchase(int a,int b) {
	System.out.println("productId is-->"+(a));
	System.out.println("product Quantity is-->"+(b));
}
//product ID ,Quantity,and Discount rate
void perchase(int a,int b,double c) {
	System.out.println("productId is-->"+(a));
	System.out.println("product Quantity is-->"+(b));
	System.out.println("product Discount percentage is-->"+(c));
}
//product Name and PROduct Quantity
void perchase(String a,int b) {
	System.out.println("product NAME  is-->"+(a));
	System.out.println("product Quantity is-->"+(b));
}
public static void main(String[] args) {
	Online_shopping_application a=new Online_shopping_application();
	a.perchase(001);
	a.perchase(001, 3);
	a.perchase(001, 3, 10.0);
	a.perchase("mobiles", 3);
}
}
