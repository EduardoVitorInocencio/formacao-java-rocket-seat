package pessoa;


public class Pessoa {
    //nome, idade, CPF
    //tipo nomeDaVariavel

    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(int indice){

        return "O nome da pessoa é " + nome + " com idade de " + idade + " sob o CPF: " + cpf
                + "e o índice é " + indice;
    }
}
