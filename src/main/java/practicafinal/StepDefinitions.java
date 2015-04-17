package practicafinal;
import cucumber.api.java8.En;
public class StepDefinitions  implements En{

    public StepDefinitions() {
        Given("I have (\\d+) cukes in my belly", (Integer cukes) -> {
            System.out.format("Cukes: %n\n", cukes);
        });
    }
}