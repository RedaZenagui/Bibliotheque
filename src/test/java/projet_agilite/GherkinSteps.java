package projet_agilite;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

public class GherkinSteps {

    private Bibliotheque bibliotheque;
    private Livre livre;

    @Given("the library name is {string}")
    public void the_library_name_is(String name) {
        bibliotheque = new Bibliotheque(name, " ", null);
    }

    @Given("the library is located in {string}")
    public void the_library_is_located_in(String location) {
        bibliotheque.setVille(location);
    }

    @When("a book with title {string}, author {string}, and ISBN {string} is added")
    public void a_book_is_added(String title, String author, String isbn) {
        livre = new Livre(title, author, isbn);
        bibliotheque.addLivre(livre);
    }

    @Then("the total number of books should be {int}")
    public void the_total_number_of_books_should_be(int totalBooks) {
        assertEquals(totalBooks, bibliotheque.getLivres().size());
    }

    @Then("the library location in uppercase should be {string}")
    public void the_library_location_in_uppercase_should_be(String locationUpper) {
        assertEquals(locationUpper, bibliotheque.villeToUpperCase());
    }

    @When("the library name is changed to {string}")
    public void the_library_name_is_changed_to(String newName) {
        bibliotheque.setNom(newName);
    }

    @When("the library location is changed to {string}")
    public void the_library_location_is_changed_to(String newLocation) {
        bibliotheque.setVille(newLocation);
    }

    @Then("the library name should be {string}")
    public void the_library_name_should_be(String expectedName) {
        assertEquals(expectedName, bibliotheque.getNom());
    }

    @Then("the library location should be {string}")
    public void the_library_location_should_be(String expectedLocation) {
        assertEquals(expectedLocation, bibliotheque.getVille());
    }
}
