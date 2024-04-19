package Atividade1;

public class App {
    private static final char[] Quadrado = null;
    private static final String Triangulo = null;
    private static final char[] Circulo = null;
    private static final String Retangulo = null;

    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado();
        quadrado.setcor("roxo");
        quadrado.setLado1(4);
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);

        System.out.println(Quadrado);
        System.out.println("Base Quadrado:" + quadrado.getArea());
        System.out.println(Triangulo);
        System.out.println("Base Triangulo:" + triangulo.getArea());
        System.out.println(Circulo);
        System.out.println("Base Circulo:" + circulo.getArea());
        System.out.println(Retangulo);
        System.out.println("Base Retangulo:" + retangulo.getArea());

        }
}
