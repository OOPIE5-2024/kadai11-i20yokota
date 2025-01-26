package ex11;

import java.awt.Color;
import java.awt.Graphics;

public class BinaryImageFilter extends AbstractImageFilter {

	@Override
	public void process(GrayImage img) {
		// TODO Auto-generated method stub
		final int BORDER = 64;	//二値化の閾値
		int color;
		int black = Color.black.getRGB();
		int white = Color.white.getRGB();
		int height = img.getHeight();
		int width = img.getWidth();
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				color = img.getRGB(i, j) << 24;  //灰色なので、赤色のところだけ取り出す
				if(color >= BORDER) {	//ボーダーと比較して白黒を決める
					img.setRGB(i,j,black);
				}else {
					img.setRGB(i,j,white);
				}
			}
		}

		

	}

}
