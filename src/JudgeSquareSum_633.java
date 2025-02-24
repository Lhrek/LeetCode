public class JudgeSquareSum_633 {
    public static boolean judgeSquareSum(int c){
      int left = 0;
      int right = (int)Math.sqrt(c);
      boolean res = false;
      while (left <= right){
//          int sum = left*left + right*right;
          if(c - right*right == left*left){
              res = true;
              return res;
          } else if ( left * left> c - right*right) {
              right--;
          }else {
              left++;
          }
      }
      return res;
    }
}
