/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.util;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Kaique
 */
public class Relogio {

    public static void main(String args[]) throws IOException {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(
                new Runnable() {
                    public void run() {
                        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                    }
                }, 1, 1, TimeUnit.SECONDS);
    }
}
