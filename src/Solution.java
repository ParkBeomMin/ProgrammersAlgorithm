class Solution {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for (int i = 0; i < skill_trees.length; i++) {
			String customSkill = skill_trees[i];
			String tmp = "";
			for (int j = 0; j < customSkill.length(); j++) {
				if (skill.contains(customSkill.substring(j, j + 1))) {
					tmp += customSkill.substring(j, j + 1);
				}
			}
			if (check(skill, tmp)) {
				answer++;
			}
		}
		return answer;
	}

	boolean check(String skill, String tmp) {
		if (skill.substring(0, tmp.length()).equals(tmp)) {
			return true;
		} else {
			return false;
		}
	}
}