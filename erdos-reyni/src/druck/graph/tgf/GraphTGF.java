package druck.graph.tgf;
 
import graph.Graph;

// Ein Object, die eine TGF-Datei erzeugen kann, die einen Graph
// verköpert. Deutlich nutzbar für das Programm Gephi.
// Beispiel:
// Knoten: 0,1,2
// Kanten: [0,1],[0,2]
// Ergibt die TGF-Datei:
// 1
// 2
// #
// 0 1
// 0 2
public class GraphTGF {

    // Mache eine TGF-Datei des Graphen, gegeben eine
    // Graph.
    public static String macheGepheiTGF(Graph g) {
	StringBuilder sb = new StringBuilder();

	// Zuerst drucken wir alle die Knoten.
	
	for (int i = 0; i < g.nachbar.size(); i++) {
	    sb.append(i);
	    sb.append("\n");
	}

 	// Eine TGF-Datei hat eine Grenze zwischen Knoten und Kanten.
	sb.append("#\n");

	// Zunächst drucken wir alle die Kanten.
	
	for (int i = 0; i < g.nachbar.size(); i++) {
	    // sbKnoten: Die Kanten eines einzelnen Knoten
	    StringBuilder sbKnoten = new StringBuilder();
	    for (int j = 0; j < g.nachbar.get(i).size(); j++) {
		sbKnoten.append(i);
		sbKnoten.append(" ");
		sbKnoten.append(g.nachbar.get(i).get(j));
		sbKnoten.append("\n");
	    }

	    if (sbKnoten.length() > 0) {
		sb.append(sbKnoten.toString());
	    }
	}

	return sb.toString();
    }
}
