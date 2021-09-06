package com.API.Controllers;

public final class Calculator {
	
	private static Calculator instance;
	public String value;
	
	private Calculator (String value) {
		this.value = value;
	}
	
	public static Calculator getInstance(String value) {
		if(instance == null) {
			instance = new Calculator(value);
		}
		return instance;
	}
	
	
	public int sum(int a, int b) {
		return a+b;
		Calculator calculator = Calculator.getInstance(value);
		
	}
	
	public double avg(double[] arr) {
		int dem= 0;
		double sum = 0;
		
		for(int i = 0; i< arr.length; i++) {
			sum = sum + arr[i];
			dem++;
		}
		return sum/dem;
	}
	
	
	public void fibonacci() {
		int fib1 = 0;
		int fib2 = 1;
		
		
	}
	
	class A extends Calculator {
		@Override
		public int sum(int a, int b) {
			return a+b;
		}
	}
	
	
	
	
	
1.	Select a.Name, b.Sem From Student a Inner Join Score b On a.ID = b.Stud_id 
			Where b.English > 8
2. 	Select AVG(Math,English) where Sem = 1    
3.  Select Max(MAth) from Score where Math > 9 
}
