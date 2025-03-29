package Proxy.access.service;

public class Resource implements IResource {

    private String data;

    public Resource() throws InterruptedException {
        System.out.println("Loading resources from data structure");
        for (int i = 5; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println(".");
        }

        this.data = "This is all your data";
        System.out.println("Resource is ready!");
    }

    @Override
    public String getData() {
        return data;
    }
}
