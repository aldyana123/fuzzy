/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kktsugeno;

import java.util.Scanner;

/**
 *
 * @author roy
 */
public class Kktsugeno {

    /**
     * @param args the command line arguments
     */
    int mtk,indo,ing;
    
    public static double mtkKurang(double x){
        double myu;
        if(x<=20) {
            myu=1;
        }
        else if(x>=60){
            myu=0;
        }
        else{
            myu = (60-x)/40;
        }
        return myu;
    }
    
    public static double mtkCukup(double x){
        double myu = 0;
        if(x<=40) myu=0;
        else if(x>=80) myu=0;
        else if(x==60)myu=1;
        else if(x<60 && x>40){
            myu = (x-40)/20;
        }
        else if(x>60 && x<80){
            myu = (80-x)/20;
        }
        return myu;
    }
    
    public static double mtkBagus(double x){
        double myu = 0;
        if(x<=60) myu=0;
        else if(x>=100) myu=0;
        else if(x==80)myu=1;
        else if(x<80 && x>60){
            myu = (x-60)/20;
        }
        else if(x>80 && x<100){
            myu = (100-x)/20;
        }
        return myu;
    }
    
    public static double mtkSangatBagus(double x){
        double myu;
        if(x<=80) myu=0;
        else if(x>=100) myu=1;
        else{
            myu = (x-80)/20;
        }
        return myu;
    }
    
   
    
   public static double indKurang(double x){
        double myu;
        if(x<=20) {
            myu=1;
        }
        else if(x>=60){
            myu=0;
        }
        else{
            myu = (60-x)/40;
        }
        return myu;
    }
    
    public static double indCukup(double x){
        double myu = 0;
        if(x<=40) myu=0;
        else if(x>=80) myu=0;
        else if(x==60)myu=1;
        else if(x<60 && x>40){
            myu = (x-40)/20;
        }
        else if(x>60 && x<80){
            myu = (80-x)/20;
        }
        return myu;
    }
    
    public static double indBagus(double x){
        double myu = 0;
        if(x<=60) myu=0;
        else if(x>=100) myu=0;
        else if(x==80)myu=1;
        else if(x<80 && x>60){
            myu = (x-60)/20;
        }
        else if(x>80 && x<100){
            myu = (100-x)/20;
        }
        return myu;
    }
    
    public static double indSangatBagus(double x){
        double myu;
        if(x<=80) myu=0;
        else if(x>=100) myu=1;
        else{
            myu = (x-80)/20;
        }
        return myu;
    }
    
    public static double ingKurang(double x){
        double myu;
        if(x<=20) {
            myu=1;
        }
        else if(x>=60){
            myu=0;
        }
        else{
            myu = (60-x)/40;
        }
        return myu;
    }
    
    public static double ingCukup(double x){
        double myu = 0;
        if(x<=40) myu=0;
        else if(x>=80) myu=0;
        else if(x==60)myu=1;
        else if(x<60 && x>40){
            myu = (x-40)/20;
        }
        else if(x>60 && x<80){
            myu = (80-x)/20;
        }
        return myu;
    }
    
    public static double ingBagus(double x){
        double myu = 0;
        if(x<=60) myu=0;
        else if(x>=100) myu=0;
        else if(x==80)myu=1;
        else if(x<80 && x>60){
            myu = (x-60)/20;
        }
        else if(x>80 && x<100){
            myu = (100-x)/20;
        }
        return myu;
    }
    
    public static double ingSangatBagus(double x){
        double myu;
        if(x<=80) myu=0;
        else if(x>=100) myu=1;
        else{
            myu = (x-80)/20;
        }
        return myu;
    }
    
    public static double zSMA(double myu){
        double z;
        z = ((60*myu)-80)/-1;
        return z;
    }
    
    public static double zSMK(double myu){
        double z;
        z = (60*myu)+20;
        return z;
    }

    public static double min(double a, double b){
        double min;
        min = Math.min(a,b);
        return min;
    }

    public static void main(String[] args) {
        
    }
       
