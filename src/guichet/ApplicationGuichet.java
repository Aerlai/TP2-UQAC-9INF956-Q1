package guichet;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationGuichet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileSystemXmlApplicationContext( "src/AuGuichet.xml" );

	}

}