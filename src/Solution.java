import java.util.HashSet;

class Solution {
	int answer = 0;

	public int solution(String numbers) {
		int[] numberArr = new int[numbers.length()];
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < numbers.length(); i++) {
			numberArr[i] = Integer.parseInt(numbers.substring(i, i + 1));
		}
		for (int i = 1; i <= numbers.length(); i++) {
			permutation(numberArr, 0, i, set);
		}
		answer = set.size();
		return answer;
	}

	void permutation(int[] numbers, int depth, int k, HashSet<Integer> set) {
		if (depth == k) {
			int tmp = 0;
			for (int i = 0; i < k; i++) {
				tmp += numbers[i] * Math.pow(10, i);
			}
			if (isPrime(tmp)) {
				set.add(tmp);
			}
		} else {
			for (int i = depth; i < numbers.length; i++) {
				swap(numbers, i, depth);
				permutation(numbers, depth + 1, k, set);
				swap(numbers, i, depth);
			}
		}
	}

	void swap(int[] arr, int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}

	void dfs(int[] numbers, boolean[] visited, int p, int[] result, int n, HashSet<Integer> set) {
		if (p == n) {
			int tmp = 0;
			for (int i = 0; i < result.length; i++) {
				// System.out.print(result[i]);
				tmp += result[i] * Math.pow(10, i);
			}
			// System.out.print(tmp);
			set.add(tmp);
			// if (isPrime(tmp)) {
			// answer++;
			// }

			System.out.println();
		} else {
			for (int i = 0; i < numbers.length; i++) {
				if (!visited[i]) {
					visited[i] = true;
					result[p] = numbers[i];
					dfs(numbers, visited, p + 1, result, n, set);
					visited[i] = false;
				}
			}

		}
	}

	boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}