import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;

class SummaryVersion extends screenGUI{
    private JLabel MaximumQ1;
    private JLabel MaximumQ2;
    private JLabel MaximumQ3;
    private JLabel MaximumQ4;
    private JLabel MaximumQ5;
    private JLabel MaximumTotal;
    private JLabel MinimumQ1;
    private JLabel MinimumQ2;
    private JLabel MinimumQ3;
    private JLabel MinimumQ4;
    private JLabel MinimumQ5;
    private JLabel MinimumTotal;
    private JLabel MeanQ1;
    private JLabel MeanQ2;
    private JLabel MeanQ3;
    private JLabel MeanQ4;
    private JLabel MeanQ5;
    private JLabel MeanTotal;
    private JLabel MedianQ1;
    private JLabel MedianQ2;
    private JLabel MedianQ3;
    private JLabel MedianQ4;
    private JLabel MedianQ5;
    private JLabel MedianTotal;
    private JTextField iMaximumQ1;
    private JTextField iMaximumQ2;
    private JTextField iMaximumQ3;
    private JTextField iMaximumQ4;
    private JTextField iMaximumQ5;
    private JTextField iMaximumTotal;
    private JTextField iMinimumQ1;
    private JTextField iMinimumQ2;
    private JTextField iMinimumQ3;
    private JTextField iMinimumQ4;
    private JTextField iMinimumQ5;
    private JTextField iMinimumTotal;
    private JTextField iMeanQ1;
    private JTextField iMeanQ2;
    private JTextField iMeanQ3;
    private JTextField iMeanQ4;
    private JTextField iMeanQ5;
    private JTextField iMeanTotal;
    private JTextField iMedianQ1;
    private JTextField iMedianQ2;
    private JTextField iMedianQ3;
    private JTextField iMedianQ4;
    private JTextField iMedianQ5;
    private JTextField iMedianTotal;

