package com.company.design;

import com.company.design.adapter.AirConditioner;
import com.company.design.adapter.Cleaner;
import com.company.design.adapter.Electronic110V;
import com.company.design.adapter.HairDryer;
import com.company.design.adapter.SocketAdapter;

public class AdapterMain {

	public static void main(String[] args) {
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);
		
		Cleaner cleaner = new Cleaner();
		Electronic110V adapter = new SocketAdapter(cleaner);
		connect(adapter);
		
		AirConditioner airConditioner = new AirConditioner();
		Electronic110V airAdapter = new SocketAdapter(airConditioner);
		connect(airAdapter);

	}

	// 콘센트
	public static void connect(Electronic110V electronic110v) {
		electronic110v.powerOn();
	}
}
