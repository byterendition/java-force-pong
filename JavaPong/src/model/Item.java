package model;

public class Item {
	private PongImage	image;
	private double		xPos, yPos;
	
	public Item(PongImage image) {
		this.image = image;
	}
	
	public PongImage getImage() {
		return image;
	}
}