import java.util.Properties;
import javax.mail.*;

public class MailSender {

	
	public static void main(String[] args){
		String to = "ultrafede94@gmail.com";
		String from = "federico.lupis@hotmail.it";
		String host = "localhost";
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host",host);
		Session session;
	}

}
