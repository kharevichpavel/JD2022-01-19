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
    public void calcScalarTaska() throws CalcException {
        Scalar var1 = (Scalar) calcService.calc("A=2+5.3");
        double expected1 = 7.3;
        double real1 = var1.getValue();
        assertEquals(expected1, real1, 1e-10);

        Scalar var2 = (Scalar) calcService.calc("B=A*3.5");
        double expected2 = 25.55;
        double real2 = var2.getValue();
        assertEquals(expected2, real2, 1e-10);

        Scalar var3 = (Scalar) calcService.calc("B1=B+0.11*-5");
        double expected3 = 25;
        double real3 = var3.getValue();
        assertEquals(expected3, real3, 1e-10);

        Scalar var4 = (Scalar) calcService.calc("B2=A/2-1");
        double expected4 = 2.65;
        double real4 = var4.getValue();
        assertEquals(expected4, real4, 1e-10);

    }

    @Test
    public void calcVectorTaskB() throws CalcException {
        Scalar var1 = (Scalar) calcService.calc("C=B+(A*2)");
        double expected1 = 40.15;
        double real1 = var1.getValue();
        assertEquals(expected1, real1, 1e-10);

        Scalar var2 = (Scalar) calcService.calc("D=((C-0.15)-20)/(7-5)");
        double expected2 = 10;
        double real2 = var2.getValue();
        assertEquals(expected2, real2, 1e-10);

        Scalar var3 = (Scalar) calcService.calc("E={2,3}*(D/2)");
        double expected3 = 10.15;
        double real3 = var3.getValue();
        assertEquals(expected3, real3, 1e-10);

    }
}