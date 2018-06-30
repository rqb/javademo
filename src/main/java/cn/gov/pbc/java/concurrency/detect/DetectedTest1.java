package cn.gov.pbc.java.concurrency.detect;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * ��Timer��ͨ��timerStartFlag�����Ƿ�ִ�л�����ͣ
 * @author renqingbin
 *
 */
public class DetectedTest1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton startBtn = null;

	private JButton pauseBtn = null;

	private JPanel mainPane = null;
	
	private boolean timerStartFlag=true;
	
	String[] Names = { "ͨ��", "״̬"};

	Object[][] playerInfo = new Object[2][2];
	
	JTable table = new JTable();
	DefaultTableModel model;
	
	
	public DetectedTest1() {
		GuiInit();
		execTimer();
	}

	private void GuiInit() {
		startBtn = new JButton("̽�⿪ʼ");
		pauseBtn = new JButton("̽����ͣ");
		Dimension dm = new Dimension(140, 21);
		startBtn.setPreferredSize(dm);
		pauseBtn.setPreferredSize(dm);
		mainPane = new JPanel(new FlowLayout(FlowLayout.CENTER, 200, 50));
		mainPane.add(startBtn);
		mainPane.add(pauseBtn);

		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setContentPane(mainPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	    table = new JTable();    
	    model=new DefaultTableModel(playerInfo,Names);
	    table.setModel(model);
	    JScrollPane scrollPane = new JScrollPane(table);
	    mainPane.add(scrollPane, BorderLayout.CENTER);
	    setVisible(true);
		
		startBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				timerStartFlag = true;//��ʼ
			}

		});
		pauseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timerStartFlag = false;//��ͣ
			}

		});

	}

	public static void main(String[] args) {
		new DetectedTest1();
	}

	
	private void execTimer(){
	    Timer timer = new java.util.Timer(); 
	    timer.schedule(new TimerTask(){    
	        public void run(){
	            if (timerStartFlag){
	            	model=new DefaultTableModel(DetectUtil.detect(),Names);
	            	table.setModel(model);
	            }else{
	                System.out.println("----��ʱ����ͣ-----");
	                model=new DefaultTableModel(null,Names);
	            	table.setModel(model);
	            }
	            model.fireTableDataChanged();
	         }          
	        },5000,5000);        
	}
}