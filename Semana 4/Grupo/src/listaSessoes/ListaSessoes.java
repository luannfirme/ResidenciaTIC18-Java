package listaSessoes;

import java.util.ArrayList;
import java.util.List;

import sessao.Sessao;

public class ListaSessoes {
    private List<Sessao> sessoes;

    public ListaSessoes() {
        this.sessoes = new ArrayList<>();
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public void adicionarSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }
}