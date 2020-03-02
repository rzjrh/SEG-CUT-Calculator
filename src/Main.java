import java.util.Scanner;

public class Main {

	
	public static double calcH (double a) {
		if (a<=50.0) {
			a= a+0.25;} 
		 {
			if (a>=50.01 && a<=64.0) {
				a= a+0.15;} 
		} 
		 {
		if (a>=64.01 && a<=5.0) {
				a= a+0.05;
		}}
			 {
		if (a>=75.01 && a<=90.0) {
			a= a-0.1;
		}}
		{
		if (a>=90.01 && a<=125.0) {
					a= a-0.21;
				}}
		{
			if (a>=125.01 && a<=170.0) {
				a= a-0.32;
			}}	
		{
			if (a>=170.01 && a<=220.0) {
				a= a-0.45;
			}}
		{
			if (a>=220.01 && a<=290.0) {
				a= a-0.55;
			}}
		{
			if (a>=290.01 && a<=350.0) {
				a= a-0.7;
			}}
		{
			if (a>=350.01 && a<=390.0) {
				a= a-0.9;
			}}
		{
			if (a>=390.01 && a<=430.0) {
				a= a-1.15;
			}}
		{
			if (a>=430.01 && a<=470.0) {
				a= a-1.45;
			}}
		{
			if (a>=470.01 && a<=500.0) {
				a= a-1.8;
			}}
		{
			if (a>=500.01) {
				System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
				a=0.000;
			}}
		System.out.println("The height cut is: \t"+ a);
		return a;	
		
		

	}

	
	public static double calcW (double a) {
		if (a<=50.0) {
			a= a+0.25;} 
		 {
			if (a>=50.01 && a<=64.0) {
				a= a+0.15;} 
		} 
		 {
		if (a>=64.01 && a<=75.0) {
				a= a+0.05;
		}}
			 {
		if (a>=75.01 && a<=90.0) {
			a= a-0.1;
		}}
		{
		if (a>=90.01 && a<=125.0) {
					a= a-0.21;
				}}
		{
			if (a>=125.01 && a<=170.0) {
				a= a-0.32;
			}}	
		{
			if (a>=170.01 && a<=220.0) {
				a= a-0.45;
			}}
		{
			if (a>=220.01 && a<=290.0) {
				a= a-0.55;
			}}
		{
			if (a>=290.01 && a<=350.0) {
				a= a-0.7;
			}}
		{
			if (a>=350.01 && a<=390.0) {
				a= a-0.9;
			}}
		{
			if (a>=390.01 && a<=430.0) {
				a= a-1.15;
			}}
		{
			if (a>=430.01 && a<=470.0) {
				a= a-1.45;
			}}
		{
			if (a>=470.01 && a<=500.0) {
				a= a-1.8;
			}}
		{
			if (a>=500.01) {
				System.out.println("WARNING!\nThe Number is too high, call Reza or your supervisor!!");
				a=0.000;
			}}
		System.out.println("\nThe width cut is: \t"+ a);
		return a;	

	}
	
	
	
	//main method
	public static void main(String[] args) {
		System.out.println("WELCOME");
		System.out.println("This program is designed to calculate the SEG frames cut file\nCurrently it is only for Backlit fabrics");
		System.out.println("Reza Akhlaqi Feb 2020- SEG cut calculator v 1.0.0.4");
		System.out.println("Note: This program is not designed for the Luna Frames");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\n\n\n\nPlease enter the frame Width:");
		double width = sc.nextDouble();
		
		System.out.println("\nPlease enter the frame Height:");
		double height = sc.nextDouble();
		
		
		
		
		calcW(width);
		calcH(height);
//		System.out.println("Please press Enter to close ....");
//		sc.nextLine();
		sc.close();
//
//		System.out.println("Press 'Enter' key to exit.");
//		System.console().readLine();
		
	}

}
