package ListaDeChamada;

public abstract class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String email, String nome){
        this.email = email;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
