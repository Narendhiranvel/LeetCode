package stringsOptimized;

public class LongestSubStringRepeating {

	public static void main(String[] args) {

		LongestSubStringRepeating ls = new LongestSubStringRepeating();
		System.out.println(ls.lengthOfLongestSubstringRepeat("abcabcbb")); // Output: 2
		System.out.println(ls.lengthOfLongestSubstringRepeat("bbbbb")); // Output: 5
		System.out.println(ls.lengthOfLongestSubstringRepeat("pwwkew"));
	}

	public static int lengthOfLongestSubstringRepeat(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int mLen = 1;
		int cLen = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				cLen++;
			} else {
				cLen = 1;
			}
			mLen = Math.max(cLen, mLen);
		}
		return mLen;
	}
}
