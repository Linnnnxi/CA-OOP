/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shemeneroje
 */
public class Question {
    private String questionText;
    private String[] options;
    private int Answer;

    public Question(String questionText, String[] options, int Answer) {
        this.questionText = questionText;
        this.options = options;
        this.Answer = Answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getAnswer() {
        return Answer;
    }

}
