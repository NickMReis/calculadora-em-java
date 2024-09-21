package calculadora;

//realizar calculos e retornar resultado
public class Calculadora {
    public double executarSoma(double numero1, double numero2){
        return numero1 + numero2;
    }
    public double executarSubtracao(double numero1, double numero2){
        return numero1 - numero2;
    }
    public double executarMultiplicacao(double numero1, double numero2){
        return numero1 * numero2;
    }
    public double executarDivisao(double numero1, double numero2){
        return numero1 / numero2;
    }
    public double executarCalculoPorcentagem(double numero){
        return numero / 100;
    }
}
