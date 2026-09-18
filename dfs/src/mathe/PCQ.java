package mathe;

public class PCQ {
    public static int pcq(int p, int q) {

	int pf = Fakultaet.fakultaet(p);
	int qf = Fakultaet.fakultaet(q);
	int pmqf = Fakultaet.fakultaet(p - q);

	return (pf / (qf * pmqf));
    }
}
