public class Problem12{

  public static void main(String[] args) {
    int divisors=1;
    int triangle=1;
    int next=2;
    while(divisors<500){
      divisors = numberOfDivisors(triangle);
      triangle+=next;
      next++;
    }
    next--;
    System.out.println(triangle-next);
  }

  public static int numberOfDivisors(int n){
    int num=1;
    for (int i=2; i*i<=n; i++){
      if(n%i==0){
        num++;
      }
    }
    return num*2;
  }
}
