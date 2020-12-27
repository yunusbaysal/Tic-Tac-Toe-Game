
public class Model {
    public char[][] ar;
    public char oyuncu;
    
    public Model()
    {
        ar=new char[3][3];
        oyuncu='X';
        for(int i = 0;i<3;i++)
            for(int j=0;j<3;j++)
                ar[i][j]='*';
        
    }

    public char[][] getAr() {
        return ar;
    }

    public void setAr(char[][] ar) {
        this.ar = ar;
    }

    public char getOyuncu() {
        return oyuncu;
    }

    public void setOyuncu(char oyuncu) {
        this.oyuncu = oyuncu;
    }
    
    
    
}
