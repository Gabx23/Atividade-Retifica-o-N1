package Atividade1;

public class Triangulo extends Figura implements IComum{
    private double base;
    private double altura;
    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public Triangulo(String cor) {
        super(cor);
    }

    public Triangulo(){
        super();
    }
    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }
    
}
    