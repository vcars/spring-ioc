package id.mandiri.day1.induction.be.config;

import id.mandiri.day1.induction.be.service.GreetingService;
import id.mandiri.day1.induction.be.service.OutputService;
import id.mandiri.day1.induction.be.service.TimeService;
import id.mandiri.day1.induction.be.service.impl.StoreFruits;
import id.mandiri.day1.induction.be.service.impl.StoreMeat;
import id.mandiri.day1.induction.be.service.impl.StoreVegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Value("Hallo")
    private String greeting;

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private TimeService timeService;

    @Bean
    public TimeService timeService(){
        return new TimeService(true);
    }

    @Bean
    public OutputService outputService() {
        return new OutputService(greetingService,timeService);
    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greeting);
    }

    @Bean
    public StoreFruits storeFruits() { return new StoreFruits();}

    @Bean
    public StoreVegetables storeVegetables() {return new StoreVegetables();}

    @Bean
    public StoreMeat storeMeat() { return new StoreMeat();}


}

