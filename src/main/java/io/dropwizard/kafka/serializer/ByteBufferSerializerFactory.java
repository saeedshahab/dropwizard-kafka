package io.dropwizard.kafka.serializer;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.apache.kafka.common.serialization.ByteBufferSerializer;
import org.apache.kafka.common.serialization.Serializer;

@JsonTypeName("byte-buffer")
public class ByteBufferSerializerFactory extends SerializerFactory {
    @Override
    public Class<? extends Serializer> getSerializerClass() {
        return ByteBufferSerializer.class;
    }
}
