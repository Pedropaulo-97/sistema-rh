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

        double bonus = joao.calcularBonus(3, 8.5);

        System.out.println(joao);
        System.out.println("Bônus anual: R$ " + bonus);
    }
}