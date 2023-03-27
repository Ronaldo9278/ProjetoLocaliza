package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Entidade.Funcionario;

public class FuncionarioRepository {
    private List<Funcionario> funcionarios;

    public FuncionarioRepository() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return this.funcionarios;
    }

    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorEndereco(String endereco) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getEndereco().equals(endereco)) {
                return funcionario;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorTelefone(String telefone) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getTelefone().equals(telefone)) {
                return funcionario;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorEmail(String email) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getEmail().equals(email)) {
                return funcionario;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorCargo(String cargo) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getCargo().equals(cargo)) {
                return funcionario;
            }
        }
        return null;
    }
}