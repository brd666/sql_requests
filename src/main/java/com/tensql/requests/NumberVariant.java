package com.tensql.requests;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class NumberVariant implements CommandVariant {
    private final Statement stmt;
    public String name;

    public NumberVariant(String name, Statement stmt) {
        this.name = name;
        this.stmt = stmt;
    }

    @Override
    public void execute() {
        try {
            ResultSet result = stmt.executeQuery(Requests.query(name));
            ResultSetMetaData rsmd = result.getMetaData();
            int columnCount = rsmd.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                System.out.printf("%-30s", rsmd.getColumnName(i+1));
            }
            System.out.println();
            while (result.next()) {
                for (int i = 0; i < columnCount; i++) {
                    System.out.printf("%-30s", result.getString(i+1));
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
