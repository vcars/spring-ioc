package id.mandiri.day1.induction.be;

import id.mandiri.day1.induction.be.config.ApplicationConfig;
import id.mandiri.day1.induction.be.service.GreetingService;
import id.mandiri.day1.induction.be.service.OutputService;
import id.mandiri.day1.induction.be.service.TimeService;
import id.mandiri.day1.induction.be.service.impl.StoreFruits;
import id.mandiri.day1.induction.be.service.impl.StoreMeat;
import id.mandiri.day1.induction.be.service.impl.StoreVegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) throws Exception {


        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        GreetingService greetingService = context.getBean(GreetingService.class);
        System.out.println(greetingService.getGreeting("Fikar"));
        OutputService outputService = context.getBean(OutputService.class);

        StoreFruits storeFruits = context.getBean(StoreFruits.class);
        StoreVegetables storeVegetables = context.getBean(StoreVegetables.class);
        StoreMeat storeMeat = context.getBean(StoreMeat.class);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Fikar");
            Thread.sleep(3000);
        }

        System.out.println();
        System.out.println("SELAMAT DATANG DI TOKO SAYA");
        System.out.println("=============================");
        System.out.println("Buah");
        System.out.println(Arrays.toString(storeFruits.getNameProduct()));
        System.out.println("Harga Per Buah = "+ storeFruits.getPrice());
        System.out.println("Stock Per Buah = " + storeFruits.getStock() );
        System.out.println("HARGA TOTAL = " + storeFruits.getCalculateAmmout());
        System.out.println("=============================");
        System.out.println("Sayuran");
        System.out.println(Arrays.toString(storeVegetables.getNameProduct()));
        System.out.println("Harga Per Buah = "+ storeVegetables.getPrice());
        System.out.println("Stock Per Buah = " + storeVegetables.getStock() );
        System.out.println("HARGA TOTAL = " + storeVegetables.getCalculateAmmout());
        System.out.println("=============================");
        System.out.println("Daging");
        System.out.println(Arrays.toString(storeMeat.getNameProduct()));
        System.out.println("Harga Per Kilogram = "+ storeMeat.getPrice());
        System.out.println("Stock Per Kilogram = " + storeMeat.getStock() );
        System.out.println("HARGA TOTAL = " + storeMeat.getCalculateAmmout());

    }
}
