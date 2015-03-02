package mono2.table;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Sets;

public class Table {
	
	private Map<Integer, Set<String>> tableT;
	private Integer tableSize;
	
	public Table() {
		this.tableT = new HashMap<Integer, Set<String>>();
		this.tableSize = 0;
	}
	
	public void readTable(String path) {
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
	        String line = br.readLine();

	        while (line != null) {
//	        	System.out.println(line);
	        	Set<String> row = new HashSet<String>();
	        	row.addAll(Arrays.asList(line.split(" ")));
	        	
//	        	for(String e : row) {
//	        		System.out.print(e + " ");
//	        	}
//	        	System.out.println();
	        	
	        	this.addRow(row);
	        	
	            line = br.readLine();
	        }
	    } catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addRow(Set<String> row) {
		this.tableSize += 1;
		this.tableT.put(this.tableSize, row);
		
		
	}
	
	public void enumerationTree(Set<Integer> rowSet, Set<Integer> xRowSet, Integer y) {
		
		Set<Integer> diff = Sets.difference(rowSet, xRowSet);
		
//		for(Integer e : diff) {
//			System.out.print(e);
//		}
//		System.out.println();
		
		if(diff.size() <= 1) {
			return;
		}
		
		Set<String> inter = new HashSet<String>();
		for(Integer e : diff) {
			if(inter.size() != 0) {
				inter = Sets.intersection(inter, this.tableT.get(e) );
				if(inter.size() == 0) {
					break;
				}
			} else {
				inter = this.tableT.get(e);
			}
		}
		if(inter.size() > 0) {
//			for(Integer e : diff) {
//				System.out.print(e + " ");
//			}
//			System.out.println();
//			
//			for(String e : inter) {
//				System.out.print(e + " ");
//			}
//			System.out.println("\n");
			
			for(String e : inter) {
				
			}
		}

		
		for(int i=y-1; i>0; i--) {
			
			Set<Integer> s = new HashSet<Integer>();
			s.add(i);
			Set<Integer> union = Sets.union(xRowSet, s);
			
			
			for(Integer e : union) {
				System.out.print(e);
			}
			System.out.println();
			
			
			if(diff.size() > 1) {
				this.enumerationTree(diff, union, i);
			}
		}
	}
}
