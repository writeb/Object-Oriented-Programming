package com.secondproblem;

import java.util.Objects;

public class Building {
	String adress = "st. Abaya";
	int amountofPeople = 1500;
	
	public Building ()
	{
		
	}
	
	
	public String toString() {
		return adress + "amount of people = " + amountofPeople; 
	}
	
	public boolean equals(Object o) {
		if(this == o) return true; 
		if(o == null) return false ; 
		if(getClass() != o.getClass()) return false; 
		Building other = (Building) o ; 
		return adress == other.adress && Objects.equals(adress, other.adress); 
	}
	
	public int hashCode()
	{
		int result = 17 ; 
		result = 31 + result + amountofPeople ;
		result = 31 + result  + Objects.hashCode(adress) ; 
		return result ; 	
	}
}
