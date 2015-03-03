package mono2.main;

import java.util.HashSet;
import java.util.Set;

import mono2.table.Table;

public class Main {

	public static void main(String[] args) {
		driver1();
	}
	
	public static void driver1() {
		String path = "/home/lauro/Documents/eclipseWorkspace/mono2/src/mono2/input/input_paper.txt";
		Set<Integer> rowSet = new HashSet<Integer>();
		rowSet.add(1);
		rowSet.add(2);
		rowSet.add(3);
		rowSet.add(4);
		rowSet.add(5);
		Set<Integer> xRowSet = new HashSet<Integer>();
		
		Table table = new Table();
		table.readTable(path);
		table.enumerationTree(rowSet, xRowSet, rowSet.size()+1);
	}

}
