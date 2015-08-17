package com.dao;

public class EmployeeDAO {
   int[] x = {1,2,3,4,5};
	
   @Override
   public int hashCode(){
	   System.out.println("Added an un-necessary line!");
	   return 9 * 100;
   }
}
