class Solution {
    public boolean isPalindrome(String s) {
       String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Reverse the cleaned string
        String rev = "";
        for (int i = c.length() - 1; i >= 0; i--) {
            rev += c.charAt(i);
        }
        if(rev.equals(c)){
            return true;
        }
        else{
            return false;
        }
    }
}