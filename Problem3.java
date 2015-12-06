public class Problem3{
    public static void main (String[] args) {
        System.out.println(primeFactor(600851475143L));
    }
    
    public static long primeFactor(long n){
        for(long i = 2; i<n; i++){
            while(n%i==0){
                n /= i;
            }
        }
        return n;
    }
}