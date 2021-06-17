package com.healthmanager.doctor.persistance.adapter;

public interface Adapter<T,K> {

	T entityAdapter(K k);
	
	K voAdapter(T t);
}
