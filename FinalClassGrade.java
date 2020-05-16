/**
 *  Final program
 *  it specifies methods for the questions asked
 *  CS108-4
 *  05/15/2020
 *  @author  YeonJun Lee
 */

public class FinalClassGrade implements InterfaceScore {
    //implementing methods from the interface. each asking question related to the grades.
    @Override
    public void name() {
        System.out.println("Please enter your full name");
    }

    @Override
    public void scorePrev() {
        System.out.println("what is your weighted grade without final project? (%)");
    }

    @Override
    public void finalProGrade() {
        System.out.println("What is your final project grade? (%)");
    }

    @Override
    public void proWorth() {
        System.out.println("What is final project worth in overall semester grade? (%)");

    }
}
