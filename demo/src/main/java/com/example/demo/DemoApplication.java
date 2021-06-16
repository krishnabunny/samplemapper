package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.basic.SampleDestination;
import com.example.demo.basic.SampleMapper;
import com.example.demo.basic.SampleSource;
import com.example.demo.diffname.SampleDestinationWithDiffNames;
import com.example.demo.diffname.SampleMapperWithDiffNames;
import com.example.demo.diffname.SampleSourceWithDiffNames;
import com.example.demo.withchild.SampleChildSource;
import com.example.demo.withchild.SampleDestinationWithChild;
import com.example.demo.withchild.SampleMapperWithChild;
import com.example.demo.withchild.SampleSourceWithChild;
import com.example.demo.withlist.SampleChildSrc;
import com.example.demo.withlist.SampleDestinationWithList;
import com.example.demo.withlist.SampleMapperWithList;
import com.example.demo.withlist.SampleSourceWithList;

@SpringBootApplication(scanBasePackages = { "com.example.demo" })
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Print from Demo Application");
		System.out.println("_____________________________________");
		runSampleMapper();
		System.out.println("_____________________________________");
		runSampleMapperWithDiffNames();
		System.out.println("_____________________________________");
		runSampleMapperWithChild();
		System.out.println("_____________________________________");
		runSampleMapperWithList();
		System.out.println("_____________________________________");
	}

	private void runSampleMapper() {
		SampleSource sampleSource = new SampleSource();

		sampleSource.setName("Hello");
		sampleSource.setAddress("World");

		System.out.println(sampleSource.toString());

		SampleDestination sampleDest = SampleMapper.INSTANCE.sourceToDestionation(sampleSource);

		System.out.println(sampleDest.toString());
		
		SampleSource s1 = SampleMapper.INSTANCE.destinationToSource(sampleDest);
		System.out.println(s1.toString());
	}
	
	private void runSampleMapperWithDiffNames() {
		SampleSourceWithDiffNames sampleSource = new SampleSourceWithDiffNames();

		sampleSource.setFullName("Hello");
		sampleSource.setFullAddress("World");

		System.out.println(sampleSource.toString());

		SampleDestinationWithDiffNames sampleDest = SampleMapperWithDiffNames.INSTANCE.sourceToDestionation(sampleSource);

		System.out.println(sampleDest.toString());
		
		SampleSourceWithDiffNames s1 = SampleMapperWithDiffNames.INSTANCE.destinationToSource(sampleDest);
		System.out.println(s1.toString());
	}
	
	private void runSampleMapperWithChild() {
		SampleSourceWithChild sampleSource = new SampleSourceWithChild();

		sampleSource.setName("Hello");
		sampleSource.setAddress("World");
		SampleChildSource childSource = new SampleChildSource();
		childSource.setChildName("Child Name");
		childSource.setChildAddress("Child Address");
		
		sampleSource.setSampleChildSource(childSource);
		

		System.out.println(sampleSource.toString());

		SampleDestinationWithChild sampleDest = SampleMapperWithChild.INSTANCE.toSampleDestinationWithChild(sampleSource);

		System.out.println(sampleDest.toString());
		
		SampleSourceWithChild s1 = SampleMapperWithChild.INSTANCE.toSampleSourceWithChild(sampleDest);
		System.out.println(s1.toString());
	}
	
	private void runSampleMapperWithList() {
		SampleSourceWithList sampleSource = new SampleSourceWithList();

		sampleSource.setName("Hello");
		sampleSource.setAddress("World");
		SampleChildSource childSource = new SampleChildSource();
		childSource.setChildName("Child Name");
		childSource.setChildAddress("Child Address");
		
		SampleChildSrc s1 = new SampleChildSrc();
		s1.setChildName("Child Name 1");
		s1.setChildAddress("Child Address 1");
		
		SampleChildSrc s2 = new SampleChildSrc();
		s2.setChildName("Child Name 2");
		s2.setChildAddress("Child Address 2");
		
		sampleSource.setChildSrcList(Arrays.asList(s1,s2));
		

		System.out.println(sampleSource.toString());

		SampleDestinationWithList sampleDest = SampleMapperWithList.INSTANCE.toSampleDestinationWithList(sampleSource);

		System.out.println(sampleDest.toString());
		
		SampleSourceWithList srcObj = SampleMapperWithList.INSTANCE.toSampleSourceWithList(sampleDest);
		System.out.println(srcObj.toString());
	}

}
