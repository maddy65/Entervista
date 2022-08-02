package Reltio;

public class buildArray {

	public static void main(String[] args) {
		int[] nums = new int[] {5,0,1,2,3,4};
		int[] newArr = buildArray(nums);
		for(int i=0; i<newArr.length; i++) {
			System.out.print(" "+newArr[i]);
		}
		
	}
	public static int[]  buildArray(int[] nums) {
        int[] resultArr = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
        	int value = nums[i];
        	resultArr[i] = nums[value];
        }
        return resultArr;
    }

}
