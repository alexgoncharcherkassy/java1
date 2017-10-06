package task2.Controller;

import task2.Db.MySQLConnect;

public class DbController {
    public static void main (String[] args) throws Exception {
        MySQLConnect con = new MySQLConnect();
        con.findAll("person");
        con.findById("person", 2);
//        con.update(2, "Test 3");
//        con.deleteById("person", 6);
//        con.insert("qwerty qwerty", 50, "", "Oxford");
        con.close();
    }
}
