package Repositorio;

import java.util.ArrayList;

import Entidade.Cliente;

public class ClienteRepository {

    private ArrayList<Cliente> clientes;

    public ClienteRepository() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public Cliente buscarCliente(int id) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public void atualizarCliente(Cliente clienteAtualizado) {
        for (int i = 0; i < this.clientes.size(); i++) {
            if (this.clientes.get(i).getId() == clienteAtualizado.getId()) {
                this.clientes.set(i, clienteAtualizado);
                break;
            }
        }
    }

    public void removerCliente(int id) {
        for (int i = 0; i < this.clientes.size(); i++) {
            if (this.clientes.get(i).getId() == id) {
                this.clientes.remove(i);
                break;
            }
        }
    }

    public ArrayList<Cliente> listarClientes() {
        return this.clientes;
    }
}