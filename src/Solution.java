import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int n = commands.length;
		int[] answer = new int[n];
		for (int p = 0; p < n; p++) {
			int i = commands[p][0]-1;
			int j = commands[p][1]-1;
			int k = commands[p][2]-1;
			int[] tmp = new int[j - i + 1];
			for (int q = i; q <= j; q++) {
				tmp[q - i] = array[q];
			}
			Arrays.sort(tmp);
			System.out.println(tmp[k]);
			answer[p] = tmp[k];
		}
		return answer;
	}
}