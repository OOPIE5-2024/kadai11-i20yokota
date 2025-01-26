package ex11;

public class NegativeImageFilter extends AbstractImageFilter {

	@Override
	public void process(GrayImage img) {
		// TODO Auto-generated method stub
		int color;
		int height = img.getHeight();
		int width = img.getWidth();
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				color = img.getRGB(i, j) ^ 0xfff0; // 排他的論理話でRGBを反転
				img.setRGB(i,j,color);

			}
		}
	}
}
