package br.com.nico;


import java.time.LocalDateTime;

public class Main {
    // Modificadores de acesso: public, private, static, protect

    public static void main(String[] args) {
        /* aqui ele esta falando que ja que vc ja saber oque é uma "Task" ele esta criando um "Task" com o nome tarefa  que terão as mesmas variaveis que uma Task, no caso: state, title
        Task tarefa = new Task();

        //aqui esta botando "Fazer compras" na variavel title de tarefas
        tarefa.title = "Fazer compras";
        tarefa.state = "A fazer";

        System.out.println(tarefa.title);
        System.out.println(tarefa.state);

        TODA A PARTE DE CIMA ESTA COMENTADO PARA NAO PERDER OS ENSINAMENTOS

        */

        /*nao sei pq mas essa BOMBA de intellij faz vc colocoar "" inves de escrever title, se nao fizer isso da erro!!!!!
        Task tarefa = new Task("Fazer-compras"); */

        /*
        Task tarefaAgendada = new ScheduledTask("Agendado", LocalDateTime.now().minusHours(2));
        //aqui estou mudando o estado da tarefa
        tarefaAgendada.doing();
        */



        /*System.out.println(tarefa.getState() .getPtName());
        aqui esta usando o metodo getTitle para exibir a variavel title qnd o codigo for rodado

        tarefa.doing();
        aqui eu fiz a tarefa ir pra  DOING

        System.out.println(tarefa.getState() .getEsName());
        estou usando o .getEsName por causa do enum que ai ele vai retornar o nome em espanhol "es"

        tarefa.done();
        System.out.println(tarefa.getState() .getPtName());
        */

        TaskService service = new TaskService();

        Task tarefaNormal = new NormalTask("Fazer compras");

        //aqui eu estou criando uma tarefa falando que vou passear com os cachorros daqui uma hr
        Task tarefaAgedada = new ScheduledTask("Passear com os cachorros",LocalDateTime
                .now()
                .plusHours(1));


        Long idTarefaNormal = service.addTask(tarefaNormal);
        Long idTarefaAgendada = service.addTask(tarefaAgedada);

        System.out.println(idTarefaNormal);
        System.out.println(idTarefaAgendada);

        System.out.println(service.getAllTasks());





    }
}