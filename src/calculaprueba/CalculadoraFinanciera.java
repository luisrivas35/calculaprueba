package calculaprueba;

public class CalculadoraFinanciera {
    public double calcularInteresSimple(double capital, double tasa, int periodo) {
        return capital * tasa * periodo;
    }
    
    public double calcularInteresCompuesto(double capital, double tasa, int periodo) {
        return capital * Math.pow((1 + tasa), periodo);
    }
    
}
