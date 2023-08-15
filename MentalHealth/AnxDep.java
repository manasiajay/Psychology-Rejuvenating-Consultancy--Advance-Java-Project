package MentalHealth;
import java.util.*;
public class AnxDep
{
    public void health()
    {
        Ques[] q = new Ques[5];

       
       	q[0] = new Ques("Do you often find yourself lost in self-critical thoughts, comparison, or hopelessness?","No", "Yes" , new Answer ("Yes"));
        q[1] = new Ques("Do problems start to feel bigger when you think about them for long periods of time?","No","Yes", new Answer("Yes"));
        q[2] = new Ques("Are you able to relax and sit still even for short periods of time?","No","Yes", new Answer("Yes"));
        q[3] = new Ques("Do you have overwhelming emotions, such as fear or sadness, that make it difficult to function at times??","No","Yes", new Answer("Yes"));
        q[4] = new Ques("Do you avoid social events because of overwhelming feelings or fear of how people see you??","No", "Yes" , new Answer ("Yes"));
       		

	int countTotal = 0;
        int countRight = 0; // More Vulnerable
        int countWrong = 0; // Less Vulnerable

	for(Ques qu: q)
        {
            System.out.println(qu.getQuestion());
            System.out.println("C : " +qu.getOption1());
            System.out.println("D : " +qu.getOption2());

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);

            switch(ans)
            {
                case 'C':
                    answer = qu.getOption1();
                    break;
                case 'D':
                    answer = qu.getOption2();
                    break;
                default:break;
            }
            System.out.println("Your answer " + answer);
            if(answer.equals(qu.getAnswer().getAnswer()))
            {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("           More prone to Anxiety as well as getting into Depression                          ");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("           Less prone to Anxiety as well as getting into Depression                         ");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                countWrong++;
            }
            System.out.println("===================================================================================================================================================================================================================");
            countTotal++;
        }

        Result result = new Result(countTotal,countRight,countWrong);
        result.showResult();
    }
}

class Ques
{

    String question;
    String option1;
    String option2;
    Answer answer;

    public Ques(String question, String option1, String option2, Answer answer) {
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
        System.out.println("More Prone to Mental Disaster , Score is :: "+correctAnswers );
        System.out.println("Less Prone to Mental Disaster , Score is :: "+wrongAnswers);
	System.out.println("Total number of  Questions " + totalQuestions);
	System.out.println("Your combined performance:  " + showStyle(correctAnswers,wrongAnswers));
	System.out.println("YOUR FINAL RESULT IS::" + showPerformance(showStyle(correctAnswers,wrongAnswers)));
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       				Vector<String> vec1 = new Vector<String>();
				vec1.add("BOOKS YOU CAN TAKE INSPIRATION FROM");
				vec1.add("The Art of Happiness");
				vec1.add("The Checklist Manifesto");
				vec1.add("The Four Agreements");
				if(vec1.contains("The ChecklistS Manifesto"))
				{
				System.out.println("Author of this book is Atul Gawande: "+ vec1.indexOf("The Checklist Manifesto"));
				}
				else{
				System.out.println("You can always take inspiration from good books: ");
				} 


				HashMap<Integer,String> hm = new HashMap<Integer,String>();
				System.out.println("List of inspirational books:  ");
				hm.put(1,"The Art of Happiness");
				hm.put(2,"The Magic of Thinking Big");
				hm.put(3,"Reinventing the Body, Resurrecting the Soul: How To Create A New You ");
				hm.put(4,"The Magic of Thinking Big");
				hm.put(5,"The Four Agreements");
				for(Map.Entry m:hm.entrySet()){
				System.out.println(m.getKey() + " " +m.getValue());
				}       
      
    }

    
    public double showStyle(int correctAnswers, int wrongAnswers) {
        //System.out.println(correctAnswers + " " + wrongAnswers);
        return (double) (correctAnswers + (double)wrongAnswers) ;
    }

   
    @Override
    public String showPerformance(double type) {
        String performance = "";

        if(correctAnswers == 5 )
        {
            performance = "Unbearably upset to the point that you cannot function and may be on the verge of a breakdown:  \n Extremely anxious and desperate, helpless and unable to handle it";
        }
        else if(correctAnswers >=3 )
        {
            performance = "Moderate to strong levels of discomfort and Upset and uncomfortable; still functional :   Mild to moderate anxiety and worry";
        }

	else if(correctAnswers >=1)
	{
            performance = "Worried or upset; still able to function :   A little bit sad or distressed";
        }

	else 
	{
            performance = "No distress; alert and focused:  Peace and complete calm";
        }
        return performance;

    }
}
	