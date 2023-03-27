package Repositorio;

import java.util.ArrayList;

import Entidade.Filial;

public class FilialRepository {
    private ArrayList<Filial> filiais = new ArrayList<>();
    
    public void adicionarFilial(Filial filial) {
        filiais.add(filial);
    }
    
    public void removerFilial(Filial filial) {
        filiais.remove(filial);
    }
    
    public Filial buscarPorNome(String nome) {
        for (Filial filial : filiais) {
            if (filial.getNome().equals(nome)) {
                return filial;
            }
        }
        return null;
    }
    
    public ArrayList<Filial> listarFiliais() {
        return filiais;
    }
}