package br.com.rh;

import br.com.rh.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Funcionario encontrarMaiorSalario(List<Funcionario> funcionarios) {

        Funcionario maior = funcionarios.get(0);

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalarioMensal() > maior.getSalarioMensal()) {
                maior = funcionario;
            }
        }
        return maior;
    }

    public static double calcularTotalFolha(List<Funcionario> funcionarios) {
        double total = 0.0;

        for (Funcionario funcionario : funcionarios) {
            total = total + funcionario.getSalarioMensal();
        }
        return total;
    }

    public static List<Funcionario> filtrarPorDepartamento(List<Funcionario> funcionarios, String departamento) {
        List<Funcionario> listaDepartamento = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDepartamento().equals(departamento))
                listaDepartamento.add(funcionario);
        }
        return listaDepartamento;
    }

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario(
                "João Silva",
                "123.456.789-00",
                5000.0,
                2,
                true,
                "01/03/2022",
                "Tecnologia",
                9.0
        ));

        funcionarios.add(new Funcionario(
                "Maria Oliveira",
                "987.654.321-00",
                8000.0,
                1,
                true,
                "15/06/2019",
                "Financeiro",
                6.5
        ));

        funcionarios.add(new Funcionario(
                "Carlos Santos",
                "111.222.333-44",
                6000.0,
                3,
                true,
                "10/01/2024",
                "Comercial",
                8.0
        ));

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println("Bônus anual: R$ " + funcionario.calcularBonus(2));
        }

        Funcionario maisRico = encontrarMaiorSalario(funcionarios);
        System.out.println("Maior salário: " + maisRico);

        double totalFolha = calcularTotalFolha(funcionarios);
        System.out.println("Total da folha: R$ " + totalFolha);

        List<Funcionario> tecnologia = filtrarPorDepartamento(funcionarios, "Tecnologia");
        System.out.println("Funcionários de Tecnologia: " + tecnologia);
    }
}