package com.example.forohub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForohubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForohubApplication.class, args);
	}

	@Getter
	@EqualsAndHashCode(of = "id")
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity(name = "Paciente")
	@Table(name = "pacientes")
	public class Paciente {

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		private String nombre;
		private String email;
		private String documentoIdentidad;
		private String telefono;

		@Embedded
		private Direccion direccion;

		public Paciente(DatosRegistroPaciente datos) {
			this.nombre = datos.nombre();
			this.email = datos.email();
			this.telefono = datos.telefono();
			this.documentoIdentidad = datos.documentoIdentidad();
			this.direccion = new Direccion(datos.direccion());
		}

	}
}
