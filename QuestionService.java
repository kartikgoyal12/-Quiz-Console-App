import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }
    int i,marks=0;

    public void playQuiz() {
        for (Question q : questions) {
            System.out.println("Question" + q.getId() + ": ");
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.println();
            System.out.print("Enter your answer: ");
            Scanner sc = new Scanner(System.in);
            selection[i++]= sc.nextLine();

        }
    }

    public void calculateScore() {
         for(int j=0;j<questions.length;j++) {
            if(selection[j].equals(questions[j].getAnswer())) {
                System.out.println("Question " + questions[j].getId() +": Correct"+" --your answer: "+selection[j] );
                marks++;
            } else {
                System.out.println("Question " + questions[j].getId() + ": Incorrect"+"--your answer: "+selection[j] + "correct answer:"+questions[j].getAnswer());
            }
        }
        System.out.println("Your total marks are: " + marks + " out of " + questions.length);
    }

} 
