package ir.freeland.spring.realexample.service.message;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
