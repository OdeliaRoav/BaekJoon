package Home;

import java.util.LinkedList;
import java.util.Queue;


class Message{
	String command;
	String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to ;
	}
	

}

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messsageQueue = new LinkedList<Message>();
		
		
		messsageQueue.offer(new Message("sendMail", "홍길동"));
		messsageQueue.offer(new Message("sendSMS", "김자바"));
		messsageQueue.offer(new Message("sendkakoTalk", "홍두께"));
		
		while(!messsageQueue.isEmpty()) {
			Message message = messsageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendkakoTalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
		
	}

}
