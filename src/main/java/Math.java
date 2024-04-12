
    public class Math {
        public int soma (int a, int b){
            int resultado = a + b;
            return resultado;
        }

        public int sub (int a, int b){
            int resultado = a - b;
            return resultado;
        }

        public int mult (int a, int b){
            int resultado = a * b;
            return resultado;
        }

        public double div (double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            double resultado =  a / b;
            return resultado;
        }

}
