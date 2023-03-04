package ua.edu.knu;

import ua.edu.knu.modem.Modem;
import ua.edu.knu.util.FileLoader;
import ua.edu.knu.util.MapToJson;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args ) throws URISyntaxException, IOException {
        FileLoader fileLoader = new FileLoader();
        String resoursePath = "/modems/";
        Modem dataforth = fileLoader.loadModemFromFile(resoursePath + "dataforth.json");
        Modem advantech = fileLoader.loadModemFromFile(resoursePath + "advantech.json");
        Modem dlink = fileLoader.loadModemFromFile(resoursePath + "dlink.json");
        Modem motorola = fileLoader.loadModemFromFile(resoursePath + "motorola.json");
        Modem irz = fileLoader.loadModemFromFile(resoursePath + "irz.json");
        Modem siemens = fileLoader.loadModemFromFile(resoursePath + "siemens.json");
        Modem tplink = fileLoader.loadModemFromFile(resoursePath + "tplink.json");
        Modem usrobotics = fileLoader.loadModemFromFile(resoursePath + "usrobotics.json");
        Modem watson = fileLoader.loadModemFromFile(resoursePath + "watson.json");
        Modem zyxel = fileLoader.loadModemFromFile(resoursePath + "zyxel.json");



        Map<String, Modem> setA = new HashMap<>();
        setA.put("advantech", advantech);
        setA.put("dlink", dlink);
        setA.put("motorola", motorola);
        setA.put("tplink", tplink);
        setA.put("watson", watson);
        setA.put("zyxel", zyxel);
        setA.put("siemens", siemens);
        setA.put("irz", irz);

        Map<String, Modem> setB = new HashMap<>();
        setB.put("advantech", advantech);
        setB.put("dlink", dlink);
        setB.put("motorola", motorola);
        setB.put("tplink", tplink);
        setB.put("siemens", siemens);
        setB.put("irz", irz);
        setB.put("usrobotics", usrobotics);
        setB.put("dataforth", dataforth);

        MapToJson mapToJson = new MapToJson();

        System.out.println( "Set A" );
        System.out.println(mapToJson.toString(setA));
        System.out.println();

        System.out.println( "Set B" );
        System.out.println(mapToJson.toString(setB));
        System.out.println();

        HashMap<String, Modem> unionAB = new HashMap<>();
        unionAB.putAll(setA);
        unionAB.putAll(setB);

        System.out.println( "unionAB" );
        System.out.println(mapToJson.toString(unionAB));
        System.out.println();

        HashMap<String, Modem> intersectionAB = new HashMap<>();
        intersectionAB.putAll(setA);
        intersectionAB.keySet().retainAll(setB.keySet());

        System.out.println( "intersectionAB" );
        System.out.println(mapToJson.toString(intersectionAB));
        System.out.println();

        HashMap<String, Modem> relativeComplementAB = new HashMap<>();
        relativeComplementAB.putAll(setA);
        relativeComplementAB.keySet().removeAll(setB.keySet());

        System.out.println( "relativeComplementAB" );
        System.out.println(mapToJson.toString(relativeComplementAB));
        System.out.println();

        HashMap<String, Modem> relativeComplementBA = new HashMap<>();
        relativeComplementBA.putAll(setB);
        relativeComplementBA.keySet().removeAll(setA.keySet());

        System.out.println( "relativeComplementBA" );
        System.out.println(mapToJson.toString(relativeComplementBA));
        System.out.println();

    }

}
