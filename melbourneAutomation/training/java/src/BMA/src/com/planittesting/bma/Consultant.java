package com.planittesting.bma;
import java.time.LocalDate;

//import BMA.src.com.planittesting.bma.Employee;

public class Consultant extends Employee{

	 
	private boolean assign;
	
	
	
	public boolean isAssign() {
		return assign;
	}



	public void setAssign(boolean assign) {
		this.assign = assign;
	}

	@Override
	public String toString() {
	    return getFullName() +" "+ getStartDate() + " " + isAssign();
	}


	
	
	 public Consultant(String fullName, LocalDate startDate) {
		// TODO Auto-generated constructor stub
		 this.setFullName(fullName);
			this.setStartDate(startDate);}
		
	



	public String getDisplayText() {
		 return getFullName() + getStartDate() + Fulladdress();
    	   	
		}
}
	
	
		
		



