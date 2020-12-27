
import javax.swing.JOptionPane;


public class Controller {
    public static Model model;
    public static View view;
    public static int full=0;//kutuların 9 i dolmussa oyunu bitir
    public Controller() {
        
        model=new Model();
        view=new View();
    }
    
   public static void tikla_butonu()    
    {
      int x = Integer.valueOf(view.getjTextField1().getText());
        int y = Integer.valueOf(view.getjTextField2().getText());
        String message;
        char temp; 
        if(model.ar[x][y]=='*')
        {
        full++;
        model.ar[x][y] = model.oyuncu;
        }
        else 
        JOptionPane.showMessageDialog(view, "Daha Önceden değer girildi,farkli bir yer deneyin.");
        temp=model.oyuncu;
        if (model.oyuncu == 'X')
            model.oyuncu = 'O';
        else 
            model.oyuncu = 'X';
        
        // ********************************************   //label içine yazılanları set et
        view.getjLabel10().setText(String.valueOf(model.oyuncu));
        view.getjLabel1().setText(String.valueOf(model.ar[0][0]));
        view.getjLabel2().setText(String.valueOf(model.ar[0][1]));
        view.getjLabel3().setText(String.valueOf(model.ar[0][2]));
        view.getjLabel4().setText(String.valueOf(model.ar[1][0]));
        view.getjLabel5().setText(String.valueOf(model.ar[1][1]));
        view.getjLabel6().setText(String.valueOf(model.ar[1][2]));
        view.getjLabel7().setText(String.valueOf(model.ar[2][0]));
        view.getjLabel8().setText(String.valueOf(model.ar[2][1]));
        view.getjLabel9().setText(String.valueOf(model.ar[2][2]));
        
        view.getjTextField1().setText("");
        view.getjTextField2().setText("");
        
        //**********************************************
        if(whowon(temp) == 1)
        {
          
          message="Player "+temp+" kazandi!";
          JOptionPane.showMessageDialog(view, message);
          System.exit(0);
            
        }
        if(full==9)
        {
            JOptionPane.showMessageDialog(view, "*** GAME OVER! ***   KAZANAN YOK");
            System.exit(0);
        } 
               
    }
     public static int whowon(char player)   
    {   
        
         //capraz durumlar
        if(player=='X' && model.ar[0][2]=='X' && model.ar[1][1]=='X' && model.ar[2][0]=='X' )
            return 1;
        if(player=='O' && model.ar[0][2]=='O' && model.ar[1][1]=='O' && model.ar[2][0]=='O' )
            return 1;
        if(player=='X' && model.ar[0][0]=='X' && model.ar[1][1]=='X' && model.ar[2][2]=='X' )
            return 1;
        if(player=='O' && model.ar[0][0]=='O' && model.ar[1][1]=='O' && model.ar[2][2]=='O' )
             return 1;
        
        // yatay durumlar X ve O icin
        for(int i = 0;i<3;i++)
        {   
         if(player=='X' && model.ar[i][0]=='X' && model.ar[i][1]=='X' && model.ar[i][2]=='X')
             return 1;
         if(player=='O' && model.ar[i][0]=='O' && model.ar[i][1]=='O' && model.ar[i][2]=='O')
             return 1;
        }
        // dikey durumlarr X ve O icin
        for(int j=0;j<3;j++)
        {
            if(player=='X' && model.ar[0][j]=='X' && model.ar[1][j]=='X' && model.ar[2][j]=='X')
               return 1;
            if(player=='O' && model.ar[0][j]=='O' && model.ar[1][j]=='O' && model.ar[2][j]=='O')
                return 1;
        }
       
        
        return 0;
    }
    
    
}
