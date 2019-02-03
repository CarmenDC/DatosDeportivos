package com.acing.app;
import java.sql.Date;
import java.util.Comparator;

public abstract class DatableImpl implements Datable {
	
	Date fecha;
	Long timeStamp;
	
	void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	void setTimeStramp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	@Override
	public int compareTo(Datable o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date getFecha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getTimeStamp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comparator<Datable> getComparatorDatable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean antesDe(Datable datable) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean despuesDe(Datable datable) {
		// TODO Auto-generated method stub
		return false;
	}

}
