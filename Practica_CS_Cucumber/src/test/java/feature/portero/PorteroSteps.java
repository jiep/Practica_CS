package feature.portero;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import pcfutbol.Portero;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PorteroSteps {
	
	Portero p;
	
	@Given("^un portero con salidas (\\d+), manoAmano (\\d+), reflejos (\\d+), penaltis (\\d+)$")
	public void un_portero_con_salidas_manoAmano_reflejos_penaltis(Integer arg1, Integer arg2, Integer arg3, Integer arg4) throws Throwable {
	    p = new Portero(arg1, arg2, arg3, arg4);
	}
	
	@When("^el cliente cree un portero con los datos anteriores$")
	public void el_cliente_cree_un_portero_con_los_datos_anteriores() throws Throwable {
	    
	}

	@Then("^Portero debe tener reflejos (\\d+)$")
	public void portero_debe_tener_reflejos(int arg1) throws Throwable {
	    assertThat(p.getReflejos(), equalTo(arg1));
	}
}
