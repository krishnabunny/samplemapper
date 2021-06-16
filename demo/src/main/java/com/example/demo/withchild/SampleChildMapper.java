package com.example.demo.withchild;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SampleChildMapper {

	SampleChildMapper INSTANCE = Mappers.getMapper( SampleChildMapper.class );
	
	SampleChildSource destinationChildToSourceChild(SampleChildDestination sampleChildDestination);
	
	SampleChildDestination sourceChildToDestionationChild(SampleChildSource sampleChildDestination);
}
