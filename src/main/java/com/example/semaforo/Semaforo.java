package com.example.semaforo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Semaforo {

    private static final Logger LOG = LoggerFactory.getLogger(Semaforo.class);

    private String cor = Cores.VERMELHO.toString();

    public void mudaCor(Cores cor) {
        this.cor = cor.toString();
    }

    public void mudaCor() throws InterruptedException {
        Random random = new Random();
        LOG.info("Cor inicial do semáforo {}", this.cor);

        //tempo entre 20 e 40 segundos
        int tempo = random.nextInt(20000) + 20000;
        Thread.sleep(tempo);
        this.mudaCor(Cores.VERDE);
        LOG.info("Segunda cor do semáforo {}", this.cor);

        //tempo entre 20 e 40 segundos
        tempo = random.nextInt(20000) + 20000;
        Thread.sleep(tempo);
        this.mudaCor(Cores.AMARELO);
        LOG.info("Terceira cor do semáforo {}", this.cor);

        //tempo entre 5 e 6 segundos
        tempo = random.nextInt(1000) + 5000;
        Thread.sleep(tempo);
        this.mudaCor(Cores.VERMELHO);
        LOG.info("Quarta cor do semáforo {}", this.cor);
    }
}
