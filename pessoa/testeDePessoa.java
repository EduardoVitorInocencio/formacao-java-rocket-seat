package pessoa;

/**
 * testeDePessoa
 */
public class testeDePessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "333333333";
        pessoa1.idade = 45;
        pessoa1.nome = "Florisponfildo";
        System.out.println(pessoa1.cpf);

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "35694944";
        pessoa2.idade = 47;
        pessoa2.nome = "Rosinha";
        System.out.println(pessoa2.cpf);

        System.out.println(pessoa2.imprimirDadosDaPessoa(10));
    }
}