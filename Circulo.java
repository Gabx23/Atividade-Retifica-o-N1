package Atividade1;

public class Circulo extends Figura implements IComum{
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(){
        super();
    }
    @Override
    public double getArea() {
        
        return 0;
    }

}