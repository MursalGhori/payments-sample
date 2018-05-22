package com.payments.jackson.serializers;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class AmountSerializer extends JsonSerializer<BigDecimal> {
	
	@Override
	public void serialize(BigDecimal value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
	
		jgen.writeString(value.setScale(2, BigDecimal.ROUND_HALF_UP).toString());

	}
}
