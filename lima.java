/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas15;

/**
 *
 * @author HP
 */
public class lima {
    public String buka;
    public String masuk;
    
    public lima(){
        this.buka=buka;
    }
    public void ya(){
       System.out.println(" ============================================================================================================================================");
 
    }
    public void buka(){
        System.out.println("                            PEROGRAM PENENTUAN KELULUSAN");
    }
    public void setbuka(String newbuka){
        System.out.println(" ");
        System.out.println("                            SMESTER GANJIL tahun 2019/2020");
        System.out.println("                                   SMK TELKOM MALANG         ");
    }
    public String getbuka(){
        return buka;
    }
   
    
    //overload :(  //
    public void masuk(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
       
    }
  public void masuk(String masuk){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
      
  }
}
