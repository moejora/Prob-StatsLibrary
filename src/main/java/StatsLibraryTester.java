
import java.util.ArrayList;

public class StatsLibraryTester
{
    public static void main(String[] args){
    MeanProgram tester = new MeanProgram();
    
    ArrayList<Integer> listOfNumbers = new ArrayList<>();
    
    for(int i = 0; i < 100; i++){
    listOfNumbers.add(i+1);
    }
    System.out.println(listOfNumbers);
    System.out.println("Test first");
    System.out.println(tester.computeMean(listOfNumbers));
    System.out.println(tester.computeMedian(listOfNumbers));
    System.out.println(tester.computeMode(listOfNumbers));
    System.out.println(tester.computeStandardDeviation(listOfNumbers));
    }    
}
