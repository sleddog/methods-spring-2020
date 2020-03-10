import org.junit.*;

public class MainTest {

        @BeforeClass
        public static void setUpClass() throws Exception {
            // Code executed before the first test method
                System.out.println("");
        }

        @Before
        public void setUp() throws Exception {
            // Code executed before each test
        }

        //Caret = ^
        //2Caret = ^^
        //3Caret = ...
        @Test
        public void inputOfCaretShouldReturnPrevCmd() {
                //preconditions
                SHell tester = new SHell(5);
                System.out.println("Test1: inputOfCaretShouldReturnPrevCmd");
                System.out.print("initial input: ");
                tester.passCmd("yep");
                //check if its right
                System.out.println("in: ^");
                System.out.print("out: ");
                Assert.assertEquals("yep ", tester.passCmd("^"));
                System.out.println("in: ^^");
                System.out.print("out: ");
                Assert.assertEquals("yep ", tester.passCmd("^^"));
                System.out.println("in: ^^");
                System.out.print("out: ");
                Assert.assertEquals("yep ", tester.passCmd("^^^"));
                System.out.println("in: ^^");
                System.out.print("out: ");
                Assert.assertEquals("yep ", tester.passCmd("^^^^"));
                System.out.println("");
        }

        @Test
        public void inputTooManyCaretsReturnsFirstCmd() {
                //preconditions
                SHell tester = new SHell(2);
                System.out.println("Test2: inputTooManyCaretsReturnsFirstCmd");
                System.out.print("initial input: ");
                tester.passCmd("yep");
                //check if its right
                System.out.println("in: ^^^");
                System.out.print("out: ");
                Assert.assertEquals("yep ", tester.passCmd("^^^"));
                System.out.println("");
        }

        @Test
        public void removeStringIfConnectedToaCarret() {
                SHell tester = new SHell(2);
                System.out.println("Test3: removeStringIfConnectedToaCarret");
                System.out.print("initial input: ");
                tester.passCmd("yep ");
                //check if its right
                System.out.println("in: thisNeedsToGo^");
                System.out.print("out: ");
                Assert.assertEquals("yep  ", tester.passCmd("thisNeedsToGo^"));
                System.out.println("");
        }

        @Test
        public void keepStringIfNotConnectedToaCarret() {
                SHell tester = new SHell(2);


                System.out.println("Test4: keepStringIfNotConnectedToaCarret");
                System.out.print("initial input: ");
                tester.passCmd("yep");
                System.out.println("in: thisNeedsToStay ^");
                System.out.print("out: ");
                Assert.assertEquals("thisNeedsToStay yep ", tester.passCmd("thisNeedsToStay ^"));
                System.out.println("");
        }

        @After
        public void tearDown() throws Exception {
            // Code executed after each test
        }

        @AfterClass
        public static void tearDownClass() throws Exception {
            // Code executed after the last test method
        }
    }