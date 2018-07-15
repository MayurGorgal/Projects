

//this package containing graphics related activities
import java.awt.*; 
//this package is an extention to the java.awt package
import javax.swing.*;

//this package is used for event handling activities
import java.awt.event.*;

//this package is used to handle text,dates,messages,numbers
import java.text.*;

//this package is used to add the clock in the frame
import java.util.Date;


//this class is used to display banner on the screen
class SplashScreen
{
 
  //method
  public void Splash()
  {
    JWindow window = new JWindow();
  
   //window.setLayout(null);
  
    //setting the duration to the banner
    int duration =30000;
    int width = 574; 
    int height =408;
 
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
 
    int x = (screen.width - width) / 2;
    int y = (screen.height - height) / 2;
 
    window.setBounds(x, y, width, height);
    window.getContentPane().add(new JLabel("UNIVERSAL BANKING PORTAL"),"Center");
 
    //attaching the label to the banner
    JLabel label=new JLabel("UNIVERSAL BANKING PORTAL",JLabel.CENTER);
    label.setLayout(null);
    Font fobj1=new Font("Verdana",Font.BOLD,30);
    label.setFont(fobj1);  
    label.setLocation(100,303);
    window.getContentPane().add(label,"Center");
    Color cl=new Color(0,70,105);
    window.getContentPane().setBackground(cl);
    label.setForeground(Color.white);
    label.setVisible(true);
    window.setVisible(true);
   

    JLabel copyrt = new JLabel("Copyright ©2018 Marvellous Infosystems ", JLabel.CENTER);
    copyrt.setLayout(null);
    copyrt.setFont(new Font("Verdana", Font.BOLD, 12));
    copyrt.setLocation(500,1200);
    window.getContentPane().add(copyrt,BorderLayout.SOUTH);
    copyrt.setForeground(Color.white);
    copyrt.setVisible(true);
    window.setVisible(true);
    
    try
    {
      //this statement makes banner to wait for perticular duration
      Thread.sleep(duration);
    }
    catch(Exception e) 
    {
    }
    //banner will be unvisible after perticular furation
    window.setVisible(false);
  }
}


//This is the code for login frame
class Login_Frame extends JFrame
{
   //creating Container class Refferenec
   Container c;
   
   //creating JFrame class Refference
   JFrame frame;
   
   //Constructor which is used to create the Frame in java useing swing
   public Login_Frame()
   {

     frame=new JFrame();
     c=frame.getContentPane();
     c.setLayout(null);
     frame.setTitle("UNIVERSAL BANKING SYSTEM");
     frame.setBounds(300,100,574,408);
     frame.setVisible(true);
     frame.setResizable(false);
     Color cl=new Color(0,70,105);
     c.setBackground(cl);
    
     //setting the image as a icon image
     ImageIcon image=new ImageIcon("Marvellous_Infosystems.png");
     frame.setIconImage(image.getImage()); 
 
     //Closeing the frame when we press on close button
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


     //this code is used to add clock to the frame
     final JLabel timeLabel = new JLabel();
     timeLabel.setForeground(Color.WHITE);
     timeLabel.setBounds(450,5,120,40);
     Font f1=new Font("Arial",Font.BOLD,14);
     timeLabel.setFont(f1);
     frame.add(timeLabel);
  
     final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
     ActionListener timerListener = new ActionListener()
     {
        public void actionPerformed(ActionEvent e)
        {
            Date date = new Date();
            String time = timeFormat.format(date);
            timeLabel.setText(time);
         }
      };
      Timer timer = new Timer(1000, timerListener);
      timer.setInitialDelay(0);
      timer.start();
 
  }
}


//This class is used to display the login-Registration frame to the end user
class Signup_Registration extends Login_Frame implements ActionListener
{
   
   //creating the label
     JLabel label1=new JLabel("WELCOME TO UNIVERSAL BANKING PORTAL");

