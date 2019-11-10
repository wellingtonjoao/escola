package br.com.controle.util.dao;

import br.com.controle.util.ConexaoUtil;
import br.com.controle.util.modelo.Disciplina;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
*
* @author WJS
*/
public class DisciplinaDAO extends DAOGenerico<Disciplina> {

    public List<Disciplina> listarDisciplinasDisponiveis(long matricula) {
        EntityManager entityManager = ConexaoUtil.getEntityManager();
        String consulta = "SELECT d FROM Disciplina d WHERE d not in (SELECT ds FROM Horario h join h.disciplina ds WHERE h.professor.matricula = :idProfessor)";
        TypedQuery<Disciplina> query = entityManager.createQuery(consulta, Disciplina.class);
        query.setParameter("idProfessor", matricula);
        return query.getResultList();
    }

    public List<Disciplina> listarDisciplinasDisponiveisTurmaProfessor(long matricula, long idTurma) {
        EntityManager entityManager = ConexaoUtil.getEntityManager();
        String consulta = "SELECT d FROM Disciplina d WHERE d not in (SELECT ds FROM Horario h join h.disciplina ds WHERE h.professor.matricula = :idProfessor and h.turma.id=:idTurma)";
        TypedQuery<Disciplina> query = entityManager.createQuery(consulta, Disciplina.class);
        query.setParameter("idProfessor", matricula);
        query.setParameter("idTurma", idTurma);
        return query.getResultList();
    }

    public List<Disciplina> getdDsciplinaTurmaProfessor(long matriculaProfessor, long idTurma) {
        EntityManager em = ConexaoUtil.getEntityManager();
        String consulta = "SELECT d FROM Horario h JOIN h.professor p JOIN h.turma t JOIN h.disciplina d WHERE p.matricula=:matriculaP and t.id=:idTurma";
        TypedQuery<Disciplina> query = em.createQuery(consulta, Disciplina.class);
        query.setParameter("matriculaP", matriculaProfessor);
        query.setParameter("idTurma", idTurma);
        return query.getResultList();
    }

    public List<Disciplina> getdDsciplinaPorTurma(long idTurma) {
        EntityManager em = ConexaoUtil.getEntityManager();
        String consulta = "SELECT  DISTINCT d FROM Horario h JOIN h.professor p JOIN h.turma t JOIN h.disciplina d WHERE t.id=:idTurma";
        TypedQuery<Disciplina> query = em.createQuery(consulta, Disciplina.class);
        query.setParameter("idTurma", idTurma);
        return query.getResultList();
    }

}
