/**
 *  Final program
 *  Unit tests the computeFinal method.
 *  CS108-4
 *  05/15/2020
 *  @author  YeonJun Lee
 */
public class UnitTest {
    public static void main(String[] args){
        computeFinal();
    }

    private static void computeFinal() {
        Score test = new FinalScore("John Doe", 65, 50, 10);
        test.computeFinal();
        if(test.computeFinal() == 70){
            System.out.println("Success: computeFinal");
        }
        else{
            System.out.println("FAILED: computeFinal");
        }
    }
}