   //creating the signup and registration button
     JButton button1=new JButton("Sign Up");
     JButton button2=new JButton("Registration"); 


     public Signup_Registration()
     {
       //adding the header to the frame
       label1.setBounds(30,100,500,40);
       c.add(label1);
       Font f2=new Font("Arial",Font.BOLD,20);
       label1.setFont(f2);
       label1.setForeground(Color.WHITE);
      
      
       //adding buttons to the frame
       button1.setBounds(110,220,120,30);
       Font f=new Font("Arial",Font.BOLD,15);
       button1.setFont(f);
       c.add(button1);

       button2.setBounds(240,220,160,30);
       Font f1=new Font("Arial",Font.BOLD,15);
       button2.setFont(f1);
       c.add(button2); 

      //attach button to addActionListner(class name)
      button1.addActionListener(this);
      button1.setActionCommand("Signup");
      //attach button to addActionListner(class name)
      button2.addActionListener(this);
      button2.setActionCommand("Registration");

     }
     //this method is used to perform event handling machanism
     public void actionPerformed(ActionEvent ev)
     {
       if(ev.getActionCommand().equals("Signup"))
       {
	 //this method is used to remove/delete previous frame
         frame.dispose(); 
	 //this method is used to generate next frame
         Username_Password obj1=new Username_Password();
       }
       else
       {
         frame.dispose();
	 Registration_Form obj1=new Registration_Form();
       }
     }
}

//this class is used to display the registration page to the end user
class Registration_Form extends Login_Frame implements ActionListener
{
        //Creating the lable which is used as header
	JLabel header=new JLabel("Registration Form");

        //creating the lable
        JLabel Fname=new JLabel("First Name");
        JLabel Sname=new JLabel("Surname");
        JLabel MobileOrEmail=new JLabel("Mobile or Email");
        JLabel Password=new JLabel("Password");
        JLabel Gender=new JLabel("Gender");
        JLabel DOB=new JLabel("date of Birth");
      
        //creating the textfield
        JTextField text1=new JTextField();
        JTextField text2=new JTextField();
        JTextField text3=new JTextField();
     
        //creating the password field
  	JPasswordField pass1=new JPasswordField();
 
        //creating the radio buttons
	JRadioButton radio1=new JRadioButton("male");
	JRadioButton radio2=new JRadioButton("female");
  
        //creating the check box
        JCheckBox cb=new JCheckBox("I accept terms and condition");

