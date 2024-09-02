package edu.ricardopanighel.modulo1;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal<6)
            System.out.println("REPROVADO");
        else if (mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else (mediaFinal>6)
            System.out.println("APROVADO");
    }
}
