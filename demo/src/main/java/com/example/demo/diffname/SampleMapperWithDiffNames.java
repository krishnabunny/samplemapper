package com.example.demo.diffname;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SampleMapperWithDiffNames {
	SampleMapperWithDiffNames INSTANCE = Mappers.getMapper( SampleMapperWithDiffNames.class );
	
	@Mappings({
		@Mapping(source="name", target="fullName"),
		@Mapping(source="address", target="fullAddress")
	})
	SampleSourceWithDiffNames destinationToSource(SampleDestinationWithDiffNames sampleDestination);
	
	@Mappings({
		@Mapping(target="name", source="fullName"),
		@Mapping(target="address", source="fullAddress")
	})
	SampleDestinationWithDiffNames sourceToDestionation(SampleSourceWithDiffNames sampleDestination);
}