        //Creating the Button
	JButton button1=new JButton("Create An Account");
        JButton button2=new JButton("Back");
     //constructor
     public Registration_Form()
     {

       //adding label to the frame
       header.setBounds(30,10,300,40);
       c.add(header);
       Font f2=new Font("Arial",Font.BOLD,20);
       header.setFont(f2);
       header.setForeground(Color.WHITE);

       //adding the lables to the frame
       Fname.setBounds(30,50,150,50);
       c.add(Fname);
       Fname.setForeground(Color.WHITE);

       Sname.setBounds(30,90,150,50);
       c.add(Sname);
       Sname.setForeground(Color.WHITE); 

       MobileOrEmail.setBounds(30,130,150,50);
       c.add(MobileOrEmail);
       MobileOrEmail.setForeground(Color.WHITE);
  
       Password.setBounds(30,170,150,50);
       c.add(Password);
       Password.setForeground(Color.WHITE);
   
       Gender.setBounds(30,210,150,50);
       c.add(Gender);
       Gender.setForeground(Color.WHITE);

       DOB.setBounds(30,250,150,50);
       c.add(DOB);
       DOB.setForeground(Color.WHITE);

       //adding textfield passwordfield radiobutton checkboxes to the frame
       text1.setBounds(150,60,120,30); 
       c.add(text1);
  
       text2.setBounds(150,100,120,30);
       c.add(text2);

       text3.setBounds(150,140,120,30);
       c.add(text3);

       pass1.setBounds(150,180,120,30);
       c.add(pass1);

      //creating color class object
      Color cl=new Color(0,70,105);

      //adding radio buttons to the frame
      radio1.setBounds(150,220,60,20);
      radio1.setBackground(cl);
      radio1.setForeground(Color.WHITE);
      c.add(radio1);
      radio2.setBounds(230,220,80,20);
      radio2.setBackground(cl);
      radio2.setForeground(Color.WHITE);
      c.add(radio2);
   
      //this class is used to select only one radio button at a time
      //we are grouping the radio buttons
      ButtonGroup bg=new ButtonGroup();
      bg.add(radio1);
      bg.add(radio2);

      //creating combobox for day      
      String day_arr[]=new String[31];
      for(int i=1;i<=31;i++)
      {
         day_arr[i-1]=Integer.toString(i);
      }
       
      JComboBox day=new JComboBox(day_arr);
      day.setBounds(150,260,50,25);
      c.add(day);

      //creating combobox for Month      
      String month_arr[]={"Jan","Feb","Mar","Apr","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
      JComboBox month=new JComboBox(month_arr);
      month.setBounds(220,260,80,25);
      c.add(month);

      //creating combobox for year      
      String year_arr[]=new String[90];
      for(int i=1951;i<=2040;i++)
      {
        year_arr[i-1951]=Integer.toString(i);
      }
      JComboBox year=new JComboBox(year_arr);
      year.setBounds(330,260,60,25);
      c.add(year);

      //adding the checkbox  to the frame
      cb.setBounds(150,300,250,30);
      cb.setBackground(cl);
      cb.setForeground(Color.WHITE);
      c.add(cb);

      //attaching button to the frame
      button1.setBounds(150,340,190,30);
      Font f=new Font("Arial",Font.BOLD,15);
      button1.setFont(f);
      c.add(button1);

      button2.setBounds(350,340,120,30);
      Font f1=new Font("Arial",Font.BOLD,15);
      button2.setFont(f1);
      c.add(button2);

      //attach button to actionListener to perorm event handling
	button1.addActionListener(this);
        button1.setActionCommand("Create An Account");
        button2.addActionListener(this);
        button2.setActionCommand("Back");
     }     
     //this method is used to perform action when button is pressed
     public void actionPerformed(ActionEvent ev)
     {

        if(ev.getActionCommand().equals("Back"))
         {
           frame.dispose(); 
 	   Signup_Registration obj1=new Signup_Registration();
         }
         if(ev.getActionCommand().equals("Create An Account"))
	 {
	     if(cb.isSelected())
             {
              frame.dispose(); 
              Username_Password obj1=new Username_Password();
	     }
	     else
	     {
	       JOptionPane.showMessageDialog(this, "Please Agree the terms and conditions");
 	      }
	 }
       
    }
}


//this class is used to display login page to the frame
class Username_Password extends Login_Frame implements ActionListener 
{
 
      //creating the header 
      JLabel label=new JLabel("Login Portal");

      //creating the lable
      JLabel label1=new JLabel("username");
      JLabel label2=new JLabel("password");
        
      //creating the textfield
      JTextField text=new JTextField();
      
      //creating one password field
      JPasswordField pass=new JPasswordField();
      
      //creating the button
      JButton button1=new JButton("submit");
      JButton button2=new JButton("Back"); 
      static int iCnt=1;
      
