package State.ProjetoGerenciadorTarefas.states;

import State.ProjetoGerenciadorTarefas.model.Task;

public class AtrasadaStatesImpl implements States {

    private Task task;
    private final String ATUAL="Atrasada";

    public AtrasadaStatesImpl(Task task) {
        this.task = task;
    }


    @Override
    public void atrasar() {
        System.out.println("Ja esta atrasada");
    }

    @Override
    public void concluir() {
        task.setState(new ConcluidaStatesImpl(task));
    }

    @Override
    public void pendente() {
        System.out.println("Tarefa ja esta atrasada");
    }

    @Override
    public String toString() {
        return "SITUACAO DA TASK = "+ATUAL;
    }
}
