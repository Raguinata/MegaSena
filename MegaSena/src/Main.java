import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        int contagemJogo = 1;
        int qtdJogos = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a " +
        "quantidade de jogos que você deseja fazer"));

        int numerosPorJogo = 0;

        for (int i = 0; i < qtdJogos; i++) {
            numerosPorJogo = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Quantos números você deseja colocar no " + (i+1) + "º jogo?"));
            Resultado.resultado(numerosPorJogo, qtdJogos, contagemJogo);
            contagemJogo++;
        }
    }
}
