package pe.edu.cibertec.configservergrupo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class ConfigServerGrupo03Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGrupo03Application.class, args);
    }

}
