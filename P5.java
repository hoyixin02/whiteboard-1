public class Symmetric{
   public static void main(String[] args) {
        int[] a = {4, 5, 2, 3, 1, 6};
        int[] b = {8, 7, 6, 9, 4, 5};

        int[] result = new int[a.length + b.length]; // maximum sizes
        int n = 0;

        for (int i = 0; i < a.length; i++) {
            boolean existsInB = false; // initialize to false first
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    existsInB = true; // a[i] found in array b
                    break;           // stop checking
                }
            }
            if (!existsInB) {
                result[n] = a[i]; // a[i] store in  array
                n++;
            }
        }
        
        for (int i = 0; i < b.length; i++) {//same as for loop above, check is it exist in array a
            boolean existsInA = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    existsInA = true;
                    break;
                }
            }
            if (!existsInA) {
                result[n] = b[i];
                n++;
            }
        }

        //order the sequence
        for(int i=0; i<n-1 ;i++){
        int minIndex = i;
          for(int j=i+1 ; j<n ;j++){
            if (result[j]< result[minIndex]){
              minIndex=j;
            }//check if the next number is smaller than previous one
          }
        int temp = result[minIndex];
              result[minIndex] = result[i];
              result[i] = temp;
        //swap number between i and j
      }
        
      System.out.print("Symmetric difference: ");//print results
      for(int c=0; c<n; c++){
        System.out.print(result[c] +" ");
      }
    }
    
}
