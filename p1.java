public class SortingNumber {
  public static void main (String [] args){

    int [] num = {21, 400, 8, -3, 77, 99, -16, 55, 111, -36, 28};

    sortNumber(num);
  }

  public static void sortNumber(int [] num){
    int n= num.length;

    for(int i=0; i<n-1 ;i++){
      int minIndex = i;
        for(int j=i+1 ; j<n ;j++){
          if (num[j]< num[minIndex]){
            minIndex=j;
          }//check if the next number is smaller than previous one
        }
      int temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
      //swap number between i and j
    }

    for(int a=0; a<n-1; a++){
      System.out.print(num[a] +" ");
    }
  }
    
}
