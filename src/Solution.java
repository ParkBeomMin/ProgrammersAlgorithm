class Solution {
	public int solution(int[][] baseball) {
		int answer = 0;
		for (int i = 123; i <= 987; i++) {
			int x = i / 100;
			int y = (i / 10) % 10;
			int z = i % 10;
			if (x == 0 || y == 0 || z == 0) {
				continue;
			}
			if (x == y || y == z || x == z) {
				continue;
			}
			for (int j = 0; j < baseball.length; j++) {
				int strike = 0;
				int ball = 0;
				int shot = baseball[j][0];
				int sx = shot / 100;
				int sy = (shot / 10) % 10;
				int sz = shot % 10;
				if (x == sx) {
					strike++;
				}
				if (y == sy) {
					strike++;
				}
				if (z == sz) {
					strike++;
				}
				if (strike != baseball[j][1]) {
					break;
				}
				if(x == sy || x == sz) {
					ball++;
				}
				if(y == sx || y == sz) {
					ball++;
				}
				if(z == sx || z == sy) {
					ball++;
				}
				if (ball != baseball[j][2]) {
					break;
				}
				if (j == baseball.length - 1) {
					answer++;
				}
			}
		}
		return answer;
	}
}