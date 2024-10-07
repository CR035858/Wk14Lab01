package com.gl.sms.model;

import java.io.IOException;
import java.io.Serializable;
import javax.persistence.AttributeConverter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringArrayConverter implements AttributeConverter<String[], String>, Serializable {




private static final long serialVersionUID = -2744576922911393664L;

@Override
public String convertToDatabaseColumn(final String[] attribute) {
try {
    return new ObjectMapper().writeValueAsString(attribute);
}
catch (@SuppressWarnings("unused") final JsonProcessingException e) {
    // ignore
}
return null;
}

@Override
public String[] convertToEntityAttribute(final String dbData) {
try {
	return new ObjectMapper().readValue(dbData, String[].class);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return null;
}

}