import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		Queue<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> result = new ArrayList<>();
		int cnt = 1;
		for(int i = 0; i < progresses.length; i++) {
			queue.offer((100-progresses[i])%speeds[i] == 0 ? (100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i] + 1);
		}
		int prev = queue.poll();
		while(!queue.isEmpty()) {
			int tmp = queue.poll();
			if(prev >= tmp) {
				cnt++;
			}else {
				result.add(cnt);
				cnt = 1;
				prev = tmp;
			}
		}
		result.add(cnt);
		answer = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}

}