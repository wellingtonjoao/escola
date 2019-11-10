package br.com.controle.visao.abstractModels;

import br.com.controle.util.modelo.Aluno;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author WJS
 */
public class TabelaAluno extends AbstractTableModel {

	private List<Aluno> alunos = new ArrayList<>();
	private final String colunas[] = {"Matricula", "Nome", "Turma", "Status", "Situação"};

	public TabelaAluno() {

	}

	public void addListaAluno(List<Aluno> alunos) {
		Collections.sort(alunos);
		this.alunos = alunos;
	}

	public void inserirAlunos(List<Aluno> alunos) {
		limparLista();
		if (alunos != null) {
			Collections.sort(alunos);
		}
		this.alunos.addAll(alunos);

	}

	public void addAluno(Aluno aluno) {
		if (alunos == null) {
			alunos = new ArrayList<>();
		}
		this.alunos.add(aluno);
		fireTableRowsInserted(getRowCount(), getRowCount() - 1);
	}

	public Aluno delAluno(int indicde) {
		Aluno aluno = alunos.remove(indicde);
		fireTableRowsDeleted(indicde, indicde);
		return aluno;
	}

	public Aluno getAluno(int index) {
		return alunos.get(index);
	}

	public void limparLista() {
		alunos.clear();
		fireTableDataChanged();
	}

	@Override
	public int getRowCount() {
		return alunos.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Aluno aluno = alunos.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return aluno.getMatricula();
		case 1:
			return aluno.getNome();
		case 2:
			return aluno.getTurma().getDescricao() + " " + aluno.getTurma().getSigla() + " " + aluno.getTurma().getTurno();
		case 3:
			return aluno.getStatus();
		case 4:
			return aluno.getSituacaoAluno();
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
