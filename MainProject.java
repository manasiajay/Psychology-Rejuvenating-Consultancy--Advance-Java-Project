import java.util.*;
import java.lang.*;
import MainInfo.*;
import Attachmentx.*;
import Boundaries.*;
import MentalHealth.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

															//REGISTRATION
class Registration {
	
	Register register = new Register();
	
        void reg(){

            Scanner scanner = new Scanner (System.in);
            System.out.print(" Enter your First Name:  ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print(" Enter your Last Name:  ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

	    System.out.print(" Enter desired UserName:  ");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.print(" Enter your password:  ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print(" Enter your emailId: ");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);

            try{
		System.out.print(" Enter your Phone Number: ");
            	long phoneNo = scanner.nextLong();
		register.setPhoneNo(phoneNo);
		if(phoneNo != scanner.nextLong()) {
			throw new InputMismatchException("Enter values for integer number only!");
			}
			else{
			 System.out.println(register.toString());
			}
		
		}
			
		catch(InputMismatchException ix){
			System.out.print("Strings in this field is not allowed \n Enter a valid field (DIGITS ONLY)");
			System.exit(0);
			}
           
        }
    
class Register {   
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    private long phoneNo;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
	return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }	
	public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    @Override
    public String toString() {
        return "You have Successfully registered [First Name=" + firstName + ", Last Name=" + lastName + ", UserName=" + userName + ", Password=" +
            password + ", EmailId=" + emailId + ", Phone Number=" + phoneNo + "]";
    }
}
}

															//LOGIN
class Authentication{
	// Using scanner for capturing input from user
	Scanner input = new Scanner (System.in);
	void auth(){
	
	System.out.println("Enter your credentials below:");

	String pwd, real;
	String n;
	System.out.println("Enter your Username : ");
	n = input.nextLine();
	System.out.println("Enter your Password : ");
	pwd = input.nextLine();
	real = "manasi";
			
	// Condition
	if( pwd.equals(real) )
	{
		System.out.println("ACCESS GRANTED, Valid login :");
	}
	else{
		System.out.println("Invalid password, Try again! --ACCESS DENIED");
		System.exit(0);
	    }
	
	}
}
															//PERSONALITY TRAIT
class Trait_test
{
    void begin()
    {
        Question[] questions = new Question[11];

       
       	questions[0] = new Question("Do you like to hang out with friends regularly?","Yes I love to spend time with them","No I would like myself alone", new Answer ("Yes I love to spend time with them"));
        questions[1] = new Question("Do you face difficulty to interact with new people? OR while Making new friends?","Yes because I keep a small circle and that's enough","No not at all I love to interact with strangers life is adventurous", new Answer("No not at all I love to interact with strangers life is adventurous"));
        questions[2] = new Question("Do you enjoy when you travel or party?","Yes I love to Travel","No I zone out", new Answer("Yes I love to Travel"));
        questions[3] = new Question("Do you share your secrets easily with anyone?","Yes but there are no such secrets my life is an open book","No not at all I keep my secrets to myself", new Answer("Yes but there are no such secrets my life is an open book"));
        questions[4] = new Question("Are you vulnerable in front of anyone,Or do you get vulnerable easily?","Yes obviously to my friends","No I'm headstrong and I dont get vulnerable easily.", new Answer("Yes obviously to my friends"));
	questions[5] = new Question("Seeing other people cry can easily make you feel like you want to cry too.?","Yes I am kinda emotional ","No I dont know how to handle", new Answer ("Yes I am kinda emotional"));
        questions[6] = new Question("At social events, you rarely try to introduce yourself to new people and mostly talk to the ones you already know.?","Yes I get awkward at times","No not at all I love to interact with people", new Answer("No not at all I love to interact with people"));
        questions[7] = new Question("Are you very sentimental.?","Yes I am ","No I am not", new Answer("No I am not"));
        questions[8] = new Question("Even a small mistake can cause you to disrupt your confidence.","Yes I'm sort of socially awkward","No it does'nt hamper my Confidence", new Answer("No it does'nt hamper my Confidence"));
        questions[9] = new Question("Do you feel comfortable just walking up to someone you find interesting and intiating a conversation.?","Yes obviously I'm always the one who takes the first step in initiating convos","No I don'nt really like to talk unless I'm asked to.", new Answer("Yes obviously I'm always the one who takes the first step in initiating convos"));
	questions[10] = new Question("Do You like books and movies that make you come up with your own interpretation of the ending..?","Yes I love making scenarious in head and plagerize stories","No I would rather chill with my friends than doing this", new Answer ("No I would rather chill with my friends than doing this"));
        int countTotal = 0;
        int countRight = 0; // Extraversion
        int countWrong = 0; // Intraversion

        for(Question q: questions)
        {
            System.out.println(q.getQuestion());
            System.out.println("A : " +q.getOption1());
            System.out.println("B : " +q.getOption2());
         

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);

            switch(ans)
            {
                case 'A':
                    answer = q.getOption1();
                    break;
                case 'B':
                    answer = q.getOption2();
                    break;
       
                default:break;
            }
            System.out.println("Your answer " + answer + " " + q.getAnswer());
            if(answer.equals(q.getAnswer().getAnswer()))
            {
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                  EXTROVERT TRAIT                      ");
               	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                 INTROVERT TRAIT                      ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    	
                countWrong++;
            }
            System.out.println("===================================================================================================================================================================================================================");
            countTotal++;
        }

