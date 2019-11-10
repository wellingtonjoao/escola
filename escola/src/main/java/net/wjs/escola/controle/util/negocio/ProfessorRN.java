package br.com.controle.util.negocio;

import br.com.controle.util.ConexaoUtil;
import br.com.controle.util.dao.ProfessorDAO;
import br.com.controle.util.modelo.Professor;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author WJS
*/
public class ProfessorRN implements GenericoRN<Professor> {

    ProfessorDAO professorDAO;

    @Override
    public boolean salvar(Professor professor) {
        professorDAO = new ProfessorDAO();
        try {
            if (professor.equals(professorDAO.buscarPorId(professor.getMatricula()))) {
                return professorDAO.atualizar(professor);
            } else {
                return professorDAO.salvar(professor);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProfessorRN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean remover(Long id) {
        professorDAO = new ProfessorDAO();
        return professorDAO.remover(id);

    }

    @Override
    public Professor buscarPorId(Long id) {
          professorDAO = new ProfessorDAO();
        return professorDAO.buscarPorId(id);
    }

    public Professor buscarPorId(String id) {
        EntityManager em = ConexaoUtil.getEntityManager();
        return em.find(Professor.class, id);
    }

    @Override
    public List<Professor> buscarTodos() {
        professorDAO = new ProfessorDAO();
        return professorDAO.buscarTodos();
    }

}
