package en02;

/**
 * Created by shouta on 2017/04/17.
 */
public class Student {
    private int score;

    public void setScore(int s) {
        score = s;
    }

    public int getScore() {
        return score;
    }

    public boolean isPass() {
        if (score >= 70) {
            return true;
        } else {
            return false;
        }
    }
}
