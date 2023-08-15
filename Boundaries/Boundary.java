package Boundaries;
import java.util.*;
public class Boundary
{
           public void Bound()
    {
        Ques[] q = new Ques[4];

       
       	q[0] = new Ques("Are you comfortable in letting people know about your personal space and comfort with touch with the physical needs like eating, sleeping?","No", "Yes" , new Answer ("Yes"));
        q[1] = new Ques("Are you capable of taking in the Emotional Energy and respecting and honouring others feelings?","No","Yes", new Answer("Yes"));
        q[2] = new Ques("Do you respect others' ideas and opinions when you yourself are cluless?","No","Yes", new Answer("Yes"));
        q[3] = new Ques("Do you fantasize materialism and are you concerned with sharing your stuff with others?","No","Yes", new Answer("No"));
       
	int countTotal = 0;
        int countRight = 0; 
        int countWrong = 0; 

	for(Ques qu: q)
        {
            System.out.println(qu.getQuestion());
            System.out.println("X : " +qu.getOption1());
            System.out.println("Y : " +qu.getOption2());

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);

            switch(ans)
            {
                case 'X':
                    answer = qu.getOption1();
                    break;
                case 'Y':
                    answer = qu.getOption2();
                    break;
                default:break;
            }
            System.out.println("Your answer " + answer);
            if(answer.equals(qu.getAnswer().getAnswer()))
            {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                  Healthy type of Boundaries                    ");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                Unhealthy type of Boundaries                       ");
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
        System.out.println("Healthy type of Boundaries:		" +correctAnswers);
        System.out.println("Unhealthy type of Boundaries:	"  + wrongAnswers);
	System.out.println("Total Questions:			 " + totalQuestions);
	System.out.println("Your combined boundaries" + showStyle(correctAnswers,wrongAnswers));
	System.out.println("THE TYPE OF BOUNDARIES YOU HAVE OR NEED TO WORK ARE ::" + showPerformance(showStyle(correctAnswers,wrongAnswers)));
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                
      
    }

    
    public double showStyle(int correctAnswers, int wrongAnswers) {
        //System.out.println(correctAnswers + " " + wrongAnswers);
        return (double) (correctAnswers + (double)wrongAnswers) ;
    }

   
    @Override
    public String showPerformance(double type) {
        String performance = "";

        if(correctAnswers == 3 && wrongAnswers == 1)
        {
            performance = "YOU HAVE A COMBINATION OF HEALTHY 'PHYSICAL, EMOTIONAL AND INTELLECTUAL BOUNDARIES' ";
        }
        else if (correctAnswers == 4)
        {
            performance = "YOU HAVE ALL HEALTHY BOUNDARIES' ";
        }

	else
	{
		 performance = "YOU NEED TO WORK ON MATERIAL BOUNDARIES";
        }	
        return performance;

    }
}
	