package dynammicbeat;

import dynammicbeat.DynamicBeat;

public class Main {
	
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	public static final int NOTE_SPEED = 2;
	public static final int SLEEP_TIME = 8;
	public static final int REACH_TIME = 2; //노트가 판정바에 도달하기까지의 시간
	
	
	public static void main(String[] args) {

		new DynamicBeat();
		
	}

}



