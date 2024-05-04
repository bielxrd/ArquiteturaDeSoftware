package State.ProjetoGerenciadorTarefas.model;

import State.ProjetoGerenciadorTarefas.states.PendenteStatesImpl;
import State.ProjetoGerenciadorTarefas.states.States;

public class Task {
    private String descricao;
    private States state;

    public Task(String descricao) {
        this.state = new PendenteStatesImpl(this);
        this.descricao = descricao;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
        System.out.println("MUDOU DE ESTADO PARA = "+getState());
    }

    // metodos que serao invocados para o registrador

    public void acionarTarefaAtrasada() {
        this.state.atrasar();
    }

    public void acionarTarefaConcluida() {
        this.state.concluir();
    }

    public void acionarTarefaPendente() {
        this.state.pendente();
    }

}
