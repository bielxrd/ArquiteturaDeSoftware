package ChainOfResponsability.process.steps;

import ChainOfResponsability.process.repository.UserRepository;
import ChainOfResponsability.process.service.ProcessContext;

import java.util.HashMap;
import java.util.Map;

public class SaveUser extends StepProcess {

    public SaveUser(Object... args) {
        super(args);
    }

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        Map<String, Object> userInput = new HashMap<String, Object>();
        userInput.put("name", context.get("name"));
        userInput.put("email", context.get("email"));
        userInput.put("password", context.get("password"));
        UserRepository.getInstance().saveUser(userInput);
        return nextStep(context, String.format("User %s saved successfully", userInput.get("name")));
    }
}
