package dp.visitor.a1;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";
    //
    /**当前访问的文件夹的名字*/
    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }
    /**在访问文件夹时被调用*/
    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
