import java.util.Arrays;
public class Problem2{
    public static void main (String[] args) {
        int sum = 2;
        int[] f = new int[2];
        f[0] = 1;
        f[1] = 2;
        while(f[1]<=4000000){
            int temp = f[0];
            f[0] = f[1];
            f[1] += temp;
            if(f[1]%2==0){
                sum += f[1];
            }
        }
        System.out.println(sum);
    }
}