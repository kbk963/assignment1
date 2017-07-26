
public class Samsungs8 extends phone {
	String RAM="4GB";
	String MEMORY="64GB";
	String BACKCAM="13MP";
	String FRONTCAM="8MP";
	String PROCESSOR="snapdragon 835";
	String SCREENSIZE="5.8 inch";
	String phnName="Samsung S8";
	public void specifications()
	{ 
		
		System.out.println("\nSamsung s8 specifications \nRAM:"+RAM+"\nMEMORY:"+MEMORY+"\nBACK CAMERA:"+BACKCAM+"\nFRONT CAMERA:"+FRONTCAM+"\nPROCESSOR :"+PROCESSOR+"\nSCREEN SIZE:"+SCREENSIZE);
	}
	public int price(){
		return baseprice+50000;
	}
	public void preorder(String Name)
	{
		System.out.println("\nA Samsung phone has been preoredred in the name of "+Name);
	}
	public void preorder(String Name,String Phoneno)
	{
		System.out.println("\nA Samsung phone has been preoredred in the name of "+Name+"\nPhone Number"+Phoneno);
	}

}
