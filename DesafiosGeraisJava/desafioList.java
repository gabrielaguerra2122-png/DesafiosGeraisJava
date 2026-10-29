import java.util.ArrayList;
import java.util.List;

public class desafioList {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Açúcar");
        produtos.add("Café");
        produtos.add("Farinha");
        System.out.println(produtos);

        for( int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).startsWith("A")){
                produtos.remove(i);
            }
        }
        System.out.println(produtos);

        /*se fosse object, eu teria que fazer um cast antes e atribuir a uma variavel, pq se eu tentasse converter
        na hora da operação, nao daria certo, pq quando eu chamo um metodo atraves da notação ponto(.sla)
        a notação ponto tem uma prioridade/precedencia de resolver mais urgente q o cast.
        ent se eu tentasse fazer o (CAST) ao msm tempo q chamo um metodo, seria como chamar o metodo sem fazer o cast.
        mas dessa vez ai, eu criei uma variavel String, e pra nao dar erro caso viesse um tipo de objeto diferente de string(oq pode acontecer) e eu tentasse
        converter pra string, eu coloquei o if instance of, pra nao lançar uma exceção caso viesse um double e eu logo de cara tentasse converter.
         fiz o cast do elemento atual pra string(como ta no if, so vai fazer o cast se o if ver q o object atual é do tipo string), 
         e atribui esse elemento atual que o for ta, ja convertido pra variavel, como eu uso o instanceOf, ele so vai  */
 
   /*    List<Object> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Açúcar");
        produtos.add("Café");
        produtos.add("Farinha");
        System.out.println(produtos);
        
        for( int i = 0; i < produtos.size(); i++){
        if(produtos.get(i) instanceOf String){se o objeto atual for um objeto string
            String atual = (String)produtos.get(i); eu faço um cast e atribuo esse objeto atual convertido pra uma variavel
            if(atual.startsWith("A")){ e verifico se o objeto atual convertido armazenado na variavel contem A como prefixo
                produtos.remove(i);
            }
        }
    }
        System.out.println(produtos);

 */
 List<Double> notas = new ArrayList<>();
notas.add(5.5);
notas.add(8.0);
notas.add(4.0);
notas.add(9.5);
notas.add(7.0);
notas.add(3.5);

double soma = 0;
int qnts = 0;

for(int i = 0; i < notas.size(); i++){

    if(notas.get(i) >= 7.0){
        soma+= notas.get(i);
        qnts++;
    }
}
System.out.println(soma / qnts);

/*Nesse caso eu n precisei atribuir.. a operação foi feita numa boa pq a precedencia de urgencia dos operadores nao é maior que
o (CAST), ent ele le o cast primeiro, ve q o elemento atual é um double e faz a comparação */
 
/*List<Object> notas = new ArrayList<>();
notas.add(5.5);
notas.add(8.0);
notas.add(4.0);
notas.add(9.5);
notas.add(7.0);
notas.add(3.5);

double soma = 0;
int qnts = 0;

for(int i = 0; i < notas.size(); i++){

    if((Double) notas.get(i) >= 7.0){
        soma+= (Double) notas.get(i);
        qnts++;
    }
}
System.out.println(soma / qnts);
*/
        }
}
