package com.AppRH.AppRH.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;

public class Vaga implements Serializable{
	
	private static final long seriaVersionId = 1L;
	
	@Id
	private long codigo;
	
	@GeneratedValue(strategy = GenerationType.AUTO);
	
	
}
