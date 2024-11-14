
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shemeneroje
 */
public class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
        loadQuestions();
    }

    private void loadQuestions() {
        questions.add(new Question("What is the largest land animal?", new String[]{"Elephant", "Lion", "Giraffe", "Bear"}, 0));
        questions.add(new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Venus", "Jupiter"}, 1));
        questions.add(new Question("What is the tallest mountain?", new String[]{"Mount Everest", "K2", "Kangchenjunga", "Lhotse"}, 0));
        // Add more questions here if needed
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

}
