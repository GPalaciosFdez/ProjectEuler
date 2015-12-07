public class Problem5{
    public static void main (String[] args) {
        System.out.println(smallestMultiple(20));
    }
    
    public static long smallestMultiple(int n){
        int[] range = new int[n];
        for (int i=0; i<n; i++){
            range[i] = i+1;
        }
        
        for (long i = range[n-1]; i<= max(n); i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(i%range[j]==0){
                    count++;
                }
                if(count == n){
                    return i;
                }
            }
        }
        return 0;
    }
    
    public static long max(int n){
        long result = 1;
        for (int i = 1; i<=n; i++){
            result *= i;
        }
        return result;
    }
}