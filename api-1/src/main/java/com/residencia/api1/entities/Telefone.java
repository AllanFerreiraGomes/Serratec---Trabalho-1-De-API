package com.residencia.api1.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone {
	
	//FK para id_instrutor
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_instrutor", referencedColumnName = "id")
	private Instrutor id_instrutor;
	
	@Column(name = "numero")
	private int numero;
	
	public Instrutor getId_instrutor() {
		return id_instrutor;
	}

	public void setId_instrutor(Instrutor id_instrutor) {
		this.id_instrutor = id_instrutor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
