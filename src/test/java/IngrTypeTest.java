import org.junit.Test;
import praktikum.IngredientType;
import static org.junit.Assert.assertNotNull;

public class IngrTypeTest {
    @Test
    public void fillingNotNullTest(){
        assertNotNull("Такого соуса нет", IngredientType.valueOf("SAUCE"));
    }
    @Test
    public void sauceNotNullTest(){
        assertNotNull("Такой начинки нет", IngredientType.valueOf("FILLING"));
    }
}
