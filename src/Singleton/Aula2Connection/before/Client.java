package Singleton.Aula2Connection.before;

import Singleton.Aula2Connection.before.conn.Connection;
import Singleton.Aula2Connection.before.conn.ConnectionPool;

public class Client {

   public static void doQuery1() {
       ConnectionPool connectionPool = new ConnectionPool();
       System.out.println(connectionPool);
       Connection connection = connectionPool.getConnection();


       if (connection != null) {
           connection.query("SELECT * FROM A1");
       }
   }
    public static void doQuery2() {
        ConnectionPool connectionPool = new ConnectionPool();
        System.out.println(connectionPool);
        Connection connection = connectionPool.getConnection();


        if (connection != null) {
            connection.query("SELECT * FROM A2");
        }
    }

    public static void doQuery3() {
        ConnectionPool connectionPool = new ConnectionPool();
        System.out.println(connectionPool);
        Connection connection = connectionPool.getConnection();


        if (connection != null) {
            connection.query("SELECT * FROM A3");
        }
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();
    }


}