        Result result = new Result(countTotal,countRight,countWrong);
        result.showResult();
    }
}
class Question
{

    String question;
    String option1;
    String option2;
    Answer answer;

    public Question(String question, String option1, String option2, Answer answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public Answer getAnswer() {
        return answer;
    }
}

class Answer
{
    String answer;

    public Answer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}

interface IResult
{
    void showResult();
    double showType(int correctAnswers,int totalQuestions);
    String showPerformance(double percentage);
}

class Result implements IResult
{
    int totalQuestions;
    int correctAnswers;
    int wrongAnswers;

    public Result(int totalQuestions, int correctAnswers, int wrongAnswers) {
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
    }

    @Override
    public void showResult() {
        System.out.println("Your results!");
        System.out.println("Total Questions " + totalQuestions);
        System.out.println("Number of Extrovert trait answers:: " + correctAnswers);
        System.out.println("Number of Introvert trait answers:: " + wrongAnswers);
        System.out.println("Your combined performance:: 	" + showType(correctAnswers,wrongAnswers));
        System.out.println("Your exact type is (Overall prediction depending on the answers you gave::) 	" + showPerformance(showType(correctAnswers,wrongAnswers)));
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                
    }

    @Override
    public double showType(int correctAnswers, int wrongAnswers) {
      
        return (double) (correctAnswers + (double)wrongAnswers) ;
    }

    @Override
    public String showPerformance(double type) {
        String performance = "";

        if(correctAnswers  > wrongAnswers )
        {
            performance = "YOU ARE AN EXTROVERT :  MORE EXTRAVERSION";
        }
        else
        {
            performance = "YOU ARE AN INTROVERT :  MORE INTRAVERSION";
        }

        return performance;

    }
}

															//BLOG SECTION OF PRC
class BlogSection extends Thread
{
	private static Object sec = new Object();
	public void run(){
	System.out.println("Pscychology Rejuvenating Consulancy (PRC) is a Console Based App wherein different kind of tests are undertaken in order to find your Personality Trait.\n It gives most accurate results of your personality style,\n:");
	System.out.println("The type of boundaries you have with everyone, it also lets you explore the level and the intensity of anxiety and Depression you may or may not have.\n By far PRC has been serving most helpful mental health knowledge.:");
	System.out.println(" PRC is concerned about the styles with their visual representation as a Healer, Intellect, Visionary and lot many Personality Styles. \n You can also rate the PRC by filling the feedback form.:");
	System.out.println("The unique attribute of PRC is it lets you visualize and choose logos of your type. \nThere are 2 types of logos- Basic and Aesthetic. You can even rate, choose and give Feedback.:");
		}
 
}
class PRC{    
	int token_no=1023;    
    
	synchronized void driveEasy(int token_no){    
	System.out.println("Unique Attribute of PRC : Customer Satisfaction and variety of choices for them. Most accurate Results and grooming to be batter person.");    
    
	if(this.token_no < token_no){    
	System.out.println("Invalid number, follow protocols...");    
	try{
		wait();
	}catch(Exception e)
	{
	}    
	}    
	this.token_no -= token_no;    
	System.out.println("Sucess");    
	}    
    
