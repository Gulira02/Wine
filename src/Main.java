import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wine wine1=new Wine("Amelia","Concha y Toro","Use",LocalDate.of(2002,03, 23));
        Wine wine2=new Wine("Sutter Home","Sutter Home","США",LocalDate.of(1997,12, 13));
        Wine wine3=new Wine("E&J Gallo Winery","Gallo","США",LocalDate.of(1986,07, 28));



        Winemaker winemaker1=new Winemaker("Concha y Toro",WineTypes.RED,15,"Use",new Wine[]{wine1});
        Winemaker winemaker2=new Winemaker("Trinchero Family Estates",WineTypes.PINK,40,"США", new Wine[]{wine2});
        Winemaker winemaker3=new Winemaker("Gallo",WineTypes.WHITE,50,"США", new Wine[]{wine3});

        Winemaker [] winemakers={winemaker1,winemaker2,winemaker3};
        for (Winemaker winemaker:winemakers)
            System.out.println(Arrays.toString(new Winemaker[]{winemaker}));

        System.out.println("Amelia: "+wine1.getAgeInYears());
        System.out.println("Sutter Home: "+wine2.getAgeInYears());
        System.out.println("E&J Gallo Winery: "+wine3.getAgeInYears());

        Scanner scanner=new Scanner(System.in);
       // System.out.println(Arrays.toString(winemaker1.addWine1(scanner.nextLine())));



    }



}