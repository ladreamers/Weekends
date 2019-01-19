package com.team.weekend02;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsClient {
	
	//Data source --> intermediate Operation1 -->Operation2-->...--> Terminator (Count, collect, result, etc..)
	//Stream is immutable collection during the operation.

	public static void main(String[] args) throws IOException {
		///////////////////////////////
		IntStream.range(1, 10).forEach(System.out::print);
//		IntStream.range(1, 10).forEach(
//					System.out::println
//				);
		System.out.println();

		///////////////////////////////
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x));
		System.out.println();

		///////////////////////////////
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();

		///////////////////////////////
		Stream
			.of("lava", "Asa", "alberto", "alla")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
		System.out.println();
		///////////////////////////////
		String[] names = { "Al", "Sal", "Sally", "FrankS", "Butter", "sister", "shit" };
		Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

		System.out.println();
		
		///////////////////////////////
//		Stream<Double> randomStream = Stream.generate(Math::random);
//		Stream<Integer> wholeNumbers = Stream.iterate(1, i -> i+1);
//		wholeNumbers.forEach(System.out::println);

		///////////////////////////////
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 })
			.map(x -> x * x)   //extracts the data
			.average()
			.ifPresent(System.out::println);
		System.out.println();

	}

}
