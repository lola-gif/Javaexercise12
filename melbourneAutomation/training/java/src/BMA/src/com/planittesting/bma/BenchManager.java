package com.planittesting.bma;
import java.time.LocalDate;

//import BMA.src.com.planittesting.bma.Employee;


public class BenchManager extends Employee{
	
	
	
	public BenchManager(String Name, LocalDate startDate){

		this.setFullName(Name);
		this.setStartDate(startDate);
		}

	 public String getDisplayText() {
    	return getFullName() + "" + getStartDate() + Fulladdress();
    	
	 }

}




