package com.longteng.designpatterns;

import com.longteng.designpatterns.strategy.Animal;
import com.longteng.designpatterns.strategy.AnimalFactory;
import com.longteng.designpatterns.strategy.Dog;
import com.longteng.designpatterns.singleton.SingLeton;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class DesignPatternsApplicationTests {


    public static void main(String[] args) {
        Collection collection = new ArrayList();
    }

    @Test
    public void testSingleton(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        threadPoolExecutor.execute(() -> {
            SingLeton singLeton = SingLeton.getSingLeton();
            //pool-1-thread-1  SingLeton@70194713
            System.out.println(singLeton);
        });
        //SingLeton singLeton = SingLeton.getSingLeton();
        //System.out.println(Thread.currentThread().getName());
        ////SingLeton@38af1bf6
        //System.out.println(singLeton);
    }

    @Test
    public void testFactory(){
        Animal animal = AnimalFactory.createAnimal(new Dog());
        animal.run();
        animal.swimming();
    }

    @Test
    public void testBuilder(){
    }
}
