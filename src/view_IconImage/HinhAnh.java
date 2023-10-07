package view_IconImage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

import controller.ActionListener_MouseListener;

public class HinhAnh extends JFrame{
	public JPopupMenu PopUpMenu;
	private JToolBar toolbar;
	public JLabel label;

	
	public HinhAnh() {
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Coder Hiệp");
		this.setSize(600, 550);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//ACTIONLISTENER
		ActionListener ac = new ActionListener_MouseListener(this);
		
		
		//1: TOOLBAR
		Font font = new Font("Times New Roman", Font.ITALIC, 15);
		Font font1 = new Font("Times New Roman", Font.ITALIC | Font.BOLD, 13);
		
		toolbar = new JToolBar();
		JButton b1 = new JButton("Thêm");
		b1.setFont(font); b1.setForeground(Color.GREEN);
		b1.setToolTipText("Add");
		JButton b2 = new JButton("Xóa");
		b2.setToolTipText("Delete");
		b2.setFont(font); b2.setForeground(Color.GREEN);
		JButton b3 = new JButton("Sửa");
		b3.setToolTipText("Modifiled");
		b3.setFont(font); b3.setForeground(Color.GREEN);
		JButton b4 = new JButton("Update");
		b4.setToolTipText("Update");
		b4.setFont(font); b4.setForeground(Color.GREEN);
		JButton b5 = new JButton("Paste");
		b5.setToolTipText("Paste");
		b5.setFont(font); b5.setForeground(Color.GREEN);
		toolbar.add(b1);
		toolbar.add(b2);
		toolbar.add(b3);
		toolbar.add(b4);
		toolbar.add(b5);
		
		
		//2: JMENUBAR
		JMenuBar MenuBar = new JMenuBar();
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Source");
		JMenu m3 = new JMenu("View");
		JMenu m4 = new JMenu("Edit");
		JMenu m5 = new JMenu("Refactor");
		JMenu m6 = new JMenu("Navigate");
		JMenu m7 = new JMenu("New");
		m7.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("New.png"))));
		
		
		//6: THÊM CÁC ICON VÀ HÌNH ẢNH VÀO CHƯƠNG TRÌNH
		//6.1 Thêm icon vào chương trình chính
		URL url_icon = HinhAnh.class.getResource("Jframe.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_icon);
		this.setIconImage(img);
		
		//6.2: Thêm icon vào các Menu và MenuItem
		m1.add(m7);
		JMenuItem i1 = new JMenuItem("Java Project"); m7.add(i1);m7.addSeparator();
		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Java_Project.png"))));
		i1.setBackground(Color.BLUE);i1.setForeground(Color.green);
		i1.setFont(font1); i1.addActionListener(ac);
		JMenuItem i2 = new JMenuItem("Project"); m7.add(i2);m7.addSeparator();
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Project.png"))));
		i2.setBackground(Color.BLUE);i2.setForeground(Color.green);
		i2.setFont(font1); i2.addActionListener(ac);
		JMenuItem i3 = new JMenuItem("Package"); m7.add(i3);m7.addSeparator();
		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Package.png"))));
		i3.setBackground(Color.BLUE);i3.setForeground(Color.green);
		i3.setFont(font1); i3.addActionListener(ac);
		JMenuItem i4 = new JMenuItem("Class"); m7.add(i4);m7.addSeparator();
		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("invest_icon.png"))));
		i4.setBackground(Color.BLUE);i4.setForeground(Color.green);
		i4.setFont(font1); i4.addActionListener(ac);
		JMenuItem i5 = new JMenuItem("Enum"); m7.add(i5);m7.addSeparator();
		i5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Enum.png"))));
		i5.setBackground(Color.BLUE);i5.setForeground(Color.green);
		i5.setFont(font1); i5.addActionListener(ac);
		JMenuItem i6 = new JMenuItem("Interface"); m7.add(i6);
		i6.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("File.png"))));
		i6.setBackground(Color.BLUE);i6.setForeground(Color.green);
		i6.setFont(font1); i6.addActionListener(ac);
		
		JMenuItem i7 = new JMenuItem("Open File");m1.add(i7);m1.addSeparator();
		i7.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Open File.png"))));
		JMenuItem i8 = new JMenuItem("Save");m1.add(i8);m1.addSeparator();
		i8.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Save.png"))));
		JMenuItem i9 = new JMenuItem("Save As");m1.add(i9);
		i9.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("SaveAs.png"))));
		JCheckBoxMenuItem i10 = new JCheckBoxMenuItem("Tool Bar");m3.add(i10);
		i10.addActionListener(ac);
		JMenuItem i11 = new JMenuItem("Undo Typing");m4.add(i11);
		JMenuItem i12 = new JMenuItem("CleanUp...");m2.add(i12);
		JMenu m8 = new JMenu("Goto");
		JMenuItem i13 = new JMenuItem("Format"); m5.add(m8);
		i13.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Jframe.png"))));
		i13.setBackground(Color.BLUE);i13.setForeground(Color.green);
		i13.setFont(font1); m8.add(i13);
		JMenuItem i14 = new JMenuItem("Move..");m6.add(i14); i14.addActionListener(ac);
		i14.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Move.png"))));
		MenuBar.add(m1);
		MenuBar.add(m2);
		MenuBar.add(m3);
		MenuBar.add(m4);
		MenuBar.add(m5);
		MenuBar.add(m6);
		this.setJMenuBar(MenuBar);
		
		
		//3 : JLABEL
		label = new JLabel("", JLabel.CENTER);
