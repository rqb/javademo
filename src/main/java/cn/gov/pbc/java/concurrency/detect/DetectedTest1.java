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
 * 在Timer中通过timerStartFlag控制是否执行还是暂停
 * @author renqingbin
 *
 */
public class DetectedTest1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton startBtn = null;

	private JButton pauseBtn = null;

	private JPanel mainPane = null;
	
	private boolean timerStartFlag=true;
	
	String[] Names = { "通道", "状态"};

	Object[][] playerInfo = new Object[2][2];
	
	JTable table = new JTable();
	DefaultTableModel model;
	
	
	public DetectedTest1() {
		GuiInit();
		execTimer();
	}

	private void GuiInit() {
		startBtn = new JButton("探测开始");
		pauseBtn = new JButton("探测暂停");
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
				timerStartFlag = true;//开始
			}

		});
		pauseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timerStartFlag = false;//暂停
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
	                System.out.println("----定时器暂停-----");
	                model=new DefaultTableModel(null,Names);
	            	table.setModel(model);
	            }
	            model.fireTableDataChanged();
	         }          
	        },5000,5000);        
	}
}