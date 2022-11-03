import javax.swing.JOptionPane;

public class SorteioUsuario {

    public static int [] sorteioUsuario(int numeroPorJogo, int qtdjogos, int contagemJogo) {
        boolean repetiu = false;
        int jogoUsuario[] = new int[numeroPorJogo];

        for (int i = 0; i < numeroPorJogo; i++) {

            do {
                repetiu = false;
                jogoUsuario[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual vai ser o " + (i + 1) + "º número do " +
                contagemJogo + "º jogo"));
                for (int j = 0; j < numeroPorJogo; j++) {
                    if (jogoUsuario[i] == jogoUsuario[j] && i != j) {
                        repetiu = true;
                        JOptionPane.showMessageDialog(null, "ERRO! Não pode inserir um número repetido", null,
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            } while (repetiu == true);
        }
        return jogoUsuario;
}
}
