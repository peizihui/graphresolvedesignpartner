package dp.state.a3;

public class NoonState implements State {
    private static NoonState singleton = new NoonState();
    /**构造函数的可见性是private*/
    private NoonState() {
    }
    public static State getInstance() {                 // 获取唯一实例
        return singleton;
    }

    /**设置时间*/
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    /**使用金库*/
    public void doUse(Context context) {
        context.callSecurityCenter("紧急：午餐时间使用金库！");
    }
    /**按下警铃*/
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(午餐时间)");
    }
    /**正常通话*/
    public void doPhone(Context context) {
        context.recordLog("午餐时间的通话录音");
    }
    /**显示字符串*/
    @Override
    public String toString() {
        return "[午餐时间]";
    }
}
