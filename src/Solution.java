import java.util.Stack;

class Solution {
	public int solution(String arrangement) {
		int answer = 0;
		Stack<String> lStack = new Stack<>();
		int barNum = 0;
		for (int i = 0; i < arrangement.length(); i++) {
			lStack.push(arrangement.substring(i, i + 1));
		}
		while (!lStack.isEmpty()) {
			String tmp = lStack.pop();
			if (tmp.equals(")")) {
				barNum++;
				if (lStack.peek().equals("(")) {
					barNum--;
					answer += barNum;
					lStack.pop();
				}
			} else {
				barNum--;
				answer += 1;
			}
		}
		return answer;
	}
}