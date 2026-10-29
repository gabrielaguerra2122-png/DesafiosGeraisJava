import java.util.ArrayDeque;
import java.util.Queue;

public class desafioQueue {
    public static void main(String[] args) {
        //fila(fifo, primeiro que chega fica em primeiro)
        Queue<String> fila = new ArrayDeque<>();
        fila.offer("Mariana");//offer adicionou 1
        fila.offer("Lucas");//offer adicionou dps de mariana
        fila.offer("Fernanda");
        fila.offer("Gabriel");
        fila.offer("Patricia");

       for(String verificacao : fila){ 
           if(verificacao.length()>6){/*se a pessoa atual tiver mais de 6 letras no nome */
            fila.poll();/*eu primeiro retiro ela do incio da fila(pq nas filas o 1 sempre sai primeiro) */
            fila.offer(verificacao);/*depois adiciono ela no fim da fila*/
        }
        else{
            fila.poll();/*se a pessoa nao tiver mais de 6 letras, eu so removo */
        }
        System.out.println(fila);
       }

       for(String passou: fila){/*agora que passou na verificação das letras, eu removo toda 1 por 1, todas as pessoas que tinham mais de 6 letras */
        fila.poll();
        System.out.println(fila);
       }
       
       Queue<String> tarefas = new ArrayDeque<>();
       tarefas.offer("Limpar a casa");
       tarefas.offer("Pagar contas");
       tarefas.offer("Estudar Java");
       tarefas.offer("Fazer compras");
       tarefas.offer("Pagar aluguel");
       Queue<String> filaDeEspera = new ArrayDeque<>();

       for(String fazer: tarefas){
        if(fazer.contains("Pagar") || fazer.contains("Estudar")){/*se a tarefa atual conter pagar ou estudar */
            System.out.println(fazer);/*imprimo a tarefa atual */
            tarefas.poll();/*removo a tarefa atual */
                System.out.println("CONCLUIDA!");/*imprimo q esta concluida */
        }
        else {/*se nao tiver pagar ou estudar na tarefa atual, ele pula o if pq se nao tem, ele deu falso */
            filaDeEspera.offer(fazer);/*adiciona a tarefa atual que nao passou pelo if, ou seja, oq n tem pagar ou estudar na fila de espera*/
            System.out.println("Falta: " + filaDeEspera);/*e imprimo a fila de espera das tarefas */
           }
        
       }

    }



}
