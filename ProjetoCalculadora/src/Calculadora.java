public class Calculadora {

    private double numero1;
    private double numero2;

    // Métodos públicos para acessar os atributos privados
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    // Operações matemáticas
    public double somar() {
        return numero1 + numero2;
    }

    public double subtrair() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("Erro: divisão por zero não é permitida.");
        }
        return numero1 / numero2;
    }
}