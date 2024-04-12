import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Math_Teste_Multiplicacao {

    // Testes multiplicacao para A = 1
    @Test
    public void mult11() {
        Math c = new Math();
        int rOb = c.mult( 1, 1);
        int rEs = 1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult12(){
        Math c = new Math();
        int rOb = c.mult(1,2);
        int rEs = 2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult1_0(){
        Math c = new Math();
        int rOb = c.mult(1,0);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult1_1(){
        Math c = new Math();
        int rOb = c.mult(1,-1);
        int rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult1_2(){
        Math c = new Math();
        int rOb = c.mult(1,-2);
        int rEs = -2;
        assertEquals(rEs, rOb);
    }

    // testes com o valor A sendo 2
    @Test
    public void mult21(){
        Math c = new Math();
        int rOb = c.mult(2,1);
        int rEs = 2;
        assertEquals( rEs, rOb);
    }
    @Test
    public void mult22(){
        Math c = new Math();
        int rOb = c.mult(2, 2);
        int rEs = 4;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult2_0(){
        Math c = new Math();
        int rOb = c.mult(2,0);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult2_1(){
        Math c = new Math();
        int rOb = c.mult(2,-1);
        int rEs = -2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult2_2(){
        Math c = new Math();
        int rOb = c.mult(2,-2);
        int rEs = -4;
        assertEquals(rEs, rOb);
    }
    // Para valores de A sendo -1
    @Test
    public void mult_11(){
        Math c = new Math();
        int rOb = c.mult(-1,1);
        int rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult_12(){
        Math c = new Math();
        int rOb = c.mult(-1,2);
        int rEs = -2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult_10(){
        Math c = new Math();
        int rOb = c.mult(-1,0);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult_1_1(){
        Math c = new Math();
        int rOb = c.mult(-1,-1);
        int rEs = 1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult_1_2(){
        Math c = new Math();
        int rOb = c.mult(-1,-2);
        int rEs = 2;
        assertEquals(rEs, rOb);
    }
    // Testes para A sendo -2
    @Test
    public void mult_21(){
        Math c = new Math();
        int rOb = c.mult(-2,1);
        int rEs = -2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult_22(){
        Math c = new Math();
        int rOb = c.mult(-2,2);
        int rEs = -4;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult_2_0(){
        Math c = new Math();
        int rOb = c.mult(-2,0);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult_2_1(){
        Math c = new Math();
        int rOb = c.mult(-2,-1);
        int rEs = 2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void mult_2_2(){
        Math c = new Math();
        int rOb = c.mult(-2,-2);
        int rEs = 4;
        assertEquals(rEs, rOb);
    }

}
