import java.util.Arrays;

class Solution {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);
		for (int i = 1; i < phone_book.length; i++) {
			if (phone_book[i].contains(phone_book[0])) {
				answer = false;
				break;
			}
		}
		return answer;
	}
}