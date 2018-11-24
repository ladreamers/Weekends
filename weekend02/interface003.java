package com.team.weekend03;


interface Employee{
	//abstract method
	Employee find(int id);
	
	//default method (instance method)
	default boolean isExec(int id) {
		return true;
	}
	
	//static method (class assoc method)
	static String getDefaultCountry() {
		return "US";
	}
	
}

public class interface003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class EmployeeImpl implements Employee{
			
			@Override
			public Employee find(int id) {
				boolean execute = isExec(id);
				return null;
			}
		}
		
		EmployeeImpl impl = new EmployeeImpl();
		impl.isExec(11111);
		
		String defaultCountry = Employee.getDefaultCountry();
		
	}

}
