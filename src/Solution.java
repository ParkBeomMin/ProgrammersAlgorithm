import java.util.Stack;

class Solution {
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		int index = heights.length - 1;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < heights.length; i++) {
			stack.push(heights[i]);
		}
		while (index > 0) {
			boolean isReceive = false;
			for (int i = index; i >= 0; i--) {
				if (heights[i] > stack.peek()) {
					answer[index] = i + 1;
					stack.pop();
					isReceive = true;
					break;
				}
			}
			if (!isReceive) {
				stack.pop();
			}

			index--;
		}

		return answer;
	}
}