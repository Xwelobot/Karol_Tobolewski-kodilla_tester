package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }


    @Test
    void testSelectUsersAndPosts() throws Exception {
        // Given
        DbManager dbManager = DbManager.getInstance();
        Connection conn = dbManager.getConnection();
        Statement stmt = conn.createStatement();

        // Clean up in case previous test failed
        stmt.executeUpdate("DELETE FROM POSTS WHERE USER_ID IN (9991, 9992)");
        stmt.executeUpdate("DELETE FROM USERS WHERE ID IN (9991, 9992)");

        // Insert sample users
        stmt.executeUpdate("INSERT INTO USERS(ID, FIRSTNAME, LASTNAME) VALUES (9991, 'John', 'Smith')");
        stmt.executeUpdate("INSERT INTO USERS(ID, FIRSTNAME, LASTNAME) VALUES (9992, 'Zachary', 'Lee')");

        // Insert posts – John: 2 posts, Zachary: 1 post
        stmt.executeUpdate("INSERT INTO POSTS(USER_ID, BODY) VALUES (9991, 'Post 1 by John')");
        stmt.executeUpdate("INSERT INTO POSTS(USER_ID, BODY) VALUES (9991, 'Post 2 by John')");
        stmt.executeUpdate("INSERT INTO POSTS(USER_ID, BODY) VALUES (9992, 'Post 1 by Zachary')");

        // When
        String sqlQuery = """
            SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POST_COUNT
            FROM USERS U
            JOIN POSTS P ON U.ID = P.USER_ID
            GROUP BY U.ID
            HAVING COUNT(*) >= 2
            """;

        ResultSet rs = stmt.executeQuery(sqlQuery);

        // Then
        int resultCount = 0;
        System.out.println("Users with at least 2 posts:");
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME") + " - Posts: " + rs.getInt("POST_COUNT"));
            resultCount++;
        }

        assertEquals(4, resultCount);

        // CleanUp
        stmt.executeUpdate("DELETE FROM POSTS WHERE USER_ID IN (9991, 9992)");
        stmt.executeUpdate("DELETE FROM USERS WHERE ID IN (9991, 9992)");

        rs.close();
        stmt.close();
    }
}