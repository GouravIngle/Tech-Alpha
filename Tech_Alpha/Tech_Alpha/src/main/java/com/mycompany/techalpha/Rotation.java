package com.mycompany.techalpha;

public class Rotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 }, d = 2;
		for (int i = d; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < d; i++) {
			System.out.print(a[i] + " ");
		}
	}
}