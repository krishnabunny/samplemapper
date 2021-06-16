package com.example.demo.basic;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SampleMapper {

	SampleMapper INSTANCE = Mappers.getMapper( SampleMapper.class );
	
	SampleSource destinationToSource(SampleDestination sampleDestination);
	
	SampleDestination sourceToDestionation(SampleSource sampleDestination);
}
