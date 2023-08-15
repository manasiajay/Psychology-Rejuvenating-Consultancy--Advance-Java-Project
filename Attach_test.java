package Attachmentx;
import java.util.*;
public class Attach_test
{
    void attatchment()
    {
        Ques[] q = new Ques[4];

       
       	q[0] = new Ques("Do you often flip-flop between hot and cold, sometimes confused about how you feel towards your loved ones?","No", "Yes" , new Answer ("Yes"));
        q[1] = new Ques("Do you feel afraid of your loved ones pulling away and constantly seek more closeness in your relationships?","No","Yes", new Answer("Yes"));
        q[2] = new Ques("Do you find yourself fearing being pressured in your relationships, while often craving independence and freedom??","No","Yes", new Answer("Yes"));
        q[3] = new Ques("Do you find you can effectively communicate and feel vulnerable in your relationships?","No","Yes", new Answer("Yes"));
        q[4] = new Ques("xyz?","Yes","No", new Answer("Yes"));

	int countTotal = 0;
        int countRight = 0; 
        int countWrong = 0; 

	for(Ques qu: q)
        {
            System.out.println(qu.getQuestion());
            System.out.println("P : " +qu.getOption1());
            System.out.println("Q : " +qu.getOption2());
            System.out.println("R : " +qu.getOption3());
            System.out.println("S : " +qu.getOption4());

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
                case 'R':
                    answer = qu.getOption3();
                    break;
                case 'S':
                    answer = qu.getOption4();
                    break;
                default:break;
            }
            System.out.println("Your answer " + answer + " " + qu.getAnswer());
            if(answer.equals(qu.getAnswer().getAnswer()))
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Fearful and Dismissive Avoidant                     ");
                System.out.println("------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                 Anxious Preoccupied and Secure                      ");
                System.out.println("------------------------------------------------------");
                countWrong++;
            }
            System.out.println("============================================================================================");
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
    String option3;
    String option4;
    Answer answer;

    public Question(String question, String option1, String option2, String option3, String option4, Answer answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
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

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
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
    double showPercentage(int correctAnswers,int totalQuestions);
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
        System.out.println("Number of Type A Attachment Style" + correctAnswers);
        System.out.println("Number of Type B Attachment Style " + wrongAnswers);
	System.out.println("Total Questions " + totalQuestions);
      
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
	