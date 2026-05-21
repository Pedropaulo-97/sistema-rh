package br.com.rh;

import br.com.rh.model.Funcionario;


public class Main {
    public static void main(String[] args) {

        Funcionario joao = new Funcionario(
                "João Silva",
                "123.456.789-00",
                5000.0,
                2,
                true,
                "17/05/2026",
                "Tecnologia"
        );

        Funcionario maria = new Funcionario(
                "Maria Oliveira",
                "987.654.321-00",
                8000.0,
                1,
                true,
                "15/06/2019",
                "Financeiro"
        );

        double bonus1 = joao.calcularBonus(3, 8.5);
        double bonus2 = maria.calcularBonus(5, 6.5);

        System.out.println(joao);
        System.out.println("Bônus anual: R$ " + bonus1);

        System.out.println(maria);
        System.out.println("Bônus anual: R$ " + bonus2);
    }
}