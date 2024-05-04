package State.ProjetoGerenciadorTarefas.states;

import State.ProjetoGerenciadorTarefas.model.Task;

public class ConcluidaStatesImpl implements States {

    private Task task;
    private final String ATUAL="Concluida";

    public ConcluidaStatesImpl(Task task) {
        this.task = task;
    }

    @Override
    public void atrasar() {
        System.out.println("Tarefa ja concluida");
    }

    @Override
    public void concluir() {
        System.out.println("Tarefa ja concluida");
    }

    @Override
    public void pendente() {
        task.setState(new PendenteStatesImpl(task));
        System.out.println("Faltou algo na tarefa, refaca");
    }

    @Override
    public String toString() {
        return "SITUACAO DA TASK = "+ATUAL;
    }
}
