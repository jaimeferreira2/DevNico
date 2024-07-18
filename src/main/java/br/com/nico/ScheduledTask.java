package br.com.nico;

import java.time.LocalDateTime;

//aqui ta falando que é uma extensao da Task
public class ScheduledTask extends Task {

    private LocalDateTime start;
    //estou criando uma variavel LocalDateTime chamada start pra dizer qnd ScheduledTask inicia

    public ScheduledTask(String title, LocalDateTime start) {

        //o super (title) precisa ir primeiro para não gerar erro
        //e o super é a instacia do "pai" dessa classe, como se fosse o metodo construtor
        super (title);

        //como fizes um metodo para uma tarefa agendada(ScheduledTask) precisamos da uma data inicio pq botamos aquele LocalDateTime start
        this.start = start;


    }
    @Override
    //Override significa sobrescrita(que significa que estou oegando um metodo q ja existe(que herdou) só que vai fazer de uma forma diferente, se n especificar vai fazer do msm jeito herdado

    public void doing(){
        //a linha abaixo diz "se o inicio é antes de agr(significa q o inicio ja passou)
        if (!start.isBefore(LocalDateTime.now())) {

            //e na linha debaixo diz q se ele não for a linha de cima vai rodar esse codigo q é como se fosse um "erro"
            throw new IllegalArgumentException();
        }
        //aqui esta alterando o state para DOING
        this.state = State.DOING;
    }
    @Override
    public void done () {
        if (!start.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException();
        }
        super.done();

        }
}
