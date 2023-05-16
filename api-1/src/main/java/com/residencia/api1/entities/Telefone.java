package com.residencia.api1.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "numero")
	private int numero;
	
	//FK para id_instrutor
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_instrutor", referencedColumnName = "id")
	private Instrutor idInstrutor;
	
	public Instrutor getId_instrutor() {
		return idInstrutor;
	}

	public void setId_instrutor(Instrutor id_instrutor) {
		this.idInstrutor = id_instrutor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
