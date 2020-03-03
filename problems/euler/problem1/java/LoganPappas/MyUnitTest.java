

import org.junit.Test;
import static org.junit.Assert;
import Driver.java;

//Class to test Driver.java
public class UnitTest{
    @Test
    //Method to test problem and compare solution to expected output
    public void testProblem(){
        MyUnit myUnit = new MyUnit();
        int result = myUnit.solution(10);
        assertEquals(23,result)
    }

}