      //constructor
      Username_Password()
      {
        // super.Login_Frame();
     
       //adding the header to the frame	
       label.setBounds(30,10,250,40);
       c.add(label);
       Font f2=new Font("Arial",Font.BOLD,24);
       label.setFont(f2);
       label.setForeground(Color.WHITE);
     
       //adding the labels to the frame
       label1.setBounds(30,80,150,50);
       c.add(label1);
       label1.setForeground(Color.WHITE);
  
       label2.setBounds(30,150,150,50);
       c.add(label2);
       label2.setForeground(Color.WHITE);

       //adding textfield to the frame
       text.setBounds(110,90,120,30);
       c.add(text);
       
       //adding passwordfield to the frame
       pass.setBounds(110,160,120,30);
       c.add(pass);

       //adding the button to the frame
       button1.setBounds(110,220,120,30);
       Font f=new Font("Arial",Font.BOLD,15);
       button1.setFont(f);
       c.add(button1);

       button2.setBounds(240,220,120,30);
       Font f1=new Font("Arial",Font.BOLD,15);
       button2.setFont(f);
       c.add(button2);

      //attach button to addActionListner(class name)  
      button1.addActionListener(this);
      button1.setActionCommand("Submit");
      button2.addActionListener(this);
      button2.setActionCommand("Back");

   }
   //this method gets called automatically when action is taken usign button
   public void actionPerformed(ActionEvent ev)
   {
       if(ev.getActionCommand().equals("Submit"))
       { 
	 String username=text.getText();
         String password=pass.getText();
         if(username.equals("admin") && password.equals("admin")) 
    	 {
	   frame.dispose();
           Invest_Loan obj1=new Invest_Loan();
         }
  	 else
  	 {	
           JOptionPane.showMessageDialog(this, "Invalid Username or Password");
	  
	   if(iCnt==3)
           {
	     try
	     {
	       //this method is used to display dialough box on screen
	       JOptionPane.showMessageDialog(this, "Wait for 30 seconds");
               Thread.currentThread().sleep(30000);
	     }
	     catch(Exception Ee)
	     {
              iCnt=0;
	     }
	     finally
	     {
	      iCnt=0;
	     }
          }
	 iCnt++;
	}
	 //this method are used to reset the textfield and password field
         text.setText(null);
         pass.setText(null);
      }
      if(ev.getActionCommand().equals("Back"))
      {
         frame.dispose(); 
 	 Signup_Registration obj1=new Signup_Registration();
      }
   }
}


//this class is used to display choices to the end user
//i.e Invest Or Loan
class Invest_Loan extends Login_Frame implements ActionListener
{
  
      //creating the button
      JButton button1=new JButton("Invest");
      
      JButton button2=new JButton("Loan");
   
      //constructor
      Invest_Loan()
      {
        //super.Login_Frame();
        
        //adding button to the frame
        button1.setBounds(180,120,120,30);
        Font f=new Font("Arial",Font.BOLD,15);
        button1.setFont(f);
        c.add(button1);

        button2.setBounds(180,170,120,30);
        Font f1=new Font("Arial",Font.BOLD,15);
        button2.setFont(f1);
        c.add(button2);
      
       //attach button to addActionListner(class name)
       button1.addActionListener(this);
       button1.setActionCommand("Invest");
       //attach button to addActionListner(class name)
       button2.addActionListener(this);
       button2.setActionCommand("Loan");
     }
     //this method gets called automatically when action is performed using Button
     public void actionPerformed(ActionEvent ev)
     {
       if(ev.getActionCommand().equals("Invest"))
       {
        frame.dispose(); 
        InvestEmi obj1=new InvestEmi();
       }
       else
       {
	 frame.dispose();
         LoanEmi obj1=new LoanEmi();
       }
     }
}

//this class is used to display Loan_Portal frame to the end user
class LoanEmi extends Login_Frame implements ActionListener
{

      //this Label is used to add header to the frame
      JLabel Loan_Portal=new JLabel("Loan Portal");
 
      //creating the lable
      JLabel label1=new JLabel("Enter amount"); 
      JLabel label2=new JLabel("Enter Duration");
      JLabel label3=new JLabel("Estimated EMI");    
     
      //creating the textfield
      JTextField Amount=new JTextField();
      JTextField Duration=new JTextField();
      JTextField Emi=new JTextField();
      
