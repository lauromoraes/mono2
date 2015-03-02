package mono2.table;

import java.util.HashSet;
import java.util.Set;

public class TableTT {
	private HashSet<Integer> excludedSet;
	
	public TableTT() {
		this.excludedSet = new HashSet<Integer>();
	}

	public Set<Integer> getExcludedSet() {
		return excludedSet;
	}

	public void setExcludedSet(HashSet<Integer> excludedSet) {
		this.excludedSet = excludedSet;
	}
	
	public void addExcludedItem(Integer item) {
		this.excludedSet.add(item);
	}
}
