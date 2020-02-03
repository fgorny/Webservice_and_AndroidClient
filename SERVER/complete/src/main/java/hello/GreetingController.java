package hello;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @RequestMapping(value = "/greeting")

        public String elo() //String bo ta funkcja zwraca string jak ktos da request
    {
        String[] tablica = new String[12];
        tablica[0] = "Życie jest jak pudełko czekoladek, nigdy nie wiesz, co ci się trafi.";
        tablica[1] = "Na tym świecie jeden człowiek jest nikim, a innego świata nie ma.";
        tablica[2] = "Jeśli chcesz rozśmieszyć Boga, to powiedz mu, co planujesz.";
        tablica[3] = "Wszyscy kiedyś umrzemy. Lecz nie wszyscy wiedzą, jak żyć.";
        tablica[4] = "Trudno być złym, kiedy świat ma do zaoferowania tyle piękna.";
        tablica[5] = "W życiu musisz być rekinem, jeśli nie chcesz żeby dopadły cię inne rekiny.";
        tablica[6] = "Życia nie można wybrać, ale można z niego coś zrobić.";
        tablica[7] = "Ludzie budują za dużo murów, a za mało mostów.";
        tablica[8] = "To smutne, że głupcy są tacy pewni siebie, a ludzie rozsądni tacy pełni wątpliwości.";
        tablica[9] = "Wielkość człowieka polega na jego postanowieniu, żeby być silniejszym niż warunki czasu i życia.";
        tablica[10] = "Rób, co możesz, w miejscu, jakim jesteś i z tym, co masz.";
        tablica[11] = "Dopiero w samotności człowiek jest naprawdę sobą.";

        Random r = new Random();

        String newLine = System.getProperty("line.separator");
       // 1. nie powinno wypisywac tego w konsoli tylko jak ktos zrobi request do bazy

       // for (int i=0; i<1; i++){
            return "Motto na dziś: \n"  +  tablica[r.nextInt(12)];
        //}
    }



}
