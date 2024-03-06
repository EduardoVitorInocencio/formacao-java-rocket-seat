package conta;

public class TesteContaBancaria {
    
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumero("1234");

        contaBancaria.setTitular("Jardel");;
        contaBancaria.depositar(100);
        
        contaBancaria.sacar(15);

    }
}
