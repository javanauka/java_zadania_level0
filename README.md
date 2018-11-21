# java_zadania_level0
Zadania z pierwszego poziomu java, te które dostaliśmy od Piotra.


Wstęp do języka Java
Zadanie 1. Napisać program służący do konwersji wartości
temperatury podanej w stopniach Celsjusza na stopnie w skali
Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
Zadanie 2. Wczytać od użytkownika 3 liczby całkowite i wypisać na
ekran największą oraz najmniejszą z nich.
Zadanie 3. Napisać program, który oblicza wartość współczynnika
BMI (ang. body mass index) wg. wzoru: waga/wzrost^2 . Jeżeli wynik
jest w przedziale (18,5 - 24,9) to wypisuje  
”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej
”nadwaga”.
Zadanie 4. Napisać program obliczający należny podatek
dochodowy od osób fizycznych. Program ma pobierać od
użytkownika dochód i po obliczeniu wypisywać na ekranie należny
podatek. Podatek obliczany jest wg. następujących reguł:  
• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN, 
• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad
85.528,00
+1Wednesday, 13 September 2017
Zadanie 5. W sklepie ze sprzętem AGD oferowana jest sprzedaż
ratalna. Napisz program umożliwiający wyliczenie wysokości
miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla
programu są:  
• cena towaru (od 100 zł do 10 tyś. zł), • liczba rat (od 6 do 48).  
Kredyt jest oprocentowany w zależności od liczby rat:  
• od 6–12 wynosi 2.5% , • od 13–24 wynosi 5%, • od 25–48 wynosi
10%.  
Obliczona miesięczna rata powinna zawierać również odsetki.
Program powinien sprawdzać, czy podane dane mieszczą się w
określonych powyżej zakresach, a w przypadku błędu pytać prosić
użytkownika ponownie o podanie danych.  
Zadanie 6. Napisać program realizujący funkcje prostego kalkulatora,
pozwalającego na wy- konywanie operacji dodawania, odejmowania,
mnożenia i dzielenia na dwóch licz- bach rzeczywistych. Program ma
identyfikować sytuację wprowadzenia błędnego symbolu działania
oraz próbę dzielenia przez zero. Zastosować instrukcję switch do
wykonania odpowiedniego działania w zależności od
wprowadzonego symbolu operacji. Scenariusz działania programu:
a) Program wyświetla informację o swoim przeznaczeniu.
b) Wczytuje pierwszą liczbę.
c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
d) Wczytuje drugą liczbę.
e) Wyświetla wynik lub - w razie konieczności - informację o niemożności
wy- konania działania.
f) Program kończy swoje działanie po naciśnięciu przez użytkownika
klawisza Enter.
+2Wednesday, 13 September 2017
Zadanie 7. Napisać program, który pobiera od użytkownika liczbę
całkowitą dodatnią, a na- stępnie wyświetla na ekranie kolejno
wszystkie liczby niepatrzyste nie większe od podanej liczby.
Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,
15.  
Zadanie 8. Napisać program pobierający od użytkownika dwie liczby
całkowite A oraz B, A < B, a następnie wyznaczający sumę ciągu
liczb od A do B, czyli sumę ciągu (A, A + 1, . . . , B). Obliczenia
należy wykonać trzykrotnie stosując kolejno pętle: while, do-while,
for.  
Przykład:  
Dla A = 4 i B = 11 program powinien wyświetlić:  
60 60 60  
Zadanie 9. Napisać program, który wczytuje od użytkownika liczbę
całkowitą dodatnią n, a następnie wyświetla na ekranie wszystkie
potęgi liczby 2 nie większe, niż podana liczba. Przykładowo, dla
liczby 71 program powinien wyświetlić:  
1 2 4 8 16 32 64  
Zadanie 10. Napisać program, który wczytuje liczby podawane przez
użytkownika dotąd, do- póki nie podana zostanie liczba 0. Następnie
wyświetlić sumę wszystkich poda- nych liczb.  
+3Wednesday, 13 September 2017
Zadanie 11. Napisać program, który pobiera od użytkownika ciąg
liczb całkowitych. Pobieranie danych kończone jest podaniem
wartości 0 (nie wliczana do danych). W następ- nej kolejności
program powinien wyświetlić sumę największej oraz najmniejszej z
podanych liczb oraz ich średnią arytmetyczną.  
3  
(
Przykład: 
Użytkownik podałciąg: 1, -4, 2, 17, 0. Wynik programu:
13 // suma min. i maks.
6.5 //średnia
Zadanie 12. Gra w ”Za dużo, za mało”. Komputer losuje liczbę z
zakresu 1...100, a gracz (użytkownik) ma za zadanie odgadnąć, co to
za liczba poprzez podawanie kolej- nych wartości. Jeżeli podana
wartość jest:  
• większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,  
• mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,  
• identyczna z wylosowaną – wyświetlany jest komunikat
„Gratulacje” i gra się kończy.  
Zadanie 13. Napisać program działający w trybie konsolowym
(tekstowym) i rysujący na ekra- nie prostokąt. Użytkownik podaje
znak wypełnienia prostokąta, pozycję lewego górnego rogu
prostokąta (x, y) oraz długości boków prostokąta (ab). Przyjmujemy,
że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).  
Przykład: x=6, y=3, a=4, b=6, zn=’x’  
>
7. >
8. > _____xxxxxx
9. > _____xxxxxx
10. > _____xxxxxx
11. > _____xxxxxx
+4Wednesday, 13 September 2017
12.  
ozn.
13. > - nowa linia,
14. _ - znak spacji.
15.  
 
