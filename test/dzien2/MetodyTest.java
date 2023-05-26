package dzien2;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class MetodyTest {

    List<Metody> listMetod = new java.util.ArrayList<>();
    @BeforeEach
    void init(){

    }
    @Test
    public void czyMetodaMnozonyPrzezDwaDzialaPoprawnieDlaLiczbDodatnich(){
        assertEquals(4,Metody.mnozonyPrzezDwa(2));
        assertEquals(6,Metody.mnozonyPrzezDwa(3));
        assertEquals(8,Metody.mnozonyPrzezDwa(4));
    }

    @Test
    public void czyMetodaMnozonyPrzezDwaDzialaPoprawnieDlaLiczbUjemnych(){
        assertEquals(-4,Metody.mnozonyPrzezDwa(-2));
        assertEquals(-6,Metody.mnozonyPrzezDwa(-3));
        assertEquals(-8,Metody.mnozonyPrzezDwa(-4));
    }
    @Test
    public void czyMetodaMnozonyPrzezDwaDzialaPoprawnieDlaZera(){
        assertEquals(0,Metody.mnozonyPrzezDwa(0));
        assertEquals(-0,Metody.mnozonyPrzezDwa(-0));
    }
}
