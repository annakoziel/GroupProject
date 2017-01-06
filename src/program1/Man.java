package program1;

import static program1.Sex.MALE;

/**
 *
 * @author Anna
 */
public class Man extends User implements BMIProduct {

    public String wynik;
    public double bmi;

    public Man(double height, double weight) {
        super(height, weight);
        Sex sex = MALE;
    }

    @Override
    public String BMIProduct() {
        bmi = calculateBMI();
        if (bmi < 17) {
            return wynik = "Wychudzenie to groźny dla zdowia stan. W przypadku BMI wskazującego na wychudzenie "
                    + "niezbędna jest wizyta u lekarza, który wykona odpowiednie barania oraz prawdopodobnie skieruje "
                    + "do dietetyka. Zmiany w nawykach żywieniowych mogą diametralnie poprawić stan zdrowia. Dobra, "
                    + "wartościowa dieta pomoże też poprawić Twoje samopoczucie i wygląd. Zalecamy zatem pracę nad sobą. Powodzenia!";
        } else if (bmi >= 17 && bmi < 18.5) {
            return wynik = "Masz niedowagę. Musisz wiedzieć o tym, że bardzo niska masa ciała wiąże się z występowaniem "
                    + "wielu chorób, a w konsekwencji może doprowadzić do anoreksji. Dlatego pamiętaj, że odpowiednio "
                    + "skomponowane posiłki, dopasowane pod względem zawartości kalorii do potrzeb Twojego organizmu, będą "
                    + "dostarczały niezbędne składniki odżywcze, zapobiegając tym samym dalszej utracie masy ciała, jednocześnie "
                    + "nie powodując jej nadmiernego wzrostu. Dieta taka zmniejszy również ryzyko wystąpienia chorób, związanych "
                    + "z bardzo niską masą ciała. ";
        } else if (bmi >= 18.5 && bmi < 25) {
            return wynik = "Masz idealną masę ciała. Jednak, aby Twoje BMI nadal "
                    + "pozostało w tym przedziale zastanów się nad sposobem swojego odżywiania, staraj się stosować do "
                    + "zaleceń racjonalnego sposobu żywienia oraz kontrolować ilość spożywanych kalorii, a utrzymasz swoją "
                    + "aktualną masę ciała. Musisz również zwrócić szczególną uwagę na poziom swojej aktywności fizycznej, "
                    + "jeśli jest niski (mniej niż 30 minut dziennie), postaraj się więcej czasu poświęcać na ćwiczenia, "
                    + "które w połączeniu ze zdrowym odżywianiem pozwolą Ci kontynuować swój sukces. ";
        } else if (bmi > 25 && bmi <= 30) {
            return wynik = " Nadwaga. To jest najwyższy czas, aby zmienić swój sposób odżywiania, głównie ograniczyć "
                    + "ilość kalorii w spożywanych posiłkach, a także wyeliminować podjadanie pomiędzy posiłkami, co pozwoli "
                    + "zminimalizować ryzyko przybierania na wadze. Pamiętaj, aby jeść mniej, ale częściej, pić dużo wody i "
                    + "zwiększyć swoją aktywność fizyczną, co znacznie ułatwi utratę zbędnych kilogramów. Wraz z nadmiernym "
                    + "wzrostem masy ciała rośnie ryzyko chorób dietozależnych, dlatego odpowiednio wcześniej zaplanuj swój "
                    + "proces odchudzania. ";
        } else if (bmi > 30 && bmi <= 35) {
            return wynik = ("Otyłość I stopnia. Wraz ze wzrostem masy ciała rośnie ryzyko niedokrwiennej choroby serca, "
                    + "nadciśnienia tętniczego, cukrzycy, choroby zwyrodnieniowej układu kostno-stawowego. Jak zapewne wiesz "
                    + "otyłość wynika z nadmiernej ilości spożywanej żywności, dlatego zastanów się w jaki sposób możesz "
                    + "ograniczyć ilość przyjmowanego pożywienia. Gdy sam/a nie dajesz sobie rady zgłoś się o pomoc do "
                    + "dietetyka, z którym razem zaplanujecie odpowiednią dla potrzeb Twojego organizmu dietę. Staraj się "
                    + "wystrzegać głodówek, które są niebezpieczne dla organizmu, a ich następstwem jest efekt jo-jo. ");
        } else if (bmi > 35 && bmi <= 40) {
            return wynik = "Otyłość II stopnia. Niewątpliwie duże jest ryzyko wystąpienia chorób wynikających z "
                    + "nadmiaru tkanki tłuszczowej głównie: cukrzycy typu 2, choroby wieńcowej, nadciśnienia tętniczego,"
                    + " zaburzenia miesiączkowania oraz zakrzepicy żylnej i cellulitu. To jest ostatni moment, abyś "
                    + "zrozumiał jak dużą rolę odgrywa stosowanie odpowiedniej diety niskokalorycznej, bogatej w "
                    + "różnorodne posiłki, a także takiej, która pomoże Ci poprawić kondycję i witalność. Na tym etapie "
                    + "rozwoju stopnia otyłości musisz wiedzieć jak poważne są konsekwencje tej choroby i że z "
                    + "otyłością trzeba walczyć, a nie ją bagatelizować. ";
        } else if (bmi > 40) {
            return wynik = "III stopień otyłości.  W takiej sytuacji zgłoś się do odpowiedniego specjalisty, "
                    + "który, poza dietą i odpowiednimi ćwiczeniami przepisze Ci leki przyspieszające spalanie tkanki "
                    + "tłuszczowej. Jednak musisz pamiętać, że podstawę Twojej terapii odchudzającej musi stanowić dieta"
                    + " oraz duża aktywność fizyczna. W takiej sytuacji ważne jest również wsparcie najbliższych osób, "
                    + "dlatego staraj się, aby w Twoim otoczeniu byli ludzie, którzy będą Cię wspierać. ";
        } else {
            return "Błąd";
        }
    }

}
