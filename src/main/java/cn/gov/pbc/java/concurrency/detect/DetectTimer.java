package cn.gov.pbc.java.concurrency.detect;

import java.util.TimerTask;

/**
 * ∂® ±ÃΩ≤‚¿‡
 * @author renqingbin
 *
 */
public class DetectTimer extends TimerTask {

	private boolean timerFlag = true;
	
	public DetectTimer(boolean timerFlag) {
		this.timerFlag = timerFlag;
	}

	@Override
	public void run() {
		 /* If timer not running, start timer */
        if (isTimerFlag()){
            DetectUtil.detect();
        }else{
            System.out.println("Timer paused");
        }
	}

	public boolean isTimerFlag() {
		return timerFlag;
	}

	public void setTimerFlag(boolean timerFlag) {
		this.timerFlag = timerFlag;
	}
	
	

}
