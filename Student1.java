class Student1
{
  public static void main(String args[])
   {
     int English =93, Maths= 69, Science= 79, Geog= 66, History=77; 
     int sum = English+ Maths+ Science+ Geog+ History;
     int average = sum/5,ch;
     int percentage = (sum*100)/500;
     System.out.println("Data of a particular student:");
     System.out.println("------------------------------------------------------");  
     System.out.println("1: Total marks obtained");
     System.out.println("Displaying Total/Sum");       //Sum
     System.out.println("Sum: " +sum);
     System.out.println("------------------------------------------------------");  
     System.out.println("2: Average obtained");
     System.out.println("Displaying Average");         //Average
     System.out.println("Average: " +average);
     System.out.println("------------------------------------------------------");
     System.out.println("3: Percentage acquired");
     System.out.println("Displaying Percentage");      //Percentage
     System.out.println("Percentage: " +percentage + "%");
     System.out.println("4: Grades acquired/ Class");
     //System.out.println("5: Actual Result");
     System.out.println("To check student's grade on the basis of Percentage");
     ch = percentage/10; // CGPA System
       switch(ch)
        {
          case 4: 
                  System.out.println("Fail  D");
          
          break;

	  case 6:
                 if(ch>=40 && ch<60){
                 System.out.println("Pass  C");
            }
         
	  case 7:
                 if( ch>=60 && ch<80){
                 System.out.println("Average  B");
            }
          
          break;

          case 8:
                 if(ch>=80){
                 System.out.println("Distinction A");
            }

	default: System.out.println("Enter valid choice!");
                
     }  

  }
}