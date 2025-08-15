public class checkAnagram{
  public static boolean Anagrams(String a, String b) {
    
        a = a.toLowerCase();//change to lowercase
        b = b.toLowerCase();

        a = a.replaceAll("[^a-z0-9]", ""); // remove spaces and punctuation
        b = b.replaceAll("[^a-z0-9]", "");

     
        if (a.length() != b.length()) return false;//check length

        Map<Character, Integer> map = new HashMap<>();//count chars
        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : b.toCharArray()) {//subtract counts
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Anagrams("listen", "silent"));                  
        System.out.println(Anagrams("debit card", "Bad credit"));          
        System.out.println(Anagrams("hello", "bye"));                      
        System.out.println(Anagrams("restful", "fluster"));                
        System.out.println(Anagrams("listen", "silentt"));                 
        System.out.println(Anagrams("Conversation", "Voices, rant on"));   
    }

}
