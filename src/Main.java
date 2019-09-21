
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		int[] answer = s.solution(progresses, speeds);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

}
