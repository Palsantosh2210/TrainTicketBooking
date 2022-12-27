import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
import java.util.Random;  
public class TrainTicketBooking
{  

    JFrame l;  
    JFrame pd;
    JFrame b;
    JFrame t;
    
    String login;
    String personaldetail;
    String booking;
    String ticket;
    TrainTicketBooking()
    {
     l=new JFrame("Login Page");  l.getContentPane().setBackground(Color.YELLOW);
        
l.setBounds(300, 90, 450, 300);

l.setResizable(false);

l.setLayout(null);

l.setVisible(true);

JLabel L1 = new JLabel("User Login");

L1.setFont(new Font("Arial", Font.PLAIN, 30));

L1.setSize(250, 40);

L1.setLocation(180, 20);

L1.setForeground(Color.RED);

l.add(L1);

JLabel L2 = new JLabel("User Name");

L2.setFont(new Font("Arial", Font.PLAIN, 20));

L2.setSize(100, 25);

L2.setLocation(65, 75);

L2.setForeground(Color.RED);

l.add(L2);

JTextField T1 = new JTextField();

T1.setFont(new Font("Arial", Font.PLAIN, 15));

T1.setSize(140, 25);

T1.setLocation(235, 75);

T1.setForeground(Color.RED);

l.add(T1);

JLabel L3 = new JLabel("Password");

L3.setFont(new Font("Arial", Font.PLAIN, 20));

L3.setSize(100, 25);

L3.setLocation(65, 130);

L3.setForeground(Color.RED);

l.add(L3);

JPasswordField P1 = new JPasswordField();

P1.setFont(new Font("Arial", Font.PLAIN, 15));

P1.setSize(140, 25);

P1.setLocation(235, 130);

P1.setForeground(Color.RED);

l.add(P1);

JButton B1 = new JButton("Login");

B1.setFont(new Font("Arial", Font.PLAIN, 15));

B1.setSize(100, 20);

B1.setLocation(150, 220);

B1.setForeground(Color.RED);

B1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if((T1.getText().equals("AMARJEET")) && (P1.getPassword().equals("54321")))

personaldetail();

else

JOptionPane.showMessageDialog(P1,"Invalid Username or Password","Alert",JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog(T1,"Invalid Username or Password","Alert",JOptionPane.WARNING_MESSAGE);

}

});
l.add(B1);
    
}
void personaldetail()
{
   pd=new JFrame("Personal Details");  pd.getContentPane().setBackground(Color.YELLOW);
        
pd.setBounds(300, 90, 900, 600);

pd.setResizable(false);

pd.setLayout(null);

pd.setVisible(true);
    
String dates[]

= { "1", "2", "3", "4", "5",

"6", "7", "8", "9", "10",

"11", "12", "13", "14", "15",

"16", "17", "18", "19", "20",

"21", "22", "23", "24", "25",

"26", "27", "28", "29", "30",

"31" };

String months[]

= { "Jan", "feb", "Mar", "Apr",

"May", "Jun", "July", "Aug",

"Sup", "Oct", "Nov", "Dec" };

String years[]

= { "1995", "1996", "1997", "1998",

"1999", "2000", "2001", "2002",

"2003", "2004", "2005", "2006",

"2007", "2008", "2009", "2010",

"2011", "2012", "2013", "2014",

"2015", "2016", "2017", "2018",

"2019","2020","2021"};

JLabel title = new JLabel("Personal Details");

title.setFont(new Font("Arial", Font.PLAIN, 30));

title.setSize(300, 30);

title.setLocation(300, 30);

title.setForeground(Color.RED);

pd.add(title);

JLabel name = new JLabel("Name");

name.setFont(new Font("Arial", Font.PLAIN, 20));

name.setSize(100, 20);

name.setLocation(100, 100);

name.setForeground(Color.RED);

pd.add(name);

JTextField tname = new JTextField();

tname.setFont(new Font("Arial", Font.PLAIN, 15));

tname.setSize(190, 20);

tname.setLocation(200, 100);

pd.add(tname);

JLabel mno = new JLabel("Mobile");

mno.setFont(new Font("Arial", Font.PLAIN, 20));

mno.setSize(100, 20);

mno.setLocation(100, 150);

mno.setForeground(Color.RED);

pd.add(mno);

JTextField tmno = new JTextField();

tmno.setFont(new Font("Arial", Font.PLAIN, 15));

tmno.setSize(150, 20);

tmno.setLocation(200, 150);

pd.add(tmno);

JLabel gender = new JLabel("Gender");

gender.setFont(new Font("Arial", Font.PLAIN, 20));

gender.setSize(100, 20);

gender.setLocation(100, 200);

gender.setForeground(Color.RED);

pd.add(gender);

JRadioButton male = new JRadioButton("Male");

male.setFont(new Font("Arial", Font.PLAIN, 15));

male.setSelected(true);

male.setSize(75, 20);

male.setLocation(200, 200);

male.setForeground(Color.RED);

pd.add(male);

JRadioButton female = new JRadioButton("Female");

female.setFont(new Font("Arial", Font.PLAIN, 15));

female.setSelected(false);

female.setSize(80, 20);

female.setLocation(275, 200);

female.setForeground(Color.RED);

pd.add(female);

ButtonGroup gengp = new ButtonGroup();

gengp.add(male);

gengp.add(female);

JLabel dob = new JLabel("DOB");

dob.setFont(new Font("Arial", Font.PLAIN, 20));

dob.setSize(100, 20); 

dob.setLocation(100, 250);

dob.setForeground(Color.RED);

pd.add(dob);

JComboBox date = new JComboBox(dates);

date.setFont(new Font("Arial", Font.PLAIN, 15));

date.setSize(50, 20);

date.setLocation(200, 250);

date.setForeground(Color.RED);

pd.add(date);

JComboBox month = new JComboBox(months);

month.setFont(new Font("Arial", Font.PLAIN, 15));

month.setSize(60, 20);

month.setLocation(250, 250);

month.setForeground(Color.RED);

pd.add(month);

JComboBox year = new JComboBox(years);

year.setFont(new Font("Arial", Font.PLAIN, 15));

year.setSize(60, 20);

year.setLocation(320, 250);

year.setForeground(Color.RED);

pd.add(year);

JLabel add = new JLabel("Address");

add.setFont(new Font("Arial", Font.PLAIN, 20));

add.setSize(100, 20);

add.setLocation(100, 300);

add.setForeground(Color.RED);

pd.add(add);

JTextArea tadd = new JTextArea();

tadd.setFont(new Font("Arial", Font.PLAIN, 15));

tadd.setSize(200, 75);

tadd.setLocation(200, 300);

tadd.setLineWrap(true);

pd.add(tadd);

JCheckBox term = new JCheckBox("Accept Terms And Conditions.");

term.setFont(new Font("Arial", Font.PLAIN, 15));

term.setSize(250, 20);

term.setLocation(150, 400);

term.setForeground(Color.RED);

pd.add(term);

JButton sub = new JButton("Next");

sub.setFont(new Font("Arial", Font.PLAIN, 15));

sub.setSize(100, 20);

sub.setLocation(150, 450);

sub.setForeground(Color.RED);

sub.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{

if (e.getSource() == sub) {

if (term.isSelected()) {

String data1; 

String data

= "Name : " + tname.getText() + "\n"
+ "Mobile : " + tmno.getText() + "\n";

if (male.isSelected())

data1 = "Gender : Male" + "\n";

else

data1 = "Gender : Female" + "\n";

String data2

= "DOB : " + (String)date.getSelectedItem() + "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem()
+ "\n";

String data3 = "Address : " + tadd.getText();

booking();

}
else {

JOptionPane.showMessageDialog(null,"Please accept the "+" terms & conditions","Alert",JOptionPane.WARNING_MESSAGE);

} 

} 

}
});
pd.add(sub);

