import java.util.HashMap;
import java.util.Map;

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> participants = new HashMap<>();
		for (String name : participant) {
			if (participants.containsKey(name)) {
				participants.replace(name, participants.get(name) + 1);
			} else {
				participants.put(name, 1);
			}
		}
		for (String name : completion) {
			if (participants.containsKey(name)) {
				participants.replace(name, participants.get(name) - 1);
			}
		}
		for (String name : participant) {
			if (participants.get(name) == 1) {
				answer = name;
			}
		}
		return answer;
	}
}