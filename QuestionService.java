import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Capital of India?", "Mumbai", "Delhi", "Kolkatta", "Chennai", "Delhi");
        questions[1] = new Question(2, "Capital of Maharashtra?", "Mumbai", "Pune", "Nashik", "Nagpur", "Mumbai");
        questions[2] = new Question(3, "Which is a best programming language?", "Cpp", "Python", "Java", "C", "Java");
        questions[3] = new Question(4, "Stack works in which manner?", "FIFO", "LIFO", "Both", "None", "LIFO");
        questions[4] = new Question(5, "Queue works in which manner?", "FIFO", "LIFO", "Both", "None", "FIFO");
    }

    public void playQuiz() {

        int i = 0;

        for (Question question : questions) {
            System.out.println("Question no. : " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOpt1());
            System.out.println(question.getOpt2());
            System.out.println(question.getOpt3());
            System.out.println(question.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            if(questions[i].getAnswer().equals(selection[i])){
                score++;
            }
        }

        System.out.println("Your score is : " + score); 
    }

}
