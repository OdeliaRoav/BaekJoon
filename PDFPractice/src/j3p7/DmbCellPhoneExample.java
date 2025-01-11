package j3p7;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("삼성 갤럭시 S24", "검정");
		
		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.callStart();
		dmbCellPhone.callEnd();
		dmbCellPhone.hangUp();
		dmbCellPhone.sendText();
		dmbCellPhone.powerOff();
		
		
		DmbCellPhone dmbCellPhone1 = new DmbCellPhone("삼성 갤럭시 노트", "검정");
		
		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);
		
		
		dmbCellPhone1.powerOn();
		dmbCellPhone1.bell();
		dmbCellPhone1.callStart();
		dmbCellPhone1.callEnd();
		dmbCellPhone1.hangUp();
		dmbCellPhone1.draw();
		dmbCellPhone1.powerOff();
		
		

	}

}
