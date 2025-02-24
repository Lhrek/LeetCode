public class TwoSum_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 1; int right = numbers.length;
        while (left < right){
            int sum = numbers[left-1] + numbers[right-1];
            if(sum == target){
                return new int[]{left,right};
            } else if (sum > target) {
                right --;
            }else {
                left ++;
            }
        }
        return null;
    }
//    public static int[] twoSum(int[] numbers, int target) {
//        int left = 1;
//        int right = numbers.length;
//        int [] res = {-1,-2} ;
//        while (left < right ){
//            if(numbers[left -1 ] + numbers[right - 1] > target){
//                right --;
//                continue;
//            }
//            if(numbers[left -1] + numbers[right-1] == target){
//                res[0] = left;
//                res[1] = right;
//              return res;
//            }
//            if(numbers[left-1] + numbers[right-1] <target){
//                left ++;
//                continue;
//            }
//        }
//        return res;
//    }

}
