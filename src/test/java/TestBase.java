import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestBase {

    protected static Session session;
    protected static NavigationManager nav;

    public TestBase(){

    }

    @BeforeClass
    public static void setUp(){
        session = new Session();
        nav = session.getNavManager();
    }

    @AfterClass
    public static void tearDown(){
        session.endSesion();
    }
}
