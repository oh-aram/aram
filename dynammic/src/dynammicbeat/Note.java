package dynammicbeat;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread{
	private Image noteBasicImage = new ImageIcon(Main.class.getResource("../images/noteBasic.png"))
			.getImage();
	private Image noteBasicImageSpace1 = new ImageIcon(Main.class.getResource("../images/noteBasicSpace.png"))
			.getImage();
	private Image noteBasicImageSpace2 = new ImageIcon(Main.class.getResource("../images/noteBasicSpace2.png"))
			.getImage();
	
	private int x,y = 580- (1000 /Main.SLEEP_TIME * Main.NOTE_SPEED) * Main.REACH_TIME; //��Ʈ�� �����ǰ� 1�ʵڿ� �������� ����
	private String noteType;
	
	public Note(String noteType) {
		if(noteType.contentEquals("S")) {
			x=228;
		}
		else if(noteType.contentEquals("D")) {
			x=332;
		}
		else if(noteType.contentEquals("F")) {
			x=436;
		}
		else if(noteType.contentEquals("Space")) {
			x=540;
		}
		else if(noteType.contentEquals("J")) {
			x=744;
		}
		else if(noteType.contentEquals("K")) {
			x=848;
		}
		else if(noteType.contentEquals("L")) {
			x=952;
		}
		this.noteType=noteType;
	}
	
	public void screenDraw(Graphics2D g) {
		if(!noteType.equals("Space")) { //spacebar ���� �� Ű
			g.drawImage(noteBasicImage, x+10, y, null);
		}
		else //spacebar�ΰ��
		{
			g.drawImage(noteBasicImageSpace1, x+30, y, null);
			g.drawImage(noteBasicImageSpace2, x+100, y, null);
		}
	}
	
	public void drop() {
		y+= Main.NOTE_SPEED; 
	}
	
	@Override
	public void run() {
		try { 
			while(true) { //�迭�� ����� ��Ʈ�� ����Ʈ���ٰ���
				drop();
				Thread.sleep(Main.SLEEP_TIME); //Sleeptime ��ŭ ���鼭 ����Ʈ��
			}
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	
}
