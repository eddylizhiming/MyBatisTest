package com.lzm.app;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/** 
 * @Description:整个web服务器初始化类
 * @author  XueJun Yang
 * @date Dec 7, 2015 1:27:26 PM 
 * @version V1.0    
 */
public class WebInitContextListener implements ServletContextListener {
	

	//private GAWLServer gawlserver = new GAWLServer();

	/**
	 * 环境初始化
	 * @param event
	 */
	public void contextInitialized(ServletContextEvent event) {
	    
		System.out.println("initial server!");
		
	    //gawlserver.launch();
	    
	}
	
	/**
	 * 销毁资源
	 * @param event
	 */
	
	public void contextDestroyed(ServletContextEvent event) {
		
	//	gawlserver.destroy();
		
	}
	
}

