import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Bridge b = new Bridge(bridge_length, weight);
		answer = b.start(truck_weights);
		return answer;
	}

	class Bridge {
		Queue<Truck> queue;
		int length;
		int maxWeight;
		int curWeight;
		int time;
		int curIndex;

		public Bridge(int length, int maxWeight) {
			this.length = length;
			this.maxWeight = maxWeight;
			this.queue = new LinkedList<>();
			this.curWeight = 0;
			this.time = 0;
			this.curIndex = 0;
		}

		int start(int[] weights) {
			while (!queue.isEmpty() || (this.curIndex < weights.length)) {
				if (!queue.isEmpty() && queue.peek().distance <= 0) {
					this.curWeight -= queue.poll().weight;
				}
				if (this.curIndex < weights.length && this.curWeight + weights[curIndex] <= this.maxWeight) {
					this.queue.offer(new Truck(this.length, weights[curIndex]));
					this.curWeight += weights[curIndex];
					this.curIndex++;
				}
				move();
				this.time++;
			}

			return this.time;
		}

		void move() {
			Iterator it = queue.iterator();
			while (it.hasNext()) {
				Truck t = (Truck) it.next();
				t.distance--;
			}
		}

		void addTruck(int[] weights) {
			while (this.curIndex < weights.length && this.curWeight + weights[curIndex] <= this.maxWeight) {
				this.queue.offer(new Truck(this.length, weights[curIndex]));
				this.curWeight += weights[curIndex];
				this.curIndex++;
				this.time++;
			}
		}
	}

	class Truck {
		int distance;
		int weight;

		public Truck(int distance, int weight) {
			this.distance = distance;
			this.weight = weight;
		}
	}
}