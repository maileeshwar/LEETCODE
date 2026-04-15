class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int ad1=Integer.parseInt(arriveAlice.substring(3, 5));
        int ad2=Integer.parseInt(leaveAlice.substring(3, 5));
        int bd1=Integer.parseInt(arriveBob.substring(3, 5));
        int bd2=Integer.parseInt(leaveBob.substring(3, 5));

        int am1=Integer.parseInt(arriveAlice.substring(0, 2));
        int am2=Integer.parseInt(leaveAlice.substring(0,2));
        int bm1=Integer.parseInt(arriveBob.substring(0,2));
        int bm2=Integer.parseInt(leaveBob.substring(0,2));
        
        int aday1=0;
        if(am1==1){
            aday1=ad1;
        }else if(am1==2){
            aday1=31+ad1;
        }else if(am1==3){
            aday1=31+28+ad1;
        }else if(am1==4){
            aday1=31+28+31+ad1;
        }else if(am1==5){
            aday1=31+28+31+30+ad1;
        }else if(am1==6){
            aday1=31+28+31+30+31+ad1;
        }else if(am1==7){
            aday1=31+28+31+30+31+30+ad1;
        }else if(am1==8){
            aday1=31+28+31+30+31+30+31+ad1;
        }else if(am1==9){
            aday1=31+28+31+30+31+30+31+31+ad1;
        }else if(am1==10){
            aday1=31+28+31+30+31+30+31+31+30+ad1;
        }else if(am1==11){
            aday1=31+28+31+30+31+30+31+31+30+31+ad1;
        }else if(am1==12){
            aday1=31+28+31+30+31+30+31+31+30+31+30+ad1;
        }
        int aday2=0;
        if(am2==1){
            aday2=ad2;
        }else if(am2==2){
            aday2=31+ad2;
        }else if(am2==3){
            aday2=31+28+ad2;
        }else if(am2==4){
            aday2=31+28+31+ad2;
        }else if(am2==5){
            aday2=31+28+31+30+ad2;
        }else if(am2==6){
            aday2=31+28+31+30+31+ad2;
        }else if(am2==7){
            aday2=31+28+31+30+31+30+ad2;
        }else if(am2==8){
            aday2=31+28+31+30+31+30+31+ad2;
        }else if(am2==9){
            aday2=31+28+31+30+31+30+31+31+ad2;
        }else if(am2==10){
            aday2=31+28+31+30+31+30+31+31+30+ad2;
        }else if(am2==11){
            aday2=31+28+31+30+31+30+31+31+30+31+ad2;
        }else if(am2==12){
            aday2=31+28+31+30+31+30+31+31+30+31+30+ad2;
        }
        boolean days1[]=new boolean [366];
        for(int i=aday1;i<=aday2;i++){
             days1[i]=true;
        }


        int bday1=0;
        if(bm1==1){
            bday1=bd1;
        }else if(bm1==2){
            bday1=31+bd1;
        }else if(bm1==3){
            bday1=31+28+bd1;
        }else if(bm1==4){
            bday1=31+28+31+bd1;
        }else if(bm1==5){
            bday1=31+28+31+30+bd1;
        }else if(bm1==6){
            bday1=31+28+31+30+31+bd1;
        }else if(bm1==7){
            bday1=31+28+31+30+31+30+bd1;
        }else if(bm1==8){
            bday1=31+28+31+30+31+30+31+bd1;
        }else if(bm1==9){
            bday1=31+28+31+30+31+30+31+31+bd1;
        }else if(bm1==10){
            bday1=31+28+31+30+31+30+31+31+30+bd1;
        }else if(bm1==11){
            bday1=31+28+31+30+31+30+31+31+30+31+bd1;
        }else if(bm1==12){
            bday1=31+28+31+30+31+30+31+31+30+31+30+bd1;
        }
        int bday2=0;
        if(bm2==1){
            bday2=bd2;
        }else if(bm2==2){
            bday2=31+bd2;
        }else if(bm2==3){
            bday2=31+28+bd2;
        }else if(bm2==4){
            bday2=31+28+31+bd2;
        }else if(bm2==5){
            bday2=31+28+31+30+bd2;
        }else if(bm2==6){
            bday2=31+28+31+30+31+bd2;
        }else if(bm2==7){
            bday2=31+28+31+30+31+30+bd2;
        }else if(bm2==8){
            bday2=31+28+31+30+31+30+31+bd2;
        }else if(bm2==9){
            bday2=31+28+31+30+31+30+31+31+bd2;
        }else if(bm2==10){
            bday2=31+28+31+30+31+30+31+31+30+bd2;
        }else if(bm2==11){
            bday2=31+28+31+30+31+30+31+31+30+31+bd2;
        }else if(bm2==12){
            bday2=31+28+31+30+31+30+31+31+30+31+30+bd2;
        }
        boolean days2[]=new boolean [366];
        for(int i=bday1;i<=bday2;i++){
             days2[i]=true;
        }
         int count=0;
        for(int i=0;i<366;i++){
            if(days1[i] && days2[i]){
                count++;
            }
        }
        return count;
    }
}