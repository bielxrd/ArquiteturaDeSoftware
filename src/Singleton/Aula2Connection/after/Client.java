package Singleton.Aula2Connection.after;

import Singleton.Aula2Connection.after.conn.Connection;
import Singleton.Aula2Connection.after.conn.ConnectionPool;

public class Client {
    public static void doQuery1() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = connectionPool.getConnection();

        if (connection != null) {
            connection.query("SELECT * FROM A1");
        }


    }
    public static void doQuery2() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        System.out.println(connectionPool);
        Connection connection = connectionPool.getConnection();

        if (connection != null) {
            connection.query("SELECT * FROM A2");
        }
    }

    public static void doQuery3() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        System.out.println(connectionPool);
        Connection connection = connectionPool.getConnection();

        if (connection != null) {
            connection.query("SELECT * FROM A3");
        }
    }

    public static void main(String[] args) {
        System.out.println("Connection POOL Size: "+ConnectionPool.POOL_SIZE);
        int pool = ConnectionPool.POOL_SIZE;
        System.out.println(pool);
        doQuery1();
        doQuery2();
        doQuery3();
    }
}
