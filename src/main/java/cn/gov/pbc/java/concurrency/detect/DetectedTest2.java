package cn.gov.pbc.java.concurrency.detect;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * 通过线程实现定时探测处理，通过startflag判断开始还是暂停
 * @author renqingbin
 *
 */
public class DetectedTest2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton startBtn = null;//开始按钮

	private JButton pauseBtn = null;//暂停按钮

	private JPanel mainPane = null;

	private ThreadTest thread = new ThreadTest();
	

	public DetectedTest2() {
		GuiInit();
		Thread t = new Thread(thread);
		t.start();
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

		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setContentPane(mainPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		startBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				thread.setFlag(true);
			}

		});
		pauseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				thread.setFlag(false);
			}

		});

	}

	public static void main(String[] args) {
		new DetectedTest2();
	}

	class ThreadTest extends Thread {

		private boolean startflag = false;

		public void run() {
			while (true) {
				if (startflag) {
					DetectUtil.detect();//执行探测
					try {
						Thread.sleep(3000);//休眠3秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		public void stopThread() {
			setFlag(false);
		}

		public boolean isFlag() {
			return startflag;
		}

		public void setFlag(boolean startflag) {
			this.startflag = startflag;
		}
	}

}