package august.aug_0827_network.echo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class EchoServer {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) throws IOException {
        info();

        startServer();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String key = br.readLine();
            if(key.toLowerCase().equals("q")) break;
        }

        stopServer();


    }

    public static void info(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("--------------------------------------------------------------------");
    }

    public static void startServer(){

    }

    public static void stopServer(){

    }

}