import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class desafioMap {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("maçã", 10);
        estoque.put("banana", 5);
        estoque.put("laranja", 0);
        estoque.put("uva", 12);
        estoque.put("pera", 3);
        /* estoque.values().removeIf(v -> v==0); aq o remove percorre so os valores, e se o valor atual for
        igual a 0, ele apaga a chave e o valor.*/

        for(Entry<String, Integer> ver:estoque.entrySet()){//aqui eu peguei o par inteiro de chave e valor
            /*o ver vai percorrer todo o dicionario, pegando cada par de chave e valor, se eu chamo um ver.getValue(), ele pega
            o valor q é relacionado a uma chave, do par de chave e valor atual */
            if(ver.getValue()==0){/*se o valor da chave, do par de chaves atual == 0 */
                estoque.remove(ver.getKey());/*removo a chave(valor vai junto) do par de chaves atual */
            }
            else if(ver.getValue()<=5){/*Basicamente, o ver guarda na memoria dele os par de chave e valores, eu retirei a laranja apenas do meu Map, mas o >ver< 
            ainda esta com ele guardado. Se eu colocar um if ao inves de else if, como if e if sao 2 condições diferentes e nao condicoes interligadas(se isso acontecer, 
            execute(if), se aquilo(if de cima) nao acontecer, execute isso(else if)), ele vai nos 2 ifs msm se a condição de cima for executada, 
            se fosse if e else if ele so ignoraria o else dps de excluir a laranja, 
            mas como o if e if são independentes ele vai verificar: " esse valor desse par atual q o for ta percorrendo, é menor ou igual a 5?" Como o >ver< que pega os
            par de chave e valor nesse caso, tem o valor(0) da 
chave atual(laranja) ainda nele armazenada(pq depois de excluir a laranja, ele vai pro proximo if ainda representando A LARANJA, ele nao rodou dnv e pegou o outro elemento
pq tem outro if pra ele verificar) e o map nao tem mais pq removeu no if 
            de cima, ele vai no put e recoloca a laranja mas agora com + 10. Se fosse else, como é o caso, dps dele executar o primeiro if q excloi a chave q tem o valor igual 
            a zero, ele pula o else pq ja executou uma condicao, o if(if e else if sao interligados), mas como if e if são independentes, ele vai tentar executar os 2!
          
            RESUMINDO: Se eu tenho 2 ou mais ifs, o loop SEMPRE vai tentar verificar se a condição imposta é true MESMO dps de ter executado algum dos ifs, mas se tiver 
            if e else if, e ele executar algum if, o else é ignorado.
            if + if = "Cheque TUDO, sem exceção." if + else = "Passou no teste do if? PARE e ignore o resto." */
                estoque.put(ver.getKey(), ver.getValue()+10);
            }
        }
       
        System.out.println(estoque);

        Map<String, Double> reajuste = new HashMap<>();
        reajuste.put("Notebook", 3500.0);
        reajuste.put("Mouse", 80.0);
        reajuste.put("Teclado", 150.0);
        reajuste.put("Monitor", 900.0);


        for(String chaveATUAL: reajuste.keySet()){//esse eu peguei so as chaves
            if(reajuste.get(chaveATUAL)>100.0){/*se o valor associado a essa chave atual dentro de reajuste
                 for maior que 100(o get() pega o valor da chave colocada dentro do ()) */
                double desconto = reajuste.get(chaveATUAL)*0.10;/*como o if pega a o valor da chave atual, o desconto tb pega(isso so ocorre se o if for truee)
                eu vou multiplicar o valor da chave atual q ta dentro de reajuste
                por 0.10, e vou atribuir a variavel(n posso fzr
                a conta de uma vez) */
              reajuste.put(chaveATUAL, reajuste.get(chaveATUAL)-desconto);/*agora que a variavel desconto sempre pega o valor da chave atual que o for ta percorrendo
              dentro de reajuste e que é maior que 100
              e multiplica por 0.10, eu so preciso pegar o valor original da chave atual e diminuir pelo desconto 
              reajuste.put(chaveATUAL(é a chave que tem o valor associado a ele maior q 100), reajuste.get(chaveATUAL(esse metodo pegou o valor em si))-desconto);*/
            }
            System.out.println("Produto: " + chaveATUAL + " | Preço: " + reajuste.get(chaveATUAL));/*imprimi a chave atual e o valor da chave atual ja com o 
            desconto aplicado */
        }


        }
            }
            
        
    
