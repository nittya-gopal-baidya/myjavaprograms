import java.util.ArrayList;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public int[] nodesBetweenCriticalPoints(ListNode head) {
		int result[] = { -1, -1 };
		if (head != null) {
			ListNode prevNode = head;
			ListNode currNode = prevNode.next;
			if (currNode != null) {
				ArrayList<Integer> Cpoint = new ArrayList<>();
				int idx = 0;
				ListNode nextNode = currNode.next;
				while (nextNode != null) {
					idx++;
					if (currNode.val > prevNode.val && currNode.val > nextNode.val
							|| currNode.val < prevNode.val && currNode.val < nextNode.val) {
						Cpoint.add(idx);
					}
					prevNode = currNode;
					currNode = nextNode;
					nextNode = nextNode.next;
				}
				if (Cpoint.size() >= 2) {
					int minDistance = Cpoint.get(Cpoint.size() - 1) - Cpoint.get(Cpoint.size() - 2);
					int maxDistance = Cpoint.get(Cpoint.size() - 1) - Cpoint.get(0);
					result[0] = minDistance;
					result[1] = maxDistance;
					return result;

				} else {
					return result;
				}
			} else {
				return result;
			}
		} else {
			return result;
		}

	}
}
