package com.basic;

public class Date {
	int day;
	int month;
	int year;
	public Date(int a, int b, int c) {
		this.day=a;
		this.month=b;
		this.year=c;
		
	}
	
	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public static void main(String args[]) {
		Date d1= new Date(10,10,2018);
		System.out.println("Date is"+ d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
		
		
	}

}