	synchronized void gain(int token_no){    
	System.out.println("Permission granted...");    
	this.token_no += token_no;    
	System.out.println("Process completed... ");    
	notify();    
	}    
}  

class DriveEasy extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    } 
} 
															//PUBLIC CLASS MAINPROJECT
public class MainProject extends Applet implements ActionListener, ItemListener{

  Image img1, img2, img3, img4, img5, img6;
  String zee =" ";
  Button play,stop;
  AudioClip audioClip;
  String str = " ";
  String s_name=" ", type=" ";
  int age;
  TextField n = new TextField(10);
  TextField n1 =new TextField(30);
	CheckboxGroup g=new CheckboxGroup(); 
	Checkbox d=new Checkbox("Simple,Subtle",g,true);
	Checkbox t=new Checkbox("Vibrant, Funky",g,false);
	Choice c=new Choice();
	Label l1=new Label("Enter your favourite among these:");
	Label l2=new Label("Choose type:");
	Label l3=new Label("Star Rating PRC:");
	Label l4=new Label("Your Feedback:");
	Button b=new Button("SUBMIT");
	CheckboxGroup grp;
	Choice kdrama, kthriller;
  public void init()
  {
    img1=getImage(getDocumentBase(),"logo2.png");
    img2=getImage(getDocumentBase(),"logo3.png");
    img3=getImage(getDocumentBase(),"logo4.png");
    img4=getImage(getDocumentBase(),"logo5.png");
    img5=getImage(getDocumentBase(),"logo6.png");
    img6=getImage(getDocumentBase(),"logo8.png");

      play = new Button(" Play in Loop ");
      add(play);
      play.addActionListener(this);
      stop = new Button(" Stop ");
      add(stop);
      stop.addActionListener(this);
      audioClip = getAudioClip(getCodeBase(), "Recording.wav");

setBackground(Color.white);
	

	grp = new CheckboxGroup();
		kdrama = new Choice();
		kthriller = new Choice();
		

		kdrama.add("Basic Category logos");
		kdrama.add("1 First logo");
		kdrama.add("2 Second logo");
		kdrama.add("6 Sixth logo");

		kthriller.add("Aesthetic category of logos");
		kthriller.add("3 Third logo");
		kthriller.add("4 Fourth logo");
		kthriller.add("5 Fifth logo");
		
		kthriller.select("Aesthetic category of logos");
		
		add(kdrama);
		add(kthriller);

		kdrama.addItemListener(this);
		kthriller.addItemListener(this);

		b.setBackground(Color.orange);
		c.setBackground(Color.orange);
		
		add(l1);
 		add(n);
		add(l2);
		add(d);
		add(t);
		add(l3);
		c.add("5");
		c.add("4");
		c.add("3");
		c.add("2");
		c.add("1");
		add(c);
		add(l4);
		add(n1);
		add(b);
		b.addActionListener(this);
		
		
		

}
@Override
public void actionPerformed(ActionEvent ae) {
      Button source = (Button)ae.getSource();
      if (source.getLabel() == " Play in Loop ") {
         audioClip.play();
      } else if(source.getLabel() == "  Stop  "){
         audioClip.stop();
      }

	s_name=n.getText();
	str = n1.getText();
		type=g.getSelectedCheckbox().getLabel();
		age=Integer.parseInt(c.getSelectedItem());
		repaint();

}

@Override
public void itemStateChanged(ItemEvent x){
		repaint();
}

  public void paint(Graphics g)
  {
    g.drawImage(img1,0,0,this);
    g.drawImage(img2,500,0,this);
    g.drawImage(img3,1000,0,this);
    g.drawImage(img4,1500,0,this);
    g.drawImage(img5,12,500,this);
    g.drawImage(img6,500,500,this);
    g.drawString(zee,600,700);

	Font fb = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);         
    	Font fi = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);         
    	Font fbi = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);     

    	Font fbx = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);         
    	Font fix = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);
	g.setFont(fb);
	g.drawString("Your favourite LOGO: "+s_name,1300,700);
	g.setFont(fb);
	g.drawString("Your Type: "+type,1300,750);
	g.setFont(fi);
	g.drawString("Ratings to PRC: "+age,1300,800);
	g.setFont(fbi);
	g.drawString("Thank you for your feedback! : "+str,1300,850);
	g.setFont(fbx);
	g.drawString("Your feedback has been submitted successfully ! : ",1300,900);	
	g.setFont(fix);



  }   
