package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HysterixDashboardServer {

    public static void main(String[] args) {
        SpringApplication.run(HysterixDashboardServer.class, args);
    }
}
