package br.com.rh.model;

public class Funcionario {


    private String nomeCompleto;
    private String cpf;


    private double salarioMensal;
    private int quantidadeDependentes;
    private boolean ativoNaEmpresa;
    private String dataDeAdmissao;
    private String departamento;
    private double notaDeAvaliacao;


    public Funcionario(
            String nomeCompleto,
            String cpf,
            double salarioMensal,
            int quantidadeDependentes,
            boolean ativoNaEmpresa,
            String dataDeAdmissao,
            String departamento,
            double notaDeAvaliacao
    ) {

        if (salarioMensal <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero");
        }

        if (notaDeAvaliacao < 0 || notaDeAvaliacao > 10) {
            throw new IllegalArgumentException("Nota deve ser entre 0 e 10");
        }

        if (nomeCompleto == null || nomeCompleto.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
        this.quantidadeDependentes = quantidadeDependentes;
        this.ativoNaEmpresa = ativoNaEmpresa;
        this.dataDeAdmissao = dataDeAdmissao;
        this.departamento = departamento;
        this.notaDeAvaliacao = notaDeAvaliacao;
    }


    /**
     * Calcula o valor do bônus anual do funcionário.
     * <p>
     * Regras:
     * - Avaliação abaixo de 7.0 → sem bônus
     * - Menos de 1 ano de empresa → sem bônus
     * - Entre 1 e 3 anos → 5% do salário anual
     * - Acima de 3 anos → 10% do salário anual
     *
     * @param anosDeEmpresa tempo de empresa calculado externamente
     * @return valor do bônus em reais
     */

    public double calcularBonus(int anosDeEmpresa) {


        if (notaDeAvaliacao < 7.0) {
            return 0;
        }


        if (anosDeEmpresa < 1) {
            return 0;
        }

        double salarioAnual = salarioMensal * 12;


        if (anosDeEmpresa >= 1 && anosDeEmpresa <= 3) {
            return salarioAnual * 0.05;
        }


        return salarioAnual * 0.10;
    }


    public double getSalarioMensal() {
        return salarioMensal;
    }

    public String getDepartamento() {
        return departamento;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salarioMensal +
                ", departamento='" + departamento + '\'' +
                ", ativo=" + ativoNaEmpresa +
                ", nota=" + notaDeAvaliacao +
                '}';
    }
}
