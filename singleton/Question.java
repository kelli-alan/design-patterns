package singleton;

/**
 * A trivia question with answer choices and a correct answer
 * @author Kelli Alan
 */
public class Question {
  private String question;
  private String[] answers;
  private int correctAnswer;

  public Question(String question, String ans1, String ans2, String ans3, String ans4, 
                      int correctAnswer) {
    this.question = question;
    this.answers = new String[4];
    this.answers[0] = ans1;
    this.answers[1] = ans2;
    this.answers[2] = ans3;
    this.answers[3] = ans4;
    this.correctAnswer = correctAnswer;
  }

  public String toString() {
    String question = this.question + "\n";
    for(int i = 0; i < answers.length; ++i) {
      question += " " + (i+1) + ". " + answers[i] + "\n";
    }
    return question;
  }

  public boolean isCorrect(int userAnswer) {
    userAnswer--;
    return userAnswer == this.correctAnswer;
  }

  public String getCorrectAnswer() {
    
    return "The correct answer is " + answers[this.correctAnswer];
  }
  
}
