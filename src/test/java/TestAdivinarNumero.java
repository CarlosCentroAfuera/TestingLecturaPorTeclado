import org.junit.jupiter.api.Test;

public class TestAdivinarNumero {

    @Test
    public void testAdinivarNumero_XXX(){
        // TODO haz todos los test que san nesarios
        try {
            Main.adivinaNumero(0,0,0);
        } catch (NumeroFueraDeRango e) {
            throw new RuntimeException(e);
        } catch (NumeroDeIntentosInvalido e) {
            throw new RuntimeException(e);
        }
    }
}
