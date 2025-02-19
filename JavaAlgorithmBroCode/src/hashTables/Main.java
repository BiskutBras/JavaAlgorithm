package hashTables;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Hashtable<String, String> table = new Hashtable<>(53);

		table.put("100", "Spongebob");
		table.put("123", "Patrick");
		table.put("456", "Squidward");
		table.put("951", "Sandy");
		table.put("746", "Garry");

		for (String key : table.keySet()) {
			System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
		}

	}

}
