package com.acing.app;
import java.sql.Date;
import java.util.Comparator;

public interface Datable extends Comparable<Datable> {
	Date getFecha();
	Long getTimeStamp();
	Comparator<Datable> getComparatorDatable();
	boolean antesDe(Datable datable);
	boolean despuesDe(Datable datable);
	
}
