class Solution {
	public int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[][] visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			if (!visited[i][i]) {
				dfs(computers, visited, i);
				answer++;
			}
		}
		return answer;
	}

	void dfs(int[][] computers, boolean[][] visited, int depth) {
		for (int i = 0; i < computers.length; i++) {
			if (!visited[depth][i] && computers[depth][i] == 1) {
				visited[depth][i] = true;
				visited[i][depth] = true;
				dfs(computers, visited, i);
			}
		}
	}
}