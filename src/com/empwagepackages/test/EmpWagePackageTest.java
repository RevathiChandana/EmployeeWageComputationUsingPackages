package com.empwagepackages.test;
import com.empwagepackages.model.EmpWagePackage;
public class EmpWagePackageTest{
	public static void main(String[] arg){
		EmpWagePackage emp=new EmpWagePackage();
	        double EmpCheck=Math.floor(Math.random()*10)%2;
		System.out.println(emp.DisplayMessage(EmpCheck));
	}
}
