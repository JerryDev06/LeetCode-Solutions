class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i < s.length(); i++){
            if(Character.isLetterOrDigit((s.charAt(i)))){
                sb.append(s.charAt(i));
            }
        }
        String a = new String(sb);
        String b= new String(sb.reverse());
        return a.equalsIgnoreCase(b); 
    }
}
