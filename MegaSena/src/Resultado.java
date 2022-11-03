import javax.swing.JOptionPane;

public class Resultado {

    public static void resultado(int numeroPorJogo, int qtdJogos, int contagemJogo) {
        int[] jogoUsuario = SorteioUsuario.sorteioUsuario(numeroPorJogo, qtdJogos, contagemJogo);
        int[] jogoMaquina = SorteioMaquina.sorteioMaquina();
        int numerosIguais = 0;

        for (int i = 0; i < numeroPorJogo; i++) {
            for (int j = 0; j < 6; j++) {
                if (jogoUsuario[i] == jogoMaquina[j]) {
                    numerosIguais++;
                }
            }
        }

        if (numerosIguais == 0) {
            JOptionPane.showMessageDialog(null, "Que pena :( você não acertou nenhum número");
        }

        else if (numerosIguais > 0 && numerosIguais < 4) {
            JOptionPane.showMessageDialog(null,
                    "Parabéns você acertou " + numerosIguais + " número(s) mais sorte na proxima");
        }

        else if (numerosIguais == 4) {
            JOptionPane.showMessageDialog(null, "Parabéns você acertou 4 números e acabou de ganhar R$700,00 REAIS!!!");
        }

        else if (numerosIguais == 5) {
            JOptionPane.showMessageDialog(null,
                    "Parabéns você acertou 5 números e acabou de ganhar R$7.000,00 REAIS!!!");
        }

        else if (numerosIguais == 6) {
            JOptionPane.showMessageDialog(null, "YOU ARE THE BEST, Você acabou de faturar 28 Milhões" +
                    " MEUS PARABÉNSSSSS!!! você acertou 6 números no total");
        }
    }
}
