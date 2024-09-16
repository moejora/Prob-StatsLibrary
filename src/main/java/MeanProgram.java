//if your ide produces Any comments or code, delte all of it (minute class contruction)

import java.util.ArrayList;

public class MeanProgram 
{
    public double computeMean(ArrayList<Integer> listOfNumbers){
        int sum = 0;
        for(int singleNumber : listOfNumbers){
        sum = sum + singleNumber;
        }
    return sum / (double) listOfNumbers.size();
    }
}
