package br.com.rh.model;

public class Funcionario {


    // Dados de indentificação
    private String nomeCompleto;
    private String cpf;

    // Dados contratuais
    private double salarioMensal;
    private int quantidadeDependentes;
    private boolean ativoNaEmpresa;
    private String dataDeAdmissao;
    private String departamento;
    private double notaDeAvaliacao;


    // Cria um novo funcionario com dados obrigatórios

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

        // Guard clause 1: avaliação insuficiente bloqueia tudo
        if (notaDeAvaliacao < 7.0) {
            return 0;
        }

        // Guard clause 2: tempo mínimo não atingido
        if (anosDeEmpresa < 1) {
            return 0;
        }

        double salarioAnual = salarioMensal * 12;

        // Faixa intermediária: 1 a 3 anos
        if (anosDeEmpresa >= 1 && anosDeEmpresa <= 3) {
            return salarioAnual * 0.05;
        }

        // Faixa sênior: mais de 3 anos
        return salarioAnual * 0.10;
    }


    // Retorna uma descrição legível do funcionario
    // Útil para logs e depuração

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
