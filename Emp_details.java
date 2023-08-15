// Program to for implementation of Overriding in JAVA


class Emp_master {
	// Private methods are not overridden
	private void sal()
	{
		System.out.println("From parent m1()");
	}

	protected void leaves()
	{
		System.out.println("From parent m2()");
	}
}

class Emp_details extends Emp_master {
	// new sal() method
	// unique to Emp_details class
	private void sal()
	{
		System.out.println("From child m1()");
	}

	// overriding method
	// with more accessibility
	@Override
	public void leaves()
	{
		System.out.println("From child m2()");
	}
}

// Driver class
class Main {
	public static void main(String[] args)
	{
		Emp_master obj1 = new Emp_master();
		obj1.leaves();
		Emp_master obj2 = new Emp_details();
		obj2.leaves();
	}
}
