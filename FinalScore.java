/**
 *  Final program
 *  This class is inherited from Score class. it calculates the final semester grade.
 *  CS108-4
 *  05/15/2020
 *  @author  YeonJun Lee
 */
public class FinalScore extends Score {
    public FinalScore(String name, int preScore, int fProScore, int worth) {
        super(name, preScore, fProScore, worth);
    }

    protected int semScore;

    @Override
    public int computeFinal() {

        semScore = getPreScore() + (getWorth() * getfProScore()/100);
        return semScore;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(semScore);

    }
}
