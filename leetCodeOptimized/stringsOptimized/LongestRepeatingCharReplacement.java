package stringsOptimized;

public class LongestRepeatingCharReplacement {

	public static void main(String[] args) {
		String s =  "ABAB";
		int k=2;
		LongestRepeatingCharReplacement lrCR = new LongestRepeatingCharReplacement();
		System.out.println(lrCR.characterReplacement(s, k));
	}

	public int characterReplacement(String s, int k) {
		int[] charCount = new int[26];
		int maxCount = 0;
		int maxLen = 0;
		int start = 0;
		
		for(int end=0; end<s.length(); end++) {
			char currentChar = s.charAt(end);
			charCount[currentChar - 'A']++;
			maxCount = Math.max(maxCount, charCount[currentChar - 'A']);
			
			if(end - start +1 - maxCount > k) {
				charCount[s.charAt(start) - 'A'] --;
				start++;
			}
			maxLen = Math.max(maxLen, end - start + 1);
		}
		return maxLen;
	}
}
