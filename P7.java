public static int squareRoot(int x){
       
       if (x == 0 || x == 1) {
       return x; // return original number(0,1)
       }
           int a = 0;
           int b = x;
           int result = 0;

           while (a <= b) {
               int midNo = (a + b) / 2;
               int midSquared = midNo * midNo;

               if (midSquared == x) {
                   return midNo; // exact square root number
               } else if (midSquared < x) {
                   a = midNo + 1;
                   result = midNo; // store last lower mid
               } else {
                   b = midNo - 1;
               }
           }
           return result; 
}
