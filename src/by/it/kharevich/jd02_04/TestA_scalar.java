package by.it.kharevich.jd02_04;

import by.it.kharevich.calculator.exceptions.CalcException;
import by.it.kharevich.calculator.model.Scalar;
import by.it.kharevich.calculator.repository.FileRepository;
import by.it.kharevich.calculator.repository.MapRepository;
import by.it.kharevich.calculator.repository.VarRepository;
import by.it.kharevich.calculator.services.CalcService;
import by.it.kharevich.calculator.utils.PathFinder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestA_scalar {

    private CalcService calcService;

    @Before
    public void setUp() throws Exception {
        VarRepository repository = new MapRepository();
        calcService = new CalcService(repository);
    }

    @After
    public void tearDown() throws Exception {
        VarRepository repository = new MapRepository();
        calcService = new CalcService(repository);
    }

    @Test
    public void TestA1() throws CalcException {
        Scalar calc = (Scalar)calcService.calc("A=2+5.3");
        double expected = 7.3;
        double actual = calc.getValue();
        assertEquals(expected, actual,1e-10);
    }

    @Test
    public void TestA2() throws CalcException {
        Scalar calc = (Scalar)calcService.calc("B=A*3.5");
        double expected = 25.55;
        double actual = calc.getValue();
        assertEquals(expected, actual,1e-10);
    }


}