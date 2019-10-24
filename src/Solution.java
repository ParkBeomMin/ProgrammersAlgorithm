class Solution {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int aNum = grading(answers, a);
		int bNum = grading(answers, b);
		int cNum = grading(answers, c);
		if (aNum == bNum && bNum == cNum) {
			return new int[] { 1, 2, 3 };
		} else if (aNum == bNum && bNum > cNum) {
			return new int[] { 1, 2 };
		} else if (aNum == cNum && cNum > bNum) {
			return new int[] { 1, 3 };
		} else if (bNum == cNum && cNum > aNum) {
			return new int[] { 2, 3 };
		} else if (aNum > bNum && aNum > cNum) {
			return new int[] { 1 };
		} else if (bNum > cNum && bNum > aNum) {
			return new int[] { 2 };
		} else if (cNum > bNum && cNum > aNum) {
			return new int[] { 3 };
		}
		return answer;
	}

	int grading(int[] answers, int[] arr) {
		int result = 0;
		for (int i = 0; i < answers.length; i++) {
			if (arr[i % arr.length] == answers[i]) {
				result++;
			}
		}
		return result;
	}
}