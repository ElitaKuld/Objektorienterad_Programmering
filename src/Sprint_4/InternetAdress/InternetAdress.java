package Sprint_4.InternetAdress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetAdress {
    public static void main(String[] args) throws UnknownHostException {
        //Mitt eget IP
        InetAddress adress = InetAddress.getLocalHost();
        System.out.println(adress);
        System.out.println(adress.getHostAddress());
        System.out.println(adress.getHostName());
        System.out.println(adress.isMulticastAddress());

        //Loopback, pekar alltid på den egna datorn
        InetAddress loopback = InetAddress.getLoopbackAddress();
        System.out.println(loopback);

        adress = InetAddress.getByName("192.168.68.54"); // Sigrun's IP, kan ersättas med min egen ip
        System.out.println(adress);

        //IP till dn.se
        adress = InetAddress.getByName("dn.se");
        System.out.println(adress);

        //Ett datornamn kan ha flera IP
        InetAddress[] arrayMedIP = InetAddress.getAllByName("www.hm.se");

        for (InetAddress inetAddress : arrayMedIP) {
            System.out.println(inetAddress);
        }
    }
}