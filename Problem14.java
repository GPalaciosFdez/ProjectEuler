public class Problem14{

  public static void main(String[] args) {
    int maxTerms = 0;
    int result = 0;
    for (int i = 1000000; i>1; i--){
      int n = numOfTerms(i);
      if(n>maxTerms){
        maxTerms = n;
        result = i;
      }
    }
    System.out.println(result);
    System.out.println(maxTerms);
  }

  public static int numOfTerms(long n){
    int terms = 1;
    while(n>1){
      terms++;
      if(n%2==0){
        n /= 2;
      }
      else{
        n = 3*n+1;
      }
    }
    return terms;
  }
}
