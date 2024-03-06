package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class estruturaDeDados {
    public static void main(String[] args) {
        // Criando uma lista, devemos importar um pacote
        List<String> nomes = new ArrayList<>();
        
        //Adicionar elmentos a lista
        nomes.add("Eduardo");
        nomes.add("Ribamar");
        nomes.add("Bruna");

        // 0 -0
        // 1 - 
        // 2

        // System.out.println(nomes.get(1));

        // for (String nome : nomes){
        //     System.out.println("O nome é: " + nome);
        // };

        nomes.forEach(nome -> System.out.println("O nome é: " + nome));


    }
}
