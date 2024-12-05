public class SearchInsert_35 {
    public static int  searchInsert(int[] nums, int target){
        int begin = 0;
        int end = nums.length-1;
        int mid = -1;
       do {
           mid = (begin+end)/2;
           if(nums[mid] > target){
                end = mid-1;
           } else if (nums[mid] == target) {
               return mid;
           }else {
               begin = mid+1;
           }
       }while(begin <= end); //每次使用end或begin更新都是移动了一位，所以当进行while的条件判断时，begin和end都指向未探索节点。所以begin==end时要继续比较
        return begin;//如果运行到这一段，即没有找到该数字，此时begin > end,begin指向第一个大于target的数，即插入的地方
    }
}
