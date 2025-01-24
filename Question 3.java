import java.util.Arrays;

public class StatisticsCalculator {
    public static void main(String[] args) {
        // Sample array of data
        double[] data = {12, 15, 14, 10, 18, 20, 13, 16, 11, 19};

        // Step 1: Calculate the mean
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        double mean = sum / data.length;
        System.out.println("Mean: " + mean);

        // Step 2: Calculate the median
        Arrays.sort(data); // Sort the array to find the median
        double median;
        if (data.length % 2 == 0) {
            median = (data[data.length / 2 - 1] + data[data.length / 2]) / 2;
        } else {
            median = data[data.length / 2];
        }
        System.out.println("Median: " + median);

        // Step 3: Calculate the standard deviation
        double sumOfSquaredDifferences = 0;
        for (double value : data) {
            sumOfSquaredDifferences += Math.pow(value - mean, 2);
        }
        double standardDeviation = Math.sqrt(sumOfSquaredDifferences / data.length);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}
