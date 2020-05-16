/**
 *  Final program
 *  This is the abstract class provides the abstract methods and the framework.
 *  CS108-4
 *  05/15/2020
 *  @author  YeonJun Lee
 */
public abstract class Score {
    private final int preScore;
    private int score;
    private String className;
    private String name;
    private int fProScore;
    private int worth;

    public Score(String name, int preScore, int fProScore, int worth){
        this.name = name;
        this.preScore = preScore;
        this.fProScore = fProScore;
        this.worth = worth;
    }


    public abstract void computeFinal();
    public abstract void print();

    public int getPreScore() {
        return preScore;
    }

    public int getWorth() {
        return worth;
    }

    public int getfProScore() {
        return fProScore;
    }

    public String getName() {
        return name;
    }
}
