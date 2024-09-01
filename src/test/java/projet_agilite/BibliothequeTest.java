package projet_agilite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BibliothequeTest {

    private Bibliotheque bibliotheque;
    private Livre livre1;
    private Livre livre2;

    @Before
    public void setUp() {
        // Initialisation de la bibliothèque et des livres avant chaque test
        bibliotheque = new Bibliotheque("François Mitterrand", "Paris", null);
        livre1 = new Livre("Le deal", "Alber Cogan", "1026244374");
        livre2 = new Livre("Les Misérables", "Victor Hugo", "978-1234567890");

        // Ajout des livres à la bibliothèque
        bibliotheque.addLivre(livre1);
        bibliotheque.addLivre(livre2);
    }

    @Test
    public void testGetNom() {
        // Tester la méthode getNom
        assertEquals("François Mitterrand", bibliotheque.getNom());
    }

    @Test
    public void testSetNom() {
        // Tester la méthode setNom
        bibliotheque.setNom("Nouvelle Bibliothèque");
        assertEquals("Nouvelle Bibliothèque", bibliotheque.getNom());
    }

    @Test
    public void testGetVille() {
        // Tester la méthode getVille
        assertEquals("Paris", bibliotheque.getVille());
    }

    @Test
    public void testSetVille() {
        // Tester la méthode setVille
        bibliotheque.setVille("Lyon");
        assertEquals("Lyon", bibliotheque.getVille());
    }

    @Test
    public void testVilleToUpperCase() {
        // Tester la méthode villeToUpperCase
        assertEquals("PARIS", bibliotheque.villeToUpperCase());
    }
    /*@Test
    public void testToUpperCaseFaux() {
        // Tester la méthode toUpperCase (premier livre)
        String fauxExpected = "Paris, Le deal";
        assertEquals(fauxExpected, bibliotheque.toUpperCase());
    }*/

    @Test
    public void testToUpperCase() {
        // Tester la méthode toUpperCase (premier livre)
        String expected = "PARIS, LE DEAL";
        assertEquals(expected, bibliotheque.toUpperCase());
    }
    @Test
    public void testAddLivre() {
        // Tester l'ajout d'un livre à la bibliothèque
        Livre livre3 = new Livre("Germinal", "Émile Zola", "978-2253004222");
        bibliotheque.addLivre(livre3);

        // Vérifier que le livre a bien été ajouté
        assertTrue(bibliotheque.getLivres().contains(livre3));
    }
    @Test
    public void testGetLivres() {
        // Tester la méthode getLivres
        assertEquals(2, bibliotheque.getLivres().size());
        assertTrue(bibliotheque.getLivres().contains(livre1));
        assertTrue(bibliotheque.getLivres().contains(livre2));
    }

    @Test
    public void testGetTotalLivres() {
        // Étape 1 : Écrire un test qui échoue
        Bibliotheque bibliotheque = new Bibliotheque("François Mitterrand", "Paris",null);
        assertEquals(0, bibliotheque.getTotalLivres());
        // La méthode getTotalLivres() n'existe pas encore
    }

    @Test
    public void testAddLivreAndGetTotalLivres() {
        // Étape 2 : Implémenter le code pour faire passer le premier test
        Bibliotheque bibliotheque = new Bibliotheque("François Mitterrand", "Paris",null);
        Livre livre1 = new Livre("Le deal", "Alber Cogan", "1026244374");
        bibliotheque.addLivre(livre1);

        // Étape 3 : Écrire un nouveau test qui échoue
        assertEquals(1, bibliotheque.getTotalLivres());
    }
    @Test
    public void testMultipleLivresAndGetTotalLivres() {
        // Étape 2 : Implémenter le code pour faire passer le deuxième test
        Bibliotheque bibliotheque = new Bibliotheque("François Mitterrand", "Paris",null);
        Livre livre1 = new Livre("Le deal", "Alber Cogan", "1026244374");
        Livre livre2 = new Livre("Le second livre", "John Doe", "1234567890");
        bibliotheque.addLivre(livre1);
        bibliotheque.addLivre(livre2);

        // Étape 3 : Écrire un nouveau test qui échoue
        assertEquals(2, bibliotheque.getTotalLivres());
    }
}
