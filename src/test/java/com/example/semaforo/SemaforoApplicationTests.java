package com.example.semaforo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

@ExtendWith(OutputCaptureExtension.class)
@SpringBootTest
class SemaforoApplicationTests {

	@Autowired
	private Semaforo semaforo;

	@Test
	void verificaCorDoSemaforo(CapturedOutput output) throws InterruptedException {
		semaforo.mudaCor();
		assertTrue(output.getOut().contains("Cor inicial do semáforo VERMELHO"));
		assertTrue(output.getOut().contains("Segunda cor do semáforo VERDE"));
		assertTrue(output.getOut().contains("Terceira cor do semáforo AMARELO"));
		assertTrue(output.getOut().contains("Quarta cor do semáforo VERMELHO"));
	}
}
