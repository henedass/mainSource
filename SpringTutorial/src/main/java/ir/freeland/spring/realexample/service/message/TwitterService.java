package ir.freeland.spring.realexample.service.message;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
