import java.util.Arrays;// had to search this up because i did not know any other way to print the results

public class Main {
    static int[] test = {1,2,3,4,2,4,8,12,4,8,16,20};//test using in practise1
    static int find = 4;//number being found in practice1
    static int[] normalreversed = {1,2,3,4,5,6,7};//test used in prac 2
    static double[][] doublearr = {{1.0,2.0},{4.0,8.0}};
    public static void main(String[] args){
        int founded = practiceProblems.countOccurrences(test, find);
        System.out.println("There were "+founded+" that the number "+find+" was found.");
        //End or pract 1
        int[] reversed = practiceProblems.reverseArray(normalreversed);
        System.out.println("The original array was "+Arrays.toString(normalreversed)+". Now its reversed is "+ Arrays.toString(reversed));
        //End of pract 2
        double gridSum = practiceProblems.sumGrid(doublearr);
        System.out.println("The sum of the grid:"+Arrays.deepToString(doublearr)+" is "+gridSum+".");//had to search up 2d arrays to string too
        // end of pract 3
        int inputnum = 10;
        int fibnum = practiceProblems.fib(inputnum);
        System.out.println("The "+inputnum+"th number of the fibonachi sequence is "+fibnum+".");
        //end of pract 4
    }
}
//I DID IT FINALLY
