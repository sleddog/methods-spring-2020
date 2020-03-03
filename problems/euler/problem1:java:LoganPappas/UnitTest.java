

import org.junit.Test;
import static org.junit.Assert;
import Driver.java

public class UnitTest{
    @Test
    public void testProblem(){
        MyUnit myUnit = new MyUnit();
        int result = myUnit.solution(10);
        assertEquals(23,result)
    }

}