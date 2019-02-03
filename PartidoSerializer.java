package com.acing.app;

import java.sql.Date;

import com.esotericsoftware.jsonbeans.Json;
import com.esotericsoftware.jsonbeans.JsonSerializer;
import com.esotericsoftware.jsonbeans.JsonValue;

public class PartidoSerializer implements JsonSerializer<Partido> {

	@Override
	public Partido read(Json json, JsonValue jsonValue, Class arg2) {
		Participante local;
		Participante visitante;
		if (Participante.mapaParticipanteId.containsKey(jsonValue.getString("localString"))) {
			local = Participante.mapaParticipanteId.get(jsonValue.getString("localString"));
		} else {
			local = new Participante();
		}
		if (Participante.mapaParticipanteId.containsKey(jsonValue.getString("visitanteString"))) {
			visitante = Participante.mapaParticipanteId.get(jsonValue.getString("visitanteString"));
		} else {
			visitante = new Participante();
		}
		
		Date fecha = new Date(0L);
		
		Partido partido = new Partido(local, visitante, fecha);
		partido.setResultado(jsonValue.getString("resultado"));
		
		return partido;
	}

	@Override
	public void write(Json json, Partido partido, Class arg2) {
		json.writeObjectStart();
        json.writeValue("localString", partido.local.getId());
        json.writeValue("visitanteString", partido.visitante.getId());
        json.writeValue("fecha", partido.getFecha());
        json.writeValue("resultado", partido.getResultado());
        json.writeObjectEnd();
		
	}

}
