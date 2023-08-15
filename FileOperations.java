import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;

  class FileOperations{
	public static void main(String args[]) throws IOException
	{
								// Using Scanner to capture input
	Scanner input = new Scanner (System.in);
	int ch;
	System.out.println("Menu driven program on File Operations:");	// Menu driven program for various operations
	while(true)
	 {
		System.out.println("1: File Creation");
		System.out.println("2: Copying Files");
		System.out.println("3: Displaying File Information");
		System.out.println("4: Write to a File");
		System.out.println("5: Read a File");
		System.out.println("6: Delete a File");
		System.out.println("7: EXIT");
		System.out.println("Enter your choice:");
		ch = input.nextInt();				// Taking input from user
		 switch(ch)
		  {
			case 1:
			
				try{
				File f1 = new File("Cloud basics1.pptx");
				if( f1.createNewFile() ){
				System.out.println("Successfully created" + f1.getName()+ " file:");
				}
				
				else{
				System.out.println("Failed to create seems like file already exist");
					}

				}
				catch(IOException x){
				System.out.println("OOPS");
				x.printStackTrace();
			  	}
				
			 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
				
			
			 break;

			 case 2:
			 FileInputStream sh = null;
			 FileOutputStream nanc = null;

				try{
					sh = new FileInputStream("sherlock.txt");
					nanc = new FileOutputStream("nancy.txt");

					int x;
					while((x= sh.read()) != -1){
					nanc.write(x);
					}

				   }
				finally{
					if(sh != null){
						sh.close();
					}
					if(nanc != null){
						nanc.close();
					}
					}
			System.out.println("Copied successfully!!!!!!!");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
			
			  
			 break;

			case 3:

			File f2 = new File("C:Cloud.txt");  
        		if (f2.exists()) {  
           
            		System.out.println("The name of the file is: " + f2.getName());  
   
              
            		System.out.println("The absolute path of the file is: " + f2.getAbsolutePath());     
   
              
            		System.out.println("Is file writeable?: " + f2.canWrite());    
   
            
            		System.out.println("Is file readable " + f2.canRead());    
   
            
           	 	System.out.println("The size of the file in bytes is: " + f2.length());    
       			} 
			else {  
           			 System.out.println("The file does not exist.");  
        		     }  

			 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
			

			 break;

			 case 4:

			try {  
        			FileWriter fwrite = new FileWriter("C:Cloud.txt");  
        	 
        			fwrite.write("Types of Virtualization:Hardware Virtualization.\n Operating system Virtualization.\n Server Virtualization. \n Storage Virtualization.");
        
       				fwrite.close();   
        			System.out.println("Content is successfully wrote to the file.");  
   			    } 
			catch (IOException e) {  
       				 System.out.println("Unexpected error occurred");  
        			e.printStackTrace();  
       			 }  
			 
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
			
	                 break;
			
			case 5:

			try {  
           
            			File f3 = new File("C:Cloud.txt");    
            			Scanner dataReader = new Scanner(f3);  
           			while (dataReader.hasNextLine()) {  
                		String fileData = dataReader.nextLine();  
                		System.out.println(fileData);  
            		    }  

            		dataReader.close();  
       			 } catch (FileNotFoundException exception) {  
            		System.out.println("Unexcpected error occurred!");  
            		exception.printStackTrace();  
        		}  
			 
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
			
			 break;
			
			 case 6:
				
				File f4 = new File("C:Cloud.txt");   
   				 if (f4.delete()) {   
      					System.out.println(f4.getName()+ " file is deleted successfully.");  
   				 } 
				else {  
     					 System.out.println("Unexpected error found in deletion of the file.");  
    				     }   
			 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
			
			 default: System.out.println("Please enter valid choice:");
				  System.exit(0);

			
					

		   }
	   }
     }
}

