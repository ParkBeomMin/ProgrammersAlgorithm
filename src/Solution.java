import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int curUser = stages.length;
		Arrays.sort(stages);
		List<Stage> list = new ArrayList<Stage>();
		for (int i = 0; i < N; i++) {
			int userCnt = 0;
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] == i + 1) {
					userCnt++;
				}
			}
			if (curUser != 0) {
				double fail = (double) userCnt / (double) curUser;
				list.add(new Stage(i + 1, fail));
			} else {
				list.add(new Stage(i + 1, 0));
			}

			curUser -= userCnt;
		}
		Collections.sort(list);
		for (int i = 0; i < N; i++) {
			answer[i] = list.get(i).stageNum;
		}
		return answer;
	}

	class Stage implements Comparable<Stage> {
		int stageNum;
		double fail;

		public Stage(int stageNum, double fail) {
			this.stageNum = stageNum;
			this.fail = fail;
		}

		@Override
		public int compareTo(Stage o) {
			if (o.fail > this.fail) {
				return 1;
			} else if (o.fail == this.fail) {
				if (o.stageNum > this.stageNum) {
					return -1;
				} else {
					return 1;
				}
			} else {
				return -1;
			}

		}
	}

}