      //creating the button
      JButton button1=new JButton("Submit");
      JButton button2=new JButton("Back");
      //constructor
      public LoanEmi()
      { 
        //super.Login_Frame();

        //adding header to the frame
        Loan_Portal.setBounds(20,20,280,20);
        Loan_Portal.setForeground(Color.WHITE);
        Font f2=new Font("Arial",Font.BOLD,28);
        Loan_Portal.setFont(f2);
        c.add(Loan_Portal);

	//adding label to the frame
        label1.setBounds(20,80,150,50);
        c.add(label1);
        label1.setForeground(Color.WHITE);
       
        label2.setBounds(20,140,150,50);
        c.add(label2);
        label2.setForeground(Color.WHITE);
       
        label3.setBounds(20,200,150,50);
        c.add(label3);
        label3.setForeground(Color.WHITE); 
       
        Amount.setBounds(130,90,120,30);
        c.add(Amount);
        
        Duration.setBounds(130,150,120,30);
        c.add(Duration);
       
        Emi.setBounds(130,210,120,30);
        Emi.setEditable(false);
        c.add(Emi);
      
        //adding the button to the frame
        button1.setBounds(130,260,120,30);
        Font f=new Font("Arial",Font.BOLD,15);
        button1.setFont(f);
        c.add(button1);
	
	button2.setBounds(270,260,120,30);
        Font f1=new Font("Arial",Font.BOLD,15);
        button2.setFont(f);
        c.add(button2);

       //attach button to addActionListner(class name)
       button1.addActionListener(this);
       button1.setActionCommand("Submit");
       button2.addActionListener(this);
       button2.setActionCommand("Back");

     }
     //this method gets automatically invoked by JVM when action was performed
     public void actionPerformed(ActionEvent ev)
     {
        if(ev.getActionCommand().equals("Submit"))
        { 

          String amount=Amount.getText();
          String duration=Duration.getText();
          double Amount1=Double.parseDouble(amount);
          int Duration1=Integer.parseInt(duration);       
          double IntrestRate=7.15;
       
          double CalcEmi=(Amount1*Duration1*IntrestRate)/1000;
          Double iNum=new Double(CalcEmi);
          String str=iNum.toString();
          Emi.setText(str);
          Amount.setText(null);
          Duration.setText(null);
	}
        if(ev.getActionCommand().equals("Back"))
        {
          frame.dispose();
          Invest_Loan obj1=new Invest_Loan(); 
        }
     }
}

//This class is used to display the choices to the user
//about Investment i.e Fix Deposite Mutual Fund SIP
class InvestEmi extends Login_Frame implements ActionListener
{
      //creating the button
      JButton button1=new JButton("Fix Deposite");
  
      JButton button2=new JButton("Mutual Fund");
      
      JButton button3=new JButton("SIP");

      JButton button4=new JButton("Back");
      //Constructor
      public InvestEmi()
      {
    	//super.Login_Frame();
   	
	//attaching button to the frame
	button1.setBounds(180,120,180,30);
        Font f=new Font("Arial",Font.BOLD,15);
        button1.setFont(f);
        c.add(button1);

        button2.setBounds(180,170,180,30);
        Font f1=new Font("Arial",Font.BOLD,15);
        button2.setFont(f1);
        c.add(button2);

        button3.setBounds(180,210,180,30);
        Font f2=new Font("Arial",Font.BOLD,15);
        button2.setFont(f2);
        c.add(button3);


        button4.setBounds(180,260,180,30);
        Font f3=new Font("Arial",Font.BOLD,15);
        button4.setFont(f3);
        c.add(button4);

        //attach button to addActionListner(class name)
        button1.addActionListener(this);
        button1.setActionCommand("Fix Deposite");
        //attach button to addActionListner(class name)
        button2.addActionListener(this);
        button2.setActionCommand("Mutual Fund");
        //attach button to addActionListner(class name)
        button3.addActionListener(this);
        button3.setActionCommand("SIP");
  
        //attach button to addActionListner(class name)
        button4.addActionListener(this);
        button4.setActionCommand("Back");
    
     }
     //this method gets automatically invoked when acton gets performed
     public void actionPerformed(ActionEvent ev)
     {
       if(ev.getActionCommand().equals("Fix Deposite"))
       {
	 frame.dispose();
         Fix_Deposite obj1=new Fix_Deposite();
       }
       else if(ev.getActionCommand().equals("Mutual Fund"))
       {
	 frame.dispose();
         Mutual_Fund obj1=new Mutual_Fund();
       }
       else if(ev.getActionCommand().equals("SIP"))
       {
	 frame.dispose();
         SIP obj1=new SIP();
       }
       else
       {
	 frame.dispose();
	 Invest_Loan obj1=new Invest_Loan();
       }
    }
}


//This class display thr Fix Deposite Portal
class Fix_Deposite extends Login_Frame implements ActionListener
{


