import java.util.Arrays;

public class desafioArray {

    public static void main(String[] args) {
        double[] desafio = {23.5, 18.0, 31.2, 27.4, 15.1, 29.8};
double maior = 0;
double menor = 0;
for(int i = 0; i < desafio.length; i ++){
    //ele verifica sempre todos os if
    if(desafio[i]>maior){/*esse n precisou pq a nota sempre sera maior q 0 */
        maior = desafio[i];
        
    }
    if(i==0 || desafio[i] < menor){/*usei o i==0 pra pegar a 1 nota da 1 rodada pq se nao, nao ia ter como comparar as outras
        notas, pq a nota do indice atual nunca seria menor(ou ate igual) a zero, ent ele n ia entrar no if pq a condição
        da nota ser menor q 0 seria falsa, mas com a nota do indice 0(i==0) armazenada na 1 rodada pq i na 1 rodada é igual a 0
        ent da true, e ele pega a nota do indice atual q é 0 e adciona, na proxima rodada se a nota atual(indice agr) for
        menor que a nota armazenada, ai eu adiciono*/
    menor = desafio[i];
    System.out.println(menor);
    }
}
System.out.println("Maior nota: " + maior + "\n" + "Menor nota: " + menor);


int[] numeros ={1, 2, 3, 4, 5};
numeros[0] = 5;
numeros[1] = 4;
numeros[2] = 3;
numeros[3] = 2;
numeros[4] = 1;
System.out.println(Arrays.toString(numeros));

//testando array com varios tipos
Object[] sla = {"oi", true, 1.3, 5, 'c'};
for(int i = 0; i < sla.length; i++){

    if(sla[i] instanceof Double){/*aq eu fiz uma trava de segurança antes de fzr o cast, se o objeto atual for do tipo Double, eu entro no if
        onde tem outro if*/
        if((Double) sla[i]==1.3){/*se eu entrei nesse if épq o objeto atual é do tipo double, ent eu faço a conversao explicita pro tipo
            double, pra poder udar as operações q eu quero */
         sla[i]= (double) sla[i] + 1 ; }/*se ele for double, 1 if da true, se na comparação ele for igual a 1.3, o 2 if da true, e eu entro pra executar aq:
         o valor do indice atual é o valor antigo mais 1(tive q fzr cast pq toda vez q eu usar um operador num object, pra nao dar erro
         ele tem q saber explicitamente q é um objeto numerico).
         aqui eu tive que atribuir o valor atual + 1 para a posição desejada, nao podia fazer sla[i]+=1; diretamente pq o tipo do array é object,
         se fosse double ou wrapper dele, ai sim, o array ia me retornar um elemento explicitamente numerico, e ele aceitaria receber diretamente.
         nem convertendo com um cast (double) sla[i] +=1; pq o java nao aceita colocar nada do lado esquerdo que nao seja"puro" como uma variavel
         qualquer ou o proprio sla[i] se fosse double, pq ele é a posição q eu ia atribuir o novo valor, qnd ele ve um (doube) sla[i]+=1;
         ele ve nada mais que uma conversão explicita tentando pegar um valor, e nao uma variavel atribuivel.
         E basicamente nao da pra usar operadores compostos += -= *=... diretamente no cast.*/
        }

       else if(sla[i] instanceof String){/*se o objeto atual for instancia String */
       String arma = (String) sla[i];/*eu faço um cast explicito e armazeno na variavel string o valor atual convertido explicitamente
       pra string(lembra da prioriadade da notação ponto e cast) */

         if(arma.equals("oi")){/*dps eu pego o valor atual convertido pra string e verifico se ele é ou n igual a oi, se for
            ele troca o indice atual q é string, por "tudo bem"" */

         sla[i] = "tudo bem";
       }
       /*coloquei else if pq ao inves do loop tentar executar 2 ifs de forma independente msm se por exemplo, tendo executado o 1 if,
       se ele executar o 1 if ja que é algo de double, ele ia so perder tempo tentando verificar no 2 if(java sempre q ve ifs diferentes tenta executar),
       ent o else garante q qnd a 1 condição(do double la) for executada, ele nao tente verificar se o objeto q deu true pra double é string.  */
    }
   
}
System.out.println(Arrays.toString(sla));
    }
}



/* int[] sovendo = {1, 2, 3, 4, 5};
for(int praver: sovendo){
if(sovendo[praver]> 3){
    System.out.println(sovendo[praver]);
}
} */
/*nao é uma boa pratica usar o foreach pra percorrer coisas com indice, pq como ele percorre elementos
se u fizer como ai em cima, e associar a variavel q percorre elementos ao indice, uma hora vai dar uma exception,
pq ele vai ate o ultimo elemtno(o indice é o tamanho - 1) o ideal se eu quiser percorrer e acessar indices é o for
convencional */