import java.util.PriorityQueue;

class Solution {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < scoville.length; i++) {
			queue.offer(scoville[i]);
		}

		while (queue.peek() < K) {
			if (queue.size() == 1) {
				answer = -1;
				break;
			}
			int a = queue.poll();
			int b = queue.poll();
			queue.offer(a + b * 2);
			answer++;
		}
		return answer;
	}
}