package br.com.nico;

import java.util.List;
//eu uso o abstract para falar pro codigo que a oq estiver dentro dessa classe(nesse caso a class Task) precisa ser herdado por alguem
public abstract  class Task {

        //é usado o protected pra não deixar ser acessado por outras pessoas mas deixar os "filhos" acessarem atraves do this
        protected String title;

        //aqui uso o State por causa do enum
        protected State state;
        protected List<String> comments;

        public Task(String title) {
            //isso é o metodo construtor, primeiro metodo que eu acho quando estou transformando uma classe em objeto, la no arquivo main quando eu criei a variavel tarefa ele vai passar por aqui e rodar esse codigo que esta dentro desse metodo

            this.title = title;
            //aqui esta obrigando a pessoa a botar um titulo quando for criar a variavel no Task no caso nosso seria a variavel tarefa

            this.state = State.TO_DO;
            //esta com o to Do para a variavel ja "nascer" com o state "TO_DO", no caso a fazer
            //tbm estou dando quais os valores possiveis de state por causa do enum
        }

        public String getTitle() {
            return title.replace("-", " ");
            //aqui estou fazendo um metodo para dar permissao para ler o title, como ele esta privado eu não consigo exibir ele no terminal com o sout, e tbm estou colocando que qnd for colocado - no title ira ser substituido por um espaço, isso posso fazer usando o .replace( , );
        }
        public State getState() {
            return state;
            //como esse metodo é do tipo enum ele precisa retornar uma String por isso uso o state.name
            //estou usando o public Satte... para nao precisar criar dois metodos para retornar o pt e o es no enum
        }

        void comment(String comment) {
            comments.add(comment);
        }

        void toDo () {
            if (state != State.DOING) {
                throw new IllegalArgumentException();
                //aqui eu estou evitando que ocorra bugs, como se o codigo estivesse esperando que voce estivesse no DOING mas não esta
            }
            state = State.TO_DO;
            //sempre usar o State. por causa do enum
        }

        void doing() {
            state = State.DOING;
        }

        void done() {
            if (state != State.DOING) {
                throw new IllegalArgumentException();

            }
            state = State.DONE;
            //aqui estou dizendo que só posso mover o state pra DONE se o state for DOING,e se não for o java vai interroper a execução
        }


}
