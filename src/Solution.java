import java.util.PriorityQueue;

class Solution {
	public int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		int dateIndex = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b.compareTo(a)); // 큰수가앞으로
		for (int i = 0; i < k; i++) {
			if (dateIndex < dates.length && dates[dateIndex] == i) {
				queue.offer(supplies[dateIndex]);
				dateIndex++;
			}
			if (stock == 0) {
				stock += queue.poll();
				answer++;
			}
			stock--;
		}

		return answer;
	}
}