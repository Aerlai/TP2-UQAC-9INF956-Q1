package rmi;


import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServeurRMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// static Logger log = Logger.getLogger(MyClass.class);
		// TODO Auto-generated method stub
		new FileSystemXmlApplicationContext( "src/ServeurRMI.xml" );
	}

}
