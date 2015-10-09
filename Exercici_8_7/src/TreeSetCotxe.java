import java.util.TreeSet;


public class TreeSetCotxe {
	
	public static void main(String[] args) {
		// 1: Create 4 TreeSets.
		// a) 2 TreeSets with a comparator of displacements. 
		TreeSet<CotxeComparat> treeSetCotxes1 = new TreeSet<CotxeComparat>();
		TreeSet<CotxeComparat> treeSetCotxes2 = new TreeSet<CotxeComparat>();
		// b) 2 TreeSets with a comparator of pot.fiscal.
		ComparadorPotFisc comparadorPotenciaFisc = new ComparadorPotFisc();
		TreeSet<Cotxe> treeSetCotxes3 = new TreeSet<Cotxe>(comparadorPotenciaFisc);
		TreeSet<Cotxe> treeSetCotxes4 = new TreeSet<Cotxe>(comparadorPotenciaFisc);
		
		// fill 5 cars in the displacements comparator list number 1.
		treeSetCotxes1.add(new CotxeComparat("Alfa Romeo", "Giulia", 2900, 6));
		treeSetCotxes1.add(new CotxeComparat("Dacia", "Sandero", 1200, 4));
		treeSetCotxes1.add(new CotxeComparat("Ford", "Focus", 2000, 4));
		treeSetCotxes1.add(new CotxeComparat("Opel", "Insignia", 2200, 4));
		treeSetCotxes1.add(new CotxeComparat("Seat", "Ibiza", 1600, 4));
		
		// fill 5 cars in the displacements comparator list number 2.
		treeSetCotxes2.add(new CotxeComparat("Alfa Romeo", "Giulia", 2900, 6));
		treeSetCotxes2.add(new CotxeComparat("Dacia", "Sandero", 1200, 4));
		treeSetCotxes2.add(new CotxeComparat("Ford", "Focus", 2000, 4));
		treeSetCotxes2.add(new CotxeComparat("Opel", "Insignia", 2200, 4));
		treeSetCotxes2.add(new CotxeComparat("Seat", "Ibiza", 1600, 4));
		
		// fill 5 cars in the pot Fisc comparator list number 1.
		treeSetCotxes3.add(new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		treeSetCotxes3.add(new Cotxe("Dacia", "Sandero", 1200, 4));
		treeSetCotxes3.add(new Cotxe("Ford", "Focus", 2000, 4));
		treeSetCotxes3.add(new Cotxe("Opel", "Insignia", 2200, 4));
		treeSetCotxes3.add(new Cotxe("Seat", "Ibiza", 1600, 4));
		
		// fill 5 cars in the pot Fisc comparator list number 2.
		treeSetCotxes4.add(new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		treeSetCotxes4.add(new Cotxe("Dacia", "Sandero", 1200, 4));
		treeSetCotxes4.add(new Cotxe("Ford", "Focus", 2000, 4));
		treeSetCotxes4.add(new Cotxe("Opel", "Insignia", 2200, 4));
		treeSetCotxes4.add(new Cotxe("Seat", "Ibiza", 1600, 4));
		
		// 2: Extract like Lifo and fifo each of them.
		// LIFO 1.a
		System.out.println("-------LIFO CILINDRADA-------");
		while(!treeSetCotxes1.isEmpty()) {
			System.out.println(treeSetCotxes1.pollLast());
		}
		// FIFO 1.b
		System.out.println("---------FIFO CILINDRADA--------");
		while(!treeSetCotxes2.isEmpty()) {
			System.out.println(treeSetCotxes2.pollFirst());
		}
		// FIFO 2.a
		System.out.println("---------LIFO POT.FISCAL--------");
		while(!treeSetCotxes3.isEmpty()) {
			System.out.println(treeSetCotxes3.pollFirst());
		}
		// FIFO 2.b
		System.out.println("---------FIFO POT.FISCAL--------");
		while(!treeSetCotxes4.isEmpty()) {
			System.out.println(treeSetCotxes4.pollLast());
		}
	}
}

