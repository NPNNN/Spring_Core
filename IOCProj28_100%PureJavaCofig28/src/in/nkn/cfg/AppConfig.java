package in.nkn.cfg;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="in.nkn")
public class AppConfig {

	static {
		System.out.println("AppConfig class file is loading...");

	}
	
	public AppConfig() {
		System.out.println("AppConfig :: Zero param constructor");
	}
	
	@Bean("dt")
	public LocalDateTime getSysDateTime() {
		System.out.println("AppConfig.getSysDateTime()");
		LocalDateTime date=LocalDateTime.now();
		
		return date;
	}
}
