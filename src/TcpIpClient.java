/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpClient {

  public static void main(String[] args) throws IOException {
    try{
      final String serverIp = "127.0.0.1";
      System.out.println("서버에 연결중입니다.");
      Socket socket = new Socket(serverIp,9999);

      BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);




      pw.close();
      socket.close();
      System.out.println("연결이 종료되었습니다.");
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
*/
