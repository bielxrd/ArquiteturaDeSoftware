package ChainOfResponsability.process;

import ChainOfResponsability.process.service.GenericService;
import ChainOfResponsability.process.service.ProcessContext;
import ChainOfResponsability.process.service.ServicesCatalog;

public class Client {
    public static void main(String[] args) {
        ProcessContext context = new ProcessContext();
        context.put("email", "user1@teste.com");
        context.put("password", "123456");
        Object response = GenericService.run(ServicesCatalog.saveUserProcess, context);
        System.out.println(response);

        context.reset();
        context.put("email", "user2@test.com");
        context.put("password", "123456");
        context.put("name", "User 2");
        response = GenericService.run(ServicesCatalog.saveUserProcess, context);
        System.out.println(response);
    }
}
