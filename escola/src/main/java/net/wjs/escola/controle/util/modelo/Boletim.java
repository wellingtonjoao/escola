package br.com.controle.util.modelo;

import javax.persistence.*;
import java.io.Serializable;

/**
*
* @author WJS
*/
@Entity
public class Boletim implements BeanBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAluno")
    private Aluno aluno;
    
    private long provaRecuperacao;
    private long notaFiinal;
    private long mediaGlobal;
    private long notalTotal;
    private String situacao;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public long getProvaRecuperacao() {
        return provaRecuperacao;
    }

    public void setProvaRecuperacao(long provaRecuperacao) {
        this.provaRecuperacao = provaRecuperacao;
    }

    public long getNotaFiinal() {
        return notaFiinal;
    }

    public void setNotaFiinal(long notaFiinal) {
        this.notaFiinal = notaFiinal;
    }

    public long getMediaGlobal() {
        return mediaGlobal;
    }

    public void setMediaGlobal(long mediaGlobal) {
        this.mediaGlobal = mediaGlobal;
    }

    public long getNotalTotal() {
        return notalTotal;
    }

    public void setNotalTotal(long notalTotal) {
        this.notalTotal = notalTotal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public long getId() {
        return id;
    }

}