      //this label is used to give header to the frame
      JLabel Fix_Deposite_Portal=new JLabel("Fix Deposite Portal");

      //creating the label
      JLabel label1=new JLabel("Enter amount");
      JLabel label2=new JLabel("Enter Duration(Months)");
      JLabel label3=new JLabel("Age");    
  
      //creating the textfield
      JTextField Amount=new JTextField();
      JTextField Duration=new JTextField();
      JTextField Age=new JTextField();
      JTextField FinalAmount=new JTextField();

      //creating the button
      JButton button1=new JButton("Calculate");
      JButton button2=new JButton("Back");

      //Constructor
      public Fix_Deposite()
      { 
        //super.Login_Frame();
   
        //Attaching header to the frame
        Fix_Deposite_Portal.setBounds(20,20,280,20);
        Fix_Deposite_Portal.setForeground(Color.WHITE);
        Font f2=new Font("Arial",Font.BOLD,20);
        Fix_Deposite_Portal.setFont(f2);
        c.add(Fix_Deposite_Portal);


        //attaching label to the frame
        label1.setBounds(20,90,150,50);
        c.add(label1);
        label1.setForeground(Color.WHITE);
  
        label2.setBounds(20,150,200,50);
        c.add(label2);
        label2.setForeground(Color.WHITE);
  
        label3.setBounds(20,210,150,50);
        c.add(label3);
        label3.setForeground(Color.WHITE); 
  
        //attaching textfields to the frame
        Amount.setBounds(200,100,120,30);
        c.add(Amount);
  
        Duration.setBounds(200,160,120,30);
        c.add(Duration);
  
        Age.setBounds(200,220,120,30);
        c.add(Age);
     
        //making final amount textfield uneditable
        FinalAmount.setBounds(340,280,120,30);
        FinalAmount.setEditable(false);
        c.add(FinalAmount);

	//attaching button to the frame
        button1.setBounds(200,280,120,30);
        Font f=new Font("Arial",Font.BOLD,15);
        button1.setFont(f);
        c.add(button1);

        button2.setBounds(200,340,120,30);
        Font f1=new Font("Arial",Font.BOLD,15);
        button2.setFont(f1);
        c.add(button2);
      
        //attach button to addActionListner(class name)
        button1.addActionListener(this);
  	button1.setActionCommand("Calculate");
        button2.addActionListener(this);
  	button2.setActionCommand("Back");

     }
     //This method gets invoked by JVM when action was performed
     public void actionPerformed(ActionEvent ev)
     {
       if(ev.getActionCommand().equals("Calculate"))
	{
     	  String amount=Amount.getText();
     	  String duration=Duration.getText();
     
     	  double Amount1=Double.parseDouble(amount);
     	  int Duration1=Integer.parseInt(duration);       
     	  double IntrestRate=7.15;
       
     	  double CalcProfit=Amount1+(Amount1*IntrestRate*Duration1)/100;
     	  Float iNum=new Float((float)CalcProfit);
     	  String str=iNum.toString();
     	  FinalAmount.setText(str);
     	
     	  Amount.setText(null);
     	  Duration.setText(null);
     	  Age.setText(null);       
	}
 	if(ev.getActionCommand().equals("Back"))
	{
	  frame.dispose();
	  Invest_Loan obj1=new Invest_Loan();
	}
     }
}

//This class display the Mutual Fund Portal frame
class Mutual_Fund extends Login_Frame implements ActionListener
{


