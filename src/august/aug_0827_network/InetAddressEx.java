package august.aug_0827_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 현재 내 컴퓨터의 IP 주소를 얻어내는 방법
public class InetAddressEx {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
            System.out.println("나의 주소값 : " + inetAddress);
            InetAddress[] iaAddress = InetAddress.getAllByName("www.fitnee.co.kr");
            for (int i = 0; i < iaAddress.length; i++) {
                System.out.println("Fitnee IP값 : " + iaAddress[i]);
            }
        } catch (UnknownHostException e){
            throw new RuntimeException(e);
        }
    }
}
