

import javax.swing.*; 
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
import java.awt.event.*;

public class CGPA_Calculator extends JFrame {
	JButton score = new JButton("Score");
	JButton grade = new JButton("Grade");
	JButton calculate1= new JButton("Calculate");
	JButton calculate2 = new JButton("Calculate");
	JButton calculate3 = new JButton("Calculate");
	JButton CGPA = new JButton("CGPA");
	JButton back = new JButton("<< Back");
	JButton Back2 = new JButton("<< Back");
	JButton Back3 = new JButton("<< Back");
	
	private Listener listener = new Listener();
	
	JTextField tf1 = new JTextField("0");
	JTextField tf2 = new JTextField("0");
	JTextField tf3 = new JTextField("0");
	JTextField tf4 = new JTextField("0");
	JTextField tf5 = new JTextField("0");
	JTextField tf6 = new JTextField("0");
	JTextField tf7 = new JTextField("0");
	JTextField tf8 = new JTextField("0");
	JTextField tf9 = new JTextField("0");
	JTextField tf10 = new JTextField("0");
	JTextField tf11 = new JTextField("0");
	JTextField tf12 = new JTextField("0");
	JTextField tf13 = new JTextField("0");
	JTextField tf14 = new JTextField("0");
	JTextField tf15 = new JTextField("0");
	JTextField tf1_ = new JTextField("0");
	JTextField tf2_ = new JTextField("0");
	JTextField tf3_ = new JTextField("0");
	JTextField tf4_ = new JTextField("0");
	JTextField tf5_ = new JTextField("0");
	JTextField tf6_ = new JTextField("0");
	JTextField tf7_ = new JTextField("0");
	JTextField tf8_ = new JTextField("0");
	JTextField tf9_ = new JTextField("0");
	JTextField tf10_ = new JTextField("0");
	JTextField tf11_ = new JTextField("0");
	JTextField tf12_ = new JTextField("0");
	JTextField tf13_ = new JTextField("0");
	JTextField tf14_ = new JTextField("0");
	JTextField tf15_ = new JTextField("0");
	JTextField txt1 = new JTextField("0");
	JTextField txt2 = new JTextField("0");
	JTextField txt3 = new JTextField("0");
	JTextField txt4 = new JTextField("0");
	JTextField txt5 = new JTextField("0");
	JTextField txt6 = new JTextField("0");
	JTextField txt7 = new JTextField("0");
	JTextField txt8 = new JTextField("0");
	JTextField txt9 = new JTextField("0");
	JTextField answer = new JTextField("0");
	JTextField tf11b_ = new JTextField("0");
	JTextField tf21_ = new JTextField("0");
	JTextField tf31_ = new JTextField("0");
	JTextField tf41_ = new JTextField("0");
	JTextField tf51_ = new JTextField("0");
	JTextField tf61_ = new JTextField("0");
	JTextField tf71_ = new JTextField("0");
	JTextField tf81_ = new JTextField("0");
	JTextField tf91_ = new JTextField("0");
	JTextField tf101_ = new JTextField("0");
	JTextField tf111_ = new JTextField("0");
	JTextField tf121_ = new JTextField("0");
	JTextField tf131_ = new JTextField("0");
	JTextField tf141_ = new JTextField("0");
	JTextField tf151_ = new JTextField("0");
	
	JComboBox cd1 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd2 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd3 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd4 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd5 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd6 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd7 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd8 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd9 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd10 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd11 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd12 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd13 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd14 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	JComboBox cd15 = new JComboBox(new Object[] {"A","B","C","D","E","F"});
	
	JLabel label1 = new JLabel("0");
	JLabel label2 = new JLabel("0");
	JLabel label3 = new JLabel("0");
	JLabel label4 = new JLabel("0");
	JLabel label5 = new JLabel("0");
	JLabel label6 = new JLabel("0");
	JLabel label7 = new JLabel("0");
	JLabel label8 = new JLabel("0");
	JLabel label9 = new JLabel("0");
	JLabel label10 = new JLabel("0");
	JLabel label11 = new JLabel("0");
	JLabel label12 = new JLabel("0");
	JLabel label13 = new JLabel("0");
	JLabel label14 = new JLabel("0");
	JLabel label15 = new JLabel("0");	
	JLabel label1a = new JLabel("0");
	JLabel label2a = new JLabel("0");
	JLabel label3a = new JLabel("0");
	JLabel label4a = new JLabel("0");
	JLabel label5a = new JLabel("0");
	JLabel label6a = new JLabel("0");
	JLabel label7a = new JLabel("0");
	JLabel label8a = new JLabel("0");
	JLabel label9a = new JLabel("0");
	JLabel label10a = new JLabel("0");
	JLabel label11a= new JLabel("0");
	JLabel label12a = new JLabel("0");
	JLabel label13a = new JLabel("0");
	JLabel label14a = new JLabel("0");
	JLabel label15a = new JLabel("0");
	
	JPanel MasterPanel = new JPanel();
	JPanel FirstPanel = new JPanel();
	JPanel SecondPanel = new JPanel();
	JPanel ThirdPanel = new JPanel();
	JPanel panel = new JPanel();
	
	CardLayout MasterCard = new CardLayout();
	CardLayout SecondPanelCard = new CardLayout();
	CardLayout ThirdPanelCard = new CardLayout();
	
