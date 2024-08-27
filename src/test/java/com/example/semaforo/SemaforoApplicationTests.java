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
		assertTrue(output.getOut().contains("vermelho"));
		assertTrue(output.getOut().contains("verde"));
		assertTrue(output.getOut().contains("amarelo"));
		//assertTrue(output.getOut().contains("azul"));
	}
}
