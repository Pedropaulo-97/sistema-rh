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


        // Cria um novo funcionario com dados obrigatórios

    public Funcionario (
            String nomeCompleto,
            String cpf,
            double salarioMensal,
            int quantidadeDependentes,
            boolean ativoNaEmpresa,
            String dataDeAdmissao,
            String departamento
    ) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
        this.quantidadeDependentes = quantidadeDependentes;
        this.ativoNaEmpresa = ativoNaEmpresa;
        this.dataDeAdmissao = dataDeAdmissao;
        this.departamento = departamento;
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
                '}';
    }
}
