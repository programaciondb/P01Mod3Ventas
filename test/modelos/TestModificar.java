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
public class TestModificar {

    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = new Venta("Venta001", 9500, 3);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        venta = new Venta("Venta001", 12800, 5);
        boolean obtenido = instance.modificar(venta);
        Assert.assertEquals(esperado, obtenido);
    }

}
