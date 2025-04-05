package ChainOfResponsability.process.service;

import ChainOfResponsability.process.steps.SaveUser;
import ChainOfResponsability.process.steps.StepProcess;
import ChainOfResponsability.process.steps.ValidateMandatoryField;

public class ServicesCatalog {
    public static StepProcess saveUserProcess = buildChain(
        new ValidateMandatoryField("name"),
        new ValidateMandatoryField("email"),
        new ValidateMandatoryField("password"),
            new SaveUser());

    private static StepProcess buildChain(StepProcess... steps) {
        for (int index = 0; index < steps.length - 1; index++) {
            StepProcess currentStep = steps[index];
            currentStep.setNextStep(steps[index + 1]);
        }

        return steps[0];
    }
}
