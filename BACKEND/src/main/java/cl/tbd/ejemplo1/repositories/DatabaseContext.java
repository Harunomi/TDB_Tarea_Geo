package cl.tbd.ejemplo1.repositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;

@Configuration
public class DatabaseContext {
    @Value("${database.url}")
    private String dbUrl;

    @Value("${database.user}")
    private String dbUser;

    @Value("${database.password}")
    private String dbPass;

    @Bean
    public Sql2o sql2o() {
        // definir url / usuario / password para ingresar a la base de datos
        dbUrl = "jdbc:postgresql://127.0.0.1:5432/postgis";
        dbUser = "postgres";
        dbPass = "grupo1";

        return new Sql2o(dbUrl, dbUser, dbPass);
    }
}
