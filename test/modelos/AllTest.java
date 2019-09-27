package modelos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    TestAgregar.class, TestEliminar.class, TestListar.class, TestModificar.class, TestsubTotal.class
})
public class AllTest {

}