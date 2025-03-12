import java.util.ArrayList;
import java.util.List;

public class generate_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);
        ans.add(new ArrayList<>(List.of(1)));
        for (int i = 1; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                int value = 0;
                if (j == 0){
                    value = ans.get(i - 1).get(j);
                }
                else if (j == i){
                    value = ans.get(i - 1).get(j - 1);
                }
                else{
                    value = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                }
                cur.add(value);
            }
            ans.add(cur);
        }
        return ans;
    }
}
