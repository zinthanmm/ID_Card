/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id_card;

import java.util.Scanner;


public class ID_Card {

    
    public static void main(String[] args) {
        System.out.print("Enter ID Number : ");
        Scanner sc = new Scanner(System.in);
        int ID_num = sc.nextInt();
        
        int a = ID_num % 10000000;
        int b = ID_num - a;
        int c = b/10000000;
        int year = c + 1900;
       
        int x = a % 10000;
        int y = a - x;
        int datecount = y/10000;
        
        if (datecount <500) {
            System.out.println("Gender : Male");
        } else {
            System.out.println("Gender : Female");
        }
        
        System.out.println("Birth Year :"+year);
             
        if (year%4==0) {
            if (1<=datecount && datecount<=31) {
                System.out.println("Birth Month : January");
                System.out.println("Birth Date :"+datecount);
            }   
            if (32<=datecount && datecount<=60) {
                System.out.println("Birth Month : February");
                System.out.println("Birth Date :"+(datecount-31));
            }    
            if (61<=datecount && datecount<=91) {
                System.out.println("Birth Month : March");
                System.out.println("Birth Date :"+(datecount-60));
            }    
            if (92<=datecount && datecount<=121) {
                System.out.println("Birth Month : April");
                System.out.println("Birth Date :"+(datecount-91));
            }    
            if (122<=datecount && datecount<=152) {
                System.out.println("Birth Month : May"); 
                System.out.println("B96irth Date :"+(datecount-121));
            }    
            if (153<=datecount && datecount<=182) {
                System.out.println("Birth Month : June"); 
                System.out.println("Birth Date :"+(datecount-152));
            }    
            if (183<=datecount && datecount<=213) {
                System.out.println("Birth Month : July");
                System.out.println("Birth Date :"+(datecount-182));
            }    
            if (214<=datecount && datecount<=244) {
                System.out.println("Birth Month : August"); 
                System.out.println("Birth Date :"+(datecount-213));
            }    
            if (245<=datecount && datecount<=274) {
                System.out.println("Birth Month : September"); 
                System.out.println("Birth Date :"+(datecount-244));
            }    
            if (275<=datecount && datecount<=305) {
                System.out.println("Birth Month : October");
                System.out.println("Birth Date :"+(datecount-274));
            }    
            if (306<=datecount && datecount<=335) {
                System.out.println("Birth Month : November");  
                System.out.println("Birth Date :"+(datecount-305));
            }    
            if (336<=datecount && datecount<=366) {
                System.out.println("Birth Month : December"); 
                System.out.println("Birth Date :"+(datecount-335));
            }    
            if (501<=datecount && datecount<=531) {
                System.out.println("Birth Month : January");
                System.out.println("Birth Date :"+datecount);
            }   
            if (532<=datecount && datecount<=560) {
                System.out.println("Birth Month : February");
                System.out.println("Birth Date :"+(datecount-531));
            }    
            if (561<=datecount && datecount<=591) {
                System.out.println("Birth Month : March");
                System.out.println("Birth Date :"+(datecount-560));
            }    
            if (592<=datecount && datecount<=621) {
                System.out.println("Birth Month : April");
                System.out.println("Birth Date :"+(datecount-591));
            }    
            if (622<=datecount && datecount<=652) {
                System.out.println("Birth Month : May"); 
                System.out.println("Birth Date :"+(datecount-621));
            }    
            if (653<=datecount && datecount<=682) {
                System.out.println("Birth Month : June"); 
                System.out.println("Birth Date :"+(datecount-652));
            }    
            if (683<=datecount && datecount<=713) {
                System.out.println("Birth Month : July");
                System.out.println("Birth Date :"+(datecount-682));
            }    
            if (714<=datecount && datecount<=744) {
                System.out.println("Birth Month : August"); 
                System.out.println("Birth Date :"+(datecount-713));
            }    
            if (745<=datecount && datecount<=774) {
                System.out.println("Birth Month : September"); 
                System.out.println("Birth Date :"+(datecount-744));
            }    
            if (775<=datecount && datecount<=805) {
                System.out.println("Birth Month : October");
                System.out.println("Birth Date :"+(datecount-774));
            }    
            if (806<=datecount && datecount<=835) {
                System.out.println("Birth Month : November");  
                System.out.println("Birth Date :"+(datecount-805));
            }    
            if (836<=datecount && datecount<=866) {
                System.out.println("Birth Month : December"); 
                System.out.println("Birth Date :"+(datecount-835));
            }    
        } else {
            if (1<=datecount && datecount<=31) {
                System.out.println("Birth Month : January");
                System.out.println("Birth Date :"+(datecount));
            }   
            if (32<=datecount && datecount<=59) {
                System.out.println("Birth Month : February");
                System.out.println("Birth Date :"+(datecount-31));
            }    
            if (60<=datecount && datecount<=90) {
                System.out.println("Birth Month : March");
                System.out.println("Birth Date :"+(datecount-59));
            }    
            if (91<=datecount && datecount<=120) {
                System.out.println("Birth Month : April");
                System.out.println("Birth Date :"+(datecount-90));
            }    
            if (121<=datecount && datecount<=151) {
                System.out.println("Birth Month : May"); 
                System.out.println("Birth Date :"+(datecount-120));
            }    
            if (152<=datecount && datecount<=181) {
                System.out.println("Birth Month : June"); 
                System.out.println("Birth Date :"+(datecount-151));
            }    
            if (182<=datecount && datecount<=212) {
                System.out.println("Birth Month : July");
                System.out.println("Birth Date :"+(datecount-181));
            }    
            if (213<=datecount && datecount<=243) {
                System.out.println("Birth Month : August");
                System.out.println("Birth Date :"+(datecount-212));
            }    
            if (244<=datecount && datecount<=273) {
                System.out.println("Birth Month : September"); 
                System.out.println("Birth Date :"+(datecount-243));
            }    
            if (274<=datecount && datecount<=304) {
                System.out.println("Birth Month : October"); 
                System.out.println("Birth Date :"+(datecount-273));
            }    
            if (305<=datecount && datecount<=334) {
                System.out.println("Birth Month : November"); 
                System.out.println("Birth Date :"+(datecount-304));
            }    
            if (335<=datecount && datecount<=365) {
                System.out.println("Birth Month : December");
                System.out.println("Birth Date :"+(datecount-334));
            }   
            if (501<=datecount && datecount<=531) {
                System.out.println("Birth Month : January");
                System.out.println("Birth Date :"+(datecount));
            }   
            if (532<=datecount && datecount<=559) {
                System.out.println("Birth Month : February");
                System.out.println("Birth Date :"+(datecount-531));
            }    
            if (560<=datecount && datecount<=590) {
                System.out.println("Birth Month : March");
                System.out.println("Birth Date :"+(datecount-559));
            }    
            if (591<=datecount && datecount<=620) {
                System.out.println("Birth Month : April");
                System.out.println("Birth Date :"+(datecount-590));
            }    
            if (621<=datecount && datecount<=651) {
                System.out.println("Birth Month : May"); 
                System.out.println("Birth Date :"+(datecount-620));
            }    
            if (652<=datecount && datecount<=681) {
                System.out.println("Birth Month : June"); 
                System.out.println("Birth Date :"+(datecount-651));
            }    
            if (682<=datecount && datecount<=712) {
                System.out.println("Birth Month : July");
                System.out.println("Birth Date :"+(datecount-681));
            }    
            if (713<=datecount && datecount<=743) {
                System.out.println("Birth Month : August");
                System.out.println("Birth Date :"+(datecount-712));
            }    
            if (744<=datecount && datecount<=773) {
                System.out.println("Birth Month : September"); 
                System.out.println("Birth Date :"+(datecount-743));
            }    
            if (774<=datecount && datecount<=804) {
                System.out.println("Birth Month : October"); 
                System.out.println("Birth Date :"+(datecount-773));
            }    
            if (805<=datecount && datecount<=834) {
                System.out.println("Birth Month : November"); 
                System.out.println("Birth Date :"+(datecount-804));
            }    
            if (835<=datecount && datecount<=865) {
                System.out.println("Birth Month : December");
                System.out.println("Birth Date :"+(datecount-834));
            }    
        }
    }
}
    

