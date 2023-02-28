import java.util.Arrays;
import java.util.Scanner;

public class Winemaker implements addWineable {
    private String name;
    private WineTypes wineType;
    private int experience;
    private String workAddress;
    private Wine[] wines;



    public Winemaker(String name, WineTypes wineType, int experience, String workAddress, Wine[] wines) {
        this.name = name;
        this.wineType = wineType;
        this.experience = experience;
        this.workAddress = workAddress;
        this.wines = wines;

    }
    public Winemaker(){}

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WineTypes getWineType() {
        return wineType;
    }

    public void setWineType(WineTypes wineType) {
        this.wineType = wineType;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public Wine[] getWines() {
        return wines;
    }

    public void setWines(Wine[] wines)
    {
        this.wines = wines;
    }



   /* @Override
    public Contact updateName(Contact contact, String newName) {
        System.out.println("Enter a new name: ");
        newName=scanner.nextLine();
        contact.setContactName(newName);
        return contact;
    }*/
    Scanner scanner=new Scanner(System.in);

    @Override
    public Wine[] addWine1(String newWine) {
        System.out.println("Enter a new wine: ");
        newWine=scanner.nextLine();
      wines.setWines(newWine);
        Wine[] newWines=new Wine[wines.length+1] ;
        return  wines;
    }

  

  
/*    public void addWine(String newWine) {
        Wine[] newWines = new Wine[wines.length + 1];
    }*/

    @Override
    public String toString() {
        return "Winemaker\n{" +
                "name: " + name + '\'' +
                " wineType: " + wineType +
                " experience: " + experience +
                " workAddress: " + workAddress + '\'' +
                " wines: " + Arrays.toString(wines) +
                '}';
    }


}
