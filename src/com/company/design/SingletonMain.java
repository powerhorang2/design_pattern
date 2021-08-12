package com.company.design;

import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class SingletonMain {

	public static void main(String[] args) {
		/* 싱글톤 */
		
		AClazz aClazz = new AClazz();
		BClazz bClazz = new BClazz();
		
		SocketClient aClient = aClazz.getSocketClient();
		SocketClient bClient = bClazz.getSocketClient();
		
		System.out.println("두개의 객체가 동일한가? (싱글톤 연습)");
		System.out.println(aClient.equals(bClient));
		
	}
	
}
