package dp.visitor.a1;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private ArrayList found = new ArrayList();
    public FileFindVisitor(String filetype) {           // 指定.后面的文件后缀名，如".txt"
        this.filetype = filetype;
    }
    public Iterator getFoundFiles() {                   // 获取已经找到的文件
        return found.iterator();
    }
    /** 在访问文件时被调用*/
    @Override
    public void visit(File file) {
        if (file.getName().endsWith(filetype)) {
            found.add(file);
        }
    }
    /**在访问文件夹时被调用*/
    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