	public void fFrame() {

		MasterPanel.setLayout(MasterCard);
		SecondPanel.setLayout(new BorderLayout());
		ThirdPanel.setLayout(new BorderLayout());
		FirstPanel.setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(15,1));
		
		CGPA.addActionListener(listener);
		grade.addActionListener(listener);
		score.addActionListener(listener);
		Back2.addActionListener(listener);
		Back3.addActionListener(listener);
		
		panel.add(new JLabel("Calculate using: "));
		panel.add(score);
		panel.add(grade);
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(CGPA);
		
		JTextArea text = new JTextArea("\t\tWHAT IS GPA and CGPA?\n\nGPA simply means Grade Point Average. That is a measure of a student's academic achievement at a college or university; calculated by dividing the number of acquired Grade Points by the total number of Course Grade Unit received. CGPA meanse Cumulative Grade Point Average.\nGrade letter may differ as some higher institutions make use of A,B,C,D,E and F while some use A,B,C,D and F.\n\nWHY IS GPA IMPORTANT?\nYour GPA, or Grade Point Average, is a number that indicates how well or how high you've scored in your courses on average. GPA scales between 1.0 AND 5.0 during your studies and shows whether your grades have been high or low overall in your classes. This nu,ber is then used to assess whether you meet the standard and expectations set by the degree programme or university.\n\nHOW WILL A GOOD GPA HELP YOU?\n\223A good GPA makes you eligible to sit for all top colleges throughout the world.\n\223It puts you on the to of your VC's list of good students.\n\223It increases your chances of getting better Grants and Scholarship\n\223You graduate with good honours.\n\223Getting a good GPA is not easy you would have learned a lot during the process.\n\nDIFFERENCE BETWEEN GPA and CGPA\nTo understand the differences between GPA and overall CGPA, you must first know that they both refer to the average grades of a student. The difference is that the GPA covers shorter periods, such as a semesterr. While CGPA refers to the average grades obtained by a Student throughout his/he entire academic experience. This means it includes grades from all terms and semesters. CGPA is used to determine your Class of Honour.\nEg:\nFirst Class\nSecond Class Upper\nSecond Class Lower\nThird Class.\n\nGPA PERCENTAGE AND CONVERSION SCALES\nThe percentage needed in any given course to achieve a certain grade and the assignment of GPA point values varies from schools to schools, and sometimes between instructors within a given school. In Nigeria, according to NUC, the standard grading scale is 5.00.\nDue to popular request, this software is developed using the 5.00 GPA scale to teach you how to calculate GPA and CGPA because it is the most widely used grading scale in Nigeria Universities.\nPlease be very sure of your school GPA Grading scale\n\nCLASSIFICATION OF DEGREES\n\223The cumulative GP for each classes are listed below:\nClass:\t\t CGPA:\n  First Class\t                   4.5 - 5.0\n  Second Class Upper	3.5 - 4.4\n  Second Class Lower	2.5 - 3.4\n  Third Class	                 1.0 - 2.4\n\nOfficial grading scale in Nigeria:\nPercentage\tGrade Letter\tGrade Point\n70 - 100\t  A\t	   5\n60 - 69\t    B\t	   4\n50 - 59\t    C\t	  3\n45 - 49\t    D\t	  2\n40 - 44\t    E\t	  1\n 0 - 39\t     F\t	   0",41,39);
		JScrollPane jsp = new JScrollPane(text);
		text.setLineWrap(true);
		text.setEditable(false);
		text.setMargin(new Insets(3,3,3,3));
		FirstPanel.add(panel, BorderLayout.WEST);
		FirstPanel.add(jsp,BorderLayout.CENTER);	
		
Label.setEditable(false);
		
		calculate1.addActionListener(listener2);
		back.addActionListener(listener2);
		
		Back3.setBackground(Color.red);
		
		JPanel fPanel1 = new JPanel();
		
		fPanel1.setLayout(new GridLayout(16,4,3,3));
		fPanel1.add(new JLabel("Courses"));
		fPanel1.add(new JLabel("Scores"));
		fPanel1.add(new JLabel("Units"));
		fPanel1.add(new JLabel("QP"));
		fPanel1.add(new JLabel("Course 1:"));
		fPanel1.add(tf1);
		fPanel1.add(tf11b_);
		fPanel1.add(label1a);
		fPanel1.add(new JLabel("Course 2:"));
		fPanel1.add(tf2);
		fPanel1.add(tf21_);
		fPanel1.add(label2a);
		fPanel1.add(new JLabel("Course 3:"));
		fPanel1.add(tf3);
		fPanel1.add(tf31_);
		fPanel1.add(label3a);
		fPanel1.add(new JLabel("Course 4:"));
		fPanel1.add(tf4);
		fPanel1.add(tf41_);
		fPanel1.add(label4a);
		fPanel1.add(new JLabel("Course 5:"));
		fPanel1.add(tf5);
		fPanel1.add(tf51_);
		fPanel1.add(label5a);
		fPanel1.add(new JLabel("Course 6:"));
		fPanel1.add(tf6);
		fPanel1.add(tf61_);
		fPanel1.add(label6a);
		fPanel1.add(new JLabel("Course 7:"));
		fPanel1.add(tf7);
		fPanel1.add(tf71_);
		fPanel1.add(label7a);
		fPanel1.add(new JLabel("Course 8:"));
		fPanel1.add(tf8);
		fPanel1.add(tf81_);
		fPanel1.add(label8a);
		fPanel1.add(new JLabel("Course 9:"));
		fPanel1.add(tf9);
		fPanel1.add(tf91_);
		fPanel1.add(label9a);
		fPanel1.add(new JLabel("Course 10:"));
		fPanel1.add(tf10);
		fPanel1.add(tf101_);
		fPanel1.add(label10a);
		fPanel1.add(new JLabel("Course 11:"));
		fPanel1.add(tf11);
		fPanel1.add(tf111_);
		fPanel1.add(label11a);
		fPanel1.add(new JLabel("Course 12:"));
		fPanel1.add(tf12);
		fPanel1.add(tf121_);
		fPanel1.add(label12a);
		fPanel1.add(new JLabel("Course 13:"));
		fPanel1.add(tf13);
		fPanel1.add(tf131_);
		fPanel1.add(label13a);
		fPanel1.add(new JLabel("Course 14:"));
		fPanel1.add(tf14);
		fPanel1.add(tf141_);
		fPanel1.add(label14a);
		fPanel1.add(new JLabel("Course 15:"));
		fPanel1.add(tf15);
		fPanel1.add(tf151_);
		fPanel1.add(label15a);
		
