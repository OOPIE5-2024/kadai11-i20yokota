package ex11;

import java.awt.image.BufferedImage;
import java.awt.Graphics;

//@SuppressWarnings("serial")
public class GrayImage extends BufferedImage{
	
	public GrayImage(BufferedImage img) {
		// 親クラスのコンストラクタ(グレイスケールで作成)
		super(img.getWidth(),img.getHeight(),TYPE_BYTE_GRAY);
		// Graphicsオブジェクトを作成し
		Graphics g = createGraphics();
		// 画像を自身に書き込む
		g.drawImage(img, 0, 0, null);
		
	}

  public int getGray(int x,int gray) { 
	  
	  return 0;
  }
  
  public void setGray(int x, int y, int gray) {
	  
	  return;
  }
  
  public void applyFilter(AbstractImageFilter f) {
	  f.process(this);
  }
  
}
