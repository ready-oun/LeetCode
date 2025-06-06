class Solution {
    public boolean isAnagram(String s, String t) {
        // If len diff, they can't be anagram 
        if (s.length() != t.length()) return false; 

        // convert to char arr & sort 
        char[] sArr = s.toCharArray(); 
        char[] tArr = t.toCharArray(); 
        Arrays.sort(sArr); 
        Arrays.sort(tArr); 

        // comp sorted arr 
        return Arrays.equals(sArr, tArr); 
    }
}