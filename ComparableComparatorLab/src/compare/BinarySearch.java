package compare;
import java.util.List;

public class BinarySearch {
	public static int binarySearch(List<Integer> numberedList, int searchTarget) {
		int left = 0;
		int right = numberedList.size() - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int current = numberedList.get(mid);
			
			if (current == searchTarget) {
				return mid;
			}
			else if (current < searchTarget) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}	
		}
		return -1;
	}
}
