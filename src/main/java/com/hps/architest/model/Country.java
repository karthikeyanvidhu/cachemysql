package com.hps.architest.model;

import java.io.Serializable;

public class Country  implements Serializable {
	
private static final long serialVersionUID = 1L;

String id;
String name;
String district;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}

@Override
public String toString() {
	return "Country [id=" + id + ", name=" + name + ", district=" + district + "]";
}


}
