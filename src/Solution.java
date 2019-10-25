class Solution {
	public String solution(int n) {
		String answer = "";
		int[] nums = { 4, 1, 2 };
		while (true) {
			answer += nums[n % 3];
			if (n % 3 == 0) {
				n -= 1;
			}
			if (n / 3 == 0) {
				break;
			}
			n = n / 3;
		}
		String tmp = "";
		for (int i = 0; i < answer.length(); i++) {
			tmp += String.valueOf(answer.charAt(answer.length() - 1 - i));
		}
		answer = tmp;
		return answer;
	}
}