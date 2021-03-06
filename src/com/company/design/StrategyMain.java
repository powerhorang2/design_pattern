package com.company.design;

import com.company.design.strategy.AppendStrategy;
import com.company.design.strategy.Base64Strategy;
import com.company.design.strategy.Encoder;
import com.company.design.strategy.EncodingStrategy;
import com.company.design.strategy.NormalStrategy;

public class StrategyMain {

	public static void main(String[] args) {
		Encoder encoder = new Encoder();
		
		// base64
		EncodingStrategy base64 = new Base64Strategy();
		
		// normal
		EncodingStrategy normal = new NormalStrategy();
		
		String message = "hello java";
		
		encoder.setEncodingStrategy(base64);
		String base64Result = encoder.getMessage(message);
		System.out.println(base64Result);
		
		encoder.setEncodingStrategy(normal);
		String normalResult = encoder.getMessage(message);
		System.out.println(normalResult);
		
		encoder.setEncodingStrategy(new AppendStrategy());
		String appendResult = encoder.getMessage(message);
		System.out.println(appendResult);
	}

}
