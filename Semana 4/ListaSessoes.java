package Semana4;

import java.util.ArrayList;
import java.util.List;

public class ListaSessoes {
    private List<Sessao> sessoes;

    public ListaSessoes() {
        this.sessoes = new ArrayList<>();
    }

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }
}
