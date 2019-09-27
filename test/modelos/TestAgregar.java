/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author davidbousquet
 */
public class TestAgregar {

    public TestAgregar() {
    }

    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta("Venta001", 9500, 3);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}
