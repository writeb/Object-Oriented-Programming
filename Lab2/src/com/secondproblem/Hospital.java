package com.secondproblem;

import java.util.Objects;

public class Hospital extends Building {
	int amountofDoctors = 75 ; 
	int amountofChambers = 300 ; 
	String nameofHospital = "Seventh gorodskoi hospital" ; 
	
	
	public Hospital() {
		
	}
	
	
	
	public String toString()
	{ 
		return "amount of doctors = " + amountofDoctors + 
				"amount of chambers = " + amountofChambers  + 
				"Name of hospital is " + nameofHospital ;  
	}
	
	public boolean equals(Object o) 
	{
		if (!super.equals(o)) return false;
		Hospital other = (Hospital)o;
		return this.amountofDoctors==other.amountofDoctors && this.amountofChambers==other.amountofChambers && Objects.equals(this.nameofHospital, other.nameofHospital);
	}
	
	public int hashCode() {
		int result  = 17 ;
//		result = 31 * result + iamountofDoctors ; 
//		result = 31 * result + amountofChambers ; 
		result = 31 * result + Objects.hashCode(nameofHospital) ; 
		return result ; 
		
	}
}
