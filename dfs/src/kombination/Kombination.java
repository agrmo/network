package kombination;

import java.util.Arrays;
import mathe.PCQ;
import druck.liste.Listedrucker;

public class Kombination {

    int[][] kombinationen;
    int kombinationenindex;
    
    int[] neukombination;

    int n;
    int k;

    public Kombination(int n, int k) {
	this.n = n;
	this.k = k;
	
	int nck = PCQ.pcq(n, k);
	this.kombinationen = new int[nck][k];
	this.kombinationenindex = 0;

	this.neukombination = new int[k];
	schritt(1, 0);
    }

    // Mache die Zahl z auf die Stelle s.
    void schritt(int z, int s) {
	if (s == this.k) {

	    kombinationen[kombinationenindex] = this.neukombination;
	    kombinationen[kombinationenindex] = Arrays.copyOf(this.neukombination,
							      this.neukombination.length);
	    kombinationenindex += 1;
	    return;
	}

	for (int i = z; i <= n && n - i + 1 >= k - s; i++) {
	    this.neukombination[s] = i;
	    schritt(i + 1, s + 1);
	}
    }
}