      //this label is used to give header to the frame
      JLabel Mutual_Fund_Portal=new JLabel("Mutual Fund Portal");

      //creating the labels
      JLabel label1=new JLabel("Enter amount");
      JLabel label2=new JLabel("Enter Duration(Months)");
      JLabel label3=new JLabel("Age");    
  
      //creating the textfield
      JTextField Amount=new JTextField();
      JTextField Duration=new JTextField();
      JTextField Age=new JTextField();
      JTextField FinalAmount=new JTextField();

      //creating the button
      JButton button1=new JButton("Calculate");
      JButton button2=new JButton("Back");
      //constructor
      public Mutual_Fund()
      { 
        //super.Login_Frame();
   
 	//Attaching Mutaul Fund Portal to the frame
        Mutual_Fund_Portal.setBounds(20,20,280,20);
        Mutual_Fund_Portal.setForeground(Color.WHITE);
        Font f2=new Font("Arial",Font.BOLD,20);
        Mutual_Fund_Portal.setFont(f2);
        c.add(Mutual_Fund_Portal);

	//attaching label to the frame
        label1.setBounds(20,80,150,50);
        c.add(label1);
        label1.setForeground(Color.WHITE);
  
        label2.setBounds(20,140,200,50);
        c.add(label2);
        label2.setForeground(Color.WHITE);
  
        label3.setBounds(20,200,150,50);
        c.add(label3);
        label3.setForeground(Color.WHITE); 
  
        //attaching textfields to the frame
        Amount.setBounds(200,90,120,30);
        c.add(Amount);
  
        Duration.setBounds(200,150,120,30);
        c.add(Duration);
  
        Age.setBounds(200,210,120,30);
        c.add(Age);
     
        //making the textfield uneditable
        FinalAmount.setBounds(340,270,120,30);
        FinalAmount.setEditable(false);
        c.add(FinalAmount);

	//attaching the button to the frame
        button1.setBounds(200,270,120,30);
        Font f=new Font("Arial",Font.BOLD,15);
        button1.setFont(f);
        c.add(button1);

        button2.setBounds(200,340,120,30);
        Font f1=new Font("Arial",Font.BOLD,15);
        button2.setFont(f1);
        c.add(button2);

        //attach button to addActionListner(class name)
        button1.addActionListener(this);
	button1.setActionCommand("Calculate");
        button2.addActionListener(this);
	button2.setActionCommand("Back");
     }
   
     public void actionPerformed(ActionEvent ev)
     {
	if(ev.getActionCommand().equals("Calculate"))
	{
       	  String amount=Amount.getText();
       	  String duration=Duration.getText();
     
          double Amount1=Double.parseDouble(amount);
          int Duration1=Integer.parseInt(duration);       
          double IntrestRate=11.15;
       
          double CalcProfit=Amount1+(Amount1*IntrestRate*Duration1)/100;
          Double iNum=new Double(CalcProfit);
          String str=iNum.toString();
          FinalAmount.setText(str);

          Amount.setText(null);
          Duration.setText(null);
          Age.setText(null);    
       }
       if(ev.getActionCommand().equals("Back"))   
       {
	frame.dispose();
	Invest_Loan obj1=new Invest_Loan();
       }
   }
}


//This class display the SIP Portal frame to the end user
class SIP extends Login_Frame implements ActionListener
{

      //this label is used to give header to the frame
      JLabel Systematic_Investment_Plan_Portal=new JLabel("Systematic Investment Plan");

