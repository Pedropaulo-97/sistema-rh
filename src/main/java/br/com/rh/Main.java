package br.com.rh;

import br.com.rh.model.Funcionario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        System.out.println(joao);
    }
}