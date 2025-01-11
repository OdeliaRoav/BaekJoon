package j3p7;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color){
		this.model = model;
		this.color = color;
		
	}
	
	void turnOnDmb() {
		System.out.println("channel " + channel + "번 DMB 방송 수신 시작");
	}
	
	void changeCHannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel " + channel + "번으로 변경");		
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 종료");
	}
}
