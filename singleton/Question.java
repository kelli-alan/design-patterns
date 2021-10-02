package singleton;

/**
 * A trivia question with answer choices and a correct answer
 * @author Kelli Alan
 */
public class Question {
  private String question;
  private String[] answers;
  private int correctAnswer;

  /**
   * Creates a new question with answer choices and a correct answer
   * @param question String representation of a trivia question
   * @param ans1 the first answer choice, index 0
   * @param ans2 the second answer choice, index 1
   * @param ans3 the third answer choice, index 2
   * @param ans4 the fourth answer choice, index 3
   * @param correctAnswer the number corresponding to the correct answer's index
   */
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

  /**
   * Creates a String representation of a question and its answer choices in a list format
   * @return question and its answer choices in a numbered list
   */
  public String toString() {
    String question = this.question + "\n";
    for(int i = 0; i < answers.length; ++i) {
      question += " " + (i+1) + ". " + answers[i] + "\n";
    }
    return question;
  }

  /**
   * Compares user input to correct answer to determine if the user answered the question correctly
   * @param userAnswer answer number provided by user from console, 1 indexed
   * @return true if user is correct, false if user is incorrect
   */
  public boolean isCorrect(int userAnswer) {
    userAnswer--;
    return userAnswer == this.correctAnswer;
  }

  /**
   * Retrieves the correct answer to a question
   * @return A String representation of the correct answer to a question
   */
  public String getCorrectAnswer() {
    
    return "The correct answer is " + answers[this.correctAnswer];
  }
  
}
