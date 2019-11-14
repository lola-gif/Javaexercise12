package com.planittesting.bma;
import java.time.LocalDate;

//import BMA.src.com.planittesting.bma.Addressfields;

public class Employee extends Addressfields{

		private String fullName;
		private Integer hours;
		private LocalDate startDate = null;
			
		
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public Integer getHours() {
			return hours;
		}
		public void setHours(Integer hours) {
			this.hours = hours;
		}
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		
		
	}
		

		
	





