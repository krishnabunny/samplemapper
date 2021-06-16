package com.example.demo.withlist;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {SampleChildMapper2.class})
public interface SampleMapperWithList {

	SampleMapperWithList INSTANCE = Mappers.getMapper(SampleMapperWithList.class);

	SampleSourceWithList toSampleSourceWithList(SampleDestinationWithList sampleDestination);

	SampleDestinationWithList toSampleDestinationWithList(SampleSourceWithList sampleDestination);

}