		JPanel sPanel1 = new JPanel();
		sPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		sPanel1.add(new JLabel("GPA"));
		sPanel1.add(Label);
		
		JPanel tPanel = new JPanel();
		sPanel1.setLayout(new GridLayout(2,1));
		tPanel.add(Back3);
		tPanel.add(calculate1);
		
		JPanel ffPanel1 = new JPanel();
		ffPanel1.setLayout(new GridLayout(2,1));
		ffPanel1.add(sPanel1);
		ffPanel1.add(tPanel);
		
		SecondPanel.add(new JLabel("Please fill-up the form below to calculate your GP"),BorderLayout.NORTH);
		SecondPanel.add(fPanel1,BorderLayout.CENTER);
		SecondPanel.add(ffPanel1,BorderLayout.SOUTH);
		
		
//SECOND LAYOUT
Label.setEditable(false);
		
		calculate2.addActionListener(listener2);
		back.addActionListener(listener2);
		
		Back2.setBackground(Color.red);
		
		JPanel fPanel22 = new JPanel();
		
		fPanel22.setLayout(new GridLayout(16,4,3,3));
		fPanel22.add(new JLabel("Courses"));
		fPanel22.add(new JLabel("Grade"));
		fPanel22.add(new JLabel("Units"));
		fPanel22.add(new JLabel("QP"));
		fPanel22.add(new JLabel("Course 1:"));
		fPanel22.add(cd1);
		fPanel22.add(tf1_);
		fPanel22.add(label1);
		fPanel22.add(new JLabel("Course 2:"));
		fPanel22.add(cd2);
		fPanel22.add(tf2_);
		fPanel22.add(label2);
		fPanel22.add(new JLabel("Course 3:"));
		fPanel22.add(cd3);
		fPanel22.add(tf3_);
		fPanel22.add(label3);
		fPanel22.add(new JLabel("Course 4:"));
		fPanel22.add(cd4);
		fPanel22.add(tf4_);
		fPanel22.add(label4);
		fPanel22.add(new JLabel("Course 5:"));
		fPanel22.add(cd5);
		fPanel22.add(tf5_);
		fPanel22.add(label5);
		fPanel22.add(new JLabel("Course 6:"));
		fPanel22.add(cd6);
		fPanel22.add(tf6_);
		fPanel22.add(label6);
		fPanel22.add(new JLabel("Course 7:"));
		fPanel22.add(cd7);
		fPanel22.add(tf7_);
		fPanel22.add(label7);
		fPanel22.add(new JLabel("Course 8:"));
		fPanel22.add(cd8);
		fPanel22.add(tf8_);
		fPanel22.add(label8);
		fPanel22.add(new JLabel("Course 9:"));
		fPanel22.add(cd9);
		fPanel22.add(tf9_);
		fPanel22.add(label9);
		fPanel22.add(new JLabel("Course 10:"));
		fPanel22.add(cd10);
		fPanel22.add(tf10_);
		fPanel22.add(label10);
		fPanel22.add(new JLabel("Course 11:"));
		fPanel22.add(cd11);
		fPanel22.add(tf11_);
		fPanel22.add(label11);
		fPanel22.add(new JLabel("Course 12:"));
		fPanel22.add(cd12);
		fPanel22.add(tf12_);
		fPanel22.add(label12);
		fPanel22.add(new JLabel("Course 13:"));
		fPanel22.add(cd13);
		fPanel22.add(tf13_);
		fPanel22.add(label13);
		fPanel22.add(new JLabel("Course 14:"));
		fPanel22.add(cd14);
		fPanel22.add(tf14_);
		fPanel22.add(label14);
		fPanel22.add(new JLabel("Course 15:"));
		fPanel22.add(cd15);
		fPanel22.add(tf15_);
		fPanel22.add(label15);
		
			JPanel sPanel22 = new JPanel();
			sPanel22.setLayout(new FlowLayout(FlowLayout.CENTER));
			sPanel22.add(new JLabel("GPA"));
			sPanel22.add(Label2);
			
			JPanel tPanel22 = new JPanel();
			sPanel22.setLayout(new GridLayout(2,1));
			tPanel22.add(Back2);
			tPanel22.add(calculate2);
			
