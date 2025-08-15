public class Intersection{
  public static void main(String[]args){
        int [] a={4, 5, 2, 3, 1, 6};
        int [] b={8, 7, 6, 9, 4, 5};
        
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[i]==b[j]){//check if have any intersection
                System.out.print(a[i]+", ");}
            }
        }
    }
}
