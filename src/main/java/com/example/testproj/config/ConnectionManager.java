package com.example.testproj.config;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class ConnectionManager {
    public static final String serverTimeZone = "Europe/Moscow";
    public static final int portNumber = 3306;
    public static final String password = "rootROOT1";
    public static final String user = "root";

    @Bean
    public static Connection getConnection() throws SQLException {

        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setUseSSL( false );
        dataSource.setServerTimezone( serverTimeZone );
        dataSource.setPortNumber( portNumber );
        dataSource.setAllowPublicKeyRetrieval(true);
        dataSource.setPassword(password);
        dataSource.setUser(user);

        return dataSource.getConnection();
    }
}