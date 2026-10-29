import java.util.List;
import java.util.ArrayList;

public class desafiofuncionarioComum {

    public static void main(String[] args) {
        /*Para esse desafio, eu terei que criar uma lista dentro da outra, tem que ser lista pq matriz
        nao é flexivel como ela */

   List<List<Object>> funcionariosHotel = new ArrayList<>();/*criei uma lista do tipo padrao, e dentro dele eu escolhi que vou
   guardar outras listas e disse que oq as listas internas vao aceitar sao objects no geral
Ok, como minha lista so aceita objetos Lista, eu obrigatoriamente tenho que instanciar listas, que vao ser 
atribuidas na ordem de inserção ao indice 0, indice 1...(tenho que adicionar as sublistas pra grande lista depois)
e tenho q usar a mesma escrita list<object> pq ele aceita todo tipo de objeto(numericos(integer Double) texto(String)), 
eu nao posso so deixar vazio(no set eu posso mas nas listas n).
Quando eu tentei adicionar usando add(indice, elemento) deu errado pq eu tentei adicionar coisas pros indices da sublista 0
que ja tinham elemento. Mas se eu atribuisse cada um para cada sublista usando add(indice, elemento) dava certo, 
contanto q eu tbm n pulasse os indices 0,1,2,3.
*/


//sublista do indice 0 instanciada
List<Object> f1 = new ArrayList<>();
f1.add("Guilherme Sá");
f1.add(26);
f1.add("Segurança");
f1.add(852.30);
//sublista do indice 1 instanciada
List<Object> f2 = new ArrayList<>();
f2.add("Laura Dias");
f2.add(31);
f2.add("Recepção");
f2.add(715.00);
//sublista do indice 2 instanciada
List<Object> f3 = new ArrayList<>();
f3.add("Sônia Lopes");
f3.add(44);
f3.add("Lavanderia");
f3.add(807.90);
//sublista do indice 3 instanciada
List<Object> f4 = new ArrayList<>();
f4.add("Roberto Reis");
f4.add(22);
f4.add("Garagem");
f4.add(475.69);

//adicionei todas as sublistas na lista principal, agora cada indice da lista geral representa uma sublista
funcionariosHotel.add(f1);
funcionariosHotel.add(f2);
funcionariosHotel.add(f3);
funcionariosHotel.add(f4);


System.out.println(funcionariosHotel);
System.out.println();

//alterei o salario da mulher

System.out.println("Salario atual da funcionaria: " + funcionariosHotel.get(1).get(3));/*fui na sublista de indice 1, e peguei o salario atual
pra mostrar o antes */
System.out.println();
funcionariosHotel.get(1).set(3, 950.14);/*usei o set pra substituir o salario da sublista 1 */
System.out.println("Salario aumentado: " + funcionariosHotel.get(1).get(3));/*posso fazer assim, ou chamar a sublista de 1 msm */
System.out.println();
//adicionei um novo funcionario na sublista de garagem
f4.add("Anísio Nunes");
f4.add(38);
f4.add("Garagem");
f4.add(760.00);

System.out.println(funcionariosHotel);


/*OS CASTS QUE FIZ PARA O TIPO PRIMITIVO NUMERICO, FOI APENAS PARA CONVERTER OS ELEMENTOS QUE SAO DOS TIPOS GENERICOS DE OBJETO
DAQUELE INDICE ATUAL PERCORRIDO PELO LOOP, PRA EU PODER USAR AS OPERAÇOES, SEM ELE EU N IA PODER pq object nao aceita 
usar simbolos de operações.
E OS CASTS PRO TIPO STRING FOI PARA PODER ARMAZENAR NA VARIAVEL STRING O VALOR DAQUELE OBJECT(detalhe, no fundo o java
sabe qual é o tipo de cada objeto, por isso foi possivel a conversao) e imprimir dps, sem ele, por ser um object 
generico, ele nao deixa armazenar na string. */

//calculei os 10% a mais nos funcionarios da lavanderia, usei cast para transformar o valor object salario em double
//e poder usar as operações(pq o salario é do tipo double, mas o object meio que disfarça ele e pra eu garantir ao 
//java que ele é um double pra eu usar as operações, eu faço o cast)


double calculoDoAumento = (double) funcionariosHotel.get(2).get(3)* 0.10;/*fui na sublista de indice 2 e
peguei o salario, e multipliquei pela porcentagem 10 */
double salarioaAumentado = (double) funcionariosHotel.get(2).get(3) + calculoDoAumento;/*com o valor do aumento calculado
e armazenado em calculoDoAumento, eu pego essa variavel que so tem o total do aumento, crio uma variavel que vai representar
o salario atual da funcionaria, somado ao aumento(800 + 80 digamos assim, salario e o aumento) */



/*esse loop percorre o tamanho da lista, e entra nas sublistas */
for(int i = 0; i<funcionariosHotel.size(); i++){
        if(funcionariosHotel.get(i).get(2).equals("Lavanderia")){/*se (sublista atual(i))(indice dos setores(2))
           se na sublista atual o setor se igualar a Lavanderia, eu vou na sublista atual que tem lavanderia como setor,
           seleciono o indice 3 q é o indice dos salarios, uso o set para substituir o salario antigo, pelo novo
           ajustado com o aumento de 10% feito com cast la em cima.  */
            funcionariosHotel.get(i).set(3, salarioaAumentado); 
           /* System.out.println(funcionariosHotel.get(i).get(3));vou na sublista atual(i), pego o salario(indice 3), e imprimo
            pra mostrar q o salaario aumentou.*/
        }
    }

System.out.println();
//exibir a idade e o salario do 3 funcionario da lista
System.out.println(f3.get(1));/*idade */
System.out.println(funcionariosHotel.get(2).get(3));/*salario */
System.out.println();


/*tive q fazer um cast pq o operador > nao funciona e objects, apenas
            em int(integer) e outros numeros, e eu so converti o indice 1(idade) de todas as sublistas que tem a idade menor que 30
            pq foi oq eu peguei chamando ele funcionariosHotel.get(i).get(1)*/

/*como o j nao foi preciso pq eu so precisava saber qual
    sublista era(i faz isso) e o indice tinha que ser um especifico pra ser convertido, o loop foi apenas 1.
    e ate pra ser mais rapido, especificar o indice é melhor se tiver uma condição sobre esse indice, mas se fosse
    apenas pra percorrer a lista e as sublistas, ai sim eu tinha q ter o j pq é ele que representaria
    os indices dos elementos de cada sublista*/
//imprimi o nome e o setor de todos os funcionarios q tem a idade menor q 30
for(int i = 0; i<funcionariosHotel.size(); i ++){
        if((Integer)funcionariosHotel.get(i).get(1) < 30){/*se nessa sublista atual(i), a idade(indice 1) for menor que 30 */
            System.out.println("O funcionario que tem idade menor que 30 é: "+ funcionariosHotel.get(i).get(0));/*eu imprimo o nome do funcionario(indice 0) da sublista atual(i)*/
        System.out.println("E seu setor é: " + funcionariosHotel.get(i).get(2));/*e imprimo o setor(indice 2) da sublista atual(i) */
        }
   } 

System.out.println();

//chamei todos os funcionarios so da lavanderia
/*aqui eu tbm nao precisei do j, pq eu podia especificar o indice perguntando se nas subslistas, o indice(2) se iguala
a lavanderia, se se igualar, eu vou imprimir sobre essa condição o >nome< do funcionario dessa sublista atual(i) que tem 
lavanderia como setor(indice 2) */
for(int i = 0; i<funcionariosHotel.size(); i++){
        if(funcionariosHotel.get(i).get(2).equals("Lavanderia")){/*subslista(0).equals to lavanderia?N?
            encremento no for, agora i é um e eu acesso o indice 1 da lista maior, entrando na sublista de indice 1, e verifico
            se o indice 2 dessa sublista 1 é lavanderia(é bem mais rapido especificar o indice pq ele ja usa o equals
            logo no indice 2 de cada sublista, usando o j ele ia verificar cada elemento, mas como o indice 2 é o indice q 
            sempre guarda os setores(menos no caso do ultm funcionario adicionado na garagem), é melhor especificar) */
            System.out.println("Os funcionarios que trabalham no setor da lavanderia são: " + funcionariosHotel.get(i).get(0));
            /*quando o if for true, eu vou imprimir o nome da sublista que tem lavanderia como setor */
        }
    }

System.out.println();

int qntsIdadesnaGaragem = 0; 
int soma = 0;
/*aqui é uma media das idades dos funcionarios que tem no setor garagem */
for(int i = 0; i<funcionariosHotel.size(); i++){
    for(int j = 0; j<funcionariosHotel.get(i).size(); j++){
        /*aqui eu usei o j pelo seguinte fato: existem 2 pessoas na msm sublista, e os indices de setor sao diferentes(2 e 6).
        quando o (i) entra na sublista que tem garagem como setor, ele percorre a sublista e encontra garagem em um indice
        de um dos elementos ai, ai ele entra no if pq a sublista atual e o indice atual deu true pra garagem, como a unica 
        sublista com 2 funcionarios, ou seja, mais indice de elemento, um if ja basta pq assim q se ele encontrar
        uma garagem, ele encontra a outra na msm sublista, ent qnd ele encontra ele vai na sublista atual, pega o valor do indice 1
        que é a idade do 1 funcionario e faz uma atribuição aditiva na variavel soma, dps como ta num if, toda vez que for true
        pra garagem e dps dele fazer a atribuição aditiva da idade do 1 funcionario, ele sempre encrementa +1 na variavel que vai 
        armazenar quantos funcioarios tem no setor garagem, dps o valor do indice 5 que é onde ta a idade do 2 funcionario,
        e soma tbm, e dps encrementa*/
      
      if(funcionariosHotel.get(i).get(j).equals("Garagem")){
         soma += (Integer)funcionariosHotel.get(i).get(1);/*somou a 1 idade que tem da sublista que tem setor garagem */
         qntsIdadesnaGaragem++;/*como ele viu q tem 1 funcionario, encrementou */
         soma += (Integer)funcionariosHotel.get(i).get(5);/*somou a 2 idade que tem da sublista atual(i), q tem setor garagem */
         qntsIdadesnaGaragem++;//encrementou +1 pq encontrou outro funcionario
         /*fiz o cast em cada um pra armazenar o valor daquele indice(q no fundo é da classe integer, por isso deu pra converter
         de objeto generico pra integer) */
        }
     }}

int media = soma / qntsIdadesnaGaragem;/*peguei o total das 2 somas das idades e divide pela quantidade de funcionarios */
        System.out.println("O valor da media é: " + media);

        System.out.println();

//fiz um loop pra pegar da lista e sublistas o maior salario

double maiorSalario = 0;
String mSalario = "";
/*aqui eu fiz o seguinte, pra fazer a comparação eu primeiro tinha que armazenar o 1 salario, como os salarios sao maiores
que 0 eu nao precisei fazer um i==0|| outra condição, ele ja armazenou de cara o 1 salario(indice 3)(q é da sublista atual 0),
e adicionou o nome(indice 0) da sublista atual, qnd ele completou o if ele voltou pro inicio do loop e encrementou 1, agora
o if analisa o salario da sublista 1, esse salario é maior que o armazenado? se for, troca o anterior por esse, se nao, deixa.
e faz isso ate encontrar o maior salario, qnd encontra um salario maior, ele armazena o novo valor do salario(o maior q tem)
e tbm armazena o nome da sublista q tem esse maior salario */
for(int i = 0; i<funcionariosHotel.size(); i++){
        if((Double)funcionariosHotel.get(i).get(3)> maiorSalario){/*se essa sublista tiver o salario maior */
            maiorSalario = (Double) funcionariosHotel.get(i).get(3);/*eu pego o salario dessa msm sublista e adiciono */
            mSalario = (String)funcionariosHotel.get(i).get(0);/*pego o nome dessa mesma sublista e adiciono */
            
        }
    }

System.out.println("Maior salarios é: " + maiorSalario + " da funcionaria: " + mSalario.toUpperCase());
System.out.println();



//aqui eu fiz um loop pra percorrer e pegar so os que ganham mais q 700 e tem a idade menor que 40

int qfuncionario = 0;

for(int i = 0; i < funcionariosHotel.size(); i++){

        if((Double)funcionariosHotel.get(i).get(3) > 700 && (Integer) funcionariosHotel.get(i).get(1)<40){/*se o salario
            do funcionario da sublista atual for maior que 700, e se a idade desse funcionario da sublista atual for menor
            que 40, ent eu encontrei o meu funcionario e encremento 1 na variavel abaixo, pra mostrar q eu encontrei */
             qfuncionario++;
             }
             /*como eu tenho uma sublista que tem um numero de indices a mais, a idade e o salario desse ultimo funcionario
             nao é compativel com as posições padroes(sublista atual(3 salario) e sublista atual(1 idade)).
             eu fiz um else if isolado, pra que quando o if ja nao encontrasse mais(terminasse as verificações de se salario maior
             que 700 e idade menor q 30  dos indices 3(salario) e (idade) de todas as sublistas, como nao sao todas q tem indices a mais
             se eu nao especificasse esse caso ele ia dar erro de limite, pq so essa sublista tem elementos a mais) */
   else if((Double)funcionariosHotel.get(3).get(7) > 700 && (Integer) funcionariosHotel.get(3).get(5)<40){
           qfuncionario++;/*e tambem se voce nao encontrar mais salarios(3)>700 e idades(1)<40, eu entro no else if e verifico
           se o funcionario da sublista 3, tem o salario q ta no indice 7 maior q 700, e se nessa msm sublista 3, esse funcionario
           tbm tem a idade menor q 40, se for true, ent eu encontrei mais 1 e encremento tbm. */
          break;/*tive q colocar break aqui, pq quando o if nao fosse mais true e ele entrasse aqui, como é um loop
          ele voltaria no loop pra tentar dnv, como aqui seria a ultima situação o break me livra de dar algum erro
          por conta do loop */
   }
    
    }

System.out.println("A quantidade de funcionarios que ganham mais q 700 e tem a idade menor que 40: "+ qfuncionario);

System.out.println();
/*esse loop é pra descobrir o mais velho dos funcionarios, e printar o setor dele */

int funcionariovelho = 0;
String setorVELHO ="";
/*como todas as idades sao maiores q 0, eu tbm n precisei usar o i==0.
e dnv tive que fazer o cast pra poder fazer operações de comparação */
for(int i = 0; i < funcionariosHotel.size(); i++){
        if((Integer) funcionariosHotel.get(i).get(1) > funcionariovelho){/*a idade do funcionario da sublista atual é maior que
            o valor guardado na variavel funcionariovelho? se sim, adiciono a idade(1) do funcionario da sublista atual */
            funcionariovelho = (Integer) funcionariosHotel.get(i).get(1);/*e dps adiciono na variavel de string
            o nome do setor(2) dessa sublista atual, se na proxima rodada a idade for maior, eu substituo a idade e o setor guardados
            pela idade e setor dessa sublista atual q tem a idade maior */
            setorVELHO = (String) funcionariosHotel.get(i).get(2);
        }
        /* esse else if é pra exceção do funcionario q tem os indices diferentes dos indices colocados numa ordem padrao*/
      else if((Integer) funcionariosHotel.get(3).get(5) > funcionariovelho){/*quando ele termina de verificar as idades(1)
        das sublistas, ele vai pra ca e verifica se a idade(5) da sublista 3 é maior que a guardada. */
            funcionariovelho = (Integer) funcionariosHotel.get(3).get(5);
             setorVELHO = (String) funcionariosHotel.get(3).get(2);
        }
    }

System.out.println("O mais velho da equipe é do setor: "+ setorVELHO + " e tem " + funcionariovelho + " anos");



double somaSalarial = 0;
int qntddSalarios = 0;
/*aqui eu calculei a media do salario da empresa(tanto faz eu colocar != ou >, ja que sempre o salario vai ser maior e diferente
de 0, dava no msm) */
for(int i = 0; i < funcionariosHotel.size(); i ++){
        if((Double)funcionariosHotel.get(i).get(3) != 0){/*se o salario da sublista atual for diferente de 0 */
            somaSalarial+=(Double)funcionariosHotel.get(i).get(3);/*eu pego o salario(3) da sublista atual(i) e
            faço uma atribuição aditiva na somaSalarial*/
            qntddSalarios++;}/*se eu somar 1 salario À variavel somaSalarial, eu obrigatoriamente encremento 1 na 
            variavel q conta a quantidade de salarios */
        else if((Double)funcionariosHotel.get(3).get(7) != 0){/*esse foi pra exceção, qnd o if nao pegar mais
            nenhum salario dos indices 3 q é o indice padrao do salario nas sublistas, o if vai ser falso ent ele entra no
            else if, entra na sublista 3 e ve se o salario dele(7) é diferente de 0, como é, ele pega o salario dele
            e faz uma atribuição aditiva na variavel q ja somou os salarios anteriores(de indice 3)
            e obrigatoriamente encrementa 1 na quantidade de salarios*/
            somaSalarial+=(Double)funcionariosHotel.get(3).get(7);
            qntddSalarios++;
    }
        
}
      double totalmedia =  somaSalarial / qntddSalarios;/*aqui eu peguei o total da soma dos salarios, e dividi pela quantidade 
      de salarios */
      System.out.println("Media salarial da empresa: " + totalmedia);


      /*esse aqui é pra descobrir quais funcionarios ganham mais q a media salarial */
    List<String> quemGanhaMais = new ArrayList<>();/*criei uma lista pra colocar todos os funcionarios q ganham acima da media */

    for(int i = 0; i< funcionariosHotel.size(); i++){

            if((Double)funcionariosHotel.get(i).get(3) > totalmedia){/*se o salario(3) desse funcionario, da sublista atual 
         for maior que a media, eu adiciono na lista quemGanhaMais o nome(indice 0) desse funcionario, dessa sublista atual(i)
         se nessa sublista atual, o salario(3) do funcionario for maior q a media, eu entro no if, e adiciono o
         nome(0) desse funcionario, e dessa mesma sublista atual(i) que o if verificou e concordou q o salario desse funcionario
         dessa sublista é maior que a media, adiciono o nome(0) na lista. Dps de fazer isso, ele volta pro inicio do loop
         encrementa +1, verifica se na sublista atual(q agr é 1) o salario do funcionario é maior q a media, se for
         ele entra no if, adiciona o nome dele na lista e roda o loop dnv, se n for ele ignora o if, testa o else(como ele
         sempre vai ser falso, ele ignora tbm), e dps encrementa */

            quemGanhaMais.add((String) funcionariosHotel.get(i).get(0));/*fiz a converão pro java saber
            que os nomes sao do tipo string, e poderem ser armazenadas na lista que so armazena string */

            System.out.println("Os funcionarios que ganham mais são: " + quemGanhaMais);
            }
           else if((Double)funcionariosHotel.get(3).get(7)> totalmedia){/*esse nem precisava, fiz so por precaução
            pq o ultimo nao ganha mais q a media */

                 quemGanhaMais.add((String) funcionariosHotel.get(3).get(4)) ;

            System.out.println("Os funcionarios que ganham mais são: "+ quemGanhaMais);
             }
        
 }            
            
}
       
    
}
    
