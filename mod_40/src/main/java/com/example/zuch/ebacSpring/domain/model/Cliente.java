package com.example.zuch.ebacSpring.domain.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_CLIENTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 
@Builder
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
	@SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "cpf", nullable = false, unique = true)
    private Long cpf;
    
	@Column(name = "telefone", nullable = false)
    private Long telefone;
	
	@Column(name = "email", nullable = false, length = 50)
    private String email;
    
	@Column(name = "endereco", nullable = false, length = 100)
    private String end;
    
	@Column(name = "numero", nullable = false)
    private Integer numero;
    
	@Column(name = "cidade", nullable = false, length = 100)
    private String cidade;
    
	@Column(name = "estado", nullable = false, length = 50)
    private String estado;
}
