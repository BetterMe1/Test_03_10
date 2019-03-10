package Test_0309;

/*
496. 下一个更大元素 I
给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。

示例 1:
输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
输出: [-1,3,-1]
解释:
    对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。
    对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
    对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。
示例 2:
输入: nums1 = [2,4], nums2 = [1,2,3,4].
输出: [3,-1]
解释:
    对于num1中的数字2，第二个数组中的下一个较大数字是3。
    对于num1中的数字4，第二个数组中没有下一个更大的数字，因此输出 -1。
注意:
nums1和nums2中所有元素是唯一的。
nums1和nums2 的数组大小都不超过1000。
 */
/*
 * 分析：
 * 使用指针i遍历数组nums1，在nums2中寻找nums1的元素，如果找到，就在找到的元素之后继续查找是否有比此元素更大的元素，
 * 如果有，将nums[i]改为找到的更大元素，如果没有找到比它更大的元素或者在nums2中没有找到遍历到的nums1元素，将nums[i]改为-1.
 * 返回nums1.
 */
public class LeetcodeTest {
	public static void main(String[] args) {
		Solution So = new Solution();
		int[] nums1 = {2,4};
		int[] nums2 = {1,2,3,4};
		int[] res = So.nextGreaterElement(nums1, nums2);
		for(int i=0; i<res.length; i++){
			System.out.print(res[i] + " ");	
		}
	}
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0; i<nums1.length; i++){
        	int j=0;
        	for(; j<nums2.length; j++){
        		if(nums2[j] == nums1[i]){
        			break;
        		}
        	}
        	if(j != nums2.length){
        		int k=j+1;
        		for(; k<nums2.length; k++){
        			if(nums2[k] > nums2[j]){
        				nums1[i] = nums2[k];
        				break;
        			}
        		}
        		if(k == nums2.length){
        			nums1[i] = -1;
        		}
        	}else{
        		nums1[i] = -1;
        	}
        }
        return nums1;
    }
}