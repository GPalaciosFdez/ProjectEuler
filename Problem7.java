public class Problem7{
    public static void main (String[] args) {
        int count = 0;
        int prime = 1;
        while(count<=10001){
            if(isPrime(prime)){
                count++;
            }
            prime++;
        }
        System.out.println(prime-1);
    }
    
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0 && n!=1 && n!=2){
                return false;
            }
        }
        return true;
    }
}