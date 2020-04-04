
package classes;

public class Curso {
    private String nome;
    private String professor;
    private String tema;
    private float valor;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    public String getProfessor() {
        return professor;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public String getTema() {
        return tema;
    }
    
    public void setValor(float valor) throws Exception {
        if(valor <= 0 && valor > 1000){
            this.valor = valor;
        } else {
            throw new Exception("Valor do curso inválido");
        }
    }
    
    public float getValor() {
        return valor;
    }
}
