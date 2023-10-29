package conn.ejercicio.APILibros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ApiLibrosApplication {

    @GetMapping("/mensaje")
    public String mensaje(){
    return ("Has desplegado exitosamente en azure");}
	public static void main(String[] args) {
		SpringApplication.run(ApiLibrosApplication.class, args);
	}

}
