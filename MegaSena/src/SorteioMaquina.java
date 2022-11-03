import java.util.ArrayList;
import java.util.Collections;

public class SorteioMaquina {

    public static int[] sorteioMaquina () { 
        int jogoMaquina[] = new int [6];
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i < 61; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros);

        for (int i = 0; i < 6; i++) {
            jogoMaquina[i] = numeros.get(i);
        }
        return jogoMaquina;
    }
}
