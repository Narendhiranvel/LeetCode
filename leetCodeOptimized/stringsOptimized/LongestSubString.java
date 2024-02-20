package stringsOptimized;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s) {
		if(s == null || s.length() ==0){
			return 0;
		}
		int i=0, j=0, maxLen = 0;
		HashSet<Character> set = new HashSet<>();
		while(i<s.length()) {
			char c = s.charAt(i);
			
			while(set.contains(c)) {
				set.remove(s.charAt(j));
				++j;
			}
			set.add(c);
			maxLen = Math.max(maxLen, i -j +1);
			++i;
		}
		return maxLen;
	}
}
