/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class pessoa {

    public static void main(String[] args) {

        String nome_cliente;
        int idade_cliente;
        String telefone_cliente;
        String cpf_cliente;
        // TODO code application logic here

        nome_cliente = JOptionPane.showInputDialog("digite o nom/*e do cliente: ");
    }

    public int idade;
    public String nome;
    public String cpf;
    public int telefone;
    public Date data_nascimento;

    public pessoa(String nome, String cpf, int telefone, Date data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }
}

class funcionario extends pessoa {

    public float salario;
    public String beneficios;
    public String folga;
    public Date horario;

    funcionario(float salario, String folga, Date horario, String beneficios,
            String nome, String cpf, int telefone, Date data_nascimento, int pagamento) {
        super(nome, cpf, telefone, data_nascimento);
        this.salario = salario;
        this.beneficios = beneficios;
        this.folga = folga;
        this.horario = horario;
    }
}

class cliente extends pessoa {

    public float gastos;
    public int mesa;
    public int horario;

    cliente(float gastos, int mesa, int horario, String cpf, int telefone,
            Date data_nascimento, String nome) {
        super(nome, cpf, telefone, data_nascimento);
        this.gastos = gastos;
        this.mesa = mesa;
        this.horario = horario;
    }
}

class caixa extends funcionario {

    public float conta;
    public int pagamento;

    caixa(float conta, int pagamento, float salario, String folga, Date horario, String beneficios, String nome, String cpf, int telefone, Date data_nascimento) {
        super(salario, folga, horario, beneficios,
                nome, cpf, telefone, data_nascimento, pagamento);
        this.conta = conta;
        this.pagamento = pagamento;
    }
}
