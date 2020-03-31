import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest extends Main{

    @Test
    public void quad() throws Exception {
        assertEquals(1, Quad(1,1));
        assertEquals(2, Quad(-1, 1));
        assertEquals(3, Quad(-1,-1));
        assertEquals(4, Quad(1, -1));
        assertEquals(5,Quad(0,0));

    }
}