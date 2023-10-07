package controller;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;

import view_IconImage.HinhAnh;

public class ActionListener_MouseListener implements java.awt.event.ActionListener, MouseListener{
	private HinhAnh hinhanh;
	
	public ActionListener_MouseListener(HinhAnh hinhanh) {
		this.hinhanh = hinhanh;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("Tool Bar")) {
			AbstractButton CheckBox = (AbstractButton) e.getSource();
			Boolean check = CheckBox.getModel().isSelected();
			
			if(check) {
				this.hinhanh.ToolBarHien();
			}else {
				this.hinhanh.ToolBarAn();
				
			}
		}else if(src.equals("Move..")) {
			System.exit(0);//Thoát
				
		}else if(src.equals("MASTER INVEST VSA")) {
			this.hinhanh.label.setText("Tiền được sinh ra khi chờ đợi,"
					+ " không phải Khi Giao Dịch");
			
		}else if(src.equals("Refresh")) {
			this.hinhanh.label.setText("");
			
			
		}else if(src.equals("Java Project")) {
			this.hinhanh.label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
					this.hinhanh.getClass().getResource("dothi.png"))));
		
		}else {
			
			this.hinhanh.label.setText("Bạn vừa nhấn vào nút "+src);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.isPopupTrigger()) { //Là trình kích hoạt bật lên Chuột Phải
			
			this.hinhanh.PopUpMenu.show(e.getComponent(), e.getX(), e.getY());	
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.isPopupTrigger()) {
			
			this.hinhanh.PopUpMenu.show(e.getComponent(), e.getX(), e.getY());
		
		}
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
