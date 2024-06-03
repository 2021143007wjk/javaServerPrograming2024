package oop;

import java.awt.AWTEvent;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.accessibility.AccessibleContext;

public class NiceButton extends Button {

	@Override
	public void addNotify() {
		// TODO Auto-generated method stub
		super.addNotify();
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return super.getLabel();
	}

	@Override
	public void setLabel(String label) {
		// TODO Auto-generated method stub
		super.setLabel(label);
	}

	@Override
	public void setActionCommand(String command) {
		// TODO Auto-generated method stub
		super.setActionCommand(command);
	}

	@Override
	public String getActionCommand() {
		// TODO Auto-generated method stub
		return super.getActionCommand();
	}

	@Override
	public synchronized void addActionListener(ActionListener l) {
		// TODO Auto-generated method stub
		super.addActionListener(l);
	}

	@Override
	public synchronized void removeActionListener(ActionListener l) {
		// TODO Auto-generated method stub
		super.removeActionListener(l);
	}

	@Override
	public synchronized ActionListener[] getActionListeners() {
		// TODO Auto-generated method stub
		return super.getActionListeners();
	}

	@Override
	public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
		// TODO Auto-generated method stub
		return super.getListeners(listenerType);
	}

	@Override
	protected void processEvent(AWTEvent e) {
		// TODO Auto-generated method stub
		super.processEvent(e);
	}

	@Override
	protected void processActionEvent(ActionEvent e) {
		// TODO Auto-generated method stub
		super.processActionEvent(e);
	}

	@Override
	protected String paramString() {
		// TODO Auto-generated method stub
		return super.paramString();
	}

	@Override
	public AccessibleContext getAccessibleContext() {
		// TODO Auto-generated method stub
		return super.getAccessibleContext();
	}
	
}
