package prak1;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.awt.AWTException;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.LinearGradient;
import javafx.scene.input.MouseEvent;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PrimaryController {
    
    int move=1,cancel=0;
    
    Random rand = new Random();
    boolean prob,prob1,prob2;//prob - masks effectivity, prob1 - get infected probability, prob2 - death probability
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Contagion;

    @FXML
    private Label Death_Probability;

    @FXML
    private Rectangle Field;

    @FXML
    private Circle Human1;

    @FXML
    private Circle Human10;

    @FXML
    private Circle Human100;

    @FXML
    private Circle Human11;

    @FXML
    private Circle Human12;

    @FXML
    private Circle Human13;

    @FXML
    private Circle Human14;

    @FXML
    private Circle Human15;

    @FXML
    private Circle Human16;

    @FXML
    private Circle Human17;

    @FXML
    private Circle Human18;

    @FXML
    private Circle Human19;

    @FXML
    private Circle Human2;

    @FXML
    private Circle Human20;

    @FXML
    private Circle Human21;

    @FXML
    private Circle Human22;

    @FXML
    private Circle Human23;

    @FXML
    private Circle Human24;

    @FXML
    private Circle Human25;

    @FXML
    private Circle Human26;

    @FXML
    private Circle Human27;

    @FXML
    private Circle Human28;

    @FXML
    private Circle Human29;

    @FXML
    private Circle Human3;

    @FXML
    private Circle Human30;

    @FXML
    private Circle Human31;

    @FXML
    private Circle Human32;

    @FXML
    private Circle Human33;

    @FXML
    private Circle Human34;

    @FXML
    private Circle Human35;

    @FXML
    private Circle Human36;

    @FXML
    private Circle Human37;

    @FXML
    private Circle Human38;

    @FXML
    private Circle Human39;

    @FXML
    private Circle Human4;

    @FXML
    private Circle Human40;

    @FXML
    private Circle Human41;

    @FXML
    private Circle Human42;

    @FXML
    private Circle Human43;

    @FXML
    private Circle Human44;

    @FXML
    private Circle Human45;

    @FXML
    private Circle Human46;

    @FXML
    private Circle Human47;

    @FXML
    private Circle Human48;

    @FXML
    private Circle Human49;

    @FXML
    private Circle Human5;

    @FXML
    private Circle Human50;

    @FXML
    private Circle Human51;

    @FXML
    private Circle Human52;

    @FXML
    private Circle Human53;

    @FXML
    private Circle Human54;

    @FXML
    private Circle Human55;

    @FXML
    private Circle Human56;

    @FXML
    private Circle Human57;

    @FXML
    private Circle Human58;

    @FXML
    private Circle Human59;

    @FXML
    private Circle Human6;

    @FXML
    private Circle Human60;

    @FXML
    private Circle Human61;

    @FXML
    private Circle Human62;

    @FXML
    private Circle Human63;

    @FXML
    private Circle Human64;

    @FXML
    private Circle Human65;

    @FXML
    private Circle Human66;

    @FXML
    private Circle Human67;

    @FXML
    private Circle Human68;

    @FXML
    private Circle Human69;

    @FXML
    private Circle Human7;

    @FXML
    private Circle Human70;

    @FXML
    private Circle Human71;

    @FXML
    private Circle Human72;

    @FXML
    private Circle Human73;

    @FXML
    private Circle Human74;

    @FXML
    private Circle Human75;

    @FXML
    private Circle Human76;

    @FXML
    private Circle Human77;

    @FXML
    private Circle Human78;

    @FXML
    private Circle Human79;

    @FXML
    private Circle Human8;

    @FXML
    private Circle Human80;

    @FXML
    private Circle Human81;

    @FXML
    private Circle Human82;

    @FXML
    private Circle Human83;

    @FXML
    private Circle Human84;

    @FXML
    private Circle Human85;

    @FXML
    private Circle Human86;

    @FXML
    private Circle Human87;

    @FXML
    private Circle Human88;

    @FXML
    private Circle Human89;

    @FXML
    private Circle Human9;

    @FXML
    private Circle Human90;

    @FXML
    private Circle Human91;

    @FXML
    private Circle Human92;

    @FXML
    private Circle Human93;

    @FXML
    private Circle Human94;

    @FXML
    private Circle Human95;

    @FXML
    private Circle Human96;

    @FXML
    private Circle Human97;

    @FXML
    private Circle Human98;

    @FXML
    private Circle Human99;

    @FXML
    private Label Masks_Effectivity;

    @FXML
    private Label Masks_Value;

    @FXML
    private Slider Slider_Contagion;

    @FXML
    private Slider Slider_Death;

    @FXML
    private Slider Slider_Effectivity;

    @FXML
    private Slider Slider_Masks;

    @FXML
    private Button button1;
     
    @FXML
    private AnchorPane scene;
        
    @FXML
    private Button start;
    
    @FXML
    private Button end;
     @FXML
    private Label notzaraz;

    @FXML
    private Label stats;

    @FXML
    private Label umer;

    @FXML
    private Label vizd;

    @FXML
    private Label zaraz;
        
    @FXML
    void initialize(MouseEvent event) throws AWTException
    {
        if (event.getSource()==button1) 
        {
            if (move==1) 
        {
            move =0;
            button1.setText("Continue");
        }
            else  {move=1;button1.setText("Pause");}
        }
        else if (event.getSource()==start) 
        {
            stats.setVisible(false);
            notzaraz.setVisible(false);
            zaraz.setVisible(false);
            vizd.setVisible(false);
            umer.setVisible(false);
            button1.setVisible(true);
            end.setVisible(true);
            start.setVisible(false);
            start();
            Slider_Contagion.setDisable(true);
            Slider_Masks.setDisable(true);
            Slider_Effectivity.setDisable(true);
            Slider_Death.setDisable(true);
        } 
        else if (event.getSource()==end) 
        {
            sbros();
            button1.setText("Pause");
            notzaraz.setText("Не заразилось - "+nezaraz);
            zaraz.setText("Заразилось - "+zaraz1);
            vizd.setText("Выздоровело - "+vilech);
            umer.setText("Умерло - "+mertv);
            button1.setVisible(false);
            end.setVisible(false);
            start.setVisible(true);
            Slider_Contagion.setDisable(false);
            Slider_Masks.setDisable(false);
            Slider_Effectivity.setDisable(false);
            Slider_Death.setDisable(false);
            move=0;cancel=1;
            stats.setVisible(true);
            notzaraz.setVisible(true);
            zaraz.setVisible(true);
            vizd.setVisible(true);
            umer.setVisible(true);
        }
    }
    LinearGradient MaskedNonContagious = LinearGradient.valueOf(
    "from 0.0% 0.0% to 0.0% 100.0% "+    
    "rgb(255, 255, 255) 0%, "+              
    "rgb(255, 255, 255) "+55+"%, "+  
    "rgb(0, 205, 255) "+45+"%, "+ 
    "rgb(0, 205, 255) 100%"             
);
    LinearGradient MaskedContagious = LinearGradient.valueOf(
    "from 0.0% 0.0% to 0.0% 100.0% "+    
    "rgb(148, 0, 0) 0%, "+              
    "rgb(148, 0, 0) "+55+"%, "+  
    "rgb(0, 205, 255) "+45+"%, "+ 
    "rgb(0, 205, 255) 100%"       
);
    Circle[]  krug = new Circle[]{Human1,Human2,Human3,Human4,Human5,Human6,Human7,Human8,Human9,Human10,Human11,Human12,Human13,Human14,Human15,Human16,Human17,Human18,Human19,Human20,Human21,Human22,Human23,Human24,Human25,Human26,Human27,Human28,Human29,Human30,Human31,Human32,Human33,Human34,Human35,Human36,Human37,Human38,Human39,Human40,Human41,Human42,Human43,Human44,Human45,Human46,Human47,Human48,Human49,Human50,Human51,Human52,Human53,Human54,Human55,Human56,Human57,Human58,Human59,Human60,Human61,Human62,Human63,Human64,Human65,Human66,Human67,Human68,Human69,Human70,Human71,Human72,Human73,Human74,Human75,Human76,Human77,Human78,Human79,Human80,Human81,Human82,Human83,Human84,Human85,Human86,Human87,Human88,Human89,Human90,Human91,Human92,Human93,Human94,Human95,Human96,Human97,Human98,Human99,Human100}; 
    int[][] coord=new int[100][8];
    int[][] centr=new int[100][2];
    int zaraz1,nezaraz,mertv,vilech;
    boolean[] dead=new boolean[100];
    boolean[] check=new boolean[100];
    Human h[]=new Human[100];
    @FXML
    void initialize()  {
        /////Заразность
     Slider_Contagion.valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(
                   ObservableValue<? extends Number> observableValue, 
                   Number oldValue, 
                   Number newValue) { 
                   Contagion.textProperty().setValue(String.valueOf(newValue.intValue())+"%");
                  }
            });
     /////Количество масок
     Slider_Masks.valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(
                   ObservableValue<? extends Number> observableValue, 
                   Number oldValue, 
                   Number newValue) { 
                   Masks_Value.textProperty().setValue(String.valueOf(newValue.intValue())+"%");
                  }
            });
     /////Эффективность масое
     Slider_Effectivity.valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(
                   ObservableValue<? extends Number> observableValue, 
                   Number oldValue, 
                   Number newValue) { 
                   Masks_Effectivity.textProperty().setValue(String.valueOf(newValue.intValue())+"%");
                  }
            });
     /////Смертность
     Slider_Death.valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(
                   ObservableValue<? extends Number> observableValue, 
                   Number oldValue, 
                   Number newValue) { 
                   Death_Probability.textProperty().setValue(String.valueOf(newValue.intValue())+"%");
                  }
            });
     krug = new Circle[]{Human1,Human2,Human3,Human4,Human5,Human6,Human7,Human8,Human9,Human10,Human11,Human12,Human13,Human14,Human15,Human16,Human17,Human18,Human19,Human20,Human21,Human22,Human23,Human24,Human25,Human26,Human27,Human28,Human29,Human30,Human31,Human32,Human33,Human34,Human35,Human36,Human37,Human38,Human39,Human40,Human41,Human42,Human43,Human44,Human45,Human46,Human47,Human48,Human49,Human50,Human51,Human52,Human53,Human54,Human55,Human56,Human57,Human58,Human59,Human60,Human61,Human62,Human63,Human64,Human65,Human66,Human67,Human68,Human69,Human70,Human71,Human72,Human73,Human74,Human75,Human76,Human77,Human78,Human79,Human80,Human81,Human82,Human83,Human84,Human85,Human86,Human87,Human88,Human89,Human90,Human91,Human92,Human93,Human94,Human95,Human96,Human97,Human98,Human99,Human100}; 

    for (int i = 0; i < 100; i++) 
        {
        centr[i][0]=(int)(krug[i].getLayoutX()); 
        centr[i][1]=(int)(krug[i].getLayoutY()); 
        }
    }

    public void start() throws AWTException
  {
      move=1;cancel=0;nezaraz=99;zaraz1=1;mertv=0;vilech=0;
    Human H10=new Human(true,true,true,true,10,"1","12");
   krug = new Circle[]{Human1,Human2,Human3,Human4,Human5,Human6,Human7,Human8,Human9,Human10,Human11,Human12,Human13,Human14,Human15,Human16,Human17,Human18,Human19,Human20,Human21,Human22,Human23,Human24,Human25,Human26,Human27,Human28,Human29,Human30,Human31,Human32,Human33,Human34,Human35,Human36,Human37,Human38,Human39,Human40,Human41,Human42,Human43,Human44,Human45,Human46,Human47,Human48,Human49,Human50,Human51,Human52,Human53,Human54,Human55,Human56,Human57,Human58,Human59,Human60,Human61,Human62,Human63,Human64,Human65,Human66,Human67,Human68,Human69,Human70,Human71,Human72,Human73,Human74,Human75,Human76,Human77,Human78,Human79,Human80,Human81,Human82,Human83,Human84,Human85,Human86,Human87,Human88,Human89,Human90,Human91,Human92,Human93,Human94,Human95,Human96,Human97,Human98,Human99,Human100}; 
   for (int i = 0; i < 100; i++) 
        {
            krug[i].setLayoutX(centr[i][0]);
            krug[i].setLayoutY(centr[i][1]);
            krug[i].setFill(javafx.scene.paint.Color.WHITE);
        }
        for (int i = 0; i < 100; i++) 
        {
            
            h[i]=new Human(false,true,true,false,10,"1","12");
            dead[i]=false;
            check[i]=false;
            krug[i].setVisible(true);
            if (i<Slider_Masks.getValue()) 
            {
              h[i].SetMasked(true);
              krug[i].setFill(MaskedNonContagious);
            }
            
            coord[i][0]=(int)(krug[i].getLayoutX()+krug[i].getRadius());//0(x)
            coord[i][1]=(int)(krug[i].getLayoutY());                    //0(y)
            coord[i][2]=(int)(krug[i].getLayoutX());                    //П/2(x)
            coord[i][3]=(int)(krug[i].getLayoutY()-krug[i].getRadius());//П/2(y)
            coord[i][4]=(int)(krug[i].getLayoutX()-krug[i].getRadius());//П(x)
            coord[i][5]=(int)(krug[i].getLayoutY());                    //П(y)
            coord[i][6]=(int)(krug[i].getLayoutX());                    //3П/2(x)
            coord[i][7]=(int)(krug[i].getLayoutY()+krug[i].getRadius());//3П/2(y)
            movement(H10,krug[i],i);
        }
        if (h[0].ReturnMasked()==true) 
        {
          krug[0].setFill(MaskedContagious);
      }else {krug[0].setFill(javafx.scene.paint.Color.RED);}
       h[0].SetContagious(true);
       h[0].SetCanGetInfected(false);
       
  }
    
 public void movement (Human human,Circle humanCircle,int k) throws AWTException
{
    
    Timer timer = new Timer();
    
    TimerTask task = new TimerTask() {
    double x = humanCircle.getLayoutX();
    double y = humanCircle.getLayoutY();
    double dx = 1;
    double  dy = 1;
         public void run ()
        {
            Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
            for (int i = 0; i < 100; i++) 
            {
               if (k!=i)
                {
                ///0П и П
                if (dx>=0) 
                {
                    if ((coord[i][4]>=humanCircle.getLayoutX())&&(coord[i][4]<=humanCircle.getLayoutX()+humanCircle.getRadius())&&(coord[i][5]==humanCircle.getLayoutY()))
                    {
                        dx=-dx;
                        collision(i,k);
                    }
                    
                }else   
                {
                    if ((coord[i][0]<=humanCircle.getLayoutX())&&(coord[i][0]>=humanCircle.getLayoutX()-humanCircle.getRadius())&&(coord[i][1]==humanCircle.getLayoutY()))
                    {
                        dx=-dx;
                        collision(i,k);
                    }
                }
                  ///П/2 и 3П/2
                  if (dy>=0) 
                {
                   if ((coord[i][3]>=humanCircle.getLayoutY())&&(coord[i][3]<=humanCircle.getLayoutY()+humanCircle.getRadius())&&(coord[i][2]==humanCircle.getLayoutX()))
                    {
                        dy=-dy;
                        collision(i,k);
                    }
                    
                }else    
                {
                     if ((coord[i][7]<=humanCircle.getLayoutY())&&(coord[i][7]>=humanCircle.getLayoutY()-humanCircle.getRadius())&&(coord[i][6]==humanCircle.getLayoutX()))
                    {
                        dy=-dy;
                        collision(i,k);
                        
                    }
                }
                  
                  ///(П;3П/2)
                  if ((dx<0)&&(dy>0)) 
                {
                    if ((coord[i][0]<humanCircle.getLayoutX())&&(coord[i][0]>humanCircle.getLayoutX()-humanCircle.getRadius())&&(coord[i][1]>humanCircle.getLayoutY())&&(coord[i][1]<humanCircle.getLayoutY()+humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                    if ((coord[i][2]<humanCircle.getLayoutX())&&(coord[i][2]>humanCircle.getLayoutX()-humanCircle.getRadius())&&(coord[i][3]>humanCircle.getLayoutY())&&(coord[i][3]<humanCircle.getLayoutY()+humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                    if ((coord[i][0]<humanCircle.getLayoutX())&&(coord[i][0]>humanCircle.getLayoutX()-humanCircle.getRadius())&&(coord[i][3]>humanCircle.getLayoutY())&&(coord[i][3]<humanCircle.getLayoutY()+humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                }
                  ///(0П;П/2)
                   if ((dx>0)&&(dy<0)) 
                {
                    if ((coord[i][6]>humanCircle.getLayoutX())&&(coord[i][6]<humanCircle.getLayoutX()+humanCircle.getRadius())&&(coord[i][7]<humanCircle.getLayoutY())&&(coord[i][7]>humanCircle.getLayoutY()-humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                    
                    if ((coord[i][4]>humanCircle.getLayoutX())&&(coord[i][4]<humanCircle.getLayoutX()+humanCircle.getRadius())&&(coord[i][5]<humanCircle.getLayoutY())&&(coord[i][5]>humanCircle.getLayoutY()-humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                    if ((coord[i][4]>humanCircle.getLayoutX())&&(coord[i][4]<humanCircle.getLayoutX()+humanCircle.getRadius())&&(coord[i][7]<humanCircle.getLayoutY())&&(coord[i][7]>humanCircle.getLayoutY()-humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
    
                }
                   ///(П/2;П)
                    if ((dx<0)&&(dy<0)) 
                {
                   if ((coord[i][0]<humanCircle.getLayoutX())&&(coord[i][0]>humanCircle.getLayoutX()-humanCircle.getRadius())&&(coord[i][1]<humanCircle.getLayoutY())&&(coord[i][1]>humanCircle.getLayoutY()-humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                    if ((coord[i][6]<humanCircle.getLayoutX())&&(coord[i][6]>humanCircle.getLayoutX()-humanCircle.getRadius())&&(coord[i][7]<humanCircle.getLayoutY())&&(coord[i][7]>humanCircle.getLayoutY()-humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                    if ((coord[i][0]<humanCircle.getLayoutX())&&(coord[i][0]>humanCircle.getLayoutX()-humanCircle.getRadius())&&(coord[i][7]<humanCircle.getLayoutY())&&(coord[i][7]>humanCircle.getLayoutY()-humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
    
                }
                    ///(3П/2;2П)
                     if ((dx>0)&&(dy>0)) 
                {
                    if ((coord[i][4]>humanCircle.getLayoutX())&&(coord[i][4]<humanCircle.getLayoutX()+humanCircle.getRadius())&&(coord[i][5]>humanCircle.getLayoutY())&&(coord[i][5]<humanCircle.getLayoutY()+humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                    if ((coord[i][2]>humanCircle.getLayoutX())&&(coord[i][2]<humanCircle.getLayoutX()+humanCircle.getRadius())&&(coord[i][3]>humanCircle.getLayoutY())&&(coord[i][3]<humanCircle.getLayoutY()+humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
                    if ((coord[i][4]>humanCircle.getLayoutX())&&(coord[i][4]<humanCircle.getLayoutX()+humanCircle.getRadius())&&(coord[i][3]>humanCircle.getLayoutY())&&(coord[i][3]<humanCircle.getLayoutY()+humanCircle.getRadius()))
                    {
                         dx=-dx;
                         dy=-dy;
                         collision(i,k);
                    }
    
                }
            }     
            }
            }catch (IndexOutOfBoundsException e) {
                                
                            }}});
            if ((dx>0)&&(x+dx+humanCircle.getRadius()>612)) {
                dx=-dx;
            }
            else if ((dx<0)&&(x-dx-humanCircle.getRadius()<2)) {
                dx=-dx;
            }
            if ((dy>0)&&(y+dy+humanCircle.getRadius()>456)) {
                dy=-dy;
            }
            else if ((dy<0)&&(y-dy-humanCircle.getRadius()<2)) {
                dy=-dy;
            }
            if ((move==1)&&(dead[k]==false)) 
            {
                x += dx;
                y += dy;
                 Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                humanCircle.setLayoutX(x);
                                humanCircle.setLayoutY(y);
                                coord[k][0]=(int)(humanCircle.getLayoutX()+humanCircle.getRadius());
                                coord[k][1]=(int)(humanCircle.getLayoutY());
                                coord[k][2]=(int)(humanCircle.getLayoutX());
                                coord[k][3]=(int)(humanCircle.getLayoutY()-humanCircle.getRadius());
                                coord[k][4]=(int)(humanCircle.getLayoutX()-humanCircle.getRadius());
                                coord[k][5]=(int)(humanCircle.getLayoutY());
                                coord[k][6]=(int)(humanCircle.getLayoutX());
                                coord[k][7]=(int)(humanCircle.getLayoutY()+humanCircle.getRadius());
                                
                            }catch (IndexOutOfBoundsException e) {
                                
                            }}}); 
            }else if ((move==1)&&(dead[k]==true))  
            {
                try {
                                humanCircle.setLayoutX(-10);
                                humanCircle.setLayoutY(-10);
                                coord[k][0]=(int)(humanCircle.getLayoutX()+humanCircle.getRadius());
                                coord[k][1]=(int)(humanCircle.getLayoutY());
                                coord[k][2]=(int)(humanCircle.getLayoutX());
                                coord[k][3]=(int)(humanCircle.getLayoutY()-humanCircle.getRadius());
                                coord[k][4]=(int)(humanCircle.getLayoutX()-humanCircle.getRadius());
                                coord[k][5]=(int)(humanCircle.getLayoutY());
                                coord[k][6]=(int)(humanCircle.getLayoutX());
                                coord[k][7]=(int)(humanCircle.getLayoutY()+humanCircle.getRadius());
                                krug[k].setVisible(false);
                                
                            }catch (IndexOutOfBoundsException e) {
                                
                            }
            }
  if (cancel==1) 
  {
        timer.cancel(); 
    }
        }
         
    };
  {timer.schedule( task, 0L ,30L);}
  

}
 
  public void collision(int first,int second)
  {
      if ((h[first].ReturnCanGetInfected()==true)&&(h[second].ReturnContagious()==true))
      {
          if (prob1=rand.nextInt(100)<Slider_Contagion.getValue()) {
              
          
          if ((h[first].ReturnMasked()==true)||(h[second].ReturnMasked()==true)) 
          {
              if (prob=rand.nextInt(100)>Slider_Effectivity.getValue()) 
              {
                  h[first].SetContagious(true);
                  h[first].SetCanGetInfected(false);
                  if (h[first].ReturnMasked()==true) 
                 {
                   krug[first].setFill(MaskedContagious);
                   nezaraz=nezaraz-1;zaraz1=zaraz1+1;
                 }
                else 
                   {
                    krug[first].setFill(javafx.scene.paint.Color.RED);
                   nezaraz=nezaraz-1;zaraz1=zaraz1+1;
                   }
              }
          }
          else if (prob1=rand.nextInt(100)<Slider_Contagion.getValue())
          {
          h[first].SetContagious(true);
          h[first].SetCanGetInfected(false);
          krug[first].setFill(javafx.scene.paint.Color.RED);
          nezaraz=nezaraz-1;zaraz1=zaraz1+1;
          }
       }
      }
      if ((h[second].ReturnCanGetInfected()==true)&&(h[first].ReturnContagious()==true))
      {
          if (prob1=rand.nextInt(100)<Slider_Contagion.getValue()) {
      if ((h[second].ReturnMasked()==true)||(h[second].ReturnMasked()==true)) 
          {
              if (prob=rand.nextInt(100)>Slider_Effectivity.getValue()) 
              {
                  h[second].SetContagious(true);
                  h[second].SetCanGetInfected(false);
                if (h[second].ReturnMasked()==true) 
                 {
                   krug[second].setFill(MaskedContagious);
                   nezaraz=nezaraz-1;zaraz1=zaraz1+1;
                 }
                else 
                   {
                    krug[second].setFill(javafx.scene.paint.Color.RED);
                   nezaraz=nezaraz-1;zaraz1=zaraz1+1;
}
              }
          }
      else if (prob1=rand.nextInt(100)<Slider_Contagion.getValue())
          {
          h[second].SetContagious(true);
          h[second].SetCanGetInfected(false);
          krug[second].setFill(javafx.scene.paint.Color.RED);
          nezaraz=nezaraz-1;zaraz1=zaraz1+1;
          }
      }
      }
      if ((h[first].ReturnContagious()==true)&&(check[first]==false)) 
      {
          check[first]=true;
          if (prob2=rand.nextInt(100)<Slider_Death.getValue())
          {
              TimerTask task = new TimerTask() {
        public void run() {
           h[first].SetAlive(false);
          dead[first]=true;
          
        }
    };
    Timer timer = new Timer("Timer");
    
    long delay = 14000L;
    timer.schedule(task, delay);
           }
          else
          {
          TimerTask task = new TimerTask() {
        public void run() {
           h[first].SetAlive(true);
          dead[first]=false;
           krug[first].setFill(javafx.scene.paint.Color.DARKGREEN);
            
            h[first].SetContagious(false);
        }
    };
    Timer timer = new Timer("Timer");
    
    long delay = 14000L;
    timer.schedule(task, delay);
          }
      }
      if ((h[second].ReturnContagious()==true) &&(check[second]==false)) 
      {
          check[second]=true;
          if (prob2=rand.nextInt(100)<Slider_Death.getValue())
          {
              TimerTask task = new TimerTask() {
        public void run() {
          h[second].SetAlive(false);
          dead[second]=true;
          
        }
    };
    Timer timer = new Timer("Timer");
    
    long delay = 14000L;
    timer.schedule(task, delay);
          }
          else
          {
          TimerTask task = new TimerTask() {
        public void run() {
           h[second].SetAlive(true);
          dead[second]=false;
           krug[second].setFill(javafx.scene.paint.Color.DARKGREEN);
            
            h[second].SetContagious(false);
        }
    };
    Timer timer = new Timer("Timer");
    
    long delay = 14000L;
    timer.schedule(task, delay);
          }
      }
  }
  public void sbros ()
  {
    for (int i = 0; i < 100; i++) 
        {
            if (dead[i]==true)
            {
                mertv++;
                dead[i]=false;
            }else if (h[i].ReturnCanGetInfected()==false)
            {
            vilech++;
            h[i].SetCanGetInfected(true);
            }
        }
  }
}





