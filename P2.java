public class FizzBuzz(){
  public static void main (String [] agrs){
      for(int i=1;i<=100;i++){
          if(i%3==0 && i%5==0){//check if i can divide by both 3 and 5
            System.out.print("FizzBuzz"+", ");}
          else if(i%3==0){//check if i can divide by 3
            System.out.print("Fizz"+", ");}
          else if(i%5==0){//check if i can divide by 5
            System.out.print("Buzz"+", ");
          }
          else{//cannot divide by both 3 and 5, print i
            System.out.print(i+", ");}
      }
  }
}
