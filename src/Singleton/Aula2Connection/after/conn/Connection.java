package Singleton.Aula2Connection.after.conn;

public class Connection {

    private boolean inUse;

    public boolean isInUse() {
        return inUse;
    }

    public Object query(String SQL) {
        System.out.println("Running " +SQL+ " in connection "+this);
        return null;
    }

    boolean inUse() {
        return inUse;
    }

    void setInUse(boolean status) {
        this.inUse = status;
    }
}
