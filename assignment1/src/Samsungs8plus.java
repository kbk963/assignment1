
public class Samsungs8plus extends Samsungs8 {
	String SCREENSIZE="6.2 inch";
	public void specifications()
	{ 
		System.out.println("\nSamsung s8plus specifications \nRAM:"+RAM+"\nMEMORY:"+MEMORY+"\nBACK CAMERA:"+BACKCAM+"\nFRONT CAMERA:"+FRONTCAM+"\nPROCESSOR :"+PROCESSOR+"\nSCREEN SIZE:"+SCREENSIZE);
	}
	public int price(){
		return baseprice+55000;
	}

}
