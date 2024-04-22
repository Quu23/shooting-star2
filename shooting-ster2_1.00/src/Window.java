import javax.swing.JFrame;

public class Window extends JFrame{
    
    Window(String title,int width,int height){
        this.setTitle(title);
        this.setSize(width,height);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 真ん中に配置する処理
        this.setLocationRelativeTo(null);

        // todo:以下でキャンバスを配置する。
    }
    
}
