import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParamIngrTest {


    private Ingredient ingredient;
    private static IngredientType type;
    private final String name;
    private final float price;
    private final static double DELTA = 0.0f;

    @Before
    public void beforeBenTest() {
        ingredient = new Ingredient(type, name, price);
    }

    public ParamIngrTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters()
    public static Object[][] getTypeNameAndPrice() {
        return new Object[][] {
                {type.SAUCE, "Sausage", (float) 69.88},
                {type.FILLING, "Кетчуп", (float) 55.99}
        };
    }

    @Test
    public void getPriceTest() {
        assertEquals("Wrong price of ingredient", price, ingredient.getPrice(), DELTA);
    }

    @Test
    public void getNameTest() {
        assertEquals("Wrong name of ingredient", name, ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        assertEquals("Wrong type of ingredient", type, ingredient.getType());
    }

}
