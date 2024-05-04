package State.ProjetoGerenciadorTarefas.client;

import State.ProjetoGerenciadorTarefas.model.Task;

public class Gerenciador {

    public static void main(String[] args) {

        Task task = new Task("Desenvolver em BRAINFUCK!");
        task.acionarTarefaAtrasada();

    }
}