      //creating the labels
      JLabel label1=new JLabel("Enter amount");
      JLabel label2=new JLabel("Enter Duration(Months)");
      JLabel label3=new JLabel("Age");    
  
      //creating the textfield
      JTextField Amount=new JTextField();
      JTextField Duration=new JTextField();
      JTextField Age=new JTextField();
      JTextField FinalAmount=new JTextField();

      //creating the checkbox
      JCheckBox cb=new JCheckBox("KYC");

      //creating the button
      JButton button1=new JButton("Calculate");
      JButton button2=new JButton("Back");
     
      //constructor
      public SIP()
      { 
        //super.Login_Frame();
 
	//attaching the header to the frame
        Systematic_Investment_Plan_Portal.setBounds(20,20,300,20);
        Systematic_Investment_Plan_Portal.setForeground(Color.WHITE);
        Font f2=new Font("Arial",Font.BOLD,18);
        Systematic_Investment_Plan_Portal.setFont(f2);
        c.add(Systematic_Investment_Plan_Portal);

        //attaching labels to the frame
        label1.setBounds(20,80,150,50);
        c.add(label1);
        label1.setForeground(Color.WHITE);
  
        label2.setBounds(20,140,200,50);
        c.add(label2);
        label2.setForeground(Color.WHITE);
  
        label3.setBounds(20,200,150,50);
        c.add(label3);
        label3.setForeground(Color.WHITE); 

	//attaching the textfields to the frame
        Amount.setBounds(200,90,120,30);
        c.add(Amount);
  
        Duration.setBounds(200,150,120,30);
        c.add(Duration);
  
        Age.setBounds(200,210,120,30);
        c.add(Age);
     
        //making the textfield non-editable
        FinalAmount.setBounds(340,270,120,30);
        FinalAmount.setEditable(false);
        c.add(FinalAmount);

        //creating Color class object
        Color cl=new Color(0,70,105);

        //attaching Combo Box to the frame
        cb.setBounds(340,90,65,25);  
        cb.setBackground(cl);
        cb.setForeground(Color.WHITE);    
        c.add(cb);

        //attaching the button to the frame
        button1.setBounds(200,270,120,30);
        Font f=new Font("Arial",Font.BOLD,15);
        button1.setFont(f);
        c.add(button1);
      
        button2.setBounds(200,340,120,30);
        Font f1=new Font("Arial",Font.BOLD,15);
        button2.setFont(f1);
        c.add(button2);
      
       //attach button to addActionListner(class name)
       button1.addActionListener(this);
       button1.setActionCommand("Calculate");
       button2.addActionListener(this);
       button2.setActionCommand("Back"); 
    }

    //This method gets automatically invoked by JVM when action is performed
    public void actionPerformed(ActionEvent ev)
    {     
       if(ev.getActionCommand().equals("Calculate"))
       {
         String amount=Amount.getText();
         String duration=Duration.getText();
      
         if(cb.isSelected())
         {
           double Amount1=Double.parseDouble(amount);
           int Duration1=Integer.parseInt(duration);       
           double IntrestRate=10.15;
       
           double CalcProfit=Amount1+(Amount1*IntrestRate*Duration1)/100;
           Double iNum=new Double(CalcProfit);
           String str=iNum.toString();
           FinalAmount.setText(str);
	  
     	   Amount.setText(null);
           Duration.setText(null);
           Age.setText(null);    
        }
        else
        {
	  JOptionPane.showMessageDialog(this, "Please Select KYC");	  
        }
      }
      if(ev.getActionCommand().equals("Back"))
      {
        frame.dispose();
        Invest_Loan obj1=new Invest_Loan();
      }
   }
}

//This is the main class of this project
//JVM starts the execution of programm from this class
class Main_Class
{ 
  public static void main(String[] args) 
  {
 
   SplashScreen obj1=new SplashScreen();
   obj1.Splash();  
   Signup_Registration obj2=new Signup_Registration();
 }
}

