package graph.zufall;

import druck.graph.tgf.GraphTGF;
import graph.Graph;

// graph.zufall.Main

public class Main {
    public static void main(String[] args) {
	Graph g = Zufallsgraph.mache(10, 0.1);

	// GraphCSV gcsv = new GraphCSV();
	// System.out.println(gcsv.macheGepheiCSV(z.graph));

	System.out.println(GraphTGF.macheGepheiTGF(g));	

	// int[][] verteilung = Kanteverteilung.kanteVerteilung(g);
	// String verteilungString = Liste.nehmeStringVonArrayArray(verteilung);
	// System.out.println(verteilungString);	
	
	// System.out.println(Graphdrucker.drucke(z.graph));
    }
}
