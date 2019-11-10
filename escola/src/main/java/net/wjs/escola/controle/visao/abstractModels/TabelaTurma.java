package br.com.controle.visao.abstractModels;

import br.com.controle.util.modelo.Turma;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
*
* @author WJS
*/
public class TabelaTurma extends AbstractTableModel {

    private final List<Turma> turmas = new ArrayList<>();
    private final String colunas[] = {"Id", "Turma", "Turno", "Ano"};

    public TabelaTurma() {
    }

    public void inserirTurmas(List<Turma> turmas) {
        limparLista();
        this.turmas.addAll(turmas);
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
        fireTableRowsInserted(getRowCount(), getRowCount() - 1);
    }

    public Long delTurma(int indicde) {
        Turma turma = turmas.remove(indicde);
        fireTableRowsDeleted(indicde, indicde);
        return turma.getId();
    }

    public void limparLista() {
        turmas.clear();
        fireTableDataChanged();

    }

    @Override
    public int getRowCount() {
        return turmas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return turmas.get(rowIndex).getId();
            case 1:
                return turmas.get(rowIndex).getDescricao() + " " + turmas.get(rowIndex).getSigla();
            case 2:
                return turmas.get(rowIndex).getTurno();
            case 3:
                return turmas.get(rowIndex).getAno();
            default:
                return null;
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}
