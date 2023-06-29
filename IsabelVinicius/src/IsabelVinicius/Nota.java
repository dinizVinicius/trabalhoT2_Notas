package IsabelVinicius;

public class Nota {
    private String nome;
    private double nota;
     private String prontuario;
    
    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object obj) {
        Nota n = (Nota) obj;
        return this.nome.equals(n.getNome());
    }  
}
