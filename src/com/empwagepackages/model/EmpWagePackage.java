package com.empwagepackages.model;
public class EmpWagePackage{
	public static final int IsFullTime=1;
	public String DisplayMessage(double EmpCheck){
		if(EmpCheck==1)
			return "Employee is present";
		else
			return "Employee is abscent";
	}
}
