package in.sagar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;

@SpringBootApplication
public class SpringProductThymeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(SpringProductThymeApplication.class, args);
		System.out.println(ctxt.getClass().getName());
	}

}
