/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package itproject;

import com.mysql.jdbc.Connection;
import java.awt.Container;
import java.sql.PreparedStatement;
import java.util.HashMap;
import javax.swing.*;
import mydatabase.DATABASE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Hasindu
 */
public class ReportView extends JFrame
{
    public ReportView(String fileName)
    {
        this(fileName, null);
    }
    public ReportView(String fileName, HashMap para)
    {
        super("ABC Solutions Employee/Project Management System (Report Viewer)");
             Connection con = null;
              PreparedStatement pst = null;
                con= DATABASE.connect();

        try
        {
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);            
        } 
        catch (JRException jRException)
        {
            
        }
        setBounds(10, 10, 900, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
}
