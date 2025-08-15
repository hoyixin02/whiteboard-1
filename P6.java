public class CharacterOccurence{
  public static void main(String[]args){
        String input="Hello, world!";  
        int maxCount = 0;
        char maxChar = ' ';//initialize characters

       
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (!Character.isLetterOrDigit(c)) {//ignore spaces and punctuation
                continue;
            }

            int count = 0;
            for (int j = 0; j < input.length(); j++) {//count occurence of the c
                char compare = input.charAt(j);
                if (c == compare) {
                    count++;
                }
            }

            if (count > maxCount) {//update maxCount character
                maxCount = count;
                maxChar = c;
            }
        }

        System.out.println("Character: '" + maxChar + "', Occurrence: " + maxCount);//print reslt
    }

  
}
