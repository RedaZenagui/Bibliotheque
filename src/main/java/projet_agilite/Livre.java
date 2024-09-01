package projet_agilite;

public class Livre
{
    private String titre;
    private String auteur;
    private String isbn;

    /**
     * Constructeur d'objets de classe Livre
     */
    public Livre(String titre, String auteur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }
    // Getter pour le titre
    public String getTitre() {
        return titre;
    }

    // Setter pour le titre
    public void setTitre(String titre) {
        this.titre = titre;
    }

    // Getter pour l'auteur
    public String getAuteur() {
        return auteur;
    }

    // Setter pour l'auteur
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    // Getter pour l'ISBN
    public String getIsbn() {
        return isbn;
    }
    // Setter pour l'ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

