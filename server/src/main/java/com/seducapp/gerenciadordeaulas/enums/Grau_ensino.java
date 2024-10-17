package com.seducapp.gerenciadordeaulas.enums;

public enum Grau_ensino {
	FUNDAMENTAL(1),
	MEDIO(2);

	private int code;
	
	Grau_ensino(int grau) {
		this.code = grau;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Grau_ensino valueOf(int code) {
		for(Grau_ensino x :Grau_ensino.values()) {
			if(x.getCode() == code) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invalid ModalidadesEnum code!");
	}
	
}
