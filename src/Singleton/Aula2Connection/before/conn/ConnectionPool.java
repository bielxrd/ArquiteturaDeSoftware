package Singleton.Aula2Connection.before.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private final static int POOL_SIZE = 2;
    private List<Connection> connectionPool;

    public ConnectionPool() {
        System.out.println("Creating the Connection Pool");
        connectionPool = new ArrayList<Connection>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection available = null;

        for (Connection item: connectionPool) {
            if (!item.isInUse()) {
                available = item;
                break;
            }
        }
        if (available == null) {
            System.out.println("No connection available.");
            return null;
        }

        available.setInUse(true);
        return available;
    }

    public void leaveConnection(Connection connection) {
        connection.setInUse(false);
    }

}
