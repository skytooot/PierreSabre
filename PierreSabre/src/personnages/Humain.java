package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom
		+" et j'aime boire du " + boissonFav);
	}

	public void boire() {
		parler("Mmmm, un bon verre de "+boissonFav+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(argent>prix) {
			parler("J'ai "+argent
			+" sous en poche. Je vais pouvoir m'offrir "
			+bien+" � "+prix+" sous");
			perdreArgent(prix);
		}
		else parler("Je n'ai plus que  "+argent
		+" sous en poche. Je ne vais m�me pas pouvoir m'offrir "
		+bien+" � "+prix+" sous");
		
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
}




