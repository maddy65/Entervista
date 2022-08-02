package Reltio;

public class maxXor {

	public static void main(String[] args) {
		int arr[] = {640};
		

		System.out.println(maximumXOR(arr));

	}
	
	static int maximumXOR(int nums[]){
		int maxXor = 0;
		int n = nums.length;
		
		for (int i = 0; i < n; i++)	{
			for (int j = i + 1; j < n; j++)	{
				maxXor = Math.max(maxXor,nums[i] ^ nums[j]);
			}
		}
		return maxXor;
	}

}
