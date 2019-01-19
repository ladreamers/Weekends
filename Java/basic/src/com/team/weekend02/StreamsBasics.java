package com.team.weekend02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasics {

	private List<Trade> findLargeTradesUsingPreJava8(List<Trade> trades) {
		List<Trade> largeTrades = new ArrayList<Trade>();
		/*
		 * additional storage use.
		 * using throw away list.
		 * iterate thru trade list.
		 */
		for(Trade trade:trades) {
			if(trade.getQuatity() > 1000)
				largeTrades.add(trade);
		}
		
		return largeTrades;
	}
	
	private List<Trade> findLargeTradesUsing(List<Trade> trades) {
		
		//Add the functionality to the pipeline.
		List<Trade> largeTrades = trades.stream()  //trades.parallelStream()   
				.filter(trade -> trade.getQuatity() > 1000)
//				.filter(Trade::isCancelledTrade)
				.collect(Collectors.toList());
		
		System.out.println("Large trades: " +largeTrades);
		return null;
	}
	
	public static void main(String[] args) {
		StreamsBasics sb = new StreamsBasics();
		List<Trade> trades = TradeUtil.createTrades();
		sb.findLargeTradesUsingPreJava8(trades);
	}
	
}
