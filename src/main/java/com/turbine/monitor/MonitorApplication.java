package com.turbine.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringCloudApplication
@EnableHystrixDashboard
@EnableTurbine
public class MonitorApplication {
	/**
	 *  ① hystrix dashboard page :    http://host-name:port/hystrix.stream
 	 *  ② turbine monitor page : http://host-name:port/turbine.stream
	 */
	public static void main(String[] args){
		SpringApplication.run(MonitorApplication.class, args);
	}

}
