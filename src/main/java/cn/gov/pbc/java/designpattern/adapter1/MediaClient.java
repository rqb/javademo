package cn.gov.pbc.java.designpattern.adapter1;

public class MediaClient {
	public static void main(String[] args) {
		IMediaPlayer mediaPlayer = new MediaPlayer();
		
		mediaPlayer.play();
		
		
		IRealPlayer realplayer = new RealPlayer();
		IMediaPlayer realPlayerAdapter = new RealPlayerAdapter(realplayer);
		
		realPlayerAdapter.play();
	}
}