        public double hitunghasil (double mtk, double ind, double ing){
        double myumtkKurang, myumtkCukup,myumtkBagus, myumtkSangatBagus, 
                myuindKurang, myuindCukup,myuindBagus, myuindSangatBagus, 
                myuingKurang, myuingCukup,myuingBagus, myuingSangatBagus,myuKelasKhusus, myuKelasBiasa;    
        
        myumtkKurang = mtkKurang(mtk);
        myumtkCukup = mtkCukup(mtk);
        myumtkBagus = mtkBagus(mtk);
        myumtkSangatBagus = mtkSangatBagus(mtk);
        myuindKurang = indKurang(ind);
        myuindCukup = indCukup(ind);
        myuindBagus = indBagus(ind);
        myuindSangatBagus = indSangatBagus(ind);
        myuingKurang = ingKurang(ing);
        myuingCukup = ingCukup(ing);
        myuingBagus = ingBagus(ing);
        myuingSangatBagus = ingSangatBagus(ing);
        
        double apred1 = min(myumtkKurang,myuindSangatBagus);
        System.out.println("apred 1 = "+apred1);
        double apred2 = min(myumtkKurang,myuindBagus);
        System.out.println("apred 2 = "+apred2);
        double apred3 = min(myumtkKurang,myuindCukup);
        System.out.println("apred 3 = "+apred3);
        double apred4 = min(myumtkKurang,myuindKurang);
        System.out.println("apred 4 = "+apred4);
        
        double apred5 = min(myumtkCukup,myuindSangatBagus);
        System.out.println("apred 5 = "+apred5);
        double apred6 = min(myumtkCukup,myuindBagus);
        System.out.println("apred 6 = "+apred6);
        double apred7 = min(myumtkCukup,myuindCukup);
        System.out.println("apred 7 = "+apred7);
        double apred8 = min(myumtkCukup,myuindKurang);
        System.out.println("apred 8 = "+apred8);
        
        double apred9 = min(myumtkBagus,myuindSangatBagus);
        System.out.println("apred 9 = "+apred9);
        double apred10 = min(myumtkBagus,myuindBagus);
        System.out.println("apred 10 = "+apred10);
        double apred11 = min(myumtkBagus,myuindCukup);
        System.out.println("apred 11 = "+apred11);
        double apred12 = min(myumtkBagus,myuindKurang);
        System.out.println("apred 12 = "+apred12);
        
        double apred13 = min(myumtkSangatBagus,myuindSangatBagus);
        System.out.println("apred 13 = "+apred13);
        double apred14 = min(myumtkSangatBagus,myuindBagus);
        System.out.println("apred 14 = "+apred14);
        double apred15 = min(myumtkSangatBagus,myuindCukup);
        System.out.println("apred 15 = "+apred15);
        double apred16 = min(myumtkSangatBagus,myuindKurang);
        System.out.println("apred 16 = "+apred16);

        double apred17 = min(myumtkKurang,myuingSangatBagus);
        System.out.println("apred 17 = "+apred17);
        double apred18 = min(myumtkKurang,myuingBagus);
        System.out.println("apred 18 = "+apred18);
        double apred19 = min(myumtkKurang,myuingCukup);
        System.out.println("apred 19 = "+apred19);
        double apred20 = min(myumtkKurang,myuingKurang);
        System.out.println("apred 20 = "+apred20);
        
        double apred21 = min(myumtkCukup,myuingSangatBagus);
        System.out.println("apred 21 = "+apred21);
        double apred22 = min(myumtkCukup,myuingBagus);
        System.out.println("apred 22 = "+apred22);
        double apred23 = min(myumtkCukup,myuingCukup);
        System.out.println("apred 23 = "+apred23);
        double apred24 = min(myumtkCukup,myuingKurang);
        System.out.println("apred 24 = "+apred24);
        
        double apred25 = min(myumtkBagus,myuingSangatBagus);
        System.out.println("apred 25 = "+apred25);
        double apred26 = min(myumtkBagus,myuingBagus);
        System.out.println("apred 26 = "+apred26);
        double apred27 = min(myumtkBagus,myuingCukup);
        System.out.println("apred 27 = "+apred27);
        double apred28 = min(myumtkBagus,myuingKurang);
        System.out.println("apred 28 = "+apred28);
        
        double apred29 = min(myumtkSangatBagus,myuingSangatBagus);
        System.out.println("apred 29 = "+apred29);
        double apred30 = min(myumtkSangatBagus,myuingBagus);
        System.out.println("apred 30 = "+apred30);
        double apred31 = min(myumtkSangatBagus,myuingCukup);
        System.out.println("apred 31 = "+apred31);
        double apred32 = min(myumtkSangatBagus,myuingKurang);
        System.out.println("apred 32 = "+apred32);
        
        double apred33 = min(myuindKurang,myuingSangatBagus);
        System.out.println("apred 33 = "+apred33);
        double apred34 = min(myuindKurang,myuingBagus);
        System.out.println("apred 34 = "+apred34);
        double apred35 = min(myuindKurang,myuingCukup);
        System.out.println("apred 35 = "+apred35);
        double apred36 = min(myuindKurang,myuingKurang);
        System.out.println("apred 36 = "+apred36);
        
        double apred37 = min(myuindCukup,myuingSangatBagus);
        System.out.println("apred 37 = "+apred37);
        double apred38 = min(myuindCukup,myuingBagus);
        System.out.println("apred 38 = "+apred38);
        double apred39 = min(myuindCukup,myuingCukup);
        System.out.println("apred 39 = "+apred39);
        double apred40 = min(myuindCukup,myuingKurang);
        System.out.println("apred 40 = "+apred40);
        
        double apred41 = min(myuindBagus,myuingSangatBagus);
        System.out.println("apred 41 = "+apred41);
        double apred42 = min(myuindBagus,myuingBagus);
        System.out.println("apred 42 = "+apred42);
        double apred43 = min(myuindBagus,myuingCukup);
        System.out.println("apred 43 = "+apred43);
        double apred44 = min(myuindBagus,myuingKurang);
        System.out.println("apred 44 = "+apred44);
        
        double apred45 = min(myuindSangatBagus,myuingSangatBagus);
        System.out.println("apred 45 = "+apred45);
        double apred46 = min(myuindSangatBagus,myuingBagus);
        System.out.println("apred 46 = "+apred46);
        double apred47 = min(myuindSangatBagus,myuingCukup);
        System.out.println("apred 47 = "+apred47);
        double apred48 = min(myuindSangatBagus,myuingKurang);
        System.out.println("apred 48 = "+apred48);
        System.out.println("\n");
        double z1 = zSMA(apred1);System.out.println("Z1 = "+z1);
        double z2 = zSMA(apred2);System.out.println("Z2 = "+z2);
        double z3 = zSMK(apred3);System.out.println("Z3 = "+z3);
        double z4 = zSMK(apred4);System.out.println("Z4 = "+z4);
        double z5 = zSMA(apred5);System.out.println("Z5 = "+z5);
        double z6 = zSMA(apred6);System.out.println("Z6 = "+z6);
        double z7 = zSMK(apred7);System.out.println("Z7 = "+z7);
        double z8 = zSMK(apred8);System.out.println("Z8 = "+z8);
        double z9 = zSMA(apred9);System.out.println("Z9 = "+z9);
        double z10 = zSMA(apred10);System.out.println("Z10 = "+z10);
        double z11 = zSMA(apred11);System.out.println("Z11 = "+z11);
        double z12 = zSMK(apred12);System.out.println("Z12 = "+z12);
        double z13 = zSMA(apred13);System.out.println("Z13 = "+z13);
        double z14 = zSMA(apred14);System.out.println("Z14 = "+z14);
        double z15 = zSMA(apred15);System.out.println("Z15 = "+z15);
        double z16 = zSMK(apred16);System.out.println("Z16 = "+z16);
        double z17 = zSMA(apred17);System.out.println("Z17 = "+z17);
        double z18 = zSMA(apred18);System.out.println("Z18 = "+z18);
        double z19 = zSMA(apred19);System.out.println("Z19 = "+z19);
        double z20 = zSMK(apred20);System.out.println("Z20 = "+z20);
        double z21 = zSMA(apred21);System.out.println("Z21 = "+z21);
        double z22 = zSMA(apred22);System.out.println("Z22 = "+z22);
        double z23 = zSMA(apred23);System.out.println("Z23 = "+z23);
        double z24 = zSMK(apred24);System.out.println("Z24 = "+z24);
        double z25 = zSMA(apred25);System.out.println("Z25 = "+z25);
        double z26 = zSMK(apred26);System.out.println("Z26 = "+z26);
        double z27 = zSMK(apred27);System.out.println("Z27 = "+z27);
        double z28 = zSMK(apred28);System.out.println("Z28 = "+z28);
        double z29 = zSMA(apred29);System.out.println("Z29 = "+z29);
        double z30 = zSMA(apred30);System.out.println("Z30 = "+z30);
        double z31 = zSMK(apred31);System.out.println("Z31 = "+z31);
        double z32 = zSMA(apred32);System.out.println("Z32 = "+z32);
        double z33 = zSMA(apred33);System.out.println("Z33 = "+z33);
        double z34 = zSMA(apred34);System.out.println("Z34 = "+z34);
        double z35 = zSMA(apred35);System.out.println("Z35 = "+z35);
        double z36 = zSMK(apred36);System.out.println("Z36 = "+z36);
        double z37 = zSMA(apred37);System.out.println("Z37 = "+z37);
        double z38 = zSMA(apred38);System.out.println("Z38 = "+z38);
        double z39 = zSMA(apred39);System.out.println("Z39 = "+z39);
        double z40 = zSMK(apred30);System.out.println("Z40 = "+z40);
        double z41 = zSMA(apred41);System.out.println("Z41 = "+z41);
        double z42 = zSMA(apred42);System.out.println("Z42 = "+z42);
        double z43 = zSMA(apred43);System.out.println("Z43 = "+z43);
        double z44 = zSMK(apred44);System.out.println("Z44 = "+z44);
        double z45 = zSMA(apred45);System.out.println("Z45 = "+z45);
        double z46 = zSMK(apred46);System.out.println("Z46 = "+z46);
        double z47 = zSMK(apred47);System.out.println("Z47 = "+z47);
        double z48 = zSMK(apred48);System.out.println("Z48 = "+z48);
        
        System.out.println("\n");
        
        double zTot = ((apred1*z1)+(apred2*z2)+(apred3*z3)+(apred4*z4)
                +(apred5*z5)+(apred6*z6)+(apred7*z7)+(apred8*z8)+(apred9*z9)
                +(apred10*z10)+(apred11*z11)+(apred12*z12)+(apred13*z13)+(apred14*z14)
                +(apred15*z15)+(apred16*z16)+(apred17*z17)+(apred18*z18)+(apred19*z19)
                +(apred20*z20)+(apred21*z21)+(apred22*z22)+(apred23*z23)+(apred24*z24)
                +(apred25*z25)+(apred26*z26)+(apred27*z27)+(apred28*z28)+(apred29*z29)
                +(apred30*z30)+(apred31*z31)+(apred32*z32)+(apred33*z33)+(apred34*z34)
                +(apred35*z35)+(apred36*z36)+(apred37*z37)+(apred38*z38)+(apred39*z39)
                +(apred40*z40)+(apred41*z41)+(apred42*z42)+(apred43*z43)+(apred44*z44)
                +(apred45*z45)+(apred46*z46)+(apred47*z47)+(apred48*z48)) /(apred1+apred2+apred3+apred4
                +apred5+apred6+apred7+apred8+apred9+apred10+apred11+apred12
                +apred13+apred14+apred15+apred16+apred17+apred18+apred19+apred20
                +apred21+apred22+apred23+apred24+apred25+apred26+apred27+apred28
                +apred29+apred30+apred31+apred32+apred33+apred34+apred35+apred36
                +apred37+apred38+apred39+apred40+apred41+apred42+apred43+apred44
                +apred45+apred46+apred47+apred48);System.out.println("Z Total = "+zTot);
        
            
        return zTot;  
    } 
        

   
}