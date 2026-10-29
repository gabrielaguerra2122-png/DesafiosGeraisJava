import java.util.Objects;

public class Funcionarios {
    String nome;
    int ID;//so pro equals e hash
    int idade;
    double salario;
    String setor;

    @Override
    public boolean equals(Object obj) {/*qnd eu passo um obj como parametro, o metodo faz uma copia da referencia automaticamente
        eu nao preciso atribuir essa copia pra uma variavel, eu atribui nesse caso pq eu converti ele(CAST) */
        if(obj instanceof Funcionarios){/*se o obj passado no parametro for um obj de Funcionarios*/
        Funcionarios f1 = (Funcionarios) obj;/*eu faço um cast e atribuo a copia dessa referencia desse objeto passado por parametro
         e que agora foi convertido explicitamente pra funcionarios e atribuido para a variavel Funcionarios apenas pq qnd é um object,
        eu tenho que fazer o cast pro java entender q ele é um Funcionario e agora tenho acesso aos atributos dele e atribuir 
        ele, e seus atributos ja com valores e ja convertido pra uma variavel do tipo Funcionarios*/
         /*se o nome do obj q chamou o equals for igual ao nome do objeto passado
            por parametro, e se o ID do obj q chamo o equals for igual ao ID do obj passado por parametro, ele dara TRUE(vai ser igual). */
            boolean iguais = this.nome.equals(f1.nome) && this.ID == f1.ID;/*se for igual eu atribuo pra uma variavel boolean
            q vai guardar o valor TRUE, MAS se forem diferentes a variavel boolean retorna false(ele vai guardar o resultado
            da operação de igualdade q eu defini) */
            return iguais;//retorna a variavel com o valor da operação
            } 
       
            return false;/*se o obj passado por parametro n for um funcionario, ele retorna logo falso(fiz isso pra nao dar erro
        caso o cast tentasse converter algo q nao é obj funcionario em obj funcionario) */ }
    

    Funcionarios(String nome, int ID, int idade, double salario, String setor){
        this.nome = nome;/*usando o this eu to dizendo que, ao colocar os valores de cada coisa pedida nos parametros
        eu to atribuindo esses valores ao objeto que eu acabei de instanciar, this se refere ao proprio
        objeto acabado de ser criado */
        this.ID = ID;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
    }
    @Override
    public int hashCode() {
        
        return Objects.hash(nome, ID);
    }
    @Override
    public String toString() {
        
        return String.format("[%s / %d / %d / %f / %s]", nome, ID, idade, salario, setor);
    }
}
