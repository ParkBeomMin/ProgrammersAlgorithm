class Solution {
	public int solution(int[] numbers, int target) {
		int answer = 0;
		int[] result = new int[1];
		dfs(numbers, 0, 0, target, result);
		dfs(numbers, 1, 0, target, result);
		answer = result[0] / 2;
		return answer;
	}

	void dfs(int[] numbers, int flag, int depth, int target, int[] result) {
		if (depth == numbers.length) {
			int tmp = 0;
			for (int i = 0; i < numbers.length; i++) {
				tmp += numbers[i];
			}
			if (tmp == target) {
				result[0]++;
			}
		} else {
			if (flag == 0) {
				numbers[depth] *= -1;
			}
			dfs(numbers, 0, depth + 1, target, result);
			numbers[depth] *= -1;
			dfs(numbers, 1, depth + 1, target, result);
		}
	}

}