/*

<html>
<applet code=MainProject height=400 width=400>
</applet>
</html>
*/  
	public static void main(String args[]){
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    	System.out.println("                                                        				WELCOME TO PSYCHOLOGY REJUVENATING CONSULTANCY: ");
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    
	Registration r = new Registration();
	r.reg();
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    
	Authentication a = new Authentication();
	a.auth();
	System.out.println("You have successfully logged in!. ");
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    	// Using scanner to capture input
		Scanner sc = new Scanner (System.in);
		
		int ch;
		System.out.println("We would like to know what kind of tests will you take........!");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		while(true)
                {
		System.out.println("1: Personality Trait Test:						|\n");
		System.out.println("2: Essential things you need to know! 					|\n 	A] About Subconscious mind 	 \n	B] Procrastination 	\n	C] Boosting Self-esteem  					| \n");
		System.out.println("3: Take Attachment Style Test to know your Attachment with everyone:	|\n");
		System.out.println("4: What type of boundaries do you have?:				|\n");
		System.out.println("5: Check your intensity of Anxiety and Depression here!:		|\n");
		System.out.println("6: Blog Section of Psychology Rejuvenating Consultancy:			|\n");
		System.out.println("7: Presentation by Psychology Rejuvenating Consultancy:			|\n");
		System.out.println("8: Visualize various personality styles over here! :			|\n");
		System.out.println("9: A tour to PRC logos and feedback form. :				|\n");
		System.out.println("10: EXIT:								|\n");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
		System.out.println("Choose from the list given above:");
		ch = sc.nextInt();
		switch(ch)
		   {
			case 1:
			System.out.println("A short Description::   The following test will tell your real trait based on few questions. Are you an EXTROVERT- an outgoing, gregarious person or an INTROVERT- living in their own world,quiet and shy to everyone. Take a quick test to know......!!!!!!!");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			Trait_test t = new Trait_test();
        		t.begin();
			break;

			case 2: 
			PRC_Details objx = new PRC_Details();
			objx.record();
			objx.det();

			break;
	
			

			case 3:
			
			System.out.println("******************************************************************TAKE THE ATTACHMENT STYLE TEST TO CHECK YOUR ATTACHMENT******************************************************************************************");
	 		System.out.println("A brief Description::   The following test will tell your Attachment Style and what type of attachment do you have with your close people.");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			Attachment_style as = new Attachment_style();
			as.attachment();
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			break;

			case 4:
			System.out.println("******************************************************************TYPES OF BOUNDARIES YOU ARE HAVING**************************************************************************************************************");
	 		System.out.println("A brief Description::   This section comprises of Identifying the types of boundaries you have with everyone. You can discover your boundaries in any relationships and work on the same.");
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			Boundary b = new Boundary();
			b.Bound();
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			break;
			case 5:
			System.out.println("******************************************************************CHECK YOUR MENTAL HEALTH ASAP******************************************************************************************************************");
	 		System.out.println("A brief Description::   This section comprises of Checking the anxiety and depression level and identifying the problem.");
			AnxDep ad = new AnxDep();
			ad.health();
			System.out.println("GET HELP - CONTACT NO. 98342xxxxxx");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
	 		break;

			case 6:
			System.out.println("******************************************************************BLOG SECTION OF PRC****************************************************************************************************************************");
	 		System.out.println("A brief Description::   This section comprises of Checking the Level of your brain by just answering one question.");
			BlogSection bs = new BlogSection();
			bs.run();
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
	 		break;

			case 7:
			System.out.println("******************************************************************PRESENTATION BY PSYCHOLOGY REJUVENATING CONSULTANCY********************************************************************************************");
	 		System.out.println("A brief Description::   You can now see the presentation on Psychology Rejuvenating Consultancy in detail.");
			try {  
           
            			File f3 = new File("C:PRCp.pptx");    
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
			 
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			File f2 = new File("C:PRCp.pptx");  
        		if (f2.exists()) {  
           
            		System.out.println("NAME OF THE PPT FILE: " + f2.getName());  
   
              
            		System.out.println("PATH IS: " + f2.getAbsolutePath());     
   
              
            		System.out.println("FILE WRITABLE?: " + f2.canWrite());    
   
            
            		System.out.println("FILE READABLE? " + f2.canRead());    
   
            
           	 	System.out.println("The size of the file in bytes is: " + f2.length());    
       			} 
			else {  
           			 System.out.println("The file does not exist.");  
        		     } 
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			String Path = "C:PRCp.pptx";
      
      			File file = new File(Path);
			long lastModified = file.lastModified();
      			Date date = new Date(lastModified);
      			System.out.println("This ppt was last modified at: ");
      			System.out.println(date); 
			System.out.println("Enter the path of the file given above to open and read the powerpoint presentation! "); 
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			try{
				File f1 = new File("PRC_data.xls");
				if( f1.createNewFile() ){
				System.out.println("Successfully created:	" +  f1.getName()  + "  Excel file:");
				}
				
				else{
				System.out.println("Failed to create seems like file already exist");
					}

				}
				catch(IOException x){
				System.out.println("OOPS an Error occured!");
				x.printStackTrace();
			  	}
				
			 	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				try {  
        			FileWriter fwrite = new FileWriter("C:PRC_data1.xls");  
        	 
        			fwrite.write("Name.\t Your Personality Trait.\t Your Attachment Style. \t Your level of Anxiety and Dep. \t Your Boundary.\n");
        			fwrite.write("Manasi.\t Introvert.\t Dismissive Avoidant. \t Moderate. \t Material.\n");
        			fwrite.write("Ajay.\t Extrovert .\t Secure. \t Calm and Peaceful. \t Intellectual.\n");
        			fwrite.write("Neha.\t Extrovert.\t Anxious Preoccupied. \t High. \t Emotional.\n");
        			fwrite.write("Aditya.\t Introvert.\t Fearful Avoidant. \t Functional. \t Physical.\n");
        			
				File f4 = new File("C:PRC_data.xls");  
        			if (f4.exists()) {  
           			System.out.println("PATH IS: " + f4.getAbsolutePath()); 
				}
       				fwrite.close();   
        			System.out.println("Content is successfully written.");  
   			    	}
	 
				catch (IOException e) {  
       					 System.out.println("Unexpected error occurred");  
        				e.printStackTrace();  
       			 	}  
			 	
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
			



			System.exit(0);	
			
	
				

  	 		break;


			case 8:
			System.out.println("******************************************************************WELCOME TO OUR PERSONALITY STYLE SECTION*****************************************************************************************************");
	 		System.out.println("Follow the given instructions to see your Personality Style:");
	 		System.out.println("1] Primarily, you are exited from the PRC , don't panick. You have to enter this command - [ javacold Ptype.java] ");
	 		System.out.println("2] Secondly, you are now in the Types directory : now, Enter: [ appletviewer Ptype.java]");
 	 		System.out.println("3] Finally you are able to actual see and visualize your Personality Type and what it is named!");
			System.out.println("4] To return back command is [javaold MainProject], enter correct information while logging in");
	 		System.exit(0);
			break;	

			case 9:
			System.out.println("******************************************************************A TOUR TO PRC LOGOS AND FEEDBACK FORM*******************************************************************************************************");
	 		System.out.println("A brief Description::   Experience the tour of LOGOS and selecting them along with the Feedback Form. Do share your choices and thoughts in the form provided.");
			System.out.println("Enter command : [ appletviewer MainProject.java] for visualizing the applet in which the form resides.");
			System.out.println("Don't forget to close the window once you are done with everything in PRC.");
	 		System.exit(0);
			break;

			case 10:
			System.out.println("****************************************************************** THANK YOU FOR YOUR VIRTUAL VISIT IN PRC ********************************************************************************************************");
	 		byte by= 10;
			Byte byteobj=by; 
			System.out.println("You have subscribed the Psychology Rejuvenating Consultancy by pressing: "+byteobj); 
			byte bytevalue=byteobj;  
			System.out.println("You have also subscribed the newsletters for updates by pressing: "+bytevalue);
			System.out.println(" ");
			System.out.println("GET HELP - CONTACT NO. 98342xxxxxx		TALK WITH OUR Psychology Expert Team or write us on prc360@gmail.com ");
			System.out.println("****************************************************************** DO VISIT AGAIN FOR FREE CONSULTANCE! ***********************************************************************************************************");
	 		  
			return;



			}
	
		}
	}
}
			
			