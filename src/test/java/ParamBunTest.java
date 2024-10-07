import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParamBunTest {

    private Bun bun;
    private final String name;
    private final float price;
    private final static double DELTA = 0.0f;

    @Before
    public void beforeBenTest() {
        bun = new Bun(name, price);
    }

    public ParamBunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters()
    public static Object[][] getNameAndPrice() {
        return new Object[][] {
                {"Булочка с кунжутом", (float) 200},
                {"57124125", (float) 152.54},
                {"$#%~", (float) 0},
                {" ", (float) 1.4},
                {null, (float) 2.54},
                {"Burger", (float) -25.5}
        };
    }

    @Test
    public void getNameTest() {
        assertEquals("Incorrect name", name, bun.getName());
    }

    @Test
    public void getPriceTest() {
        assertEquals("Incorrect price", price, bun.getPrice(), DELTA);
    }
}
