package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class Arraycode1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of students");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<=n-1;i++) {
			System.out.println("Enter Marks of students"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("####marks added######");
		for(int i=0;i<=n-1;i++) {
			System.out.println("The marks of student no."+(i+1)+"is ="+arr[i]);
		}
	}

}
