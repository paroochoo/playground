
package playground;

import org.junit.jupiter.api.Test;

public class JUnit5Test
{
	@Test
	void helloJUnit()
	{
		System.out.println("Hello JUnit5!");
		System.out.println("Java version: " + System.getProperty("java.version"));
		System.out.println("OS: " + System.getProperty("os.name"));
		System.out.println("OS version: " + System.getProperty("os.version"));
		Main.main(null);
	}
}
