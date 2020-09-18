package dp.visitor.a1;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    /**文件夹名字*/
    private String name;
    /**目录条目集合*/
    private ArrayList dir = new ArrayList();
    /**构造函数*/
    public Directory(String name) {
        this.name = name;
    }
    /**获取名字*/
    @Override
    public String getName() {
        return name;
    }
    /**获取大小*/
    @Override
    public int getSize() {
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    /**增加目录条目*/
    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }
    /**生成Iterator*/
    @Override
    public Iterator iterator() {
        return dir.iterator();
    }

    /** 接受访问者的访问*/
    public void accept(Visitor v) {
        v.visit(this);
    }
}
