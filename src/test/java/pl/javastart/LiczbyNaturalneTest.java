package pl.javastart;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LiczbyNaturalneTest {

    private LiczbyNaturalne liczbyNaturalne;

    @Before
    public void init(){
        liczbyNaturalne = new LiczbyNaturalne();
    }

    @Test
    public void shouldReturnFor6(){
        //given
        int a = 6;

        //when
        int result = liczbyNaturalne.multiCalc(a);

        //then
        assertThat(result, is(8));
    }

    @Test
public void shouldReturnFor20(){
    //given
    int a = 20;

    //when
    int result = liczbyNaturalne.multiCalc(a);

    //then
    assertThat(result, is(78));
}

}