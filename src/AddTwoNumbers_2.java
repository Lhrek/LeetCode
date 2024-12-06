public class AddTwoNumbers_2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int num1 = listToInt(l1);
        int num2 = listToInt(l2);
        return intToList(num1+num2);
    }
    public static int listToInt(ListNode l){
        int exp = 0;
        int ans = 0;
        while (l != null){
            ans = (int) (l.val * Math.pow(10,exp) + ans);
            l = l.next;
            exp++;
        }
        return ans;
    }
    public static ListNode intToList(int target){
        if(target == 0){
            return new ListNode(0);
        }
        ListNode ans = new ListNode();
        ListNode current = ans;
        while (target !=0){
            current.next = new ListNode(target % 10);
            current = current.next;
            target /= 10;
        }
        return  ans.next;
    }

    //todo 转成数字相加超数据类型的size了
    //可以递归链表
}
