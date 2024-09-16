
import java.util.ArrayList;

public class TestMeanProgram
{
    public static void main(String[] args){
    MeanProgram tester = new MeanProgram();
    
    ArrayList<Integer> listOfNumbers = new ArrayList<>();
    
    for(int i = 0; i < 100; i++){
    listOfNumbers.add(1);
    }
    System.out.println(listOfNumbers);
    System.out.println("Test first");
    System.out.println(tester.computeMean(listOfNumbers));
    }    
}
