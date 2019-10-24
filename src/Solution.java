import java.util.LinkedList;

class Solution {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		LinkedList<Integer> waiting = new LinkedList<>();
		for (int priority : priorities) {
			waiting.add(priority);
		}
		while (!waiting.isEmpty()) {
			boolean isMin = true;
			for (int i = 1; i < waiting.size(); i++) {
				if (waiting.get(0) < waiting.get(i)) {
					waiting.add(waiting.poll());
					if (location == 0) {
						location = waiting.size() - 1;
					} else {
						location--;
					}
					isMin = false;
					break;
				}
			}
			if (isMin) {
				waiting.poll();
				answer++;
				if (location == 0) {
					break;
				} else {
					location--;
				}
			}
		}
		return answer;
	}
}