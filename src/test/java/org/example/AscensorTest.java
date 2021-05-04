package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class AscensorTest{
    private Ascensor ascensor;
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void before(){
        ascensor = new Ascensor();
    }

    @Test
    public void siDestinoFueraDeRangoLanzarExcepcion() throws Exception{
        exception.expect(Exception.class);
        ascensor.usarAscensor(5);
    }

    @Test
    public void siOrigenFueraDeRangoLanzarExcepcion() throws Exception{
        exception.expect(Exception.class);
        ascensor.verificar(5);
    }
    @Test
    public void siOrigenPisoUnoAbrirPuerta() throws Exception{
        assertEquals("Abrir Puerta",ascensor.verificar(1));
    }
    @Test
    public void siDestinoDentroDeRangoDirijirse() throws Exception{
        assertEquals("Dirigirse al piso 2 y abrir la puerta",ascensor.usarAscensor(3));

    }

    @Test
    public void siOrigenDentroDeRangoDirijirse() throws Exception{
        assertEquals("Dirijirse al piso 2 y abrir puerta", ascensor.verificar(2));
    }
    @Test
    public void siOrigenIgualADestinoLanzarExcepcion() throws Exception{
        exception.expect(Exception.class);
        ascensor.comparar(2,2);
    }


}