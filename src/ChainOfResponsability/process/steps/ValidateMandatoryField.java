package ChainOfResponsability.process.steps;

import ChainOfResponsability.process.service.ProcessContext;

public class ValidateMandatoryField extends StepProcess {

    public ValidateMandatoryField(Object... args) {
        super(args);
    }

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        Object field =  context.get(((String) args[0]));
        if (field == null) {
            throw new Exception("Field " + args[0] + " is mandatory");
        }
        return nextStep(context, true);
    }
}
