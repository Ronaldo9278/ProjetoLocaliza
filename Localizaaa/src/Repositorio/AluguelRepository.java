package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Entidade.Aluguel;

public class AluguelRepository {
    private List<Aluguel> alugueis;

    public AluguelRepository() {
        alugueis = new ArrayList<>();
    }

    public void addAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public Aluguel getAluguelById(int id) {
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getId() == id) {
                return aluguel;
            }
        }
        return null;
    }

    public void removeAluguelById(int id) {
        Aluguel aluguelToRemove = null;
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getId() == id) {
                aluguelToRemove = aluguel;
                break;
            }
        }
        if (aluguelToRemove != null) {
            alugueis.remove(aluguelToRemove);
        }
    }
}