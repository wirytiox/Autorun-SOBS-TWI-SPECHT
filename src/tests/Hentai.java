package tests;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;
public class Hentai {
public static void main(String[] args)throws Exception{
int Input=JOptionPane.showConfirmDialog(null,"Do you want to open: streamlabsOBS, Twitch.tv and speechchat.com");
File OBSLocation= new File("C:\\Program Files\\Streamlabs OBS\\Streamlabs OBS.exe");
String url0 = "https://www.twitch.tv/", url1 = "https://www.speechchat.com/";
switch(Input){
    case 0:
        Desktop.getDesktop().open(OBSLocation);  
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url1);
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url0);
    break;
    default:
        System.out.println("Closed");
    break;
        }}}
