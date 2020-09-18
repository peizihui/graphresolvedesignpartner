package dp.state.a4;

public class DayState implements State {
    private static DayState singleton = new DayState();
    /** 构造函数的可见性是private*/
    private DayState() {
    }
    /** 获取唯一实例*/
    public static State getInstance() {
        return singleton;
    }
    /** 设置时间*/
    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }
    /** 使用金库*/
    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库(白天)");
    }
    /** 按下警铃*/
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
        context.changeState(UrgentState.getInstance()); 
    }
    /** 正常通话*/
    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }
    /** 显示表示类的文字*/
    @Override
    public String toString() {
        return "[白天]";
    }
}
