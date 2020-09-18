package dp.command.a1.drawer;
import dp.command.a1.command.Command;
import java.awt.*;

public class ColorCommand implements Command {
    // 绘制对象
    protected Drawable drawable;
    // 颜色
    private Color color;
    // 构造函数
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    // 执行
    public void execute() {
        drawable.setColor(color);
    }
}
