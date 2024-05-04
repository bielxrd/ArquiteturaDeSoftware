package State.ProjetoGerenciadorTarefas.states;

import State.ProjetoGerenciadorTarefas.model.Task;

public class PendenteStatesImpl implements States {

    private Task task;
    private final String ATUAL="Pendente";

    public PendenteStatesImpl(Task task) {
        this.task = task;
    }

    @Override
    public void atrasar() {
        this.task.setState(new AtrasadaStatesImpl(task));
    }

    @Override
    public void concluir() {
        this.task.setState(new ConcluidaStatesImpl(task));
    }

    @Override
    public void pendente() {
        System.out.println("Tarefa ja esta pendente");
    }

    @Override
    public String toString() {
        return "Estado atual da tarefa =  "+ATUAL;
    }
}
