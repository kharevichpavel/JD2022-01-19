package by.it.tarend.jd02_04;

import by.it.tarend.calc.exceptions.CalcException;
import by.it.tarend.calc.model.Scalar;
import by.it.tarend.calc.model.Var;
import by.it.tarend.calc.repositories.MapRepository;
import by.it.tarend.calc.repositories.VarRepository;
import by.it.tarend.calc.services.CalcService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcServiceTest {

    private CalcService calcService;

    @Before
    public void setUp() throws Exception {
        VarRepository repository = new MapRepository();
        calcService = new CalcService(repository);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calc() throws CalcException {
        Scalar var = (Scalar) calcService.calc("2+2.00000000000001");
        double expected = 4.0;
        double actual = var.getValue();
        assertEquals(expected, actual, 1e-10);
    }
    @Test
    public void calcScalarTaskA() throws CalcException {
        Scalar var = (Scalar) calcService.calc("A=2+5.3");
        double expected = 7.3;
        double actual = var.getValue();
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void calcScalarSign() throws CalcException {
        Scalar var = (Scalar) calcService.calc("-2.9--1.3");
        double expected = -1.6;
        double actual = var.getValue();
        assertEquals(expected, actual, 1e-10);
    }
}