import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Canvas extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {

        // アンチエイリアシング処理。これを行うことで描画が滑らかになるが、動作が重くなる。
        // TODO:これをplay時には切り替えられるようにする。
        Graphics2D gra = (Graphics2D) g;
        gra.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        this.draw(g);
        super.paintComponent(g);
    }

    private void draw(Graphics g){
        // TODO:描画処理を書く。ほかのクラスが定義してからにしたい。
        // プレイヤーはAppの静的フィールドとして持つようにしないといけない。
    }
}
