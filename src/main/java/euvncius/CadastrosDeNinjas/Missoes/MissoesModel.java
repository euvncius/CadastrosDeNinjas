package euvncius.CadastrosDeNinjas.Missoes;

import euvncius.CadastrosDeNinjas.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;
import org.hibernate.boot.model.relational.internal.SqlStringGenerationContextImpl;

import java.util.List;

@Entity
@Table(name="tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldade;

    // uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}

