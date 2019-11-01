
public class Main {

	public static void main(String[] args) {
		int n = 3;
//		int[][] arr = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int[][] arr = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
		Solution s = new Solution();
		System.out.println(s.solution(n, arr));
	}

}
