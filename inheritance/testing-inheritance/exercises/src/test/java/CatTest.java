import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat",7);
        assertEquals(7,keyboardCat.getWeight(), .001);
    }

    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertEquals(13, keyboardCat.getWeight(), .001);
        assertEquals(13, keyboardCat.getWeight());

    }

    @Test
    public void inheritsMethodsInCats() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());
    }
}
