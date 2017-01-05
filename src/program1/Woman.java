/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;


import static program1.Sex.FEMALE;

/**
 * @author Anna
 */
public class Woman extends User implements BMIProduct {

    public String wynik;
    public double bmi;
    
    public Woman(double height, double weight) {
        super(height, weight);
        Sex sex = FEMALE;
    }
    
    @Override
    public void BMIProduct() {
        bmi = calculateBMI();
        if (bmi < 17) {
            wynik = "Twoje BMI określać może stan, który jest niebezpieczny dla zdrowia. "
                    + "Jedynie osoby wysokie o atletycznej budowie ciała mogą być tutaj nieco spokojniejsze."
                    + "Wychudzenie może skutkować wieloma chorobami,ale może też być przez choroby "
                    + "spowodowane. Oczywiście, najbardziej znanym przykładem jest tutaj anoreksja, "
                    + "choć groźne są również AIDS, gruźlica czy nowotwory. Warto zatem zbadać swój stan "
                    + "zdrowia aby wykluczyć wszystkie medyczne przyczyny zbyt niskiej wagi."
                    + "W przypadku BMI wskazującego na wychudzenie niezbędna jest wizyta u lekarza,"
                    + "który wykona odpowiednie barania oraz prawdopodobnie skieruje do dietetyka. "
                    + "Zmiany w nawykach żywieniowych mogą diametralnie poprawić stan zdrowia. "
                    + "Dobra, wartościowa dieta pomoże też poprawić Twoje samopoczucie i wygląd. "
                    + "Zalecamy zatem pracę nad sobą. ";
        } else if (bmi >= 17 && bmi < 18.5) {
            wynik = "Masz niedowagę. Jest wiele czynników i chorób, które mogą skutkować utratą masy ciała, "
                    + "część z nich jest bardzo poważna (gruźlica, AIDS, pasożyty czy nowotwory). "
                    + "Warto zatem zasięgnąć rady lekarza."
                    + "Nawet małe zmiany w sposobie i nawykach żywieniowych mogą poprawić stan zdrowia. "
                    + "Dobra, wartościowa dieta również pomoże poprawić Twoje samopoczucie i będzie miała wpływ na wygląd. "
                    + "Zalecamy zatem pracę nad swoją wagą i kondycją fizyczną, aby BMI wzrosło powyżej bezpiecznego poziomu.";
        } else if (bmi >= 18.5 && bmi < 25) {
            wynik = "Wynik ten to pożądany i prawidłowy stan. Oczywiście, nawet w wypadku prawidłowego wyniku zawsze "
                    + "warto dbać o zdrowie. Dobrym pomysłem może być zwiększenie aktywności fizycznej, "
                    + "prowadzące do poprawy wyglądu sylwetki.Jak wiadomo, dobrze dobrana dieta to nie tylko rozwiązanie dla "
                    + "osób chcących poprawić swoja wagę, ale również dla tych, którzy (jak w tym przypadku) mają ją na "
                    + "dobrym poziomie. Odpowiednie nawyki żywieniowe wpływają na zdrowie, wygląd skóry oraz samopoczucie. "
                    + "Zachęcamy do zdrowego odżywiania.";
        } else if (bmi > 25 && bmi <= 30) {
            wynik = " Nadwaga to popularna cecha w społeczności, gdzie nie ma problemów z dostępem do żywności, "
                    + "ale mimo tego należy z nią walczyć. Najlepszym sposobem na zmniejszenie BMI jest konsultacja ze "
                    + "specjalistą i wykonanie podstawowych badań. Nie jest to duży wysiłek, a może zaoszczędzić wiele "
                    + "kłopotów, ponieważ nieleczona nadwaga skutkuje często dużą ilością powikłań "
                    + "(m. in.: miażdżyca, choroby serca czy nadciśnienie). Podstawowymi elementami, które pomogą Ci w "
                    + "odzyskaniu odpowiedniej masy ciała są: dieta oraz aktywność fizyczna. Tylko połączone razem w "
                    + "odpowiednich proporcjach dają gwarancję powodzenia. Zachęcamy do konsultacji ze specjalistami w "
                    + "tej dziedzinie (lekarz, dietetyk), którzy pomogą zmienić złe nawyki żywieniowe na właściwe "
                    + "(oraz całkowicie pozbyć się tych groźnych dla zdrowia) i przygotują dopasowane indywidualnie "
                    + "propozycje treningowe. Dzięki temu realne jest w stosunkowo krótkim czasie poprawienie swojego BMI "
                    + "i obniżenie go do zadowalającego wyniku.";
        } else if (bmi > 30 && bmi <= 35) {
            wynik = "Otyłość I stopnia. Stan ten wymaga Twojej niezwłocznej reakcji. Otyłość jest popularną chorobą w "
                    + "społeczności, gdzie nie ma problemów z dostępem do żywności. Mimo tego, zaniedbana jest bardzo "
                    + "groźna i może spowodować wiele chorób czy powikłań, jak na przykład: cukrzyca, miażdżyca, "
                    + "schorzenia wątroby, nadciśnienie, choroby stawów, nowotwory czy choroba wieńcowa serca. "
                    + "Warto zatem wykonać odstawowe badania i skonsultować je z lekarzem. Oczywiście nawet z tak wysokim "
                    + "BMI nie jest z późno do pracy nad sobą. Wspomnimy oczywisty fakt, że podstawowym elementem, który "
                    + "pomoże Tobie w odzyskaniu odpowiedniej masy ciała jest dieta oraz aktywność fizyczna. Połączone w "
                    + "odpowiednio dobranych i bezpiecznych proporcjach, które ustalą specjaliści dają gwarancję powodzenia. "
                    + "Zachęcamy do konsultacji w tym zakresie. Odpowiednia pomoc daje dużą dawkę motywacji i zwraca się w "
                    + "bezcenny sposób – poprawia zdrowie, które jest tu najważniejsze.";
        } else if (bmi > 35 && bmi <= 40) {
            wynik = "Otyłość II stopnia. Potrzebujesz wykwalifikowanej pomocy lekarskiej i dietetycznej bo tak wysokie BMI "
                    + "jest już niebezpieczne. Nie zwlekaj dłużej i podejmij walkę z tą chorobą teraz. W pełni Twój stan zdrowia i "
                    + "tkankę tłuszczową zbadać może tylko lekarz, do konsultacji z którym zachęcamy. Tak słaby wynik (trzeba to "
                    + "jasno powiedzieć) może mieć nie tylko żywieniowe ale i chorobowe podłoże, co trzeba wykluczyć w badaniach."
                    + "Zmiana nawyków żywieniowych w tymprzypadku jest nieunikniona. Razem z odpowiednio dobranymi ćwiczeniami "
                    + "fizycznymi, poprawisz swoje zdrowie, wygląd oraz samopoczucie – do czego z całego serca motywujemy i zachęcamy.";
        } else if (bmi > 40) {
            wynik = "III stopień otyłości.  Zgłoś się niezwłocznie do swojego lekarza! Zadbaj natychmiast o swoje zdrowie! "
                    + "Z otyłości można się wyleczyć! Znajdujesz się w grupie wysokiego ryzyka rozwoju takich powikłań otyłości "
                    + "jak: nadciśnienie tętnicze, cukrzyca, choroba niedokrwienna serca.  Najczęstszą przyczyną otyłości jest "
                    + "tzw. otyłość prosta, alimentacyjna powstająca w wyniku nadmiaru dostarczanych w pokarmach kalorii w "
                    + "stosunku do ich wydatkowania. Zmiana nawyków żywieniowych w Twoim przypadku jest nieunikniona. Zachęcamy "
                    + "do skorzystania z pomocy specjalistów dietetyków, których wiedza umożliwi ułożenie diety wg aktualnych "
                    + "potrzeb Twojego organizmu.";
        }
        
    }
    
    
}
