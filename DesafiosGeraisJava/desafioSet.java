import java.util.HashSet;
import java.util.Set;

public class desafioSet {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");
        nomes.add("Joao");
        nomes.add("Amanda");
        nomes.add("Bruno");
   System.out.println(nomes);   

   nomes.removeIf(n-> n.startsWith("A"));/*metodo do lambda
   removeIf percorre o set todo, para cada item que eu pegar eu vou chamar temporariamente de n.
   -> significa "oq eu faço com esse n?".
   n.startswith(...)? true? removo.
   basicamente o removeIf passa pelo conjunto todo verificando elemento por elemento se a condição q eu impus
   é verdadeira pra poder enfim executar o remove */
   System.out.println(nomes);        
   
  /*eu nao posso modificar nada em uma coleção usando o foreach(usando os metodos do tipo do elemento)
  eu so posso imprimir, fazer calculos, verifiricar condições, mandar o valor pra outra variavel(tipo
  adicionando elementos q começam com A em uma nova lista).
  Nao posso usar metodos como add(); remove(); entre outros enquanto o foreach tiver percorrendo a lista */

  Set<Integer> numeros = new HashSet<>();
  numeros.add(2);
  numeros.add(5);
  numeros.add(8);
  numeros.add(11);
  numeros.add(14);
  numeros.add(17);
  numeros.add(20);
    System.out.println(numeros);
  numeros.removeIf(num-> num % 2 == 1);/*removeIf vai verificar cada numero de numeros, se o elementoatual(num) dividido por 2 restar 1, eu removo */
    System.out.println(numeros);

  Set<Integer> numero1 = new HashSet<>();

  for(Integer nums: numeros){
    numero1.add(nums*2);/*basicamente so pra reforçar oq foi dito, eu nao posso modificar nada em uma cleção usando foreach, se eu quiser mudar valores
    como esse caso, eu posso atribuir esses valores modificados a um novo conjunto, mas nunca modificar alguma coleção diretamente pelo foreach, ele é usado apenas
    para percorrer e tals, nao é o caso do for convencional onde eu modifico e faço de tudo em coleções onde tem INDICE. 
    ou seja, NAO DA PRA MODIFICAR UMA COLLECTION JA CRAIDA USANDO FOREACH(so faz calculos, somas e verifica coisas dependendo do q se pede), 
    OU EU USO OUTRA COLLECTION PRA ADICIONAR VALORES MODIFICADOS OU O FOR CONVENCIONAL
    PARA OS Q TEM INDICE*/
  System.out.println(numero1);

       
    }
}

   }
