import java.util.ArrayDeque;
import java.util.Deque;

public class desafioDeque {
    public static void main(String[] args) {
        Deque<String> musics = new ArrayDeque<>();
        musics.push("Musica E");//push adicionou 1 item
        musics.push("Musica D");//adicionou na frente do 1 item colocado
        musics.push("Musica C");
        musics.push("Musica B");
        musics.push("Musica A");//push adicionou no incio da pilha

        
        System.out.println(musics);

        musics.removeFirst();

        System.out.println(musics);

        musics.removeLast();
        
        System.out.println(musics);

        musics.push("VIP Inicio");//adiciona na frente de todos os elementos que tem no deque
        System.out.println(musics);
        musics.offer("VIP Fim");//adiciona no fim do deque
        for(String percorra: musics){
            System.out.println(percorra);
        }

System.out.println();

        Deque<Integer> esvaziamento = new ArrayDeque<>();
        esvaziamento.offer(10);
        esvaziamento.offer(20);
        esvaziamento.offer(30);
        esvaziamento.offer(40);
        esvaziamento.offer(50);
        esvaziamento.offer(60);



/* for(Integer veja: esvaziamento){
    if(veja==10){ se elemento atual(veja) igual a 10
        System.out.println("Inicio: " + esvaziamento.pop()); imprimo e removo com Inicio
    }
    else if(veja>10 && veja<60){
        System.out.println("Meio: " + esvaziamento.pop());
    }
    else{
        System.out.println("Fim: " + esvaziamento.pop());
    }
}
System.out.println(esvaziamento); */



//usei while pra treinar
         while (!esvaziamento.isEmpty()) {//enquanto a pilha nao estiver vazia
            if(esvaziamento.element()==10){//1 eu verifico se o elemento da rodada atual é igual a 10
            System.out.println("Inicio: " + esvaziamento.pop());}//se for, eu imprimo com Inicio e o elemento que acabou de ser removido(pop retorna o elemento removido
            //se vvc imprimir a pilha.pop())
            else if(esvaziamento.element()>10 && esvaziamento.element()<60){/*se o elemento da rodada atual do while nao for igual a 10
                 eu vejo se o elemento da rodada atual do while esta entre 20 e 50 */
                System.out.println("Meio: " + esvaziamento.element());/*se estiver, eu imprimo Meio + o elemento q acabou de ser retirado*/
            esvaziamento.pop();}//fiz de outro jeito pra mostrar q eu posso tanto imprimir o elemento e dps remover
            //como tbm assim q eu removo, o pop retorna ele pra mim pra eu imprimir
                else{//se o elemento atual nao tiver em nenhum dos ifs(ou seja, 60), eu vou usar Fim e imprimir o elemento q acabou de ser removido
                    System.out.println("Fim: " + esvaziamento.pop());
                }
            
        }
        System.out.println(esvaziamento); 

    }
}
