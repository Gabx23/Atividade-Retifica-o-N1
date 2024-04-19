package Atividade1;

import Atividade1.Circulo;
import Atividade1.Quadrado;
import Atividade1.Retangulo;
import Atividade1.Triangulo;


@SuppressWarnings("unused")
public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado();
        quadrado.setcor("roxo");
        quadrado.setLado1(4);
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);
        System.out.println(quadrado);
        System.out.println("Base Quadrado:" + quadrado.getArea());
        System.out.println(triangulo);
        System.out.println("Base Triangulo:" + triangulo.getArea());
        System.out.println(circulo);
        System.out.println("Base Circulo:" + circulo.getArea());
        System.out.println(retangulo);
        System.out.println("Base Retangulo:" + retangulo.getArea());

        }
}
