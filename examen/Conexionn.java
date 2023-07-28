/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package examen;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexionn {

    public static Connection getConnection() {
       
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mariadb://localhost:3308/java");
        config.setUsername("root");
        config.setPassword("ruthar");

        HikariDataSource dataSource = new HikariDataSource(config);
        try {
            Connection con = dataSource.getConnection();
            System.out.println("Conexión establecida");
            return con;
        } catch (SQLException e) {
            System.err.println("Error al obtener la conexión: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Connection conexion = getConnection();
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }
}

