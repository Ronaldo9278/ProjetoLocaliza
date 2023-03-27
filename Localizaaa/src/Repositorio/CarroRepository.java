package Repositorio;

import java.util.ArrayList;

import Entidade.Carro;

public class CarroRepository {

    private ArrayList<Carro> carros;

    public CarroRepository() {
        this.carros = new ArrayList<>();
    }

    public void create(Carro carro) {
        carros.add(carro);
    }

    public Carro read(int id) {
        for (Carro carro : carros) {
            if (carro.getId() == id) {
                return carro;
            }
        }
        return null;
    }

    public void update(Carro carroAtualizado) {
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getId() == carroAtualizado.getId()) {
                carros.set(i, carroAtualizado);
                break;
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getId() == id) {
                carros.remove(i);
                break;
            }
        }
    }
}