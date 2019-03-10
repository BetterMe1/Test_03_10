package Test_0309;

/*
496. ��һ������Ԫ�� I
��������û���ظ�Ԫ�ص����� nums1 �� nums2 ������nums1 �� nums2 ���Ӽ����ҵ� nums1 ��ÿ��Ԫ���� nums2 �е���һ��������ֵ��
nums1 ������ x ����һ������Ԫ����ָ x �� nums2 �ж�Ӧλ�õ��ұߵĵ�һ���� x ���Ԫ�ء���������ڣ���Ӧλ�����-1��

ʾ�� 1:
����: nums1 = [4,1,2], nums2 = [1,3,4,2].
���: [-1,3,-1]
����:
    ����num1�е�����4�����޷��ڵڶ����������ҵ���һ����������֣������� -1��
    ����num1�е�����1���ڶ�������������1�ұߵ���һ���ϴ������� 3��
    ����num1�е�����2���ڶ���������û����һ����������֣������� -1��
ʾ�� 2:
����: nums1 = [2,4], nums2 = [1,2,3,4].
���: [3,-1]
����:
    ����num1�е�����2���ڶ��������е���һ���ϴ�������3��
    ����num1�е�����4���ڶ���������û����һ����������֣������� -1��
ע��:
nums1��nums2������Ԫ����Ψһ�ġ�
nums1��nums2 �������С��������1000��
 */
/*
 * ������
 * ʹ��ָ��i��������nums1����nums2��Ѱ��nums1��Ԫ�أ�����ҵ��������ҵ���Ԫ��֮����������Ƿ��бȴ�Ԫ�ظ����Ԫ�أ�
 * ����У���nums[i]��Ϊ�ҵ��ĸ���Ԫ�أ����û���ҵ����������Ԫ�ػ�����nums2��û���ҵ���������nums1Ԫ�أ���nums[i]��Ϊ-1.
 * ����nums1.
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