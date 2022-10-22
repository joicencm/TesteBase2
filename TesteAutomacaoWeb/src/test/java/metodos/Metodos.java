package metodos;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexoes.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void uploadArquivo() throws AWTException {

		Robot robot = new Robot();
		robot.delay(1000);
		StringSelection ss = new StringSelection("C:\\Users\\joice\\Downloads\\TESTE.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);
	}

	public void validarMensagem(By elemento, String texto) {
		String textoCapturado = driver.findElement(elemento).getText();
		System.out.println("Mensagem Capturado" + textoCapturado);
		assertTrue(textoCapturado.contains(texto));
	}

	public void screenshot(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencia/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			System.err.println("**********Erro ao realizar a evidencia*********" + nomeEvidencia);
			System.err.println("****** Causa do erro ******" + e.getCause());
		}

	}

	public void aguardarElemento(Duration tempo, By elemento) {

		WebDriverWait wait = new WebDriverWait(driver, tempo);
		wait.until(ExpectedConditions.elementToBeClickable(elemento));

	}

	public void aguardarElemento(int i, By msg) {

	}

}
