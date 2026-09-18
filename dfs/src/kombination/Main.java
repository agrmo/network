package kombination;

import druck.liste.Listedrucker;

// kombination.Main

public class Main {
    static void beispieleins() {
	Kombination k = new Kombination(5, 3);
	System.out.println(Listedrucker.drucke(k.kombinationen));
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
