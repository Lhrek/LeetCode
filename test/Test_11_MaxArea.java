import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Test_11_MaxArea {
    @Test 
    public void testMaxArea(){
    int[] height =  {1,8,6,2,5,4,8,3,7};
         assertEquals(49,MaxArea_11.maxArea(height));
    }
    @Test
    public void testMaxAreaTwo(){
        int[] heght = {1,1};
        assertEquals(1,MaxArea_11.maxArea(heght));
    }

}
