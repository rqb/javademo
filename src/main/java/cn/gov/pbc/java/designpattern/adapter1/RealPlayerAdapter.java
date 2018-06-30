package cn.gov.pbc.java.designpattern.adapter1;

public class RealPlayerAdapter implements IMediaPlayer {

	IRealPlayer realPlayer;
	
	public RealPlayerAdapter(IRealPlayer realPlayer ){
		this.realPlayer = realPlayer;
	}
	
	@Override
	public void play() {
		realPlayer.playRealPlayer();
	}

}
