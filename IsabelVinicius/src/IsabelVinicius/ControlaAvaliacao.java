package IsabelVinicius;

import java.util.ArrayList;
import java.util.List;

public class ControlaAvaliacao {

    private List<Avaliacao> listaAvaliacao;

    public ControlaAvaliacao() {
        this.listaAvaliacao = new ArrayList();
    }

    public void adicionar(Avaliacao a) {
        this.listaAvaliacao.add(a);
    }

    public List<Avaliacao> getAvaliacao() {
        return this.listaAvaliacao;
    }

    public double getNotaTotalAvaliacao() {
        double totalAvaliacao = 0;
        double mediaTotal = 0;
        int x = 0;
        for (Avaliacao a : listaAvaliacao) {
            totalAvaliacao += a.getMediaTotal();
            x++;
        }
        mediaTotal = totalAvaliacao/x;
        return mediaTotal;
    }

    public double getMediaTotalPorFormaAvaliacao(String formaAvaliacao) {
        //retornar o valor total em vendas das vendas pagar em "formPagamento"
        double totalNota = 0;
        double mediaTotal=0;
        int q = 0;
        for (Avaliacao a : listaAvaliacao) {
            if (a.getformaAvaliacao().equals(formaAvaliacao)) {
                totalNota += a.getMediaTotal();
                q++;
            }
        }
        mediaTotal = totalNota/q;
        return mediaTotal;
    }
}
