/*
Description:
p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)

the function nb_year should return n number of entire years needed to get a population greater or equal to p.

aug is an integer, percent a positive or null number, p0 and p are positive integers (> 0)
Examples:
nb_year(1500, 5, 100, 5000) -> 15
nb_year(1500000, 2.5, 10000, 2000000) -> 10
*/

public class Arge {
	//SOLUTION 1//
	public static int nbYear(int p0, double percent, int aug, int p) {
        /*double population = p0;
        double percentage = percent / 100;
        int numberOfYears = 0;
        while(population < p){
          population = population + (population * percentage) + aug;
          numberOfYears++;
        }
        return numberOfYears;
    }*/
        int numberOfYears = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            numberOfYears++;
        }
        return numberOfYears;
    }
}