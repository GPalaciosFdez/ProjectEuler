public class Problem1{    
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 1; i<1000; i++){
            if(isMultiple(i,3,5)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
    public static boolean isMultiple(int n, int d1, int d2){
        if(n%d1==0 || n%d2==0){
            return true;
        }
        return false;
    }
}
