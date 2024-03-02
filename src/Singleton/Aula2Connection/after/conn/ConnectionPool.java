package Singleton.Aula2Connection.after.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static ConnectionPool singleton = new ConnectionPool();
    public final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    private ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<Connection>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }
    public static ConnectionPool getInstance() {
        return singleton;
    }

    public Connection getConnection() {
        Connection available = null;

        for (Connection item: connectionsPool) {
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
