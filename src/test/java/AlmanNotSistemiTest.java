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
    @Test
    void yetmisAltiDört(){

        assertEquals(4,almanNotSistemi.notSistemi(65));

    }
    @Test
    void seksenAltiÜc(){

        assertEquals(3,almanNotSistemi.notSistemi(75));

    }
    @Test
    void doksanAltiIki(){

        assertEquals(2,almanNotSistemi.notSistemi(85));

    }
    @Test
    void doksanÜstüBir(){

        assertEquals(1,almanNotSistemi.notSistemi(95));

    }
}