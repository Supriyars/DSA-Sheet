public class isPalindrome {
    public boolean isPalindrome1(String s) {
        s = s.toLowerCase();
        return isPalindromeHelper(s, 0,s.length()-1);
    }
    private boolean isPalindromeHelper(String s, int left, int right){
        if(left>=right){
           return true;
        }
        while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }
        return isPalindromeHelper(s, left+1, right-1);
          }
}
