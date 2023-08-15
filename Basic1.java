import java.util.Scanner;

  class Basic1{
	public static void main(String args[])
	{
										// Using Scanner to capture input
	Scanner input = new Scanner (System.in);
	int app_no,doc_app,ch;
	System.out.println("Enter appointment number:");
	app_no = input.nextInt();						// Taking input from user
	System.out.println("Enter ward of doctor:");
	doc_app = input.nextInt();						// Taking input from user
	System.out.println("Program to display records of a clinic:");// Menu driven program using nested switch case
	while(true)
	 {
		System.out.println("1: To display Doctor records");
		System.out.println("2: To display Patient records");
		System.out.println("3: Emergency ward list");
		System.out.println("4: Exit ");
		System.out.println("Enter your choice:");
		ch = input.nextInt();						// Taking input from user
		 switch(ch)
		  {
			case 1:
			System.out.println("a: Dr. Santosh Deshpande");
			System.out.println("b: Dr. Piya Kumbhar");
			System.out.println("c: Dr. Satish Patil");
			System.out.println("d: Dr. Anjali Datar");
			System.out.println("Enter your choice to see qualification ");
			char u;
			u = input.next().charAt(0);
				switch(u)
				 {
					case 'a':
					System.out.println("BHMS,MBBS, practicing as Cardiologist");
					break;
					case 'b':
					System.out.println("Gold medalist, practicing as Neurologist");
					break;
					case 'c':
					System.out.println("Focusing on ear,nose and throat, practicing as ENT specialist");
					break;
					case 'd':
					System.out.println("Specialization in overall health(reproductive system), practicing as Gynecologist");
					break;
					default:
					System.out.println("Enter valid choice");
				 }
				break;
			case 2:
			System.out.println("Neha Jadhav");
			System.out.println("Aditya Oak");
			System.out.println("Manasi Powar");
			System.out.println("Devanshu Jain");
			System.out.println("Daksh Deshpande");
			System.out.println("Aditee Kumbhar");
			System.out.println("Ayaan Taneja");
			System.out.println("Mira Patel");
				break;

			case 3:
			System.out.println("Aditya Oak");
			System.out.println("Manasi Powar");
			System.out.println("Devanshu Jain");	
				break;

			case 4:
				return;	
		  }

	   }


     }
}