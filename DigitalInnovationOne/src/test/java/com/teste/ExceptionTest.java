package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Fail.fail;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExceptionTest {
    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        List <String> Lista = new ArrayList<String>();
        Lista.get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void alouldTestExceptionMessage() throws IndexOutOfBoundsException{
        List<Object> List = new ArrayList<Object>();
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        List.get(0);
    }

    @Test
    public void testExceptionMessage(){
        try {
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutOfBoundsException seja lançada");
        }catch (IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
