/*Menu driven program to implement 
1) all access specifiers
2) Multilevel inheritance with string buffer class methods
3) Hybrid inheritance using String class methods
4) Multiple inheritance using arrays concept*/

import java.util.*;
import java.lang.*;
								//PUBLIC ACCESS SPECIFIER
class Bank_info{
	public void data(){
	System.out.println("Provide details below : "); 
	}
}
class Bank_master extends Bank_info{  
		Scanner sc = new Scanner(System.in);
		public void data(){
		String name1;
		int n ;
		System.out.println("Enter customer name:");
		name1 = sc.nextLine();
		System.out.println("Enter your acc no. :");
		n = sc.nextInt();
		System.out.println("Details are as  :" +name1 + " " +n);
		}  
	}  

								//PRIVATE ACCESS SPECIFIER

class Bank_balance extends Bank_master{
	private void balance(){
	//System.out.println("The name of the customer is: " +name1);
	int bal = 1500;
	System.out.println("Balance in the account is : " +bal);
	}
}

								//PROTECTED ACCESS SPECIFIER

class Bank_acc{
	protected void acc_type(){
	String acc = "Savings";
	System.out.println("Your account type is  : "+acc);
	}
}
								// MULTILEVEL INHERITANCE

class Bank_validt extends Bank_acc{
	public void valid(){
	StringBuffer z = new StringBuffer ("Zero balance acc");
	if(z.equals("Savings")){
	System.out.println("No need to keep minumum 15,000");	
	}
	else{
	System.out.println("You must keep minumum 15,000 in your account");	
	}
	}
}

class Bank_due extends Bank_validt{
	public void due(){
	StringBuffer z1 = new StringBuffer("Twenty five thousand and fifty four");
	System.out.println("Your payment without interest : " +z1);
	z1.append("25% of due (included) is added");
	System.out.println("Total amount You need to pay: " +z1 + "  Six thousand and two sixty three");
	}
}

class Bank_updation extends Bank_due{
	public void update(){
	System.out.println("Least interacted customers since 6 years: ");
	StringBuffer z2 =new StringBuffer("Sherlock Holmes");  
	System.out.println("Customer name- before deletion:  " +z2);
	z2.delete(0,15);  
	System.out.println("Customer name- after we deleted it:   "+z2);
	}
}

								//HYBRID INHERITANCE

class Bank_employees{
		Scanner inp = new Scanner(System.in);
		public void b_data(){
		String goodname;
		int dept_no ;
		System.out.println("Enter the name of an employee working in xyz bank:");
		goodname = inp.nextLine();
		System.out.println("Enter your department no. :");
		dept_no = inp.nextInt();
		System.out.println("Details are as  :" +goodname + " " +dept_no);
		} 
}
class Bank_rules extends Bank_employees{
	public void rules(){
	String a1 ="Abide by the rules of RBI:"; 
	System.out.println(a1);
	String a2 = "No fradulent data tolerrated:";
	System.out.println(a2); 
	String a3 ="Do not accept any bribe:"; 
	System.out.println(a3);
	}
}

class E_record extends Bank_rules{
	public void record(){
	System.out.println("Update the list of employees working and replace the old employees by new ones :");
	Scanner s14 = new Scanner(System.in);
	Scanner s15 = new Scanner(System.in);
	System.out.println("Enter new employee's name :");
	String st14 = s14.nextLine();
			
	String st15 = st14.replace("Manasi", "Sherlock"); 
	System.out.println("Successfully replaced the old record by adding new one:  " + st15);
	}
}		



class E_dept extends Bank_employees{
	public void department(){
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	System.out.println("Enter employee's department :");		
	String str1 = s1.nextLine();
	System.out.println("Enter employee's work post:");
	String str2 = s2.nextLine();
	String s3 = str1.concat(str2);
	System.out.println("Employee's department along with designation is as :  "+ s3);
	}
}

								//MULTIPLE INHERITANCE

interface Loan_mast{
	String name_ex[] = new String[]{"Ajay","Yash"};
	public void l_master();

}

interface Loan_req{
	int array[] = new int[]{231,232};
	public void requirement();

}

class Loan_main implements Loan_mast,Loan_req{
	public void l_master(){
	
	System.out.println("Loan requirement for : ");
	for(int i=0; i<name_ex.length; i++){
		System.out.println("Loan withdrawal for "+ (i+1) + ": " + name_ex[i]);
	}
	
	Scanner inp = new Scanner(System.in);
	int code;
	System.out.println("Enter the code :  ");
	code = inp.nextInt();
	if(code == 231){
		System.out.println("You are eligible for taking loan");
		}
	else{
		System.out.println("You are not eligible for taking loan");
		}
	System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void requirement(){	
	System.out.println("Loan requirement for : Manasi Ajay Powar");
	double max = 1000000, min = 100000;
	System.out.println("Minimum loan withdrawal is : "+min);
	System.out.println("Maximum loan withdrawal is : "+max);
	for(int i=0; i<name_ex.length; i++){
		System.out.println("Loan withdrawal code  "+ (i+1) + ": " + array[i]);
	}
	
	}
}



// Driver code

class Prog2{
	public static void main(String args[]){
	// Using scanner to capture input
	Scanner input = new Scanner (System.in);
		
		int ch;
		System.out.println("Menu driven program to implement mplement all access specifiers, Multilevel inheritance with string buffer class methods, Hybrid inheritance using string class methods, Multiple inheritance using arrays concept in JAVA:");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		while(true)
                {
		System.out.println("1: All access specifiers in JAVA:");
		System.out.println("2: Multilevel inheritance with StringBuffer class in JAVA: ");
		System.out.println("3: Hybrid inheritance using string class methods in JAVA:");
		System.out.println("4: Multiple inheritance using arrays concept in JAVA:");
		System.out.println("5: EXIT:");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Make your choice:");
		ch = input.nextInt();
		  
		switch(ch)
		   {
			case 1:
			System.out.println("Public Access specifier in JAVA");
			Bank_master obj = new Bank_master();  
   			obj.data();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Private Access specifier in JAVA");
			Bank_balance obj1 = new Bank_balance();
			//obj1.balance();
			System.out.println("You can't invoke Private Access method in JAVA directly");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
			System.out.println("Protected Access specifier in JAVA");
			Bank_acc obj2 = new Bank_acc();  
   			obj2.acc_type();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
			break;
			

			case 2: 
			System.out.println("Bank propanganda is displayed in brief using Multilevel inheritance and StringBuffer class in Java: ");
			Bank_updation obj3 = new Bank_updation();
			obj3.valid();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			obj3.due();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
			obj3.update(); 
  	  		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
			break;
			
			
			
			case 3:
			System.out.println("Bank employees profile is displayed in brief using Hybrid inheritance and String class in Java: ");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			E_dept obj4 = new E_dept();
			obj4.b_data();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			obj4.department();

			E_record obj5 = new E_record();
			obj5.record();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			obj5.rules();
			break;

			case 4:
			System.out.println("Loan profile is displayed in brief using Multiple inheritance and Array concept in Java: ");
			Loan_main obj6 = new Loan_main();	
			obj6.l_master();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			obj6.requirement();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
			break;

			case 5:
			return;

			default:
			System.out.println("Invalid input , Try again!");
			return;
			

		}
	    
	
	}
	
    }
}
	