JButton reset = new JButton("Reset");

reset.setFont(new Font("Arial", Font.PLAIN, 15));

reset.setSize(100, 20);

reset.setLocation(270, 450);

reset.setForeground(Color.RED);

reset.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent e)
    {
if (e.getSource() == reset) {

String def = "";

tname.setText(def);

tadd.setText(def);

tmno.setText(def);

term.setSelected(false);

date.setSelectedIndex(0);

month.setSelectedIndex(0);

year.setSelectedIndex(0);

}
}
});
pd.add(reset);
}
void booking()
{
 b = new JFrame("Ticket Booking"); b.getContentPane().setBackground(Color.YELLOW);
        
b.setBounds(300, 90, 900, 600);

b.setResizable(false);

b.setLayout(null);

b.setVisible(true);

String SPlaces[]

= {"Mumbai","Delhi","Kolkata","Chennai","Bangalore","Indore","Ahmedabad","Jaipur","Pune","Goa","Srinagar","Hyderabad" };

String DPlaces[]

= {"Mumbai","Delhi","Kolkata","Chennai","Bangalore","Indore","Ahmedabad","Jaipur","Pune","Goa","Srinagar","Hyderabad" };

String dates[]

= { "1", "2", "3", "4", "5",

"6", "7", "8", "9", "10",

"11", "12", "13", "14", "15",

"16", "17", "18", "19", "20",

"21", "22", "23", "24", "25",

"26", "27", "28", "29", "30",

"31" };

String months[]

= { "Jan", "feb", "Mar", "Apr",

"May", "Jun", "July", "Aug",

"Sup", "Oct", "Nov", "Dec" };

String years[]

= { "1995", "1996", "1997", "1998",

"1999", "2000", "2001", "2002",

"2003", "2004", "2005", "2006",

"2007", "2008", "2009", "2010",

"2011", "2012", "2013", "2014",

"2015", "2016", "2017", "2018",

"2019","2020","2021"};

JLabel title1 = new JLabel("Ticket Booking");

title1.setFont(new Font("Arial", Font.PLAIN, 30));

title1.setSize(265, 40);

title1.setLocation(190, 20);

title1.setForeground(Color.RED);

b.add(title1);

JLabel nop = new JLabel("No. of Passengers");

nop.setFont(new Font("Arial", Font.PLAIN, 20));

nop.setSize(180, 40);

nop.setLocation(40, 85);

nop.setForeground(Color.RED);

b.add(nop);

JTextField tnop = new JTextField();

tnop.setFont(new Font("Arial", Font.PLAIN, 15));

tnop.setSize(100, 20);

tnop.setLocation(260, 95);

tnop.setForeground(Color.RED);

b.add(tnop);

JLabel sp = new JLabel("Start Place");

sp.setFont(new Font("Arial", Font.PLAIN, 20));

sp.setSize(180, 25); 

sp.setLocation(40, 150);

sp.setForeground(Color.RED);

b.add(sp);


JComboBox SPlace = new JComboBox(SPlaces);

SPlace.setFont(new Font("Arial", Font.PLAIN, 15));

SPlace.setSize(100, 25);

SPlace.setLocation(260, 150);

SPlace.setForeground(Color.RED);

b.add(SPlace);


JLabel Dp = new JLabel("Destination Place");

Dp.setFont(new Font("Arial", Font.PLAIN, 20));

Dp.setSize(180, 25); 

Dp.setLocation(40, 200);

Dp.setForeground(Color.RED);

b.add(Dp);

JComboBox DPlace = new JComboBox(DPlaces);

DPlace.setFont(new Font("Arial", Font.PLAIN, 15));

DPlace.setSize(100, 25);

DPlace.setLocation(260, 200);

DPlace.setForeground(Color.RED);

b.add(DPlace);


JLabel atp = new JLabel("Add Ticket Price");

atp.setFont(new Font("Arial", Font.PLAIN, 20));

atp.setSize(180, 25);

atp.setLocation(40, 250);

atp.setForeground(Color.RED);

b.add(atp);

JTextField tatp = new JTextField();

tatp.setFont(new Font("Arial", Font.PLAIN, 15));

tatp.setSize(100, 25);

tatp.setLocation(260, 250);

b.add(tatp);

JCheckBox term1 = new JCheckBox("Pay the amount...");

term1.setFont(new Font("Arial", Font.PLAIN, 15));

term1.setSize(195, 25);

term1.setLocation(390, 250);

term1.setForeground(Color.RED);

b.add(term1);


JLabel dd = new JLabel("Departure Date");

dd.setFont(new Font("Arial", Font.PLAIN, 20));

dd.setSize(180, 25);

dd.setLocation(40, 295);

dd.setForeground(Color.RED);

b.add(dd);

JTextArea tdd = new JTextArea();

tdd.setFont(new Font("Arial", Font.PLAIN, 15));

tdd.setSize(100, 25);

tdd.setLocation(260, 295);

b.add(tdd);

JButton sub1 = new JButton("Submit");

sub1.setFont(new Font("Arial", Font.PLAIN, 15));

sub1.setSize(100, 25);

sub1.setLocation(145, 375);

sub1.setForeground(Color.RED);

sub1.addActionListener(new ActionListener()

{
public void actionPerformed(ActionEvent e)
{

if (e.getSource() == sub1)

{

if (term1.isSelected())

{

JOptionPane.showMessageDialog(term1,"Payment Successfull!","Alert",JOptionPane.WARNING_MESSAGE); 
 
}

else

{

JOptionPane.showMessageDialog(term1,"Please Pay the Amount!","Alert",JOptionPane.WARNING_MESSAGE); 

}

}
}
});

b.add(sub1);

JButton reset1 = new JButton("Reset");

reset1.setFont(new Font("Arial", Font.PLAIN, 15));

reset1.setSize(100, 25);

reset1.setLocation(280, 375);

reset1.setForeground(Color.RED);

reset1.addActionListener(new ActionListener ()
{
public void actionPerformed(ActionEvent e)
{
if (e.getSource() == reset1)
{

String def = "";

tnop.setText(def);

tatp.setText(def);

tdd.setText(def);

term1.setSelected(false);

SPlace.setSelectedIndex(0);

DPlace.setSelectedIndex(0);

}

}

});

b.add(reset1);

b.setVisible(true);

}

public static void main(String[] args)
    {  
        new TrainTicketBooking();  
    }  
}
