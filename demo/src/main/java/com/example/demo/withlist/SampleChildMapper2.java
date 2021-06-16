package com.example.demo.withlist;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SampleChildMapper2 {

	SampleChildMapper2 INSTANCE = Mappers.getMapper( SampleChildMapper2.class );
	
	SampleChildSrc destinationChildToSourceChild(SampleChildDest sampleChildDestination);
	
	SampleChildDest sourceChildToDestionationChild(SampleChildSrc sampleChildDestination);
}
