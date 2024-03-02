package Singleton.Aula2Connection.before.conn;

public class Connection {
    private boolean inUse;

    public boolean isInUse() {
        return inUse;
    }

    public Object query(String SQL) {
        System.out.println("Running " +SQL+ " in connection "+this);
        return null;
    }

    public boolean inUse() {
        return inUse;
    }

    void setInUse(boolean status) {
        this.inUse = status;
    }
}
