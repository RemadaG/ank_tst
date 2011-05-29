package pl.remadag.madzia.pat.data;

import java.util.Comparator;

/**
 * Triple
 */
public class ComplexTriple {
    String letter;
    int answer;
    int answerCount;

    public ComplexTriple() {
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public ComplexTriple(String letter, int answer, int answerCount) {
        this.letter = letter;
        this.answer = answer;
        this.answerCount = answerCount;
    }
}
