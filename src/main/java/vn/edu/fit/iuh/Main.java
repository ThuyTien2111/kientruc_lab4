package vn.edu.fit.iuh;

import jdepend.xmlui.JDepend;

import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend(new PrintWriter("reports/report.xml"));
        depend.addDirectory("T:\\Library-Assistant-master");
        depend.analyze();
        System.out.println("DONE");
    }
}