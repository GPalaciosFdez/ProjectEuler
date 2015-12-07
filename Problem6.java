public class Problem6{
    
    public static void main (String[] args) {
        int[] o = order(squareOfSum(100),sumOfSquares(100));
        System.out.println(o[1]-o[0]);
    }
    
    public static int sumOfSquares(int n){
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i*i;
        }
        return sum;
    }
    
    public static int squareOfSum(int n){
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i;
        }
        return sum*sum;
    }
    
    public static int[] order(int n, int m){
        int [] ordered = new int[2];
        if(n<m){
            ordered[0] = n;
            ordered[1] = m;
        }
        else{
            ordered[0] = m;
            ordered[1] = n;
        }
        return ordered;
    }
}