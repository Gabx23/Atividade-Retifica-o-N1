package Atividade1;

public abstract class Figura {
    protected String cor;
    public String getcor(){
        return cor;
    }
    public void setcor (String cor){
        this.cor = cor;
    }
    public Figura(String cor){
        this.cor = cor;

    }
    public Figura() {
    }
}
