import java.util.Scanner;
class  AtmCard
{
	static Scanner sc=new Scanner(System.in);
	static int user_pin=3432;
	static long user_pno=8098057285L;
	static long Acc_no=8748478378932L;
	static String user_name="Dhanaseka_Dev";

	public static void main(String[] args) throws Exception
	{
		System.out.println("Select the input");
		System.out.println("1.Change Pin\n2.Update Contact\n3.Details of Account Holder");
		int button=sc.nextInt();
		if(button==1)
		{
			System.out.println("Enter your contact number");
			long userenter_contact=sc.nextLong();
			if(userenter_contact==user_pno)
			{
				System.out.println("\tEnter the Otp:");
				Thread.sleep(1000);
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\tDear user Your Otp is"+sys_otp); 
				int user_enter_otp=sc.nextInt();
				if(user_enter_otp==sys_otp)
				{
					System.out.println("\t\tEnter your New PIN number");
					user_pin=sc.nextInt();
					System.out.println("\t\tYour New Pin is "+user_pin);
				}
			}
			else
			{
				System.out.println("\t\tVerificataion failed");
			}
		}
		if(button==2)
		{
			System.out.println("\t\t\t Enter PIN");
			int Entered_pin=sc.nextInt();
			if(Entered_pin==user_pin)
			{

				System.out.println("Processing....");
				Thread.sleep(1000);
				System.out.println("Enter Your New Contact number");
				user_pno=sc.nextLong();
				System.out.println("Contact Changed Successfully:"+user_pno);
			}
			else
			{
				System.out.println("\t\tVerification failed.");
			}
		}
		if(button==3)
		{
			System.out.println("\t\t\tEnter PIN");
			int user_entered_PIN=sc.nextInt();
			if(user_entered_PIN==user_pin)
			{
				System.out.println("Processing....");
				Thread.sleep(1000);
				System.out.println("User pin    :"+user_pin+"\ncontact_no  :"+user_pno+"\nUser_name   :"+user_name+"\nAccount_no  :"+Acc_no);
				
			}
		}
	}
}
