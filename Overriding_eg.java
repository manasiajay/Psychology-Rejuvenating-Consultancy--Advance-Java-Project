// Program to for implementation of Overriding in JAVA
class Emp_master {
	// Private methods are not overridden
	private void sal()
	{
		System.out.println("The salary of your xxxxx employee is 20000");
	}

	protected void leaves()
	{
		System.out.println("No. of leaves he/she has taken is 59 in 365 days");
	}
}

class Emp_details extends Emp_master {
	// new sal() method
	// unique to Emp_details class
	private void sal()
	{
		System.out.println("The salary of your xxxxx employee is 20000");
	}

	// overriding method
	
	public void leaves()
	{
		System.out.println("No. of leaves he/she has taken is 59 in 365 days");
	}
}

// Main class
class Overriding_eg {
	public static void main(String[] args)
	{
		Emp_master obj1 = new Emp_master();
		obj1.leaves();
		Emp_master obj2 = new Emp_details();
		obj2.leaves();
	}
}
