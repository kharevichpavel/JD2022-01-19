package by.it.tarend.jd02_04;

import by.it.tarend.calc.exceptions.CalcException;
import by.it.tarend.calc.model.Scalar;
import by.it.tarend.calc.repositories.MapRepository;
import by.it.tarend.calc.repositories.VarRepository;
import by.it.tarend.calc.services.CalcService;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcServiceTestA {

    private static CalcService calcService;

    @BeforeClass
    public static void setUp() throws Exception {
        VarRepository repository = new MapRepository();
        calcService = new CalcService(repository);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calcScalarTaskA1() throws CalcException {
        Scalar var = (Scalar) calcService.calc("A=2+5.3");
        double expected = 7.3;
        double real = var.getValue();
        assertEquals(expected, real, 1e-10);
    }
    @Test
    public void calcScalarTaskA2() throws CalcException {
        Scalar var = (Scalar) calcService.calc("B=A*3.5");
        double expected = 25.55;
        double real = var.getValue();
        assertEquals(expected, real, 1e-10);
    }
    @Test
    public void calcScalarTaskA3() throws CalcException {
        Scalar var = (Scalar) calcService.calc("B1=B+0.11*-5");
        double expected = 25;
        double real = var.getValue();
        assertEquals(expected, real, 1e-10);
    }
    @Test
    public void calcScalarTaskA4() throws CalcException {
        Scalar var = (Scalar) calcService.calc("B2=A/2-1");
        double expected = 2.65;
        double real = var.getValue();
        assertEquals(expected, real, 1e-10);
    }

}