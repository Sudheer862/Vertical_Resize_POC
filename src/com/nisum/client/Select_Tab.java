package com.nisum.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class Select_Tab extends Composite implements HasText {

	private static Select_TabUiBinder uiBinder = GWT
			.create(Select_TabUiBinder.class);

	interface Select_TabUiBinder extends UiBinder<Widget, Select_Tab> {
	}

	public Select_Tab() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiField
	AbsolutePanel mainPanel1;
	public AbsolutePanel getMainPanel1() {
		return mainPanel1;
	}

	public void setMainPanel1(AbsolutePanel mainPanel1) {
		this.mainPanel1 = mainPanel1;
		
	}

	public AbsolutePanel getLeftSideParameterCodesListPanel() {
		return leftSideParameterCodesListPanel;
	}

	public void setLeftSideParameterCodesListPanel(
			AbsolutePanel leftSideParameterCodesListPanel) {
		this.leftSideParameterCodesListPanel = leftSideParameterCodesListPanel;
	}

	
	public AbsolutePanel getRightsidePanel() {
		return rightsidePanel;
	}

	public void setRightsidePanel(AbsolutePanel rightsidePanel) {
		this.rightsidePanel = rightsidePanel;
	}
	@UiField
	AbsolutePanel leftSideParameterCodesListPanel;
	@UiField
	AbsolutePanel rightsidePanel;
	@UiField 
	Button leftMoveBtn;
	@UiField 
	Button rightMoveBtn;
	@UiField 
	Button matchBtn;
	@UiField 
	Button andOrBtn;
	
	
	
	
	

	public Button getLeftMoveBtn() {
		return leftMoveBtn;
	}

	public void setLeftMoveBtn(Button leftMoveBtn) {
		this.leftMoveBtn = leftMoveBtn;
	}

	public Button getRightMoveBtn() {
		return rightMoveBtn;
	}

	public void setRightMoveBtn(Button rightMoveBtn) {
		this.rightMoveBtn = rightMoveBtn;
	}

	public Button getMatchBtn() {
		return matchBtn;
	}

	public void setMatchBtn(Button matchBtn) {
		this.matchBtn = matchBtn;
	}

	public Button getAndOrBtn() {
		return andOrBtn;
	}

	public void setAndOrBtn(Button andOrBtn) {
		this.andOrBtn = andOrBtn;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}

	
}
