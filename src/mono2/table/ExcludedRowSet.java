package mono2.table;

import java.util.Set;
import java.util.TreeSet;

public class ExcludedRowSet {
	private TreeSet<Integer> excludedSet;
	
	public ExcludedRowSet() {
		this.excludedSet = new TreeSet<Integer>();
	}

	public Set<Integer> getExcludedSet() {
		return excludedSet;
	}

	public void setExcludedSet(TreeSet<Integer> excludedSet) {
		this.excludedSet = excludedSet;
	}
	
	public void addExcludedItem(Integer item) {
		this.excludedSet.add(item);
	}
}
