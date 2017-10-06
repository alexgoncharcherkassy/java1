package task2.Db;

import java.sql.*;

public class MySQLConnect {
    private Connection con;

    public MySQLConnect () {
        con = Connector.connect();
    }

    public void findAll(String table) throws Exception {
        try {
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM " + table;
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("-------------Show------------------");
            while (resultSet.next()) {
                System.out.print("ID: " + resultSet.getString("id") + " ");
                System.out.print("Name: " + resultSet.getString("name") + " ");
                System.out.print("Age: " + resultSet.getString("age") + " ");
                System.out.print("Job: " + resultSet.getString("job") + " ");
                System.out.println("University: " + resultSet.getString("university"));
            }
            System.out.println("-------------End------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void findById(String table, int id) throws Exception {
        try {
            PreparedStatement statement = con.prepareStatement("SELECT * FROM " + table + " WHERE id=?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("-------------Show------------------");
            while (resultSet.next()) {
                System.out.print("ID: " + resultSet.getString("id") + " ");
                System.out.print("Name: " + resultSet.getString("name") + " ");
                System.out.print("Age: " + resultSet.getString("age") + " ");
                System.out.print("Job: " + resultSet.getString("job") + " ");
                System.out.println("University: " + resultSet.getString("university"));
            }
            System.out.println("-------------End------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String name, int age, String job, String university) throws Exception {
        try {
            System.out.println("-------------Insert------------------");
            System.out.println("Name: " + name + " Age: " + age + " Job: " + job + " University: " + university);
            PreparedStatement statement = con.prepareStatement("INSERT INTO person (name, age, job, university) VALUES (?, ?, ?, ?)");
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, job);
            statement.setString(4, university);
            statement.executeUpdate();
            System.out.println("-------------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(int id, String name) throws Exception {
        try {
            System.out.println("-------------Update------------------");
            System.out.println("Id: " + id + " Name: " + name);
            PreparedStatement statement = con.prepareStatement("UPDATE person SET name = ? WHERE id = ?");
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.executeUpdate();
            System.out.println("--------------------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteById(String table, int id) throws Exception {
        try {
            System.out.println("-------------Delete------------------");
            System.out.println("Id: " + id);
            PreparedStatement statement = con.prepareStatement("DELETE FROM " + table + " WHERE id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("----------------------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
