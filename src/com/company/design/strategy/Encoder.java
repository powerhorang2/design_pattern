package com.company.design.strategy;

public class Encoder {

	private EncodingStrategy encodingStrategy;

	public String getMessage(String message) {
		return this.encodingStrategy.encode(message);
	}

	/**
	 * @param encodingStrategy the encodingStrategy to set
	 */
	public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
		this.encodingStrategy = encodingStrategy;
	}
	

}
