import java.util.ArrayList;

public class Problem10{
    
    public static void main (String[] args) {
        ArrayList<Integer> primes = primeList(2000000);
        long sum = sum(primes);
        System.out.println(sum);
    }
    
    public static long sum(ArrayList<Integer> p){
        long sum = 0;
        for(Integer i : p){
            sum += i;
        }
        return sum;
    }
    
    public static ArrayList<Integer> primeList(int limit){
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        primeList.add(2);
        for (int i = 3; i<=limit; i+=2){
            if(isPrime(i)){
                primeList.add(i);
            }
        }
        return primeList;
    }
    
    public static boolean isPrime(int n){
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}