Zadanie 14. Napisaćprogram rysujący w konsoli „choinkę” złożoną
ze znaków gwiazdki (*). Użytkownik programu powinien podaćliczbę
całkowitąn, n > 0, określającąwysokośćchoinki (liczbęwierszy). 
Przykład: dla n = 5 wynik powinien wyglądaćnastępująco: 
*
***
*****
*******
*********
Zadanie 15. Napisaćprogram, który pobiera od użytkownika liczbę
całkowitą, a następnie:•oblicza sumęcyfr tej liczby, 
•stosunekśredniej arytmetycznej cyfr parzystych dośredniej
arytmetycznej cyfr nieparzystych. 
Zadanie 16. Napisaćprogram, dla podanej liczby całkowitej
wyświetla jej dzielniki. Przykła- dowo, dla liczby 21 dzielniki to: 1, 3,
7, 21. 
Zadanie 17. Napisaćprogram, który sprawdza, czy podana liczba
całkowita n,n > 1, jest liczbąpierwszą. 
+5Wednesday, 13 September 2017
Zadanie 18. Napisać program, który utworzy tablicę 20 liczb
całkowitych z przedziału 1 . . . 10, a następnie wypisze na ekranie ile
razy każda z liczb z tego przedziału powtarza się w tablicy.
Przykład:
Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
Wystąpienia:
1-1 2-1 3-3 4-3 5-3 6-4 7-1 8-2 9-0
10 - 2
Zadanie 19. Napisz program, który:
• stworzy tablicę (macierz) 5 x 5 liczb całkowitych,
• wypełnij ją losowymi wartościami z zakresu {−5, −4, . . . , 5},
• dla każdej kolumny wyznacz minimum,
• dla każdej kolumny wyznaczy maksimum.
Program ma wyświetlać tablicę wypełnioną liczbami oraz tablice z minimami oraz
maksymami.
Zadanie 20. Napisać program, który wczytuje od użytkownika liczbę
całkowitą, a następnie wyświetla jej reprezentację w kodzie binarnym
(ZM). Podczas konwersji liczby należy kolejne jej bity zapisywać w
pomocniczej tablicy liczb całk. o rozmiarze 32. Konwersji należy
dokonać korzystając z operacji dzielenia całkowitego oraz operacji
modulo.
Przykład:
Wejście:
-75 (liczba podana przez użytkownika)
Wynik:
Liczba -75 binarnie: 1.1001011
+6Wednesday, 13 September 2017
Zadanie 21. Napisać program na podstawie programu do zadania 4,
który dodatkowo wyświetli liczbę w pozostałych kodach, a więc ZU1
oraz ZU2.
Zadanie 22. Napisz program, który pobiera od użytkownika dodatnią
liczbę naturalną n i tworzy tablicę a zmiennych typu logicznego
(boolean) o rozmiarze n×n. Następnie program powinien wypełnić
utworzoną tablicę, tak by a[i][j] = true jeżeli liczby (i+1) oraz (j+1) są
względnie pierwsze, tzn. nie mają wspólnych dzielników poza 1. Tak
utworzoną tablicę należy wypisać na ekranie, przy czym dla wartości
true należy wyświetlić znak ”+”, natomiast dla wartości false znak
”.”. Przykład:
Podaj liczbę (> 0): 10
1 2 3 4 5 6 7 8 9 10
1++++++++++
2+.+.+.+.+.
3++.++.++.+
4+.+.+.+.+.
5++++.++++.
6+...+.+...
7++++++.+++
8+.+.+.+.+.
9++.++.++.+
10 + . + . . . + . + .
+7
