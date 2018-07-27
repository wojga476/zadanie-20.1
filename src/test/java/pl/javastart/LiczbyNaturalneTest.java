package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LiczbyNaturalneTest {

    @Test
    public void shouldBe23(){

        LiczbyNaturalne liczbyNaturalne = new LiczbyNaturalne();
        int liczba = 10;

        List<Integer> lista = new ArrayList<>();
        lista = liczbyNaturalne.wielokrotnosci3i5(liczba);
        int sumaLiczb = 0;
        for(Integer integer: lista){
            sumaLiczb += integer;
        }
        assertThat(sumaLiczb, CoreMatchers.is(23));
    }
}