package br.com.nico;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

//feito para dizer quais serviços os outros sistemas podem acessar referente a tarefa
public class TaskService {
    private Long sequence = 1L;
    //criando uma variavel Long que se chama sequence que inicia com o numero 1

    private Map<Long, Task> tasks = new HashMap<>();
    //aqui estou dizendo que pra esse determinado numero eu tenho essa tarefa
    //long significa numero


                        //aqui diz qual tarefa eu quero adicionar
    public Long addTask(Task task) {
        //aqui estou criando uma variavel id
        Long id = sequence++;

        //aqui estou colocando o id na memoria
        tasks.put(id, task);

        return id;


    }
    public void removeTask(Long id) {
        //id é a chave do mapa
        tasks.remove(id);

    }
    //pegar tarefa de volta
    public Task getTask(Long id) {
        return  tasks.get(id);

    }
    //pegar tds as tarefas
    public List<Task> getAllTasks() {

        //aqui transformko elas em listas
        return tasks.values()
                .stream()
                .toList();
    }

    //avançar uma tarefa
    public void forwardSTask() {

    }
    //voltar uma tarefa
    public void previousStateTask() {

    }

}
