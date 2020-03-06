/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas15;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tiga  extends lima{
  Scanner baca= new Scanner(System.in);
     @Override
    public void buka(){
         System.out.print("jumlah anak = ");
         int org = baca.nextInt();
         String nama []=new String[org];
         String kelas []=new String[org];
         String mapel[]=new String[org];
         String po[]=new String[org];
         int nilai1[]=new int [org];
         int nilai2[]=new int[org];
         int nilai[]=new int[org];
         int nilaiul2[]=new int[org];
         int pts[]=new int[org];
         int rata[]=new int[org];
         
         System.out.println(" ");
         for(int b=0;b<org;b++){
             System.out.print("Nama anak ke "+(b+1)+"    = ");
             nama[b]=baca.nextLine();
             nama[b]=baca.next();
          
         }
         System.out.println(" ");
         for(int b=0;b<org;b++){
             System.out.print("kelas anak ke "+(b+1)+"    = ");
             kelas[b]=baca.nextLine();
             kelas[b] =baca.next();
           
         }
         System.out.println(" ");
        for(int b=0;b<org;b++){
            System.out.print("Mapel anak ke "+(b+1)+"    = ");
            
            mapel[b]=baca.nextLine();
            mapel[b]=baca.next();
        }
         System.out.println(" ");
        for(int b=0;b<org;b++){
            System.out.println("===============================================");
            System.out.print("Nilai ulangan-1 anak ke "+(b+1)+"    = ");
            nilai[b]=baca.nextInt();
            System.out.print("Nilai ulangan-2 anak ke "+(b+1)+"    = ");
            nilaiul2[b]=baca.nextInt();
            System.out.print("Nilai harian-1 anak ke "+(b+1)+"     = ");
            nilai1[b]=baca.nextInt();
            System.out.print("Nilai harian-2 anak ke "+(b+1)+"     = ");
            nilai2[b]=baca.nextInt();
            System.out.print("Nilai pts anak ke "+(b+1)+"          = ");
            pts[b]=baca.nextInt();
            rata[b]=(nilai[b]+nilaiul2[b]+nilai1[b]+nilai2[b]+pts[b])/5;
        }
         System.out.println(" ");
        for(int b=0;b<org;b++){
            
            if(rata[b]>=70){
                po[b]="LULUS";
            }else if(nilai[b]<70){
                po [b]="TIDAK LULUS";
           }
            System.out.println("Predikat kelulusan"+"anak ke "+(b+1)+"   = "+po[b]);
           
        }
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("============================================================================================================================================================================================================================");
        System.out.println(" ");
        System.out.println("           PROGRAM PENENTUAN KELULUSAN");
        System.out.println("   semester ganjil tahun ajaran 2019/2020");
        System.out.println("                SMK TELKOM MALANG");
        System.out.println(" ");
        System.out.println("no         |  nama           | kelas       | mapel      |  nilai       | predikat      |  ");    
        for(int d=0;d<org;d++){
        System.out.println(((d+1)+"            "+nama[d]    +"              " +kelas[d]+"          "+mapel[d]+"            " +rata[d]+"            "+po[d] ) );
        }
        System.out.println(" ");
        System.out.println("================================================================================================================================================================================================================================");
        System.out.println(" ");
        System.out.println(" ");
        }
        
       
    }

