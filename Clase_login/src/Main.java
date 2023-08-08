import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
         Class.forName("org.h2.Driver").newIstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:" + "./Database/ay", "root", "ayPassword");
        Statement stat = connection.createStatement();

        String createTable = "DROP TABLE IF EXIST TEST; CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255))";
        stat.execute(createTable);

        String insertFila = "INSERT INTO TEST VALUES(1, 'HOLA')";
        String insertFila2 = "INSERT INTO TEST VALUES(2 'CHAU')";

stat.execute(insertFila);
stat.execute(insertFila2);

String sql = "SELECT * FROM TEST";
ResultSet rd = stat.executeQuery(sql);
while (rd.next()) {
    System.out.println(rd.getInt(1) + rd.getString(2));
}
    }
}