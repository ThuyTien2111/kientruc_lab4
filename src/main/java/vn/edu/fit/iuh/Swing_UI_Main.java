package vn.edu.fit.iuh;

import jdepend.xmlui.JDepend;

public class Swing_UI_Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend();
        depend.addDirectory("T:\\Library-Assistant-master");
        depend.analyze();
        System.out.println("DONE");
    }
}
// npm run jdepend-ui T:\kientruc_lab4\lab4_edit\reports\report.xml be tai jdp ui
//