/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konzol;

/**
 *
 * @author DezsőVinceAndrás(Szf
 */
import java.util.Scanner;

public class kopapirollo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kő/Papír/Olló");
        String gepvalasz2;
        String felhasznalo = sc.nextLine();
        int random = (int) (Math.random());
        
        String gepvalasz1;
        if (random == 0) {
            gepvalasz1 = "Kő";
        } else if (random == 1) {
            gepvalasz1 = "Papír";
        } else {
            gepvalasz1 = "Olló";
        }
        
        if (gepvalasz1 == "Kő" & felhasznalo == "Kő"){
            gepvalasz2 = "Döntetlen!";
        }
        else if (gepvalasz1 == "Papír" & felhasznalo == "Kő" | gepvalasz1 == "Olló" & felhasznalo == "Papír" | gepvalasz1 == "Kő" & felhasznalo == "Olló"){
            gepvalasz2 = "A gép nyert!";
        }
        else{
            gepvalasz2 = "A felhasználó nyert";
        }
        System.out.println("A gép válasza: " + gepvalasz1);
        System.out.println("Tehát " + gepvalasz2);
    }
}