    public SummaryVersion(){
        computeData cd = new computeData();
        MaximumQ1 = new JLabel("Maximum of Q1");
        MaximumQ1.setBounds(5,30,200,30);
        iMaximumQ1 = new JTextField(String.format("%d",cd.ComputeMaxQ1()));
        iMaximumQ1.setBounds(210,30,200,30);
        iMaximumQ1.setEditable(false);
        MaximumQ2 = new JLabel("Maximum of Q2");
        MaximumQ2.setBounds(5,70,200,30);
        iMaximumQ2 = new JTextField(String.format("%d",cd.ComputeMaxQ2()));
        iMaximumQ2.setBounds(210,70,200,30);
        iMaximumQ2.setEditable(false);
        MaximumQ3 = new JLabel("Maximum of Q3");
        MaximumQ3.setBounds(5,110,200,30);
        iMaximumQ3 = new JTextField(String.format("%d",cd.ComputeMaxQ3()));
        iMaximumQ3.setBounds(210,110,200,30);
        iMaximumQ3.setEditable(false);
        MaximumQ4= new JLabel("Maximum of Q4");
        MaximumQ4.setBounds(5,150,200,30);
        iMaximumQ4 = new JTextField(String.format("%d",cd.ComputeMaxQ4()));
        iMaximumQ4.setBounds(210,150,200,30);
        iMaximumQ4.setEditable(false);
        MaximumQ5= new JLabel("Maximum of Q5");
        MaximumQ5.setBounds(5,190,200,30);
        iMaximumQ5 = new JTextField(String.format("%d",cd.ComputeMaxQ5()));
        iMaximumQ5.setBounds(210,190,200,30);
        iMaximumQ5.setEditable(false);
        MaximumTotal= new JLabel("Maximum of Total");
        MaximumTotal.setBounds(5,230,200,30);
        iMaximumTotal = new JTextField(String.format("%d",cd.ComputeMaxTotal()));
        iMaximumTotal.setBounds(210,230,200,30);
        iMaximumTotal.setEditable(false);
        MinimumQ1 = new JLabel("Minimum of Q1");
        MinimumQ1.setBounds(5,270,200,30);
        iMinimumQ1 = new JTextField(String.format("%d",cd.ComputeMinQ1()));
        iMinimumQ1.setBounds(210,270,200,30);
        iMinimumQ1.setEditable(false);
        MinimumQ2 = new JLabel("Minimum of Q2");
        MinimumQ2.setBounds(5,310,200,30);
        iMinimumQ2 = new JTextField(String.format("%d",cd.ComputeMinQ2()));
        iMinimumQ2.setBounds(210,310,200,30);
        iMinimumQ2.setEditable(false);
        MinimumQ3 = new JLabel("Minimum of Q3");
        MinimumQ3.setBounds(5,350,200,30);
        iMinimumQ3 = new JTextField(String.format("%d",cd.ComputeMinQ3()));
        iMinimumQ3.setBounds(210,350,200,30);
        iMinimumQ3.setEditable(false);
        MinimumQ4= new JLabel("Minimum of Q4");
        MinimumQ4.setBounds(5,390,200,30);
        iMinimumQ4 = new JTextField(String.format("%d",cd.ComputeMinQ4()));
        iMinimumQ4.setBounds(210,390,200,30);
        iMinimumQ4.setEditable(false);
        MinimumQ5= new JLabel("Minimum of Q5");
        MinimumQ5.setBounds(5,430,200,30);
        iMinimumQ5 = new JTextField(String.format("%d",cd.ComputeMinQ5()));
        iMinimumQ5.setBounds(210,430,200,30);
        iMinimumQ5.setEditable(false);
        MinimumTotal= new JLabel("Minimum of Total");
        MinimumTotal.setBounds(5,470,200,30);
        iMinimumTotal= new JTextField(String.format("%d",cd.ComputeMinTotal()));
        iMinimumTotal.setBounds(210,470,200,30);
        iMinimumTotal.setEditable(false);
        MeanQ1 = new JLabel("Mean of Q1");
        MeanQ1.setBounds(5,510,200,30);
        iMeanQ1 = new JTextField(String.format("%f",cd.ComputeMeanQ1()));
        iMeanQ1.setBounds(210,510,200,30);
        iMeanQ1.setEditable(false);
        MeanQ2 = new JLabel("Mean of Q2");
        MeanQ2.setBounds(5,550,200,30);
        iMeanQ2 = new JTextField(String.format("%f",cd.ComputeMeanQ2()));
        iMeanQ2.setBounds(210,550,200,30);
        iMeanQ2.setEditable(false);
        MeanQ3= new JLabel("Mean of Q3");
        MeanQ3.setBounds(5,590,200,30);
        iMeanQ3 = new JTextField(String.format("%f",cd.ComputeMeanQ3()));
        iMeanQ3.setBounds(210,590,200,30);
        iMeanQ3.setEditable(false);
        MeanQ4= new JLabel("Mean of Q4");
        MeanQ4.setBounds(5,630,200,30);
        iMeanQ4 = new JTextField(String.format("%f",cd.ComputeMeanQ4()));
        iMeanQ4.setBounds(210,630,200,30);
        iMeanQ4.setEditable(false);
        MeanQ5 = new JLabel("Mean of Q5");
        MeanQ5.setBounds(5,670,200,30);
        iMeanQ5 = new JTextField(String.format("%f",cd.ComputeMeanQ5()));
        iMeanQ5.setBounds(210,670,200,30);
        iMeanQ5.setEditable(false);
        MeanTotal = new JLabel("Mean of Total");
        MeanTotal.setBounds(5,710,200,30);
        iMeanTotal = new JTextField(String.format("%f",cd.ComputeMeanTotal()));
        iMeanTotal.setBounds(210,710,200,30);
        iMeanTotal.setEditable(false);
        MedianQ1 = new JLabel("Median of Q1");
        MedianQ1.setBounds(5,750,200,30);
        iMedianQ1 = new JTextField();
        iMedianQ1.setBounds(210,750,200,30);
        iMedianQ1.setEditable(false);
        MedianQ2 = new JLabel("Median of Q2");
        MedianQ2.setBounds(5,790,200,30);
        iMedianQ2 = new JTextField();
        iMedianQ2.setBounds(210,790,200,30);
        iMedianQ2.setEditable(false);
        MedianQ3= new JLabel("Median of Q3");
        MedianQ3.setBounds(5,830,200,30);
        iMedianQ3 = new JTextField();
        iMedianQ3.setBounds(210,830,200,30);
        iMedianQ3.setEditable(false);
        MedianQ4 = new JLabel("Median of Q4");
        MedianQ4.setBounds(5,870,200,30);
        iMedianQ4 = new JTextField();
        iMedianQ4.setBounds(210,870,200,30);
        iMedianQ4.setEditable(false);
        MedianQ5= new JLabel("Median of Q5");
        MedianQ5.setBounds(5,910,200,30);
        iMedianQ5 = new JTextField();
        iMedianQ5.setBounds(210,910,200,30);
        iMedianQ5.setEditable(false);
        MedianTotal = new JLabel("Median of Total");
        MedianTotal.setBounds(5,950,200,30);
        iMedianTotal = new JTextField();
        iMedianTotal.setBounds(210,950,200,30);
        iMedianTotal.setEditable(false);
        JScrollPane jsp = new JScrollPane();
        JFrame frame = new JFrame("SUMMARY TABLE");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(MaximumQ1);
        frame.add(iMaximumQ1);
        frame.add(MaximumQ2);
        frame.add(MaximumQ3);
        frame.add(MaximumQ4);
        frame.add(MaximumQ5);
        frame.add(MaximumTotal);
        frame.add(MinimumQ1);
        frame.add(MinimumQ2);
        frame.add(MinimumQ3);
        frame.add(MinimumQ4);
        frame.add(MinimumQ5);
        frame.add(MinimumTotal);
        frame.add(MeanQ1);
        frame.add(MeanQ2);
        frame.add(MeanQ3);
        frame.add(MeanQ4);
        frame.add(MeanQ5);
        frame.add(MeanTotal);
        frame.add(MedianQ1);
        frame.add(MedianQ2);
        frame.add(MedianQ3);
        frame.add(MedianQ4);
        frame.add(MedianQ5);
        frame.add(MedianTotal);
       
        frame.add(iMaximumQ2);
        frame.add(iMaximumQ3);
        frame.add(iMaximumQ4);
        frame.add(iMaximumQ5);
        frame.add(iMaximumTotal);
        frame.add(iMinimumQ1);
        frame.add(iMinimumQ2);
        frame.add(iMinimumQ3);
        frame.add(iMinimumQ4);
        frame.add(iMinimumQ5);
        frame.add(iMinimumTotal);
        frame.add(iMeanQ1);
        frame.add(iMeanQ2);
        frame.add(iMeanQ3);
        frame.add(iMeanQ4);
        frame.add(iMeanQ5);
        frame.add(iMeanTotal);
        frame.add(iMedianQ1);
        frame.add(iMedianQ2);
        frame.add(iMedianQ3);
        frame.add(iMedianQ4);
        frame.add(iMedianQ5);
        frame.add(iMedianTotal);
        frame.setVisible(true);
        frame.setSize(getScreenWidth(),2*getScreenHeight());
        frame.add(jsp);
        
    }
    public void displayGUISummary(){
        new SummaryVersion();
    }
}
