class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();
        while(right<n){
            char currentCharacter = s.charAt(right);
            if(!set.contains(currentCharacter)){
                set.add(currentCharacter);
                maxLength = Math.max(maxLength,right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
