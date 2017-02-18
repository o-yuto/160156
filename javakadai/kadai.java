import java.awt.*;

import java.awt.event.*;

import java.util.Calendar;



public class Tokei extends Frame implements Runnable{

        static int h;

        static int m;

        static int s;

        boolean a = true;


        static Tokei f = new Tokei();

        static Thread th = new Thread(f);

        Calendar now = Calendar.getInstance();

    public static void main(String args[]){

        f.setSize(200, 100);

        f.setVisible(true);

        f.addWindowListener(new Ada());



        th.start();

    }

    public void run(){

        while(a==true){

              h = now.getInstance().get(now.HOUR_OF_DAY);

              m = now.getInstance().get(now.MINUTE);

              s= now.getInstance().get(now.SECOND);

              repaint();



              try{

                  th.sleep(1000);

              }catch(InterruptedException e){

              }

        }

    }

    public void paint(Graphics g)

    {



        g.drawString(h+":"+m+":"+s,50,59);

    }

}

class Ada extends WindowAdapter

{

    public void windowClosing(WindowEvent e){

       System.exit(0);

    }

}