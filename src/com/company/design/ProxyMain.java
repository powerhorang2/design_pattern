package com.company.design;

import java.util.concurrent.atomic.AtomicLong;

import com.company.design.aop.AopBrowser;
import com.company.design.proxy.IBrowser;

public class ProxyMain {

	public static void main(String[] args) {
		// proxy 적용 전
		/*
		 * Browser browser = new Browser("www.naver.com"); 
		 * browser.show();
		 * browser.show();
		 * browser.show();
		 * browser.show();
		 */

		// proxy 적용 후 (cache)
		/*
		 * IBrowser browser = new BrowserProxy("www.naver.com");
		 * browser.show();
		 * browser.show();
		 * browser.show();
		 * browser.show();
		 * browser.show();
		 */

		AtomicLong start = new AtomicLong();
		AtomicLong end = new AtomicLong();

		IBrowser aopBrowser = new AopBrowser("www.naver.com",
			() -> {
				System.out.println("before");
				start.set(System.currentTimeMillis());
			},
			() -> {
				long now = System.currentTimeMillis();
				end.set(now - start.get());
			}

		);
		
		aopBrowser.show();
		System.out.println("loading time : " + end.get());
		
		aopBrowser.show();
		System.out.println("loading time : " + end.get());
	}

}
