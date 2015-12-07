public class Problem4{
    public static void main (String[] args) {
        int max = 999*999;
        for (int i = max; i>99*99; i--){
            if(isPalindrome(i) && isProduct(i)){
                System.out.println(i);
                break;
            }
        }
    }
    
    public static boolean isPalindrome(int n){
        int palindrome = 0;
        int temp = n;
        while(temp != 0){
            int r = temp%10;
            palindrome = palindrome*10 + r;
            temp /= 10;
        }
        
        if(palindrome == n){
            return true;
        }
        return false;
    }
    
    public static boolean isProduct(int n){
        for (int i=100; i<=999; i++){
            if (n%i==0){
                for (int j=100; j<=999; j++){
                    if ((n/i)%j==0 && (n/i)/j==1){
                        System.out.println("First 3 digit divisor: " + i);
                        System.out.println("Second 3 digit divisor: " + j);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}