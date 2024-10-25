//code mean,median,mode,standard deviation, make a gen for 100 numbers like in the mean project. then run it through the " " gen and produce output. 
import java.util.ArrayList;

public class StatsLibrary {

    public double computeMean(ArrayList<Integer> listOfNumbers) {
        int sum = 0;
        for (int singleNumber : listOfNumbers) {
            sum = sum + singleNumber;
        }
        return sum / (double) listOfNumbers.size();
    }

    public double computeMedian(ArrayList<Integer> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size() - 1; i++) {
            for (int j = 0; j < listOfNumbers.size() - 1 - i; j++) {
                if (listOfNumbers.get(j) > listOfNumbers.get(j + 1)) {
                    // Swap
                    int temp = listOfNumbers.get(j);
                    listOfNumbers.set(j, listOfNumbers.get(j + 1));
                    listOfNumbers.set(j + 1, temp);
                }
            }
        }

        int size = listOfNumbers.size();
        if (size % 2 == 0) {
            return (listOfNumbers.get(size / 2 - 1) + listOfNumbers.get(size / 2)) / 2.0;
        } else {
            return listOfNumbers.get(size / 2);
        }
    }

    public double computeMode(ArrayList<Integer> listOfNumbers) {
        int maxCount = 0;
        double mode = 0;

        for (int i = 0; i < listOfNumbers.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < listOfNumbers.size(); j++) {
                if (listOfNumbers.get(i).equals(listOfNumbers.get(j))) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = listOfNumbers.get(i);
            }
        }

        return maxCount > 1 ? mode : 0; 
    }

    public double computeStandardDeviation(ArrayList<Integer> listOfNumbers) {
        double mean = computeMean(listOfNumbers);
        double sumSquaredDiffs = 0;
        for (int number : listOfNumbers) {
            sumSquaredDiffs += Math.pow(number - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / listOfNumbers.size());
    }
}
