
package at.tws.lanterna;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import static com.googlecode.lanterna.input.Key.Kind.Escape;
import com.googlecode.lanterna.screen.Screen;
import static com.googlecode.lanterna.screen.ScreenCharacterStyle.Bold;
import com.googlecode.lanterna.terminal.Terminal;
import java.util.Scanner;
import java.lang.Math;
/**
 *  Kalkulator - Laterna
 * @author Adrian
 */
public class Main {
    public static void main(String args[]) throws InterruptedException{
        boolean mainLoop = true;
                Screen screen = TerminalFacade.createScreen();
        screen.startScreen();
        int liczba01, liczba02, wynik;
        String pierwsza;
        while(mainLoop){
        screen.putString(10,5,"Podaj dwie liczby - zostaną zsumowane", Terminal.Color.WHITE, Terminal.Color.BLACK);
        screen.refresh();

                screen.putString(10,6,"Podaj pierwszą"
                + "   ", Terminal.Color.WHITE, Terminal.Color.BLACK);
            Key key = screen.readInput();
            while(key == null)
            {
                key = screen.readInput();
            }
            if(key.getKind() == Escape)
              mainLoop = false;
           // liczba01 = Integer.parseInt(toString());
            screen.putString(10,7,key.toString(),Terminal.Color.YELLOW, Terminal.Color.BLACK);
            System.out.println("1.Pierwsza liczba : " + key.getCharacter());

            Key key2 = screen.readInput();
            while(key2 == null)
            {
                key2 = screen.readInput();
            }
            screen.refresh();
            //liczba02 = Integer.parseInt(key2.toString());
            System.out.println("2.Druga liczba : " + key2.getCharacter());
            screen.putString(10,8,key2.toString(),Terminal.Color.YELLOW, Terminal.Color.BLACK);
            screen.refresh();
          if(key.getKind() == Escape)
              mainLoop = false;
          //wynik = liczba01 + liczba02;
          //screen.putString(10,8,wynik,Terminal.Color.YELLOW, Terminal.Color.BLACK);
        }
//        Thread.sleep(3000);
        screen.stopScreen();
        System.exit(0);
    }
        }



