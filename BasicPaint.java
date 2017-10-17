import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BasicPaint {
	public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(500, 500);
		f.setVisible(true);
	}
}

class MyPanel extends JPanel {
	Font f1;

	public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		f1 = new Font("Serif", Font.PLAIN, 10);
	}

	public void init() {
		setBackground(Color.black);
		setForeground(Color.green);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(f1);
		g.drawString("drawLine", 10, 20);

		g.drawString("drawRect", 100, 20);
		g.drawString("fillRect", 150, 20);
		g.drawString("clearRect", 200, 20);
		g.drawString("drawRRect", 250, 20);
		g.drawString("fillRRect", 300, 20);
		g.drawString("drawOval", 10, 170);
		g.drawString("fillOval", 120, 170);
		g.drawString("draw3Rect", 350, 20);
		g.drawString("fill3Rect", 400, 20);
		g.drawString("drawArc", 200, 170);
		g.drawString("fillArc", 270, 170);
		g.drawString("drawPoly", 50, 20);
		g.drawString("fillPoly", 50, 30);
		g.drawString("drawPolyline", 300, 170);
		g.drawLine(10, 30, 50, 50);
		g.drawRect(100, 30, 50, 50);
		g.fillRect(150, 30, 50, 50);
		g.clearRect(200, 30, 50, 50);
		g.drawRoundRect(250, 30, 50, 50, 20, 20);
		g.fillRoundRect(300, 30, 50, 50, 20, 20);
		g.drawOval(10, 100, 70, 50);
		g.fillOval(110, 100, 70, 50);
		g.drawArc(200, 100, 50, 50, 90, 180);
		g.fillArc(270, 100, 50, 50, 90, 180);
		int[] xSin = { 280, 305, 330};
		int[] ySin = { 100, 243, 205};
		g.drawPolyline(xSin, ySin, xSin.length);
		int[] xPoints = new int[6];
		int[] yPoints = new int[6];
		xPoints[0] = 50;
		xPoints[1] = 70;
		xPoints[2] = 80;
		xPoints[3] = 70;
		xPoints[4] = 50;
		xPoints[5] = 40;
		yPoints[0] = 50;
		yPoints[1] = 50;
		yPoints[2] = 60;
		yPoints[3] = 70;
		yPoints[4] = 70;
		yPoints[5] = 60;
		g.drawPolygon(xPoints, yPoints, xPoints.length);
		int[] xPoints1 = new int[6];
		int[] yPoints1 = new int[6];
		xPoints1[0] = 80;
		xPoints1[1] = 90;
		xPoints1[2] = 100;
		xPoints1[3] = 90;
		xPoints1[4] = 80;
		xPoints1[5] = 70;
		yPoints1[0] = 80;
		yPoints1[1] = 80;
		yPoints1[2] = 90;
		yPoints1[3] = 90;
		yPoints1[4] = 90;
		yPoints1[5] = 90;
		g.fillPolygon(xPoints1, yPoints1, xPoints1.length);
		g.draw3DRect(350, 30, 50, 50, true);
		g.fill3DRect(400, 30, 50, 50, true);

	}
}
