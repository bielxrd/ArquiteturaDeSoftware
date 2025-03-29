package Proxy.access.service;

public class ResourceProxy implements IResource {

    private IResource realResource;
    private String validtoken = "v@lid!";
    private String tokenProvided;

    public ResourceProxy(String tokenProvided) {
        this.tokenProvided = tokenProvided;
    }

    @Override
    public String getData() {
        if (!tokenProvided.equals(validtoken)) return "Invalid token";

        if (realResource == null) {
            try {
                realResource = new Resource();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return realResource.getData();
    }
}
