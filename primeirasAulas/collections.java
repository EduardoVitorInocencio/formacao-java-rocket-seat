package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class collections {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Dani",10);
        notas.put("Eduardo", 10);
        notas.put("Julia", 100);

        // var nota = notas.get("Eduardo");

        // System.out.println(nota);

        for(Map.Entry<String, Integer> entry: notas.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
 }

    }
    
}
