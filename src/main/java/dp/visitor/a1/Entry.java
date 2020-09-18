package dp.visitor.a1;

import java.util.Iterator;

public abstract class Entry implements Element {
    /**获取名字*/

    public abstract String getName();
    /**获取大小*/

    public abstract int getSize();
    /**增加目录条目*/
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    /**生成Iterator*/
    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    /**显示字符串*/
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
