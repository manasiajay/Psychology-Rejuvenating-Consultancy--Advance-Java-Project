package Attachmentx;
import java.util.*;
public class Attachment_style
{
    public void attachment()
    {
        Ques[] q = new Ques[4];

       
       	q[0] = new Ques("Do you often flip-flop between hot and cold, sometimes confused about how you feel towards your loved ones?","No", "Yes" , new Answer ("Yes"));
        q[1] = new Ques("Do you feel afraid of your loved ones pulling away and constantly seek more closeness in your relationships?","No","Yes", new Answer("Yes"));
        q[2] = new Ques("Do you find yourself fearing being pressured in your relationships, while often craving independence and freedom??","No","Yes", new Answer("Yes"));
        q[3] = new Ques("Do you find you can effectively communicate and feel vulnerable in your relationships?","No","Yes", new Answer("Yes"));
        
	int countTotal = 0;
        int countRight = 0; 
        int countWrong = 0; 

	for(Ques qu: q)
        {
            System.out.println(qu.getQuestion());
            System.out.println("P : " +qu.getOption1());
            System.out.println("Q : " +qu.getOption2());

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);

            switch(ans)
            {
                case 'P':
                    answer = qu.getOption1();
                    break;
                case 'Q':
                    answer = qu.getOption2();
                    break;
                default:break;
            }
            System.out.println("Your answer " + answer);
            if(answer.equals(qu.getAnswer().getAnswer()))
            {
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                  Fearful and Dismissive Avoidant                     ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                 Anxious Preoccupied and Secure                      ");
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
        System.out.println("Number of Type A Attachment Style:	" + correctAnswers);
        System.out.println("Number of Type B Attachment Style: 	" + wrongAnswers);
	System.out.println("Total Questions " + totalQuestions);
	System.out.println("Your combined performance" + showStyle(correctAnswers,wrongAnswers));
	System.out.println("Overall performance depending on attachment style ::" + showPerformance(showStyle(correctAnswers,wrongAnswers)));
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                
      
    }

    
    public double showStyle(int correctAnswers, int wrongAnswers) {
        //System.out.println(correctAnswers + " " + wrongAnswers);
        return (double) (correctAnswers + (double)wrongAnswers) ;
    }

   
    @Override
    public String showPerformance(double type) {
        String performance = "";

        if(correctAnswers  > wrongAnswers )
        {
            performance = "YOUR TYPE OF ATTACHMENT IS BIT COMPLICATED, YOU NEED TO WORK ON IT:  TYPE A";
        }
        else
        {
            performance = "YOUR TYPE OF ATTACHMENT IS BETTER THAN 60% :  TYPE B";
        }

        return performance;

    }
}
	