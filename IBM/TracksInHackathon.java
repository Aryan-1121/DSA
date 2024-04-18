package IBM;

public class TracksInHackathon {
    public static void main(String[] args) {

        int t1 =3, t2 = 4; 
        int p =7; 
        countTeams(t1, t2, p);
        
    }
    


    private static void countTeams(int t1, int t2, int p){
        int m1 = p/t1;
        int rem1 = p%t1; 

        while (m1 >=0){
            if(rem1 % t2 ==0)
                break; 
            m1--; 
            rem1 += t1;
        }
    

        int m2 = p/ t2; 
        int rem2 = p% t2; 
        while(t2 >= 0){
            if(rem2 % t1 ==0){
                break; 
            }
            m2--; 
            rem2 += t2; 
        }

        if(m1<0 && m2 <0){
            System.out.println(-1);
        }
        else if(m1 <0){
            System.out.println(m2 + rem2/t1);
        }
        else if(m2 <0 ){
            System.out.println(m1 + rem1/t2);
        }
        else{
            System.out.println(Math.min(m2 + rem2/t1, m1 + rem1/t2 ));
        }

    }

}