//		label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
//				HinhAnh.class.getResource("dothi.png")))); //Thêm hình ảnh
		label.setFont(new Font("Arial", Font.BOLD|Font.ITALIC, 20));
		label.setForeground(Color.BLUE);
		
		
		//4: JBUTTON
		JButton b6 = new JButton("MASTER INVEST VSA");
		b6.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Master.png"))));
		b6.addActionListener(ac);
		b6.setBackground(Color.GRAY);b6.setForeground(Color.green);
		b6.setFont(new Font("Arial", Font.BOLD, 25));
		
		
		//5: JPopupMenu
		PopUpMenu = new JPopupMenu();
		JMenu     menu1 = new JMenu("View");
		JMenuItem menu1_1 = new JMenuItem("Ant");menu1.add(menu1_1);
		menu1_1.addActionListener(ac);
		menu1_1.setBackground(Color.BLUE);menu1_1.setForeground(Color.green);
		menu1_1.setFont(font1);
		JMenuItem menu1_2 = new JMenuItem("Console");menu1.add(menu1_2);
		menu1_2.addActionListener(ac);
		menu1_2.setBackground(Color.BLUE);menu1_2.setForeground(Color.green);
		menu1_2.setFont(font1); 
		JMenuItem menu1_3 = new JMenuItem("Error Log");menu1.add(menu1_3);
		menu1_3.addActionListener(ac);
		menu1_3.setBackground(Color.BLUE);menu1_3.setForeground(Color.green);
		menu1_3.setFont(font1); 
		
		JMenuItem menu2 = new JMenuItem("Sort By");
		menu2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("sortby.png"))));
		JMenuItem menu3 = new JMenuItem("Refresh");
		menu3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Refresh.png"))));
		menu3.addActionListener(ac);
		JMenuItem menu4 = new JMenuItem("Open in Terminal");
		menu4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("Sort By.png"))));
		JMenuItem menu5 = new JMenuItem("More Option");
		menu5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				HinhAnh.class.getResource("MoreOption.png"))));
		//Lắng nghe chuột
		MouseListener ms = new ActionListener_MouseListener(this);
		this.addMouseListener(ms);
		
		PopUpMenu.add(menu1);
		PopUpMenu.addSeparator();
		PopUpMenu.add(menu2);
		PopUpMenu.addSeparator();
		PopUpMenu.add(menu3);
		PopUpMenu.addSeparator();
		PopUpMenu.add(menu4);
		PopUpMenu.addSeparator();
		PopUpMenu.add(menu5);
		
		this.add(PopUpMenu);
		
		
		
		this.setLayout(new BorderLayout());
//		this.add(toolbar, BorderLayout.NORTH);
		this.add(label, BorderLayout.CENTER);
		this.add(b6, BorderLayout.SOUTH);
	}
	
	//Xử lý dữ liệu
	public void ToolBarHien() {
		this.add(toolbar, BorderLayout.NORTH);
		this.Refresh();
	}
	public void ToolBarAn() {
		this.remove(toolbar); //Xóa toolbar khỏi chương trình
		this.Refresh();
	}
	public void Refresh() {
		this.pack();
		this.setSize(600, 550);
	}
	
	
	//Main
	public static void main(String[] args) {
		new HinhAnh();
		
	}
}
