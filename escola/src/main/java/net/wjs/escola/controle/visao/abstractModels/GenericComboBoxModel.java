package br.com.controle.visao.abstractModels;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WJS
 * @param <T>
 */
public class GenericComboBoxModel<T> extends AbstractListModel implements ComboBoxModel {

	private Object selectedItem;
	private final ArrayList<T> listaGenerica;

	public GenericComboBoxModel(ArrayList<T> arrayList) {
		listaGenerica = arrayList;
	}

	public GenericComboBoxModel(List<T> arrayList) {
		listaGenerica = (ArrayList<T>) arrayList;
	}

	@Override
	public Object getSelectedItem() {
		return selectedItem;
	}

	@Override
	public void setSelectedItem(Object newValue) {
		fireContentsChanged(newValue, 0, listaGenerica.size());
		selectedItem = newValue;
	}

	@Override
	public int getSize() {
		return listaGenerica.size();
	}

	@Override
	public Object getElementAt(int i) {
		return listaGenerica.get(i).toString();
	}

	public T get(int selectedIndex) {
		return listaGenerica.get(selectedIndex);
	}

	public void clear() {
		listaGenerica.clear();
		fireIntervalRemoved(this, 0, listaGenerica.size());

	}

	public void removerIndex(int index) {
		listaGenerica.remove(index);
		fireIntervalRemoved(this, index, index);

	}

}
