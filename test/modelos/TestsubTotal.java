/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author davidbousquet
 */
public class TestsubTotal {

    public TestsubTotal() {
    }
        @Test
        public void testSubTotal() {
        System.out.println("testSubTotal");
        Venta venta = new Venta("Venta001", 9500, 3);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        assertTrue(instance.subTotal(venta) == 28500);
    }
    
}
