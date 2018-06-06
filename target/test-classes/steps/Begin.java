package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Begin {
  
  @Given("^word hello$")
  public void word_hello() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
	 // System.out.print("hi!");
      //throw new PendingException();
  }

  @Then("^Begin with hello$")
  public void Begin_with_hello_word() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
	  //System.out.print("hello world!"); 
      //throw new PendingException();
  }
}
