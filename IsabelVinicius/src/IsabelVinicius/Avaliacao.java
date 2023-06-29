package IsabelVinicius;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
    private String dataAvaliacao;
    private String formaAvaliacao;
    private double mediaTotal = 0;
    private List<Nota> listaNota;
    
    
    public Avaliacao(){
        this.listaNota = new ArrayList();
    }

    public String getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setdataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public String getformaAvaliacao() {
        return formaAvaliacao;
    }

    public void setformaAvaliacao(String formaAvaliacao) {
        this.formaAvaliacao = formaAvaliacao;
    }

    public double getMediaTotal() {
        return mediaTotal;
    }

    public List<Nota> getListaNota() {
        return listaNota;
    }
    
    public void addAvaliacao(Nota n){
    this.listaNota.add(n);
    this.calcularMediaTotal();
    }
    
    public void excluirAvaliacao(Nota n){
        this.listaNota.remove(n);
        this.calcularMediaTotal();
    }
    
    private void calcularMediaTotal(){
        //percorre todos os produtos da lista e calcula o valor total com base no valor e quant.
        this.mediaTotal = 0;
         double valorNotaAtual = 0;
         int q = 0;
        for(Nota n : this.listaNota){
            valorNotaAtual += n.getNota();
            q++;
        }
        this.mediaTotal = valorNotaAtual/q;
    }
    public String getAvaliacao(){
        //recebe a venda e retorna os produtos dessa venda formatados em texto
        String avalicao = "";
        for(Nota n : this.listaNota){
            avalicao += n.getNome() + " - " + n.getNota() + "  " + " \n ";
        }
        
        return avalicao;
    }
}
    

