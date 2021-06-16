package com.example.demo.withchild;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SampleMapperWithChild {

	SampleMapperWithChild INSTANCE = Mappers.getMapper(SampleMapperWithChild.class);

	SampleSourceWithChild toSampleSourceWithChild(SampleDestinationWithChild sampleDestination);

	SampleDestinationWithChild toSampleDestinationWithChild(SampleSourceWithChild sampleDestination);

	SampleChildSource toSampleChildSource(SampleChildDestination sampleChildDestination);

	SampleChildDestination toSampleChildDestination(SampleChildSource sampleChildDestination);
}
