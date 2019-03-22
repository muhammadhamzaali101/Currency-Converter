

package currnecy.converter.with.gui;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Gui extends JFrame {
   
    private JComboBox selection,selection1,selection2;
    private JButton button; 
    private JTextField text,text1,text2;
    private JLabel label;
    
    String names[]={"US Dollar","PKR","Chinese Yuan","Canadian Dollar","Dinar","Dirham","Euro","Indian Rupee","Australian Dollar","Yen","Pound","Franc","Rayal","Afghani","Norway Krone","New Zealand Dollar","German Mark","Bangladesh Taka","Hong Kong Dollar","Omani Rial"};
    String name[]={"US Dollar","PKR","Chinese Yuan","Canadian Dollar","Dinar","Dirham","Euro","Indian Rupee","Australian Dollar","Yen","Pound","Franc","Rayal","Afghani","Norway Krone","New Zealand Dollar","German Mark","Bangladesh Taka","Hong Kong Dollar","Omani Rial"};
    String month[]={"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
    
    public Gui()
    {
        super("Converter");
          try {
    final Image backgroundImage = javax.imageio.ImageIO.read(new File("images.jpg"));
    setContentPane(new JPanel(new BorderLayout()) {
        @Override public void paintComponent(Graphics g) {
            g.drawImage(backgroundImage, 0, 0, null);
        }
    });
        } catch (IOException e) {
            //throw new RuntimeException(e);
        }
        setLayout(null);
        selection = new JComboBox(names);
        selection2 = new JComboBox(month);
        selection1 = new JComboBox(name);
        text =new JTextField(10);
        text1 =new JTextField(10);
        text2 =new JTextField(10);
        button = new JButton("Convert");
        add(selection);
        add(text);
        add(selection1);
        add(text1);
        add(selection2);
        add(button);
        
        selection.setBounds(45,25,147,30);
        text.setBounds(195,25,147,30);
        selection1.setBounds(45,70,147,30);
        text1.setBounds(195,70,147,30);
        selection2.setBounds(90,115,200,30);
        button.setBounds(112,160,140,45);
        
        Handel h=new Handel();
        selection.addActionListener(h);
        selection1.addActionListener(h);
        button.addActionListener(h);
    }
 
   private class Handel implements ActionListener
    {
        double total=0.0,a=0.0;
     
        @Override
      public void actionPerformed(ActionEvent e)
      {
        double d=0;
         String line;
       Object item=selection.getSelectedItem();
       Object item1=selection1.getSelectedItem();
       Object item2=selection2.getSelectedItem();
       a=Double.parseDouble(text.getText());
    try
    {
        FileReader fr=new FileReader("C:\\Users\\ME\\Desktop\\Currnecy Converter with GUI\\Rates\\usDollarToOther.txt");
        BufferedReader br=new BufferedReader(fr);
       
     while ((line = br.readLine())!= null){
        try{
            String[] data = line.split(",");
       
       if(item=="US Dollar")
       {
       
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a; 
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data[0]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[1]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[2]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[3]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[4]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[5]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[6]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[7]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[8]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[9]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[10]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[11]);
                        } 
                        total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Chinese Yuan")
                    {
                            if(item2=="January")
                        {
                            d=Double.parseDouble(data[12]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[13]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[14]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[15]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[16]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[17]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[18]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[19]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[20]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[21]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[22]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[23]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Canadian Dollar")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[24]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[25]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[26]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[27]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[28]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[29]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[30]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[31]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[32]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[33]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[34]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[35]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dinar")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[36]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[37]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[38]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[39]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[40]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[41]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[42]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[43]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[44]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[45]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[46]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[47]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dirham")
                    {
                            if(item2=="January")
                        {
                            d=Double.parseDouble(data[48]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[49]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[50]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[51]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[52]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[53]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[54]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[55]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[56]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[57]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[58]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[59]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Euro")
                    {
                            if(item2=="January")
                        {
                            d=Double.parseDouble(data[60]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[61]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[62]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[63]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[64]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[65]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[66]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[67]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[68]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[69]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[70]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[71]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Indian Rupee")
                    {
                             if(item2=="January")
                        {
                            d=Double.parseDouble(data[72]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[73]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[74]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[75]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[76]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[77]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[78]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[79]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[80]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[81]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[82]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[83]);
                        }
                             total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Australian Dollar")
                    {
                            if(item2=="January")
                        {
                            d=Double.parseDouble(data[84]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[85]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[86]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[87]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[88]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[89]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[90]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[91]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[92]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[93]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[94]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[95]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Yen")
                    {
                            if(item2=="January")
                        {
                            d=Double.parseDouble(data[96]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[97]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[98]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[99]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[100]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[101]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[102]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[103]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[104]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[105]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[106]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[107]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Pound")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[108]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[109]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[110]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[111]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[112]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[113]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[114]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[115]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[116]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[117]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[118]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[119]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Franc")
                    {
                            if(item2=="January")
                        {
                            d=Double.parseDouble(data[120]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[121]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[122]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[123]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[124]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[125]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[126]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[127]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[128]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[129]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[130]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[131]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Rayal")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[132]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[133]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[134]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[135]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[136]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[137]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[138]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[139]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[140]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[141]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[142]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[143]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Afghani")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[144]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[145]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[146]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[147]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[148]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[149]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[150]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[151]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[152]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[153]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[154]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[155]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Norway Krone")
                    {
                             if(item2=="January")
                        {
                            d=Double.parseDouble(data[156]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[157]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[158]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[159]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[160]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[161]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[162]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[163]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[164]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[165]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[166]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[167]);
                        }
                             total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[168]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[169]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[170]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[171]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[172]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[173]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[174]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[175]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[176]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[177]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[178]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[179]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="German Mark")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[180]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[181]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[182]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[183]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[184]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[185]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[186]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[187]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[188]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[189]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[190]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[191]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[192]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[193]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[194]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[195]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[196]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[197]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[198]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[199]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[200]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[201]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[202]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[203]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[204]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[205]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[206]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[207]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[208]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[209]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[210]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[211]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[212]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[213]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[214]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[215]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Omani Rial")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data[216]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data[217]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data[218]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data[219]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data[220]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data[221]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data[222]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data[223]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data[224]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data[225]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data[226]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data[227]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                     br.close();
                    }
                    if(e.getSource()==button)
                    {
                    text1.setText(""+total);
                    }
                    
            }
       if(item=="PKR")
       {
           FileReader fr1=new FileReader("C:\\Users\\ME\\Desktop\\Currnecy Converter with GUI\\Rates\\PKRtoOther.txt");
        BufferedReader br1=new BufferedReader(fr1);
        while ((line = br1.readLine())!= null){
          try{
              System.out.println(line);
              String []data1 = line.split(",");
                         
                    if(item1=="US Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data1[0]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[1]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[2]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[3]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[4]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[5]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[6]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[7]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[8]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[9]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[10]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[11]);
                        } 
                        total=a*d;
                     text2.setText(""+d);
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                             if(item2=="January")
                        {
                            d=Double.parseDouble(data1[12]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[13]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[14]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[15]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[16]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[17]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[18]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[19]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[20]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[21]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[22]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[23]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data1[24]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[25]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[26]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[27]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[28]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[29]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[30]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[31]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[32]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[33]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[34]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[35]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dinar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data1[36]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[37]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[38]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[39]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[40]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[41]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[42]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[43]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[44]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[45]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[46]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[47]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dirham")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data1[48]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[49]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[50]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[51]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[52]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[53]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[54]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[55]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[56]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[57]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[58]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[59]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Euro")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data1[60]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[61]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[62]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[63]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[64]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[65]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[66]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[67]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[68]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[69]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[70]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[71]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    
                           
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data1[72]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[73]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[74]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[75]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[76]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[77]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[78]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[79]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[80]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[81]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[82]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[83]);
                        }
                             total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Australian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data1[84]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[85]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[86]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[87]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[88]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[89]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[90]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[91]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[92]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[93]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[94]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[95]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Yen")
                    {if(item2=="January")
                        {
                            d=Double.parseDouble(data1[96]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[97]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[98]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[99]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[100]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[101]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[102]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[103]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[104]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[105]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[106]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[107]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Pound")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data1[108]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[109]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[110]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[111]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[112]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[113]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[114]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[115]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[116]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[117]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[118]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[119]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Franc")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data1[120]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[121]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[122]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[123]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[124]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[125]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[126]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[127]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[128]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[129]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[130]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[131]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Rayal")
                    {
                        
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data1[132]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[133]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[134]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[135]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[136]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[137]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[138]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[139]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[140]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[141]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[142]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[143]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Afghani")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data1[144]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[145]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[146]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[147]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[148]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[149]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[150]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[151]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[152]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[153]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[154]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[155]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data1[156]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[157]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[158]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[159]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[160]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[161]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[162]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[163]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[164]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[165]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[166]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[167]);
                        }
						total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data1[168]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[169]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[170]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[171]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[172]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[173]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[174]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[175]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[176]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[177]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[178]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[179]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="German Mark")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data1[180]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[181]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[182]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[183]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[184]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[185]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[186]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[187]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[188]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[189]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[190]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[191]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data1[192]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[193]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[194]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[195]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[196]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[197]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[198]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[199]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[200]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[201]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[202]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[203]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data1[204]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[205]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[206]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[207]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[208]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[209]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[210]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[211]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[212]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[213]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[214]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[215]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Omani Rial")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data1[216]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data1[217]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data1[218]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data1[219]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data1[220]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data1[221]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data1[222]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data1[223]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data1[224]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data1[225]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data1[226]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data1[227]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                    if(e.getSource()==button)
                    {
                    text1.setText(""+total);
                    }
          }catch(ArrayIndexOutOfBoundsException q)
          {
              q.printStackTrace();
              
          }}      
            }
       if(item=="Chinese Yuan")
       {
        FileReader fr2=new FileReader("C:\\Users\\ME\\Desktop\\Currnecy Converter with GUI\\Rates\\YuanToOther.txt");
        BufferedReader br2=new BufferedReader(fr2);
        String line2;
        while ((line2 = br2.readLine())!= null){
          try{
              System.out.println(line);
              String []data4 = line2.split(",");
                         
                    if(item1=="US Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[0]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[1]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[2]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[3]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[4]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[5]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[6]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[7]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[8]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[9]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[10]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[11]);
                        } 
                        total=a*d;
                     text2.setText(""+d);
                    }
                    else if(item1=="PKR")
                    {
                             if(item2=="January")
                        {
                            d=Double.parseDouble(data4[12]);
                            text1.setText(""+total);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[13]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[14]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[15]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[16]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[17]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[18]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[19]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[20]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[21]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[22]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[23]);
                        }
                       total=a*d;    
                     text2.setText(""+d);
                    }
                     else if(item1=="Chinese Yuan")
                    {
                     total=a;   
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[24]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[25]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[26]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[27]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[28]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[29]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[30]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[31]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[32]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[33]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[34]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[35]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dinar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[36]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[37]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[38]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[39]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[40]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[41]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[42]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[43]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[44]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[45]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[46]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[47]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dirham")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[48]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[49]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[50]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[51]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[52]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[53]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[54]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[55]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[56]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[57]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[58]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[59]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Euro")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[60]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[61]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[62]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[63]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[64]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[65]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[66]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[67]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[68]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[69]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[70]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[71]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    
                           
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[72]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[73]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[74]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[75]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[76]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[77]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[78]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[79]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[80]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[81]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[82]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[83]);
                        }
                             total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Australian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[84]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[85]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[86]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[87]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[88]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[89]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[90]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[91]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[92]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[93]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[94]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[95]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Yen")
                    {if(item2=="January")
                        {
                            d=Double.parseDouble(data4[96]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[97]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[98]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[99]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[100]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[101]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[102]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[103]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[104]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[105]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[106]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[107]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Pound")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[108]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[109]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[110]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[111]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[112]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[113]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[114]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[115]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[116]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[117]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[118]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[119]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Franc")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[120]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[121]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[122]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[123]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[124]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[125]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[126]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[127]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[128]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[129]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[130]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[131]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Rayal")
                    {
                        
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[132]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[133]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[134]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[135]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[136]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[137]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[138]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[139]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[140]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[141]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[142]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[143]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Afghani")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[144]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[145]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[146]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[147]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[148]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[149]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[150]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[151]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[152]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[153]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[154]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[155]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[156]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[157]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[158]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[159]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[160]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[161]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[162]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[163]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[164]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[165]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[166]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[167]);
                        }
						total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[168]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[169]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[170]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[171]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[172]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[173]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[174]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[175]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[176]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[177]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[178]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[179]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="German Mark")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[180]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[181]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[182]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[183]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[184]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[185]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[186]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[187]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[188]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[189]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[190]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[191]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[192]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[193]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[194]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[195]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[196]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[197]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[198]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[199]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[200]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[201]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[202]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[203]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[204]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[205]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[206]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[207]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[208]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[209]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[210]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[211]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[212]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[213]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[214]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[215]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Omani Rial")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[216]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[217]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[218]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[219]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[220]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[221]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[222]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[223]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[224]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[225]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[226]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[227]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                    if(e.getSource()==button)
                    {
                    text1.setText(""+total);
                    }
                    
          }catch(ArrayIndexOutOfBoundsException q)
          {
              q.printStackTrace();
              
          }}
         
            }
       if(item=="Canadian Dollar")
       {
       
                   FileReader fr3=new FileReader("C:\\Users\\ME\\Desktop\\Currnecy Converter with GUI\\Rates\\CanadianDollarToOther.txt");
        BufferedReader br3=new BufferedReader(fr3);
        String line3;
        while ((line3 = br3.readLine())!= null){
          try{
              String []data3 = line3.split(",");
                         
                    if(item1=="US Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data3[0]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[1]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[2]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[3]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[4]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[5]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[6]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[7]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[8]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[9]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[10]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[11]);
                        } 
                        total=a*d;
                     text2.setText(""+d);
                    }
                    else if(item1=="PKR")
                    {
                             if(item2=="January")
                        {
                            d=Double.parseDouble(data3[12]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[13]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[14]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[15]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[16]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[17]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[18]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[19]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[20]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[21]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[22]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[23]);
                        }
                       total=a*d;    
                     text2.setText(""+d);
                    }
                     else if(item1=="Chinese Yuan")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data3[24]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[25]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[26]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[27]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[28]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[29]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[30]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[31]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[32]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[33]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[34]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[35]);
                        }
                           total=a*d;
                     text2.setText(""+d); 
                    }
                     else if(item1=="Canadian Dollar")
                    {
                        
                       total=a;  
                    }
                     else if(item1=="Dinar")
                    {
                         
                    }
                     else if(item1=="Dirham")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data3[48]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[49]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[50]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[51]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[52]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[53]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[54]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[55]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[56]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[57]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[58]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[59]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Euro")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data3[60]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[61]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[62]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[63]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[64]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[65]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[66]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[67]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[68]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[69]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[70]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[71]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    
                           
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data3[72]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[73]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[74]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[75]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[76]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[77]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[78]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[79]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[80]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[81]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[82]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[83]);
                        }
                             total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Australian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data3[84]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[85]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[86]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[87]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[88]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[89]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[90]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[91]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[92]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[93]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[94]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[95]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Yen")
                    {if(item2=="January")
                        {
                            d=Double.parseDouble(data3[96]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[97]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[98]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[99]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[100]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[101]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[102]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[103]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[104]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[105]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[106]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[107]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Pound")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data3[108]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[109]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[110]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[111]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[112]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[113]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[114]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[115]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[116]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[117]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[118]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[119]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Franc")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data3[120]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[121]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[122]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[123]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[124]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[125]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[126]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[127]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[128]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[129]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[130]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[131]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Rayal")
                    {
                        
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data3[132]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[133]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[134]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[135]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[136]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[137]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[138]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[139]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[140]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[141]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[142]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[143]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Afghani")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data3[144]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[145]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[146]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[147]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[148]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[149]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[150]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[151]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[152]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[153]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[154]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[155]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data3[156]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[157]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[158]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[159]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[160]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[161]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[162]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[163]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[164]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[165]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[166]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[167]);
                        }
						total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data3[168]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[169]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[170]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[171]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[172]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[173]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[174]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[175]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[176]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[177]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[178]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[179]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="German Mark")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data3[180]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[181]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[182]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[183]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[184]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[185]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[186]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[187]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[188]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[189]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[190]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[191]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data3[192]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[193]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[194]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[195]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[196]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[197]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[198]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[199]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[200]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[201]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[202]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[203]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data3[204]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[205]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[206]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[207]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[208]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[209]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[210]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[211]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[212]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[213]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[214]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[215]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Omani Rial")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data3[216]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data3[217]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data3[218]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data3[219]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data3[220]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data3[221]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data3[222]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data3[223]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data3[224]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data3[225]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data3[226]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data3[227]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                    if(e.getSource()==button)
                    {
                    text1.setText(""+total);
                    }
          }catch(ArrayIndexOutOfBoundsException q)
          {
              q.printStackTrace();
              
          }}
            }
       if(item=="Dinar")
       {
          FileReader fr4=new FileReader("C:\\Users\\ME\\Desktop\\Currnecy Converter with GUI\\Rates\\dinarToOther.txt");
        BufferedReader br4=new BufferedReader(fr4);
        String line4;
        while ((line4 = br4.readLine())!= null){
          try{
              String []data4 = line4.split(",");
                         
                    if(item1=="US Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[0]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[1]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[2]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[3]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[4]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[5]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[6]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[7]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[8]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[9]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[10]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[11]);
                        } 
                        total=a*d;
                     text2.setText(""+d);
                    }
                    else if(item1=="PKR")
                    {
                             if(item2=="January")
                        {
                            d=Double.parseDouble(data4[12]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[13]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[14]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[15]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[16]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[17]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[18]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[19]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[20]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[21]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[22]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[23]);
                        }
                       total=a*d;    
                     text2.setText(""+d);
                    }
                     else if(item1=="Chinese Yuan")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[24]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[25]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[26]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[27]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[28]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[29]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[30]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[31]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[32]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[33]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[34]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[35]);
                        }
                           total=a*d;
                     text2.setText(""+d); 
                    }
                     else if(item1=="Canadian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[36]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[37]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[38]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[39]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[40]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[41]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[42]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[43]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[44]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[45]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[46]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[47]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dirham")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[48]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[49]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[50]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[51]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[52]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[53]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[54]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[55]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[56]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[57]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[58]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[59]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                      
                    }
                     else if(item1=="Dinar")
                    {
                         total=a;  
                    }
                     else if(item1=="Euro")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[60]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[61]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[62]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[63]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[64]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[65]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[66]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[67]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[68]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[69]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[70]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[71]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    
                           
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[72]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[73]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[74]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[75]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[76]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[77]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[78]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[79]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[80]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[81]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[82]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[83]);
                        }
                             total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Australian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[84]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[85]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[86]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[87]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[88]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[89]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[90]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[91]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[92]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[93]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[94]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[95]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Yen")
                    {if(item2=="January")
                        {
                            d=Double.parseDouble(data4[96]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[97]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[98]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[99]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[100]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[101]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[102]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[103]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[104]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[105]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[106]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[107]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Pound")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[108]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[109]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[110]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[111]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[112]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[113]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[114]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[115]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[116]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[117]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[118]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[119]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Franc")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[120]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[121]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[122]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[123]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[124]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[125]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[126]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[127]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[128]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[129]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[130]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[131]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Rayal")
                    {
                        
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[132]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[133]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[134]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[135]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[136]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[137]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[138]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[139]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[140]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[141]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[142]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[143]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Afghani")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[144]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[145]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[146]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[147]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[148]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[149]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[150]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[151]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[152]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[153]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[154]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[155]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[156]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[157]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[158]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[159]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[160]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[161]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[162]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[163]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[164]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[165]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[166]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[167]);
                        }
						total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[168]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[169]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[170]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[171]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[172]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[173]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[174]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[175]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[176]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[177]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[178]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[179]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="German Mark")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[180]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[181]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[182]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[183]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[184]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[185]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[186]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[187]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[188]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[189]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[190]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[191]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[192]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[193]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[194]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[195]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[196]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[197]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[198]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[199]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[200]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[201]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[202]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[203]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[204]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[205]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[206]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[207]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[208]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[209]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[210]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[211]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[212]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[213]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[214]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[215]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Omani Rial")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[216]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[217]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[218]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[219]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[220]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[221]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[222]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[223]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[224]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[225]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[226]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[227]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                    if(e.getSource()==button)
                    {
                    text1.setText(""+total);
                    }
          }catch(ArrayIndexOutOfBoundsException q)
          {
              q.printStackTrace();
              
          }}
       }
            
         if(item=="Dirham")
       {
       FileReader fr3=new FileReader("C:\\Users\\ME\\Desktop\\Currnecy Converter with GUI\\Rates\\dirhamToOther.txt");
        BufferedReader br3=new BufferedReader(fr3);
        String line3;
        while ((line3 = br3.readLine())!= null){
          try{
              String []data4 = line3.split(",");
                         
                    if(item1=="US Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[0]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[1]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[2]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[3]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[4]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[5]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[6]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[7]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[8]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[9]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[10]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[11]);
                        } 
                        total=a*d;
                     text2.setText(""+d);
                    }
                    else if(item1=="PKR")
                    {
                             if(item2=="January")
                        {
                            d=Double.parseDouble(data4[12]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[13]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[14]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[15]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[16]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[17]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[18]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[19]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[20]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[21]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[22]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[23]);
                        }
                       total=a*d;    
                     text2.setText(""+d);
                    }
                     else if(item1=="Chinese Yuan")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[24]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[25]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[26]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[27]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[28]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[29]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[30]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[31]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[32]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[33]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[34]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[35]);
                        }
                           total=a*d;
                     text2.setText(""+d); 
                    }
                     else if(item1=="Canadian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[36]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[37]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[38]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[39]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[40]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[41]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[42]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[43]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[44]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[45]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[46]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[47]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                    
                     else if(item1=="Dinar")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[48]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[49]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[50]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[51]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[52]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[53]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[54]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[55]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[56]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[57]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[58]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[59]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                      else if(item1=="Dirham")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[60]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[61]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[62]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[63]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[64]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[65]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[66]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[67]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[68]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[69]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[70]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[71]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                      
                    }
                     else if(item1=="Euro")
                    {
                         
                     if(item2=="January")
                        {
                            d=Double.parseDouble(data4[72]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[73]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[74]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[75]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[76]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[77]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[78]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[79]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[80]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[81]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[82]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[83]);
                        }
                             total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Australian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[84]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[85]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[86]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[87]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[88]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[89]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[90]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[91]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[92]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[93]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[94]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[95]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                           
                    }
                     else if(item1=="Indian Rupee")
                    {
                         total=a;
                    }
                     else if(item1=="Yen")
                    {if(item2=="January")
                        {
                            d=Double.parseDouble(data4[96]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[97]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[98]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[99]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[100]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[101]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[102]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[103]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[104]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[105]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[106]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[107]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Pound")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[108]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[109]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[110]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[111]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[112]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[113]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[114]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[115]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[116]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[117]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[118]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[119]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Franc")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[120]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[121]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[122]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[123]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[124]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[125]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[126]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[127]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[128]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[129]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[130]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[131]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Rayal")
                    {
                        
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[132]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[133]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[134]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[135]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[136]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[137]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[138]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[139]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[140]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[141]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[142]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[143]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Afghani")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[144]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[145]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[146]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[147]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[148]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[149]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[150]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[151]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[152]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[153]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[154]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[155]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[156]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[157]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[158]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[159]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[160]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[161]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[162]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[163]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[164]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[165]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[166]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[167]);
                        }
						total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[168]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[169]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[170]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[171]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[172]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[173]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[174]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[175]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[176]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[177]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[178]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[179]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="German Mark")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[180]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[181]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[182]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[183]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[184]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[185]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[186]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[187]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[188]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[189]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[190]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[191]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[192]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[193]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[194]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[195]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[196]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[197]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[198]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[199]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[200]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[201]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[202]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[203]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[204]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[205]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[206]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[207]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[208]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[209]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[210]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[211]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[212]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[213]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[214]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[215]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Omani Rial")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[216]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[217]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[218]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[219]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[220]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[221]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[222]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[223]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[224]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[225]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[226]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[227]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                    if(e.getSource()==button)
                    {
                    text1.setText(""+total);
                    }
          }catch(ArrayIndexOutOfBoundsException q)
          {
              q.printStackTrace();
              
          }}
            }
            if(item=="Euro")
       {
         FileReader fr3=new FileReader("C:\\Users\\ME\\Desktop\\Currnecy Converter with GUI\\Rates\\EuroToOther.txt");
        BufferedReader br3=new BufferedReader(fr3);
        String line3;
        while ((line3 = br3.readLine())!= null){
          try{
              String []data4 = line3.split(",");
                         
                    if(item1=="US Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[0]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[1]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[2]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[3]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[4]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[5]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[6]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[7]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[8]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[9]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[10]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[11]);
                        } 
                        total=a*d;
                     text2.setText(""+d);
                    }
                    else if(item1=="PKR")
                    {
                             if(item2=="January")
                        {
                            d=Double.parseDouble(data4[12]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[13]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[14]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[15]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[16]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[17]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[18]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[19]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[20]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[21]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[22]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[23]);
                        }
                       total=a*d;    
                     text2.setText(""+d);
                    }
                     else if(item1=="Chinese Yuan")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[24]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[25]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[26]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[27]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[28]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[29]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[30]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[31]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[32]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[33]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[34]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[35]);
                        }
                           total=a*d;
                     text2.setText(""+d); 
                    }
                     else if(item1=="Canadian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[36]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[37]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[38]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[39]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[40]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[41]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[42]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[43]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[44]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[45]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[46]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[47]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dinar")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[48]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[49]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[50]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[51]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[52]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[53]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[54]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[55]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[56]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[57]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[58]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[59]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Dirham")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[60]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[61]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[62]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[63]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[64]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[65]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[66]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[67]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[68]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[69]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[70]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[71]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Euro")
                    {
                         total=a;
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[72]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[73]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[74]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[75]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[76]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[77]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[78]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[79]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[80]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[81]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[82]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[83]);
                        }
                             total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Australian Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[84]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[85]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[86]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[87]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[88]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[89]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[90]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[91]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[92]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[93]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[94]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[95]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Yen")
                    {if(item2=="January")
                        {
                            d=Double.parseDouble(data4[96]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[97]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[98]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[99]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[100]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[101]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[102]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[103]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[104]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[105]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[106]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[107]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Pound")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[108]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[109]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[110]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[111]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[112]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[113]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[114]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[115]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[116]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[117]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[118]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[119]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Franc")
                    {
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[120]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[121]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[122]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[123]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[124]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[125]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[126]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[127]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[128]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[129]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[130]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[131]);
                        }
                            total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Rayal")
                    {
                        
                           if(item2=="January")
                        {
                            d=Double.parseDouble(data4[132]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[133]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[134]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[135]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[136]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[137]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[138]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[139]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[140]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[141]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[142]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[143]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Afghani")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[144]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[145]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[146]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[147]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[148]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[149]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[150]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[151]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[152]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[153]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[154]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[155]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[156]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[157]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[158]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[159]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[160]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[161]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[162]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[163]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[164]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[165]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[166]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[167]);
                        }
						total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                        if(item2=="January")
                        {
                            d=Double.parseDouble(data4[168]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[169]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[170]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[171]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[172]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[173]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[174]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[175]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[176]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[177]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[178]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[179]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="German Mark")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[180]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[181]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[182]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[183]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[184]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[185]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[186]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[187]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[188]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[189]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[190]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[191]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(item2=="January")
                        {
                            d=Double.parseDouble(data4[192]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[193]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[194]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[195]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[196]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[197]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[198]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[199]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[200]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[201]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[202]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[203]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[204]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[205]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[206]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[207]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[208]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[209]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[210]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[211]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[212]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[213]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[214]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[215]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                     else if(item1=="Omani Rial")
                    {
                         if(item2=="January")
                        {
                            d=Double.parseDouble(data4[216]);
                        }
                        else if(item2=="Feburary")
                        {
                            d=Double.parseDouble(data4[217]);
                        }
                        else if(item2=="March")
                        {
                            d=Double.parseDouble(data4[218]);
                        }
                        else if(item2=="April")
                        {
                            d=Double.parseDouble(data4[219]);
                        }
                        else if(item2=="May")
                        {
                            d=Double.parseDouble(data4[220]);
                        }
                        else if(item2=="June")
                        {
                            d=Double.parseDouble(data4[221]);
                        }
                        else if(item2=="July")
                        {
                            d=Double.parseDouble(data4[222]);
                        }
                        else if(item2=="August")
                        {
                            d=Double.parseDouble(data4[223]);
                        }
                        else if(item2=="September")
                        {
                            d=Double.parseDouble(data4[224]);
                        }
                        else if(item2=="October")
                        {
                            d=Double.parseDouble(data4[225]);
                        }
                        else if(item2=="November")
                        {
                            d=Double.parseDouble(data4[226]);
                        }
                        else if(item2=="December")
                        {
                            d=Double.parseDouble(data4[227]);
                        }
                           total=a*d;
                     text2.setText(""+d);
                    }
                    if(e.getSource()==button)
                    {
                    text1.setText(""+total);
                    }
          }catch(ArrayIndexOutOfBoundsException q)
          {
              q.printStackTrace();
              
          }}
            }
          
            if(item=="Indian Rupee")
       {
       double usDollar=0.016,PKR=1.63,ChineseYuan=0.11,CanadianDollar=0.0021,dinar=0.0047,dirham=0.052,euro=0.014,AustrailianDollar=0.021,yen=1.73,taka=1.25,pound=0.012,krone=0.13,omaniRial=0.006,CFPfranc=1.65,afghani=1.054,newZealandDollar=0.022,qatariRial=0.056,Mark=0.027,HKDollar=0.12;
          
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }  
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }  
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                            
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }
                  if(item=="Australian Dollar")
       {
       double usDollar=0.75,PKR=78.15,ChineseYuan=5.13,CanadianDollar=1.01,dinar=0.23,dirham=2.74,euro=0.67,indianRupee=48.06,yen=82.96,taka=60.24,pound=0.37,krone=6.24,omaniRial=0.29,CFPfranc=79.39,afghani=51,newZealandDollar=1.07,qatariRial=2.72,Mark=1.28,HKDollar=5.82;
       
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }
                  
                     if(item=="Yen")
       {
       double usDollar=0.009,PKR=0.94,ChineseYuan=0.062,CanadianDollar=0.012,dinar=0.0027,dirham=0.033,euro=0.008,indianRupee=0.58,AustrailianDollar=0.012,taka=0.72,pound=0.0069,krone=0.075,omaniRial=0.0035,CFPfranc=0.96,afghani=0.61,newZealandDollar=0.013,qatariRial=0.033,Mark=0.015,HKDollar=0.07;
         
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }       
         if(item=="Pound")
       {
       double usDollar=1.29,PKR=135.63,ChineseYuan=8.92,CanadianDollar=1.74,dinar=0.39,dirham=4.75,euro=1.16,indianRupee=83.78,AustrailianDollar=1.73,taka=104.476,yen=144.88,krone=10.83,omaniRial=0.50,CFPfranc=137.98,afghani=88.40,newZealandDollar=1.84,qatariRial=4.71,Mark=2.22,HKDollar=10.08;
         
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }  
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                            text1.setText(""+total);
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }
           if(item=="Franc")
       {
       double usDollar=0.0094,PKR=0.98,ChineseYuan=0.065,pound=0.00725,CanadianDollar=0.013,dinar=0.0028,dirham=0.034,euro=0.0084,indianRupee=0.61,AustrailianDollar=0.013,taka=0.75,yen=1.05,krone=0.078,omaniRial=0.0036,afghani=0.64,newZealandDollar=0.013,qatariRial=0.034,Mark=0.016,HKDollar=0.073;
          
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                             text1.setText(""+total);
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }
             if(item=="Rayal")
       {
       double usDollar=0.27,PKR=28.79,pound=0.21,ChineseYuan=1.89,CanadianDollar=0.37,dinar=0.083,dirham=1.01,euro=0.25,indianRupee=17.78,AustrailianDollar=0.37,taka=22.12,yen=30.69,krone=2.30,omaniRial=0.11,CFPfranc=29.29,afghani=18.76,newZealandDollar=0.39,Mark=0.47,HKDollar=2.14;
          
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        } 
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }
               if(item=="Afghani")
       {
       double usDollar=0.12,PKR=1.6,ChineseYuan=0.102,CanadianDollar=0.02,dinar=0.0044,dirham=0.054,euro=0.013,indianRupee=0.96,AustrailianDollar=0.02,taka=1.2,yen=1.67,krone=0.12,pound=0.11,omaniRial=0.0058,CFPfranc=1.59,newZealandDollar=0.021,qatariRial=0.054,Mark=0.02,HKDollar=0.11;
         
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }
                 if(item=="Norway Krone")
       {
       double usDollar=0.12,PKR=12.5,ChineseYuan=0.82,CanadianDollar=0.16,dinar=0.035,dirham=0.43,euro=0.11,indianRupee=7.07,AustrailianDollar=0.16,taka=9.61,yen=13.27,pound=0.091,omaniRial=0.046,CFPfranc=12.7,afghani=8,newZealandDollar=0.171,qatariRial=0.43,Mark=0.2,HKDollar=0.93;
         
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                        
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }
                   if(item=="New Zealand Dollar")
       {
       double usDollar=0.7,PKR=72.78,ChineseYuan=4.79,pound=0.45,CanadianDollar=0.938,dinar=0.21,dirham=2.54,euro=0.62,indianRupee=44.76,AustrailianDollar=0.93,taka=56,yen=77.27,krone=5.82,omaniRial=0.22,CFPfranc=73.94,afghani=46.52,qatariRial=2.53,Mark=1.194,HKDollar=5.402;
        
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                      
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                             text1.setText(""+total);
                        }
                    
                    
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                            
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                             
                        }
                    }
                    text1.setText(""+total);
            }
                     if(item=="German Mark")
       {
       double usDollar=0.581,PKR=60.94,ChineseYuan=4.005,CanadianDollar=0.784,dinar=0.174,dirham=2.133,euro=0.517,indianRupee=37.47,AustrailianDollar=0.77,taka=46.83,yen=64.69,krone=4.87,omaniRial=0.23,CFPfranc=61.90,afghani=38.95,newZealandDollar=0.84,qatariRial=3.64,HKDollar=7.78;
        
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                        }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                            text1.setText(""+total);
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                  }
                    text1.setText(""+total);
            }
                       if(item=="Bangladesh Taka")
       {
       double usDollar=0.012,PKR=1.30,ChineseYuan=0.085,CanadianDollar=0.0167,dinar=0.0037,dirham=0.045,euro=0.011,indianRupee=0.800,AustrailianDollar=0.0166,pound=0.0095,yen=1.38,krone=0.104,omaniRial=0.0048,CFPfranc=1.32,afghani=0.83,newZealandDollar=0.017,qatariRial=0.045,Mark=0.021,HKDollar=0.096;
         
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    
                    
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                    text1.setText(""+total);
            }
                         if(item=="Hong Kong Dollar")
       {
       double usDollar=0.12,PKR=13.47,ChineseYuan=0.88,CanadianDollar=0.173,dinar=0.038,dirham=0.47,euro=0.11,indianRupee=8.28,AustrailianDollar=0.17,taka=10.35,yen=14.30,krone=1.07,omaniRial=0.05,pound=0.098,CFPfranc=13.68,afghani=8.61,newZealandDollar=0.18,qatariRial=0.468,Mark=0.22;
         
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                          }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*indianRupee;
                        }    
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;  
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                        if(e.getSource()==button)
                        {
                             total=a*omaniRial;
                        }
                    }
                          text1.setText(""+total);
       }
               if(item=="Omani Rial")
       {
       double usDollar=2.56,PKR=256.74,ChineseYuan=17.66,CanadianDollar=3.46,dinar=0.76,dirham=9.41,euro=2.28,indianRupee=165.28,AustrailianDollar=3.43,taka=206.53,yen=285.30,krone=21.48,pound=1.97,CFPfranc=273,afghani=171.79,newZealandDollar=3.69,qatariRial=9.33,Mark=4.41,HKDollar=19.95;
          
                    if(item1=="US Dollar")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*usDollar;
                        }
                    }
                    else if(item1=="PKR")
                    {
                        if(e.getSource()==button)
                        {
                            total=a*PKR;
                        }
                    }
                     else if(item1=="Chinese Yuan")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*ChineseYuan;
                        }
                    }
                     else if(item1=="Canadian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CanadianDollar;
                        }
                    }
                     else if(item1=="Dinar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dinar;
                        }
                    }
                     else if(item1=="Dirham")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*dirham;
                        }
                    }
                     else if(item1=="Euro")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*euro;
                        }
                    }
                     else if(item1=="Indian Rupee")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*indianRupee;
                        }
                    }
                     else if(item1=="Australian Dollar")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*AustrailianDollar;
                        }
                    }
                     else if(item1=="Yen")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*yen;
                        }
                    }
                     else if(item1=="Pound")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*pound;;
                        }
                    }
                     else if(item1=="Franc")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*CFPfranc;
                        }
                    }
                     else if(item1=="Rayal")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*qatariRial;
                        }
                    }
                     else if(item1=="Afghani")
                    {
                          if(e.getSource()==button)
                        {
                          total=a*afghani;
                        }
                    }
                     else if(item1=="Norway Krone")
                    {
                          if(e.getSource()==button)
                        {
                         total=a*krone;  
                        }
                    }
                     else if(item1=="New Zealand Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*newZealandDollar;
                        }
                    }
                     else if(item1=="German Mark")
                    {
                          if(e.getSource()==button)
                        {
                             total=a*Mark;
                        }
                    }
                     else if(item1=="Bangladesh Taka")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*taka;
                        }
                    }
                     else if(item1=="Hong Kong Dollar")
                    {
                          if(e.getSource()==button)
                        {
                            total=a*HKDollar;
                        }
                    }
                     else if(item1=="Omani Rial")
                    {
                          if(e.getSource()==button)
                        {
                             total=a;
                        }
                    }
                    text1.setText(""+total);
               }
                }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println();
        }
                } }
    catch(Exception x)
    {
     x.printStackTrace();
    
    }
      }
       }
   }


    

