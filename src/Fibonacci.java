import java.math.BigInteger;
import java.text.DecimalFormat;

public class Fibonacci {

    private static BigInteger[] cache;

    void main(){
        DecimalFormat df = new DecimalFormat("#,###");
        int numberOfIts = 10;
        int sequence = numberOfIts--;
        cache = new BigInteger[numberOfIts + 1];


        System.out.println("The answer for sequence " + sequence + " is " + df.format(Fibon(numberOfIts)));
        System.out.println();
    }

    private static BigInteger Fibon(int n){
        if (n <= 1)
            return BigInteger.valueOf(n);

        if (cache[n] != null){
            return cache[n];
        }

        BigInteger tempCache = Fibon(n - 2).add(Fibon(n - 1));
        cache[n] = tempCache;
        return tempCache;
    }

    // fn = fn-1 + fn-2

}
