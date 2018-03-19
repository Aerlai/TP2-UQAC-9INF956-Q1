package rmi;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationRMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileSystemXmlApplicationContext( "src/ViaRMI.xml" );

	}

}
