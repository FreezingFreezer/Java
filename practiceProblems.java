public class practiceProblems {
    static int amountFound = 0;
    static int countOccurrences(int[] testing, int finding){
        for(int num = 0; num>testing.length;num++){
            if(testing[num] == finding){
                amountFound++;
            }
        }
        return amountFound;
    }
    static int[] reverseArray(int[]arrayGiven){
        int[] reversing = new int[arrayGiven.length];
        for (int i = 0; i<arrayGiven.length; i++){
            reversing[i] = arrayGiven[arrayGiven.length - 1-i];
        }
        return reversing;
    }
    static double sumGrid(double[][] arrGiven){
        double sum = 0;
        for(int x = 0; x<arrGiven.length;x++){
            for(int y = 0;y<arrGiven[x].length;y++)
            sum += arrGiven[x][y];
        }
        return sum;
    }
    static int fib(int num){//longest and most challenging
        if(num <= 1){
            return num;
        }
        else{
            return fib(num-1)+fib(num-2);   // the equation is Fn = Fn-1 + Fn-2, where n > 1.
        }
    }
}
