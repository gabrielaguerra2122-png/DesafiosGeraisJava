import java.util.ArrayList;
import java.util.List;

public class GerenciamentoHotel {
    public static void main(String[] args) {
        List<Funcionarios> cadastro = new ArrayList<>();
        Funcionarios f1 = new Funcionarios("Jonas Silva", 1, 26, 852.3, "Segurança");
        Funcionarios f2 = new Funcionarios("Beatriz Lima", 2, 31, 715.0, "Recepção");
        Funcionarios f3 = new Funcionarios("Carla Souza", 3, 44, 807.9, "Lavanderia");
        Funcionarios f4 = new Funcionarios("Lucas Mendes", 4, 22, 475.69, "Garagem");
    cadastro.add(f1);
    cadastro.add(f2);
    cadastro.add(f3);
    cadastro.add(f4);

    for(int i = 0; i < cadastro.size(); i++){
        if(cadastro.get(i).nome.equals("Beatriz Lima")){
            cadastro.get(i).salario = 950.14;
        }
    }
    System.out.println(cadastro.get(1));

    Funcionarios f5 = new Funcionarios("Eduardo Rocha", 5, 38, 760.00, "Garagem");
    cadastro.add(f5);

    for(int i = 0; i < cadastro.size(); i++){
        if(cadastro.get(i).setor.equals("Lavanderia")){
           double aumento = cadastro.get(i).salario *= 0.10;
            cadastro.get(i).salario += aumento;
        }
    }
    System.out.println(cadastro.get(2));

    System.out.println(cadastro.get(2).nome);
    System.out.println(cadastro.get(2).idade);

    List<String> agrupando = new ArrayList<>();
    for(int i = 0; i < cadastro.size(); i++){
        if(cadastro.get(i).idade<30){
            agrupando.add(cadastro.get(i).nome);
            agrupando.add(cadastro.get(i).setor);
        }
    }
    System.out.println(agrupando);
    int mediaIdadeGaragem = 0;
    int contador = 0;
    for(int i = 0; i < cadastro.size(); i++){
        if(cadastro.get(i).setor.equals("Garagem")){
          mediaIdadeGaragem +=  cadastro.get(i).idade;
          ++contador;

        }
    }
    System.out.println("A media das idades dos funcionarios que trabalham no setor de garagem é: " + mediaIdadeGaragem / contador);
int contador2 = 0;
    for(int i = 0; i < cadastro.size(); i++){
        if(cadastro.get(i).salario>700 && cadastro.get(i).idade<40){
            ++contador2;
        }
    }
    System.out.println("Os funcionarios que tem menos de 40 anos e ganham mais que 700: " + contador2);
 double somaSalarial = 0;
 int contador3 = 0;
    for(int i = 0; i < cadastro.size(); i++){
        if(cadastro.get(i).salario > 0){
            somaSalarial += cadastro.get(i).salario;
            ++contador3;
        }
    }
    double mediaSalarial = somaSalarial / contador3;
    System.out.println("A media salarial do hotel é: " + mediaSalarial);

    List<String> fGanhamAcimaMedia = new ArrayList<>();
    for(int i = 0; i < cadastro.size(); i++){
        if(cadastro.get(i).salario>mediaSalarial){
            fGanhamAcimaMedia.add(cadastro.get(i).nome);
        }
    }
    System.out.println(fGanhamAcimaMedia + "-> Ganham acima da media salarial");
    }
}
