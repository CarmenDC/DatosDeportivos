package com.acing.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import com.esotericsoftware.jsonbeans.Json;
import com.esotericsoftware.jsonbeans.JsonSerializable;
import com.esotericsoftware.jsonbeans.JsonValue;

public class Partido extends EventoImpl {
	
	protected String resultado;

	public Partido(Participante local, Participante visitante, Date fecha) {
		super.local = local;
		super.visitante = visitante;
		super.fecha = fecha;
	}
	
	public Partido() {
		//super(null, null, null);
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;

	}

	@Override
	public Date getFecha() {
		return fecha;
	}

	@Override
	public Collection<Suceso> getSucesos() {
		return sucesos;
	}

	@Override
	public String getResultado() {
		return resultado;
	}

	@Override
	public Participante getGanador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Partido [resultado=" + resultado + ", fecha=" + fecha + ", local=" + local + ", visitante=" + visitante
				+ "]";
	}

	
}
