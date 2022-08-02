package Reltio;

public class MaxSpliceArr {

	public static void main(String[] args) {
		int[] nums1 = {60,60,60};
		int[] nums2 = {10,90,10};
		System.out.println(maximumsSplicedArray(nums1,nums2));
	}
	
	public static int maximumsSplicedArray(int[] nums1, int[] nums2) {
		
		int nums1Heighest = 0;
		int nums2Heighest = 0;
		int leftNum1 = 0;
		int leftNum2 = 0;
		int left = 0;
		int nums2Min = Integer.MAX_VALUE;
		int right = 0;
		int[] parentArr = new int[nums1.length];
		int[] childArr = new int[nums1.length];
		
		for(int i=0; i<nums1.length; i++) {
			if(nums1[i] > nums1Heighest) {
				 nums1Heighest = nums1[i];
				 leftNum1 = i;
			}
		}
		
		for(int i=0; i<nums2.length; i++) {
			if(nums2[i] > nums2Heighest) {
				nums2Heighest = nums2[i];
				leftNum2 = i;
			}
		}
		
		if(nums2Heighest > nums1Heighest) {
			parentArr = nums2;
			childArr = nums1;
			left = leftNum2;
		}else {
			parentArr = nums1;
			childArr = nums2;
			left = leftNum1;
		}
		
		for(int j=left; j<childArr.length; j++) {
			if(childArr[j] < nums2Min) {
				nums2Min = childArr[j];
				right = j;
			}
		}
		
		if(left == right) {
			if(parentArr[left] <  childArr[left]) {
				
				int temp = parentArr[left];
				parentArr[left] =  childArr[left];
				childArr[left] = temp;
			}
		}else {
			int temp = parentArr[left];
			parentArr[left] =  childArr[left];
			childArr[left] = temp;
			
			int tempright = childArr[right];
			childArr[right] =  parentArr[right];
			parentArr[right] = tempright;
		}
		
		
		
		int nums1Sum = getMax(parentArr);
		int nums2Sum = getMax(childArr);
		
		
		System.out.println(Math.max(nums1Sum, nums2Sum));
		
		
        return Math.max(nums1Sum, nums2Sum);
    }

	public static int getMax(int[] nums1) {
		int sum = 0;
		for(int i=0; i<nums1.length; i++) {
			sum = sum+ nums1[i];
		}
		return sum;
	}
}
