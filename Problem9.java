public class Problem9{
    
    public static void main (String[] args) {
        System.out.println(product());
    }
    
    public static int product(){
        for(int a = 1; a<=998; a++){
            for(int b = 1; b<=998; b++){
                if(1000*a+1000*b-a*b==500000){
                    return (a*b*(1000-a-b));
                }
            }
        }
        return -1;
    }
    
}