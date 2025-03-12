package euvncius.CadastrosDeNinjas.Ninjas.Controller;

import jakarta.persistence.*;

//Entity ele transforma uma classe comum em uma entidade do DB
// JPA = Java Persistence API
@Entity
@Table(name="tb_cadastro") //tb de tabela
public class NinjaModel {

    @Id //para falar que a primeira variavel é com quem ele vai trabalhar
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para dar referencia do numero que ele vai começar, uma estrategia
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne = um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //chave extrangeira (Foreing Key)
    private MissoesModel missoes;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}