import java.util.ArrayList;
import java.util.List;

public class Country {

    public static void main(String[] args) {
        List<Locality> localities = new ArrayList<Locality>();


        LocalityFactory localityFactory = new LocalityFactory();
        Locality budapest = localityFactory.Create("Budapest", LocalityType.TOWN);
        budapest.setGps("1122");
        localities.add(budapest);


        Locality nagykanizsa = localityFactory.Create("Nagykanizsa", LocalityType.TOWN);
        nagykanizsa.setGps("5000");
        localities.add(nagykanizsa);

        Locality kukutyin = localityFactory.Create("Kukutyin", LocalityType.VILLAGE);
        kukutyin.setGps("1301");
        localities.add(kukutyin);


        Locality település;   //elegánsabb megoldás,de ugyanazt csinálja ,mint fent
        település = localityFactory.Create("Budapest", LocalityType.TOWN);
        település.setGps("1122");
        localities.add(település);


        String[] város = {"szeged","budapest", "debrecen"}; //még elengánsabb,ciklusban
        for (Integer i = 0; i < város.length; i++) {
            település = localityFactory.Create(város[i],LocalityType.TOWN);
            település.setGps("123" + i.toString());
            localities.add(település);
        }
        for (int i = 0; i < localities.size(); i++) {
            System.out.println(localities.get(i).getName() + " " + localities.get(i).getGps());
        }
    }
}
