package cn.itcast.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : XU
 * @date : 2019/1/1 22:21
 */
public class SocketService {
    public void go () {

        try  {
            ServerSocket ss = new ServerSocket(5000);

            while (true) {

                Socket socket = ss.accept();

                InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String s = bufferedReader.readLine();

                System.out.println(s);

                inputStreamReader.close();

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SocketService ss = new SocketService();

        ss.go();
    }

    }
