package projet_agilite;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque
{
    // Nos attributs
    private String nom;
    private String ville;
    private List<Livre> livres;

    private int totalLivres;

    public int getTotalLivres() {
        return totalLivres;
    }

    public void setTotalLivres(int totalLivres) {
        this.totalLivres = totalLivres;
    }

    public void addLivre(Livre livre) {
        this.livres.add(livre);
        this.totalLivres++;
    }


    /**
     * Constructeur d'objets de classe Bibliotheque
     */
    public Bibliotheque(String nom, String ville, Livre livre)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.ville = ville;
        this.livres = new ArrayList<>();
        this.totalLivres = 0;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String villeToUpperCase() {
        return this.ville = this.ville.toUpperCase();
    }
    public String toUpperCase() {
        return this.ville.toUpperCase() + ", " + this.livres.get(0).getTitre().toUpperCase();
    }
    public List<Livre> getLivres() {
        return livres;
    }

}