			JPanel ffPanel22 = new JPanel();
			ffPanel22.setLayout(new GridLayout(2,1));
			ffPanel22.add(sPanel22);
			ffPanel22.add(tPanel22);
			
			ThirdPanel.add(new JLabel("Please fill-up the form below to calculate your GP"),BorderLayout.NORTH);
			ThirdPanel.add(fPanel22,BorderLayout.CENTER);
			ThirdPanel.add(ffPanel22,BorderLayout.SOUTH);
				
		MasterPanel.add(FirstPanel, "Home");
		MasterPanel.add(SecondPanel, "SecondPanel");
		MasterPanel.add(ThirdPanel, "ThirdPanel");
		
		add(MasterPanel);

	}
	
	JTextField Label = new JTextField("0.00");
	private Handler listener2 =new Handler();
	
	JTextField Label2 = new JTextField("0.00");	
	
	
	
	class Handler implements ActionListener {
		 public void actionPerformed(ActionEvent event) {
			 if (event.getSource()==back) { 
				 System.exit(0);
				 CGPA_Calculator call = new CGPA_Calculator();
					call.fFrame();
					call.setTitle("BB_WISE CGPA_Calculator");
					call.setSize(580,710);
					call.setResizable(false);
					call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					call.setLocationRelativeTo(null);
					call.setVisible(true);
	 
			 }
			 else if(event.getSource()==calculate2) {
				 
				 double cb1=0;
				 String c1 = cd1.getSelectedItem().toString();
				 if(c1.contentEquals("A")) {
					 cb1 = 5;
				 }
				 else if(c1.contentEquals("B")) {
					 cb1 = 4;
				 }
				 else if(c1.contentEquals("C")) {
					 cb1 = 3;
				 }
				 else if(c1.contentEquals("D")) {
					 cb1 = 2;
				 }
				 else if(c1.contentEquals("E")) {
					 cb1 = 1;
				 }
				 else if(c1.contentEquals("F")) {
					 cb1 = 0;
				 }				 
				 double u1 = Double.parseDouble(tf1_.getText());
				 double QP1 =cb1*u1;
				 String total1 = Double.toString(QP1);
				 label1.setText(total1);
				 double cb2=0;
				 String c2 = cd2.getSelectedItem().toString();
				 if(c2.contentEquals("A")) {
					 cb2 = 5;
				 }
				 else if(c2.contentEquals("B")) {
					 cb2 = 4;
				 }
				 else if(c2.contentEquals("C")) {
					 cb2 = 3;
				 }
				 else if(c2.contentEquals("D")) {
					 cb2 = 2;
				 }
				 else if(c2.contentEquals("E")) {
					 cb2 = 1;
				 }
				 else if(c2.contentEquals("F")) {
					 cb2 = 0;
				 }				 
				 double u2 = Double.parseDouble(tf2_.getText());
				 double QP2 =cb2*u2;
				 String total2 = Double.toString(QP2);
				 label2.setText(total2);
				 double cb3=0;
				 String c3 = cd3.getSelectedItem().toString();
				 if(c3.contentEquals("A")) {
					 cb3 = 5;
				 }
				 else if(c3.contentEquals("B")) {
					 cb3 = 4;
				 }
				 else if(c3.contentEquals("C")) {
					 cb3 = 3;
				 }
				 else if(c3.contentEquals("D")) {
					 cb3 = 2;
				 }
				 else if(c3.contentEquals("E")) {
					 cb3 = 1;
				 }
				 else if(c3.contentEquals("F")) {
					 cb3 = 0;
				 }				 
				 double u3 = Double.parseDouble(tf3_.getText());
				 double QP3 =cb3*u3;
				 String total3 = Double.toString(QP3);
				 label3.setText(total3);
				 double cb4=0;
				 String c4 = cd4.getSelectedItem().toString();
				 if(c4.contentEquals("A")) {
					 cb4 = 5;
				 }
				 else if(c4.contentEquals("B")) {
					 cb4 = 4;
				 }
				 else if(c4.contentEquals("C")) {
					 cb4 = 3;
				 }
				 else if(c4.contentEquals("D")) {
					 cb4 = 2;
				 }
				 else if(c4.contentEquals("E")) {
					 cb4 = 1;
				 }
				 else if(c4.contentEquals("F")) {
					 cb4 = 0;
				 }				 
				 double u4 = Double.parseDouble(tf4_.getText());
				 double QP4 =cb4*u4;
				 String total4 = Double.toString(QP4);
				 label4.setText(total4);
				 double cb5=0;
				 String c5 = cd5.getSelectedItem().toString();
				 if(c5.contentEquals("A")) {
					 cb5 = 5;
				 }
				 else if(c5.contentEquals("B")) {
					 cb5 = 4;
				 }
				 else if(c5.contentEquals("C")) {
					 cb5 = 3;
				 }
				 else if(c5.contentEquals("D")) {
					 cb5 = 2;
				 }
				 else if(c5.contentEquals("E")) {
					 cb5 = 1;
				 }
				 else if(c5.contentEquals("F")) {
					 cb5 = 0;
				 }				 
				 double u5 = Double.parseDouble(tf5_.getText());
				 double QP5 =cb5*u5;
				 String total5 = Double.toString(QP5);
				 label5.setText(total5);
				 double cb6=0;
				 String c6 = cd6.getSelectedItem().toString();
				 if(c6.contentEquals("A")) {
					 cb6 = 5;
				 }
				 else if(c6.contentEquals("B")) {
					 cb6 = 4;
				 }
				 else if(c6.contentEquals("C")) {
					 cb6 = 3;
				 }
				 else if(c6.contentEquals("D")) {
					 cb6 = 2;
				 }
				 else if(c6.contentEquals("E")) {
					 cb6 = 1;
				 }
				 else if(c6.contentEquals("F")) {
					 cb6 = 0;
				 }				 
				 double u6 = Double.parseDouble(tf6_.getText());
				 double QP6 =cb6*u6;
				 String total6 = Double.toString(QP6);
				 label6.setText(total6);
				 double cb7=0;
				 String c7 = cd7.getSelectedItem().toString();
				 if(c7.contentEquals("A")) {
					 cb7 = 5;
				 }
				 else if(c7.contentEquals("B")) {
					 cb7 = 4;
				 }
				 else if(c7.contentEquals("C")) {
					 cb7 = 3;
				 }
				 else if(c7.contentEquals("D")) {
					 cb7 = 2;
				 }
				 else if(c7.contentEquals("E")) {
					 cb7 = 1;
				 }
				 else if(c7.contentEquals("F")) {
					 cb7 = 0;
				 }				 
				 double u7 = Double.parseDouble(tf7_.getText());
				 double QP7 =cb7*u7;
				 String total7 = Double.toString(QP7);
				 label7.setText(total7);
				 double cb8=0;
				 String c8 = cd8.getSelectedItem().toString();
				 if(c8.contentEquals("A")) {
					 cb8 = 5;
				 }
				 else if(c8.contentEquals("B")) {
					 cb8 = 4;
				 }
				 else if(c8.contentEquals("C")) {
					 cb8 = 3;
				 }
				 else if(c8.contentEquals("D")) {
					 cb8 = 2;
				 }
				 else if(c8.contentEquals("E")) {
					 cb8 = 1;
				 }
				 else if(c8.contentEquals("F")) {
					 cb8 = 0;
				 }				 
				 double u8 = Double.parseDouble(tf8_.getText());
				 double QP8 =cb8*u8;
				 String total8 = Double.toString(QP8);
				 label8.setText(total8);
				 double cb9=0;
				 String c9 = cd9.getSelectedItem().toString();
				 if(c9.contentEquals("A")) {
					 cb9 = 5;
				 }
				 else if(c9.contentEquals("B")) {
					 cb9 = 4;
				 }
				 else if(c9.contentEquals("C")) {
					 cb9 = 3;
				 }
				 else if(c1.contentEquals("D")) {
					 cb9 = 2;
				 }
				 else if(c9.contentEquals("E")) {
					 cb9 = 1;
				 }
				 else if(c9.contentEquals("F")) {
					 cb9 = 0;
				 }				 
				 double u9 = Double.parseDouble(tf9_.getText());
				 double QP9 =cb9*u9;
				 String total9 = Double.toString(QP9);
				 label9.setText(total9);
				 double cb10=0;
				 String c10 = cd10.getSelectedItem().toString();
				 if(c10.contentEquals("A")) {
					 cb10 = 5;
				 }
				 else if(c10.contentEquals("B")) {
					 cb10 = 4;
				 }
				 else if(c10.contentEquals("C")) {
					 cb10 = 3;
				 }
				 else if(c10.contentEquals("D")) {
					 cb10 = 2;
				 }
				 else if(c10.contentEquals("E")) {
					 cb10 = 1;
				 }
				 else if(c10.contentEquals("F")) {
					 cb10 = 0;
				 }				 
				 double u10 = Double.parseDouble(tf10_.getText());
				 double QP10 =cb10*u10;
				 String total10 = Double.toString(QP10);
				 label10.setText(total10);
				 double cb11=0;
				 String c11 = cd11.getSelectedItem().toString();
				 if(c11.contentEquals("A")) {
					 cb11 = 5;
				 }
				 else if(c11.contentEquals("B")) {
					 cb11 = 4;
				 }
				 else if(c11.contentEquals("C")) {
					 cb11 = 3;
				 }
				 else if(c11.contentEquals("D")) {
					 cb11 = 2;
				 }
				 else if(c11.contentEquals("E")) {
					 cb11 = 1;
				 }
				 else if(c11.contentEquals("F")) {
					 cb11 = 0;
				 }				 
				 double u11 = Double.parseDouble(tf11_.getText());
				 double QP11 =cb11*u11;
				 String total11 = Double.toString(QP11);
				 label11.setText(total11);
				 double cb12=0;
				 String c12 = cd12.getSelectedItem().toString();
				 if(c12.contentEquals("A")) {
					 cb12 = 5;
				 }
				 else if(c12.contentEquals("B")) {
					 cb12 = 4;
				 }
				 else if(c12.contentEquals("C")) {
					 cb12 = 3;
				 }
				 else if(c12.contentEquals("D")) {
					 cb12 = 2;
				 }
				 else if(c12.contentEquals("E")) {
					 cb12 = 1;
				 }
				 else if(c12.contentEquals("F")) {
					 cb12 = 0;
				 }				 
				 double u12 = Double.parseDouble(tf12_.getText());
				 double QP12 =cb12*u12;
				 String total12 = Double.toString(QP12);
				 label12.setText(total12);
				 double cb13=0;
				 String c13 = cd13.getSelectedItem().toString();
				 if(c13.contentEquals("A")) {
					 cb13 = 5;
				 }
				 else if(c13.contentEquals("B")) {
					 cb13 = 4;
				 }
				 else if(c13.contentEquals("C")) {
					 cb13 = 3;
				 }
				 else if(c13.contentEquals("D")) {
					 cb13 = 2;
				 }
				 else if(c13.contentEquals("E")) {
					 cb13 = 1;
				 }
				 else if(c13.contentEquals("F")) {
					 cb13 = 0;
				 }				 
				 double u13 = Double.parseDouble(tf13_.getText());
				 double QP13 =cb13*u13;
				 String total13 = Double.toString(QP13);
				 label13.setText(total13);
				 double cb14=0;
				 String c14 = cd14.getSelectedItem().toString();
				 if(c14.contentEquals("A")) {
					 cb14 = 5;
				 }
				 else if(c14.contentEquals("B")) {
					 cb14 = 4;
				 }
				 else if(c14.contentEquals("C")) {
					 cb14 = 3;
				 }
				 else if(c14.contentEquals("D")) {
					 cb14 = 2;
				 }
				 else if(c14.contentEquals("E")) {
					 cb14 = 1;
				 }
				 else if(c14.contentEquals("F")) {
					 cb14 = 0;
				 }				 
				 double u14 = Double.parseDouble(tf14_.getText());
				 double QP14 =cb14*u14;
				 String total14 = Double.toString(QP14);
				 label14.setText(total14);
				 double cb15=0;
				 String c15 = cd15.getSelectedItem().toString();
				 if(c15.contentEquals("A")) {
					 cb15 = 5;
				 }
				 else if(c15.contentEquals("B")) {
					 cb15 = 4;
				 }
				 else if(c15.contentEquals("C")) {
					 cb15 = 3;
				 }
				 else if(c15.contentEquals("D")) {
					 cb15 = 2;
				 }
				 else if(c15.contentEquals("E")) {
					 cb15 = 1;
				 }
				 else if(c15.contentEquals("F")) {
					 cb15 = 0;
				 }				 
				 double u15 = Double.parseDouble(tf15_.getText());
				 double QP15 =cb15*u15;
				 String total15 = Double.toString(QP15);
				 label15.setText(total15);
				 				 
				 double TCU = u1+u2+u3+u4+u5+u6+u7+u8+u9+u10+u11+u12+u13+u14+u15;
				 double TQP = QP1+QP2+QP3+QP4+QP5+QP6+QP7+QP8+QP9+QP10+QP11+QP12+QP13+QP14+QP15;
				 double GP = TQP/TCU;
				 
				 String GPA = Double.toString(GP);
				 Label2.setText(GPA);
				 
			 }
			 else if(event.getSource()==calculate1) {
				 
				 double s1= Double.parseDouble(tf1.getText()) ;
				 if (s1>=70) {
					 s1 = 5;
				 }
				 else if(s1>=60) {
					 s1 = 4;
				 }
				 else if(s1>=50) {
					 s1 = 3;
				 }
				 else if(s1>=45) {
					 s1 = 2;
				 }
				 else if(s1>=40) {
					 s1 = 1;
				 }
				 else if(s1<=40) {
					 s1 = 0;
				 }
				 double u1 = Double.parseDouble(tf11b_.getText());
				 double QP1 =s1*u1;
				 String total1 = Double.toString(QP1);
				 label1a.setText(total1);
				 
				 double s2= Double.parseDouble(tf2.getText()) ;
				 if (s2>=70) {
					 s2 = 5;
				 }
				 else if(s2>=60) {
					 s2 = 4;
				 }
				 else if(s2>=50) {
					 s2 = 3;
				 }
				 else if(s2>=45) {
					 s2 = 2;
				 }
				 else if(s2>=40) {
					 s2 = 1;
				 }
				 else if(s2<=40) {
					 s2 = 0;
				 }
				 double u2 = Double.parseDouble(tf21_.getText());
				 double QP2 =s2*u2;
				 String total2 = Double.toString(QP2);
				 label2a.setText(total2);
				 
				 double s3= Double.parseDouble(tf3.getText()) ;
				 if (s3>=70) {
					 s3 = 5;
				 }
				 else if(s3>=60) {
					 s3 = 4;
				 }
				 else if(s3>=50) {
					 s3 = 3;
				 }
				 else if(s3>=45) {
					 s3 = 2;
				 }
				 else if(s3>=40) {
					 s3 = 1;
				 }
				 else if(s3<=40) {
					 s3 = 0;
				 }
				 double u3 = Double.parseDouble(tf31_.getText());
				 double QP3 =s3*u3;
				 String total3 = Double.toString(QP3);
				 label3a.setText(total3);

				 double s4= Double.parseDouble(tf4.getText()) ;
				 if (s4>=70) {
					 s4 = 5;
				 }
				 else if(s4>=60) {
					 s4 = 4;
				 }
				 else if(s4>=50) {
					 s4 = 3;
				 }
				 else if(s4>=45) {
					 s4 = 2;
				 }
				 else if(s4>=40) {
					 s4 = 1;
				 }
				 else if(s4<=40) {
					 s4 = 0;
				 }
				 double u4 = Double.parseDouble(tf41_.getText());
				 double QP4 =s4*u4;
				 String total4 = Double.toString(QP4);
				 label4a.setText(total4);
				 
				 double s5= Double.parseDouble(tf5.getText()) ;
				 if (s5>=70) {
					 s5 = 5;
				 }
				 else if(s5>=60) {
					 s5 = 4;
				 }
				 else if(s5>=50) {
					 s5 = 3;
				 }
				 else if(s5>=45) {
					 s5 = 2;
				 }
				 else if(s5>=40) {
					 s5 = 1;
				 }
				 else if(s5<=40) {
					 s5 = 0;
				 }
				 double u5 = Double.parseDouble(tf51_.getText());
				 double QP5 =s5*u5;
				 String total5 = Double.toString(QP5);
				 label5a.setText(total5);
				 
				 double s6= Double.parseDouble(tf6.getText()) ;
				 if (s6>=70) {
					 s6 = 5;
				 }
				 else if(s6>=60) {
					 s6 = 4;
				 }
				 else if(s6>=50) {
					 s6 = 3;
				 }
				 else if(s6>=45) {
					 s6 = 2;
				 }
				 else if(s6>=40) {
					 s6 = 1;
				 }
				 else if(s6<=40) {
					 s6 = 0;
				 }
				 double u6 = Double.parseDouble(tf61_.getText());
				 double QP6 =s6*u6;
				 String total6 = Double.toString(QP6);
				 label6a.setText(total6);
				 
				 double s7 = Double.parseDouble(tf7.getText()) ;
				 if (s7>=70) {
					 s7 = 5;
				 }
				 else if(s7>=60) {
					 s7 = 4;
				 }
				 else if(s7>=50) {
					 s7 = 3;
				 }
				 else if(s7>=45) {
					 s7 = 2;
				 }
				 else if(s7>=40) {
					 s7 = 1;
				 }
				 else if(s7<=40) {
					 s7 = 0;
				 }
				 double u7 = Double.parseDouble(tf71_.getText());
				 double QP7 =s7*u7;
				 String total7 = Double.toString(QP7);
				 label7a.setText(total7);
				 
				 double s8= Double.parseDouble(tf8.getText()) ;
				 if (s8>=70) {
					 s8 = 5;
				 }
				 else if(s8>=60) {
					 s8 = 4;
				 }
				 else if(s8>=50) {
					 s8 = 3;
				 }
				 else if(s8>=45) {
					 s8 = 2;
				 }
				 else if(s8>=40) {
					 s8 = 1;
				 }
				 else if(s8<=40) {
					 s8 = 0;
				 }
				 double u8 = Double.parseDouble(tf81_.getText());
				 double QP8 =s8*u8;
				 String total8 = Double.toString(QP8);
				 label8a.setText(total8);
				 
				 double s9= Double.parseDouble(tf9.getText()) ;
				 if (s9>=70) {
					 s9 = 5;
				 }
				 else if(s9>=60) {
					 s9 = 4;
				 }
				 else if(s9>=50) {
					 s9 = 3;
				 }
				 else if(s9>=45) {
					 s9 = 2;
				 }
				 else if(s9>=40) {
					 s9 = 1;
				 }
				 else if(s9<=40) {
					 s9 = 0;
				 }
				 double u9 = Double.parseDouble(tf91_.getText());
				 double QP9 =s9*u9;
				 String total9 = Double.toString(QP9);
				 label9a.setText(total9);
				 
				 double s10= Double.parseDouble(tf10.getText()) ;
				 if (s10>=70) {
					 s10 = 5;
				 }
				 else if(s10>=60) {
					 s10 = 4;
				 }
				 else if(s10>=50) {
					 s10 = 3;
				 }
				 else if(s10>=45) {
					 s10 = 2;
				 }
				 else if(s10>=40) {
					 s10 = 1;
				 }
				 else if(s10<=40) {
					 s10 = 0;
				 }
				 double u10 = Double.parseDouble(tf101_.getText());
				 double QP10 =s10*u10;
				 String total10 = Double.toString(QP10);
				 label10a.setText(total10);
				 
				 double s11= Double.parseDouble(tf11.getText()) ;
				 if (s11>=70) {
					 s11 = 5;
				 }
				 else if(s11>=60) {
					 s11 = 4;
				 }
				 else if(s11>=50) {
					 s11 = 3;
				 }
				 else if(s11>=45) {
					 s11 = 2;
				 }
				 else if(s11>=40) {
					 s11 = 1;
				 }
				 else if(s11<=40) {
					 s11 = 0;
				 }
				 double u11 = Double.parseDouble(tf111_.getText());
				 double QP11 =s11*u11;
				 String total11 = Double.toString(QP11);
				 label11a.setText(total11);
				 
				 double s12= Double.parseDouble(tf12.getText()) ;
				 if (s12>=70) {
					 s12 = 5;
				 }
				 else if(s12>=60) {
					 s12 = 4;
				 }
				 else if(s12>=50) {
					 s12 = 3;
				 }
				 else if(s12>=45) {
					 s12 = 2;
				 }
				 else if(s12>=40) {
					 s12 = 1;
				 }
				 else if(s12<=40) {
					 s12 = 0;
				 }
				 double u12 = Double.parseDouble(tf121_.getText());
				 double QP12 =s12*u12;
				 String total12 = Double.toString(QP12);
				 label12a.setText(total12);
				 
				 double s13= Double.parseDouble(tf13.getText()) ;
				 if (s13>=70) {
					 s13 = 5;
				 }
				 else if(s13>=60) {
					 s13 = 4;
				 }
				 else if(s13>=50) {
					 s13 = 3;
				 }
				 else if(s13>=45) {
					 s13 = 2;
				 }
				 else if(s13>=40) {
					 s13 = 1;
				 }
				 else if(s13<=40) {
					 s13 = 0;
				 }
				 double u13 = Double.parseDouble(tf131_.getText());
				 double QP13 =s13*u13;
				 String total13 = Double.toString(QP13);
				 label13a.setText(total13);
				 
				 double s14= Double.parseDouble(tf14.getText()) ;
				 if (s14>=70) {
					 s14 = 5;
				 }
				 else if(s14>=60) {
					 s14 = 4;
				 }
				 else if(s14>=50) {
					 s14 = 3;
				 }
				 else if(s14>=45) {
					 s14 = 2;
				 }
				 else if(s14>=40) {
					 s14 = 1;
				 }
				 else if(s14<=40) {
					 s14 = 0;
				 }
				 double u14 = Double.parseDouble(tf141_.getText());
				 double QP14 =s14*u14;
				 String total14 = Double.toString(QP14);
				 label14a.setText(total14);
				 
				 double s15= Double.parseDouble(tf15.getText()) ;
				 if (s15>=70) {
					 s15 = 5;
				 }
				 else if(s15>=60) {
					 s15 = 4;
				 }
				 else if(s15>=50) {
					 s15 = 3;
				 }
				 else if(s15>=45) {
					 s15 = 2;
				 }
				 else if(s15>=40) {
					 s15 = 1;
				 }
				 else if(s15<=40) {
					 s15 = 0;
				 }
				 double u15 = Double.parseDouble(tf151_.getText());
				 double QP15 =s15*u15;
				 String total15 = Double.toString(QP15);
				 label15a.setText(total15);
				 
				 double TCU = u1+u2+u3+u4+u5+u6+u7+u8+u9+u10+u11+u12+u13+u14+u15;
				 double TQP = QP1+QP2+QP3+QP4+QP5+QP6+QP7+QP8+QP9+QP10+QP11+QP12+QP13+QP14+QP15;
				 double GP = TQP/TCU;
				 
				 String GPA = Double.toString(GP);
				 Label.setText(GPA);
			 }
			 
			 else if(event.getSource()==calculate3) {
				 String g1 = txt1.getText();
				 double c1 = Double.parseDouble(g1);
				 String g2 = txt2.getText();
				 double c2 = Double.parseDouble(g2);
				 String g3 = txt3.getText();
				 double c3 = Double.parseDouble(g3);
				 String g4 = txt4.getText();
				 double c4 = Double.parseDouble(g4);
				 String g5 = txt5.getText();
				 double c5 = Double.parseDouble(g5);
				 String g6 = txt6.getText();
				 double c6 = Double.parseDouble(g6);
				 String g7 = txt7.getText();
				 double c7 = Double.parseDouble(g7);
				 String g8 = txt8.getText();
				 double c8 = Double.parseDouble(g8);
				 String g9 = txt9.getText();
				 double c9 = Double.parseDouble(g9);
				 double TC = (c1+c2+c3+c4+c5+c6+c7+c8)/c9;
				 String CTC = Double.toString(TC);
				 answer.setText(CTC);
			 }
		 }
	}
	
	public void CGPAFrame() {
		setLayout(new GridLayout(9,3,3,3));
		calculate3.addActionListener(listener2);
		add(new JLabel("Levels:"));
		add(new JLabel("First Semester"));
		add(new JLabel("Second Semester"));
		add(new JLabel("100 Level GPA"));
		add(txt1);
		add(txt2);
		add(new JLabel("200 Level GPA"));
		add(txt3);
		add(txt4);
		add(new JLabel("300 Level GPA"));
		add(txt5);
		add(txt6);
		add(new JLabel("400 Level GPA"));
		add(txt7);
		add(txt8);
		add(new JLabel("Numbers of Semester:"));
		add(new JLabel(" "));
		add(txt9);
		add(new JLabel(" "));
		add(calculate3);
		add(answer);
		
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		CGPA_Calculator call = new CGPA_Calculator();
		call.fFrame();
		call.setTitle("BB_WISE CGPA_Calculator");
		call.setSize(580,710);
		call.setResizable(false);
		call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		call.setLocationRelativeTo(null);
		call.setVisible(true);

	}
	public class Listener implements ActionListener{
		public void actionPerformed(ActionEvent Event) {

			 if (Event.getSource()==score) {
				 
				 MasterCard.show(MasterPanel, "SecondPanel");
				 
			 }
			 else if(Event.getSource()==grade) {
				 MasterCard.show(MasterPanel, "ThirdPanel");
				 
			 }
			 else if(Event.getSource()==CGPA) {
				 
				 CGPA_Calculator call = new CGPA_Calculator(); 
				 call.CGPAFrame();
				 call.setTitle("BB_WISE CGPA_Calculator");
				 call.setSize(400,410);
				 call.setResizable(false);
				 call.setLocationRelativeTo(null);
				 call.setVisible(true);
			 }
			 else if(Event.getSource()==Back2) {
			 MasterCard.show(MasterPanel, "Home");
		 }
			 else if(Event.getSource()==Back3) {
				 MasterCard.show(MasterPanel, "Home");
			 }
		}
		}

}
