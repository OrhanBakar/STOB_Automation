import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlmanNotSistemiTest {

    AlmanNotSistemi almanNotSistemi=new AlmanNotSistemi();

    @Test
    void ellininAltiAlti(){

        assertEquals(6,almanNotSistemi.notSistemi(45));

    }
    @Test
    void altmisinAltiBes(){

        assertEquals(5,almanNotSistemi.notSistemi(55));

    }
    @Test
    void eksibirVeYuzUzeriReturnIllegalArgumentExeption(){

        assertThrows(IllegalArgumentException.class,
                () ->{
            almanNotSistemi.notSistemi(-1);
                });
    }
}