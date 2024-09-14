package com.mycompany.questao_2;

public class CalculadoraDeSoma
{
    public int somar(int a, int b)
    {
        return a + b;
    }

    public int somar(int a, int b, int c)
    {
        return a + b + c;
    }

    public double somar(double a, double b)
    {
        return a + b;
    }

    public double somar(double a, double b, double c)
    {
        return a + b + c;
    }

    public static void main(String[] args)
    {
        CalculadoraDeSoma calculadora = new CalculadoraDeSoma();

        int somaInt = calculadora.somar(5, 10);
        int somaIntTres = calculadora.somar(1, 2, 3);
        double somaDouble = calculadora.somar(5.5, 10.5);
        double somaDoubleTres = calculadora.somar(1.1, 2.2, 3.3);

        System.out.println("Soma de dois inteiros: " + somaInt);
        System.out.println("Soma de tres inteiros: " + somaIntTres);
        System.out.println("Soma de dois decimais: " + somaDouble);
        System.out.println("Soma de tres decimais: " + somaDoubleTres);
    }
}