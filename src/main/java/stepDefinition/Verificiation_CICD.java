package stepDefinition;

import org.testng.annotations.Test;
import io.cucumber.java.en.*;
import pages.Jenkins_Web_Page;


public class Verificiation_CICD extends BaseTest{

	
	@Test
	
	
	

	
	
	@Given("utilisateur est sur la page d acceuil")
	public void utilisateur_est_sur_la_page_d_acceuil() throws InterruptedException {
		Thread.sleep(5000);
	 System.out.println("1");
	}
	Jenkins_Web_Page Jen = new Jenkins_Web_Page(base_test_driver);
	@When("verifie l affichage du premier texte")
	public void verifie_l_affichage_du_premier_texte() {
		
		Jen.verification_affichage_text1();
		
	}

	@And("verifie l affichage du deuxieme texte")
	public void verifie_l_affichage_du_deuxieme_texte() {
		
		Jen.verification_affichage_texte2();
	}

	@Then("afficher le message test passet")
	public void afficher_le_message_test_passet() {
	   System.out.println("Test Passed");
	}
	
	
	



	
}
